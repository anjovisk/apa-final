package com.apa.application.usecases;

import com.apa.application.repository.AlunoRepository;
import com.apa.application.repository.InscricaoRepository;
import com.apa.application.repository.MatriculaRepository;
import com.apa.application.repository.TurmaRepository;

public class InscricaoUseCaseImpl extends AbstractInscricaoUseCase implements InscricaoUseCase {
	public InscricaoUseCaseImpl(InscricaoRepository inscricaoRepository, 
			AlunoRepository alunoRepository,
			TurmaRepository turmaRepository, 
			MatriculaRepository matriculaRepository) {
		super(inscricaoRepository, alunoRepository, turmaRepository, matriculaRepository);
	}
}
