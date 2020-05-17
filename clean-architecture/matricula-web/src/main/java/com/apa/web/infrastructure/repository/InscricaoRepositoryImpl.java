package com.apa.web.infrastructure.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apa.web.infrastructure.repository.entity.Inscricao;

@Component
public class InscricaoRepositoryImpl implements com.apa.application.repository.InscricaoRepository {
	@Autowired
	private com.apa.web.infrastructure.repository.InscricaoRepository inscricaoRepository;
	
	@Override
	@Transactional
	public Inscricao salvar(com.apa.domain.disciplina.inscricao.Inscricao entity) {
		return inscricaoRepository.save((Inscricao)entity);
	}

	@Override
	@Transactional
	public Inscricao atualizar(com.apa.domain.disciplina.inscricao.Inscricao entity) {
		return salvar(entity);
	}

	@Override
	@Transactional
	public void apagar(Long id) {
		inscricaoRepository.deleteById(id);
	}

	@Override
	@Transactional
	public Optional<Inscricao> recuperar(Long id) {
		return inscricaoRepository.findById(id);
	}
}
