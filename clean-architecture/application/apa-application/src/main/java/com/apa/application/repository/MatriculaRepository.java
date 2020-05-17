package com.apa.application.repository;

import java.util.Optional;

import com.apa.domain.aluno.Aluno;
import com.apa.domain.matricula.Matricula;
import com.apa.domain.matricula.StatusMatricula;

public interface MatriculaRepository extends BaseRepository<Matricula, Long> {
	Optional<? extends Matricula> obterPorAlunoAndStatus(Aluno aluno, StatusMatricula status);
}
