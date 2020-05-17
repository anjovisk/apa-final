package com.apa.application.usecases.dto;

import java.util.ArrayList;
import java.util.List;

public class MatriculaConfirmadaDTO {
	private Long idAluno;
	private String nomeAluno;
	private Long idMatricula;
	private String numeroMatricula;
	private List<String> disciplinas; 
	
	private MatriculaConfirmadaDTO() {}
	
	public static MatriculaConfirmadaDTO getInstance() {
		return new MatriculaConfirmadaDTO();
	}
	
	public Long getIdAluno() {
		return idAluno;
	}
	public MatriculaConfirmadaDTO comIdAluno(Long idAluno) {
		this.idAluno = idAluno;
		return this;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public MatriculaConfirmadaDTO comNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		return this;
	}
	public Long getIdMatricula() {
		return idMatricula;
	}
	public MatriculaConfirmadaDTO comIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
		return this;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public MatriculaConfirmadaDTO comNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
		return this;
	}

	public List<String> getDisciplinas() {
		if (disciplinas == null) {
			disciplinas = new ArrayList<>();
		}
		return disciplinas;
	}
	
	public void addDisciplina(String disciplina) {
		getDisciplinas().add(disciplina);
	}
}
