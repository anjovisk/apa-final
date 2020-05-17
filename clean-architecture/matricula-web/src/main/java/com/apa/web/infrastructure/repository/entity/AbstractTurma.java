package com.apa.web.infrastructure.repository.entity;

import javax.persistence.MappedSuperclass;

import com.apa.domain.turma.Turma;

@MappedSuperclass
public abstract class AbstractTurma extends com.apa.domain.turma.AbstractTurma implements Turma {

}
