package com.apa.controller.dto;

import java.util.List;

public class ConfirmaMatriculaResponseDTO {
	private Long idMatricula;
	private Long idAluno;
	private String nomeAluno;
	private String numeroMatricula;
	private List<String> disciplinas;
	
	public Long getIdMatricula() {
		return idMatricula;
	}
	public ConfirmaMatriculaResponseDTO comIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
		return this;
	}
	public Long getIdAluno() {
		return idAluno;
	}
	public ConfirmaMatriculaResponseDTO comIdAluno(Long idAluno) {
		this.idAluno = idAluno;
		return this;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public ConfirmaMatriculaResponseDTO comNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		return this;
	}
	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	public ConfirmaMatriculaResponseDTO comNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
		return this;
	}
	public List<String> getDisciplinas() {
		return disciplinas;
	}
	public ConfirmaMatriculaResponseDTO comDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
		return this;
	}
}
