package com.apa.web.infrastructure.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apa.application.repository.TurmaRepository;
import com.apa.web.infrastructure.repository.entity.Turma;

@Component
public class TurmaRepositoryImpl implements TurmaRepository {
	@Autowired
	com.apa.web.infrastructure.repository.TurmaRepository turmaRepository;

	@Override
	@Transactional
	public Turma salvar(com.apa.domain.turma.Turma entity) {
		return turmaRepository.save((Turma)entity);
	}

	@Override
	@Transactional
	public Turma atualizar(com.apa.domain.turma.Turma entity) {
		return salvar(entity);
	}

	@Override
	@Transactional
	public void apagar(Long id) {
		turmaRepository.deleteById(id);
	}

	@Override
	@Transactional
	public Optional<Turma> recuperar(Long id) {
		return turmaRepository.findById(id);
	}
}
