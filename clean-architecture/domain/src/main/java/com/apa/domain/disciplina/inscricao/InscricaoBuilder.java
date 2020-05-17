package com.apa.domain.disciplina.inscricao;

import java.time.LocalDateTime;

import com.apa.domain.disciplina.Disciplina;
import com.apa.domain.matricula.Matricula;

public class InscricaoBuilder {
	private Matricula matricula;
	private Disciplina disciplina;
	private LocalDateTime data;
	
	private InscricaoBuilder() {}
	
	public static InscricaoBuilder getInstance() {
		return new InscricaoBuilder();
	}
	
	public InscricaoBuilder comMatricula(Matricula matricula) {
		this.matricula = matricula;
		return this;
	}
	
	public InscricaoBuilder comDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
		return this;
	}
	
	public InscricaoBuilder comData(LocalDateTime data) {
		this.data = data;
		return this;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public LocalDateTime getData() {
		return data;
	}
}
