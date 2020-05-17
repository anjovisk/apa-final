package com.apa.application.usecases;

import com.apa.application.repository.AlunoRepository;
import com.apa.application.repository.MatriculaRepository;
import com.apa.application.usecases.dto.ConfirmarMatriculaDTO;
import com.apa.application.usecases.dto.MatriculaConfirmadaDTO;
import com.apa.domain.aluno.Aluno;
import com.apa.domain.exceptions.MatriculaException;
import com.apa.domain.matricula.Matricula;
import com.apa.domain.matricula.StatusMatricula;

public abstract class AbstractConfirmaMatriculaUseCase implements ConfirmaMatriculaUseCase {
	AbstractConfirmaMatriculaUseCase(AlunoRepository alunoRepository, MatriculaRepository matriculaRepository) {
		this.alunoRepository = alunoRepository;
		this.matriculaRepository = matriculaRepository;
	}

	private AlunoRepository alunoRepository;
	private MatriculaRepository matriculaRepository;

	@Override
	public MatriculaConfirmadaDTO confirmar(ConfirmarMatriculaDTO confirmarMatricula) throws MatriculaException {
		Aluno aluno = alunoRepository.recuperar(confirmarMatricula.getIdAluno())
				.orElseThrow(() -> new MatriculaException("Aluno não encontrado."));
		Matricula matricula = matriculaRepository.recuperar(confirmarMatricula.getIdMatricula())
				.orElseThrow(() -> new MatriculaException("Matricula não encontrada."));
		if (!matricula.getStatus().equals(StatusMatricula.PENDENTE)) {
			throw new MatriculaException("A matrícula não está pendente de confirmação.");
		}
		if (!matricula.getAluno().getId().equals(confirmarMatricula.getIdAluno())) {
			throw new MatriculaException("A matrícula não pertence ao aluno.");
		}
		matricula.efetuarMatricula();
		matricula = matriculaRepository.salvar(matricula);
		MatriculaConfirmadaDTO matriculaConfirmada = MatriculaConfirmadaDTO.getInstance().comIdAluno(aluno.getId())
				.comNomeAluno(aluno.getNome()).comIdMatricula(matricula.getId())
				.comNumeroMatricula(matricula.getNumero());
		matricula.getInscricoes().stream()
				.forEach(inscricao -> matriculaConfirmada.addDisciplina(inscricao.getDisciplina().getNome()));
		return matriculaConfirmada;
	}
}
