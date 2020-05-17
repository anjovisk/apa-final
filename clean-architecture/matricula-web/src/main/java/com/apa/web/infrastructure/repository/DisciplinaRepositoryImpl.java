package com.apa.web.infrastructure.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apa.web.infrastructure.repository.entity.Disciplina;

@Component
public class DisciplinaRepositoryImpl implements com.apa.application.repository.DisciplinaRepository {
	@Autowired
	private com.apa.web.infrastructure.repository.DisciplinaRepository disciplinaRepository;
	
	@Override
	@Transactional
	public Disciplina salvar(com.apa.domain.disciplina.Disciplina entity) {
		return disciplinaRepository.save((Disciplina)entity);
	}

	@Override
	@Transactional
	public Disciplina atualizar(com.apa.domain.disciplina.Disciplina entity) {
		return salvar(entity);
	}

	@Override
	@Transactional
	public void apagar(Long id) {
		disciplinaRepository.deleteById(id);
	}

	@Override
	@Transactional
	public Optional<Disciplina> recuperar(Long id) {
		return disciplinaRepository.findById(id);
	}
}
