package com.apa.web.infrastructure.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apa.web.infrastructure.repository.entity.Aluno;

@Component
public class AlunoRepositoryImpl implements com.apa.application.repository.AlunoRepository {
	@Autowired
	private com.apa.web.infrastructure.repository.AlunoRepository alunoRepository;
	
	@Override
	@Transactional
	public Aluno salvar(com.apa.domain.aluno.Aluno entity) {
		return alunoRepository.save((Aluno)entity);
	}

	@Override
	@Transactional
	public Aluno atualizar(com.apa.domain.aluno.Aluno entity) {
		return salvar(entity);
	}

	@Override
	@Transactional
	public void apagar(Long id) {
		alunoRepository.deleteById(id);
	}

	@Override
	@Transactional
	public Optional<Aluno> recuperar(Long id) {
		return alunoRepository.findById(id);
	}
}
