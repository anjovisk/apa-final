package com.apa.web.infrastructure.repository.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.apa.domain.disciplina.AbstractDisciplina;
import com.apa.web.infrastructure.repository.entity.factory.InscricaoFactory;


@Entity
public class Disciplina extends AbstractDisciplina implements com.apa.domain.disciplina.Disciplina {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String nome;
	@Column
	private int totalVagas;
	@ManyToOne
	@JoinColumn(name="ID_TURMA", nullable=false, updatable=false)
	private Turma turma;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="matricula")
	private List<Inscricao> inscricoes;
	
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
	public int getTotalVagas() {
		return totalVagas;
	}
	public void setTotalVagas(int totalVagas) {
		this.totalVagas = totalVagas;
	}
	public com.apa.domain.turma.Turma getTurma() {
		return (com.apa.domain.turma.Turma)turma;
	}
	public void setTurma(com.apa.domain.turma.Turma turma) {
		this.turma = (Turma)turma;
	}
	@SuppressWarnings("unchecked")
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	@Override
	public InscricaoFactory getInscricaoFactory() {
		return InscricaoFactory.getInstance();
	}
}
