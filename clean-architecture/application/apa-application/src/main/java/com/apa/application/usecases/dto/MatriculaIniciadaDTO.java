package com.apa.application.usecases.dto;

public class MatriculaIniciadaDTO {
	private Long idAluno;
	private String nomeAluno;
	private Long idMatricula;
	
	private MatriculaIniciadaDTO() {}
	
	public static MatriculaIniciadaDTO getInstance() {
		return new MatriculaIniciadaDTO();
	}
	
	public Long getIdAluno() {
		return idAluno;
	}
	public MatriculaIniciadaDTO comIdAluno(Long idAluno) {
		this.idAluno = idAluno;
		return this;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public MatriculaIniciadaDTO comNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		return this;
	}
	public Long getIdMatricula() {
		return idMatricula;
	}
	public MatriculaIniciadaDTO comIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
		return this;
	}
}
