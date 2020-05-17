package com.apa.web.infrastructure.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.apa.domain.disciplina.inscricao.AbstractInscricao;

@Entity
public class Inscricao extends AbstractInscricao implements com.apa.domain.disciplina.inscricao.Inscricao {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne(optional=false) 
    @JoinColumn(name="ID_ALUNO", nullable=false, updatable=false)
	private Matricula matricula;
	@ManyToOne(optional=false) 
    @JoinColumn(name="ID_DISCIPLINA", nullable=false, updatable=false)
	private Disciplina disciplina;
	@Column
	private LocalDateTime data;
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(com.apa.domain.matricula.Matricula matricula) {
		this.matricula = (Matricula)matricula;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(com.apa.domain.disciplina.Disciplina disciplina) {
		this.disciplina = (Disciplina)disciplina;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
