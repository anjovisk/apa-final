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

import com.apa.domain.matricula.AbstractMatricula;
import com.apa.domain.matricula.StatusMatricula;

@Entity
public class Matricula extends AbstractMatricula implements com.apa.domain.matricula.Matricula {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name="ID_ALUNO", nullable=false, updatable=false)
	private Aluno aluno;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="matricula")
	private List<Inscricao> inscricoes;
	@Column
	private StatusMatricula status;
	@Column
	private String numero;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	@Override
	public void setAluno(com.apa.domain.aluno.Aluno aluno) {
		this.aluno = (Aluno)aluno;
	}
	@SuppressWarnings("unchecked")
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public StatusMatricula getStatus() {
		return status;
	}
	public void setStatus(StatusMatricula status) {
		this.status = status;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
