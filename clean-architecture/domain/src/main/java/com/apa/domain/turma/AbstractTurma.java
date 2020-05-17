package com.apa.domain.turma;

import java.util.Optional;

import com.apa.domain.disciplina.Disciplina;

public abstract class AbstractTurma implements Turma {
	public Optional<Disciplina> selecionarDisciplina(Long idDisciplina) {
		return getDisciplinas().stream().filter(disciplina -> disciplina.getId().equals(idDisciplina)).findFirst();
	}
}
