package com.apa.controller.dto;

import java.time.LocalDateTime;

public class InscricaoResponseDTO {
	private Long idDisciplina;
	private String nomeDisciplina;
	private Long idAluno;
	private String nomeAluno;
	private LocalDateTime data;
	
	public Long getIdDisciplina() {
		return idDisciplina;
	}
	public InscricaoResponseDTO comIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
		return this;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public InscricaoResponseDTO comNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		return this;
	}
	public Long getIdAluno() {
		return idAluno;
	}
	public InscricaoResponseDTO comIdAluno(Long idAluno) {
		this.idAluno = idAluno;
		return this;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public InscricaoResponseDTO comNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		return this;
	}
	public LocalDateTime getData() {
		return data;
	}
	public InscricaoResponseDTO comData(LocalDateTime data) {
		this.data = data;
		return this;
	}
}
