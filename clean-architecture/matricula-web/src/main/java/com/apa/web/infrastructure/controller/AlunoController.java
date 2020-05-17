package com.apa.web.infrastructure.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apa.application.repository.DisciplinaRepository;
import com.apa.application.repository.MatriculaRepository;
import com.apa.web.infrastructure.repository.AlunoRepositoryImpl;
import com.apa.web.infrastructure.repository.TurmaRepositoryImpl;
import com.apa.web.infrastructure.repository.entity.Aluno;
import com.apa.web.infrastructure.repository.entity.Disciplina;
import com.apa.web.infrastructure.repository.entity.Matricula;
import com.apa.web.infrastructure.repository.entity.Turma;

@RestController
@RequestMapping("/public/v1/aluno")
public class AlunoController {
	@Autowired
	private TurmaRepositoryImpl turmaRepository;
	@Autowired
	private AlunoRepositoryImpl alunoRepository;
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@RequestMapping(path =  "/{idAluno}", method = RequestMethod.GET)
	public ResponseEntity<?> getInscricoes(@PathVariable("idAluno") Long idAluno) {
		Optional<Turma> t = turmaRepository.recuperar(idAluno);
		return ResponseEntity.ok().body(t.orElse(null));
	}
	
	@RequestMapping(path =  "/{idAluno}", method = RequestMethod.POST)
	public ResponseEntity<?> postInscricoes(@PathVariable("idAluno") Long idAluno) {
		Aluno a = new com.apa.web.infrastructure.repository.entity.Aluno();
		a.setNome("Aluno 1");
		alunoRepository.salvar(a);
		
		Turma t = new Turma();
		t.setNome(idAluno.toString());
		t = turmaRepository.salvar(t);
		
		Disciplina d = new Disciplina();
		d.setNome("Disciplina 1");
		d.setTotalVagas(10);
		d.setTurma(t);
		disciplinaRepository.salvar(d);
		
		Matricula m = new Matricula();
		m.setAluno(a);
		matriculaRepository.salvar(m);
		
		return ResponseEntity.ok().body(t);
	}
}
