package com.apa.web.infrastructure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apa.domain.aluno.Aluno;
import com.apa.domain.matricula.StatusMatricula;
import com.apa.web.infrastructure.repository.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
	Optional<Matricula> findByAlunoAndStatus(Aluno aluno, StatusMatricula status);
}
