package com.apa.web.infrastructure.repository.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.apa.domain.aluno.AbstractAluno;
import com.apa.domain.matricula.MatriculaFactory;

@Entity
public class Aluno extends AbstractAluno implements com.apa.domain.aluno.Aluno {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String nome;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="aluno")
	private List<Matricula> matriculas;
	
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
	@Override
	@SuppressWarnings("unchecked")
	public List<Matricula> getMatriculas() {
		return matriculas;
	}
	@Override
	public MatriculaFactory getMatriculaFactory() {
		return com.apa.web.infrastructure.repository.entity.factory.MatriculaFactory.getInstance();
	}
}
