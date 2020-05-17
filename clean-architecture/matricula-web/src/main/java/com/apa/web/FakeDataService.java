package com.apa.web;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apa.application.repository.DisciplinaRepository;
import com.apa.web.infrastructure.repository.AlunoRepositoryImpl;
import com.apa.web.infrastructure.repository.TurmaRepositoryImpl;
import com.apa.web.infrastructure.repository.entity.Aluno;
import com.apa.web.infrastructure.repository.entity.Disciplina;
import com.apa.web.infrastructure.repository.entity.Turma;

@Service
public class FakeDataService {
	@Autowired
	private TurmaRepositoryImpl turmaRepository;
	@Autowired
	private AlunoRepositoryImpl alunoRepository;
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@PostConstruct
	public void inserirDados() {
		inserirAlunos();
		inserirTurmas();
	}
	
	private void inserirAlunos() {
		for (int i = 1; i <= 10; i++) {
			Aluno aluno = new Aluno();
			aluno.setNome(String.format("Aluno %s", i));
			alunoRepository.salvar(aluno);
		}
	}
	
	private void inserirTurmas() {
		for (int i = 1; i <= 10; i++) {
			Turma turma = new Turma();
			turma.setNome(String.format("Turma %s", i));
			turma = turmaRepository.salvar(turma);
			for (int indexDisciplina = 1; indexDisciplina <= 5; indexDisciplina++) {
				inserirDisciplina(turma, String.format("Disciplina %s - %s", indexDisciplina, turma.getNome()), indexDisciplina);
			}
		}
	}
	
	private void inserirDisciplina(Turma turma, String nome, int totalVagas) {
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(nome);
		disciplina.setTotalVagas(totalVagas);
		disciplina.setTurma(turma);
		disciplinaRepository.salvar(disciplina);
	}
}
