package com.apa.application.usecases.dto;

import java.time.LocalDateTime;

public class InscricaoEfetuadaDTO {
	private Long idDisciplina;
	private String nomeDisciplina;
	private Long idAluno;
	private String nomeAluno;
	private LocalDateTime data;
	
	public Long getIdDisciplina() {
		return idDisciplina;
	}
	public InscricaoEfetuadaDTO comIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
		return this;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public InscricaoEfetuadaDTO comNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		return this;
	}
	public Long getIdAluno() {
		return idAluno;
	}
	public InscricaoEfetuadaDTO comIdAluno(Long idAluno) {
		this.idAluno = idAluno;
		return this;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public InscricaoEfetuadaDTO comNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		return this;
	}
	public LocalDateTime getData() {
		return data;
	}
	public InscricaoEfetuadaDTO comData(LocalDateTime data) {
		this.data = data;
		return this;
	}
}
