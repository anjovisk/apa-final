package com.apa.application.usecases;

import com.apa.application.repository.AlunoRepository;
import com.apa.application.repository.MatriculaRepository;

public class ConfirmaMatriculaUseCaseImpl extends AbstractConfirmaMatriculaUseCase implements ConfirmaMatriculaUseCase {
	public ConfirmaMatriculaUseCaseImpl(AlunoRepository alunoRepository, MatriculaRepository matriculaRepository) {
		super(alunoRepository, matriculaRepository);
	}
}
