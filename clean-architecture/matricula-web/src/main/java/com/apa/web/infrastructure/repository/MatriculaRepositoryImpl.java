package com.apa.web.infrastructure.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apa.application.repository.MatriculaRepository;
import com.apa.domain.aluno.Aluno;
import com.apa.domain.matricula.StatusMatricula;
import com.apa.web.infrastructure.repository.entity.Matricula;

@Component
public class MatriculaRepositoryImpl implements MatriculaRepository {
	@Autowired
	private com.apa.web.infrastructure.repository.MatriculaRepository matriculaRepository;
	
	@Override
	@Transactional
	public Matricula salvar(com.apa.domain.matricula.Matricula entity) {
		return matriculaRepository.save((Matricula)entity);
	}

	@Override
	@Transactional
	public Matricula atualizar(com.apa.domain.matricula.Matricula entity) {
		return salvar(entity);
	}

	@Override
	@Transactional
	public void apagar(Long id) {
		matriculaRepository.deleteById(id);
	}

	@Override
	@Transactional
	public Optional<Matricula> recuperar(Long id) {
		return matriculaRepository.findById(id);
	}

	@Override
	public Optional<Matricula> obterPorAlunoAndStatus(Aluno aluno, StatusMatricula status) {
		return matriculaRepository.findByAlunoAndStatus(aluno, status);
	}
}
