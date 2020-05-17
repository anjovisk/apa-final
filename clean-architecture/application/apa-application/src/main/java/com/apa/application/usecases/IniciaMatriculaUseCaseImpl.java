package com.apa.application.usecases;

import com.apa.application.repository.AlunoRepository;
import com.apa.application.repository.MatriculaRepository;

public class IniciaMatriculaUseCaseImpl extends AbstractIniciarMatriculaUseCase implements IniciaMatriculaUseCase {
	public IniciaMatriculaUseCaseImpl(AlunoRepository alunoRepository, MatriculaRepository matriculaRepository) {
		super(alunoRepository, matriculaRepository);
	}
}
