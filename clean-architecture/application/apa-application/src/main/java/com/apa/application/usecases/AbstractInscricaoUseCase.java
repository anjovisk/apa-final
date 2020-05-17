package com.apa.application.usecases;

import com.apa.application.repository.AlunoRepository;
import com.apa.application.repository.InscricaoRepository;
import com.apa.application.repository.MatriculaRepository;
import com.apa.application.repository.TurmaRepository;
import com.apa.application.usecases.dto.SolicitacaoInscricaoDTO;
import com.apa.application.usecases.dto.InscricaoEfetuadaDTO;
import com.apa.domain.aluno.Aluno;
import com.apa.domain.disciplina.Disciplina;
import com.apa.domain.disciplina.inscricao.Inscricao;
import com.apa.domain.exceptions.MatriculaException;
import com.apa.domain.matricula.Matricula;
import com.apa.domain.matricula.StatusMatricula;
import com.apa.domain.turma.Turma;

public abstract class AbstractInscricaoUseCase implements InscricaoUseCase {
	AbstractInscricaoUseCase(InscricaoRepository inscricaoRepository,
			AlunoRepository alunoRepository,
			TurmaRepository turmaRepository,
			MatriculaRepository matriculaRepository) {
		this.alunoRepository = alunoRepository;
		this.turmaRepository = turmaRepository;
		this.inscricaoRepository = inscricaoRepository;
		this.matriculaRepository = matriculaRepository;
	}
	
	private InscricaoRepository inscricaoRepository;
	private AlunoRepository alunoRepository;
	private TurmaRepository turmaRepository;
	private MatriculaRepository matriculaRepository;
	
	@Override
	public InscricaoEfetuadaDTO efetuarInscricao(SolicitacaoInscricaoDTO solicitacaoInscricao) throws MatriculaException {
		Aluno aluno = alunoRepository.recuperar(solicitacaoInscricao.getIdAluno()).orElseThrow(() -> new MatriculaException("Aluno não encontrado."));
		Matricula matricula = matriculaRepository.obterPorAlunoAndStatus(aluno, StatusMatricula.PENDENTE).orElseThrow(() -> new MatriculaException("Nenhuma matrícula foi iniciada."));
		Turma turma = turmaRepository.recuperar(solicitacaoInscricao.getIdTurma()).orElseThrow(() -> new MatriculaException("Turma não encontrada."));
		Disciplina disciplina = turma.selecionarDisciplina(solicitacaoInscricao.getIdDisciplina()).orElseThrow(() -> new MatriculaException("Disciplina não encontrada."));
		Inscricao inscricao = disciplina.inscrever(matricula);
		inscricao = inscricaoRepository.salvar(inscricao);
		InscricaoEfetuadaDTO inscricaoEfetuada = new InscricaoEfetuadaDTO()
				.comIdAluno(aluno.getId())
				.comNomeAluno(aluno.getNome())
				.comIdDisciplina(disciplina.getId())
				.comNomeDisciplina(disciplina.getNome())
				.comData(inscricao.getData());
		return inscricaoEfetuada;
	}
}
