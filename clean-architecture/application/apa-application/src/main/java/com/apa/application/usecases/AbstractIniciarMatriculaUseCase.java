package com.apa.application.usecases;

import com.apa.application.repository.AlunoRepository;
import com.apa.application.repository.MatriculaRepository;
import com.apa.application.usecases.dto.MatriculaIniciadaDTO;
import com.apa.application.usecases.dto.SolicitacaoIniciarMatriculaDTO;
import com.apa.domain.aluno.Aluno;
import com.apa.domain.exceptions.MatriculaException;
import com.apa.domain.matricula.Matricula;
import com.apa.domain.matricula.StatusMatricula;

public abstract class AbstractIniciarMatriculaUseCase implements IniciaMatriculaUseCase {
	AbstractIniciarMatriculaUseCase(AlunoRepository alunoRepository,
			MatriculaRepository matriculaRepository) {
		this.alunoRepository = alunoRepository;
		this.matriculaRepository = matriculaRepository;
	}
	private AlunoRepository alunoRepository;
	private MatriculaRepository matriculaRepository;
	
	@Override
	public MatriculaIniciadaDTO iniciarMatricula(SolicitacaoIniciarMatriculaDTO solicitacaoIniciarMatricula) throws MatriculaException {
		Aluno aluno = alunoRepository.recuperar(solicitacaoIniciarMatricula.getIdAluno()).orElseThrow(() -> new MatriculaException("Aluno não encontrado."));
		if (matriculaRepository.obterPorAlunoAndStatus(aluno, StatusMatricula.PENDENTE).isPresent()) {
			throw new MatriculaException("Já existe uma matrícula em andamento.");
		}
		Matricula matricula = aluno.iniciarMatricula();
		matricula = matriculaRepository.salvar(matricula);
		MatriculaIniciadaDTO matriculaIniciada = MatriculaIniciadaDTO.getInstance()
				.comIdAluno(aluno.getId())
				.comNomeAluno(aluno.getNome())
				.comIdMatricula(matricula.getId());
		return matriculaIniciada;
	}
}
