package com.apa.web.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apa.application.repository.AlunoRepository;
import com.apa.application.repository.InscricaoRepository;
import com.apa.application.repository.MatriculaRepository;
import com.apa.application.repository.TurmaRepository;
import com.apa.application.usecases.ConfirmaMatriculaUseCase;
import com.apa.application.usecases.ConfirmaMatriculaUseCaseImpl;
import com.apa.application.usecases.IniciaMatriculaUseCase;
import com.apa.application.usecases.IniciaMatriculaUseCaseImpl;
import com.apa.application.usecases.InscricaoUseCase;
import com.apa.application.usecases.InscricaoUseCaseImpl;

@Configuration
public class UseCasesConfig {
	@Autowired
	private InscricaoRepository inscricaoRepository;
	@Autowired
	private TurmaRepository turmaRepository;
	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Bean
	public InscricaoUseCase inscricaoUseCase() {
		return new InscricaoUseCaseImpl(inscricaoRepository, alunoRepository, turmaRepository, matriculaRepository);
	}
	
	@Bean 
	public IniciaMatriculaUseCase iniciaMatriculaUseCase() {
		return new IniciaMatriculaUseCaseImpl(alunoRepository, matriculaRepository);
	}
	
	@Bean 
	public ConfirmaMatriculaUseCase confirmaMatriculaUseCase() {
		return new ConfirmaMatriculaUseCaseImpl(alunoRepository, matriculaRepository);
	}
}
