package com.apa.web.infrastructure.repository.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Turma extends com.apa.domain.turma.AbstractTurma implements com.apa.domain.turma.Turma {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String nome;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="turma")
	private List<Disciplina> disciplinas;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
