package com.apa.controller.dto;

public class IniciaMatriculaResponseDTO {
	private Long idMatricula;
	private Long idAluno;
	private String nomeAluno;
	
	public Long getIdMatricula() {
		return idMatricula;
	}
	public IniciaMatriculaResponseDTO comIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
		return this;
	}
	public Long getIdAluno() {
		return idAluno;
	}
	public IniciaMatriculaResponseDTO comIdAluno(Long idAluno) {
		this.idAluno = idAluno;
		return this;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public IniciaMatriculaResponseDTO comNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		return this;
	}
}
