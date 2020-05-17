package com.apa.domain.turma;

import java.util.List;
import java.util.Optional;

import com.apa.domain.disciplina.Disciplina;

public interface Turma {
	Long getId();
	String getNome();
	Optional<Disciplina> selecionarDisciplina(Long id);
	<T extends Disciplina> List<T> getDisciplinas();
}
