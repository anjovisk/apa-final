package com.apa.domain.disciplina.inscricao;

import java.time.LocalDateTime;

import com.apa.domain.disciplina.Disciplina;
import com.apa.domain.matricula.Matricula;

public interface Inscricao {
	Matricula getMatricula();
	Disciplina getDisciplina();
	LocalDateTime getData();
}
