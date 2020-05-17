package com.apa.web.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apa.web.infrastructure.repository.entity.Inscricao;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {

}
