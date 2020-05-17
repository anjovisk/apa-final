package com.apa.domain.disciplina.inscricao;

import java.time.LocalDateTime;

import com.apa.domain.disciplina.Disciplina;
import com.apa.domain.matricula.Matricula;

public interface Inscricao {
	Matricula getMatricula();
	void setMatricula(Matricula matricula);
	Disciplina getDisciplina();
	void setDisciplina(Disciplina disciplina);
	LocalDateTime getData();
	void setData(LocalDateTime data);
	void preparar(Matricula matricula, Disciplina disciplina);
}
