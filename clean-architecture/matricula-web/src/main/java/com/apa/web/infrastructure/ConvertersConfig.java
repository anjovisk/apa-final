package com.apa.web.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apa.controller.dto.converter.ConfirmaMatriculaRequestConverter;
import com.apa.controller.dto.converter.ConfirmaMatriculaResponseConverter;
import com.apa.controller.dto.converter.IniciaMatriculaRequestConverter;
import com.apa.controller.dto.converter.IniciaMatriculaResponseConverter;
import com.apa.controller.dto.converter.InscricaoRequestConverter;
import com.apa.controller.dto.converter.InscricaoResponseConverter;

@Configuration
public class ConvertersConfig {
	@Bean
	public InscricaoRequestConverter inscricaoRequestConverter() {
		return new InscricaoRequestConverter();
	}
	
	@Bean
	public InscricaoResponseConverter inscricaoResponseConverter() {
		return new InscricaoResponseConverter();
	}
	
	@Bean 
	public IniciaMatriculaRequestConverter iniciaMatriculaRequestConverter() {
		return new IniciaMatriculaRequestConverter();
	}
	
	@Bean
	public IniciaMatriculaResponseConverter iniciaMatriculaResponseConverter() {
		return new IniciaMatriculaResponseConverter();
	}
	
	@Bean 
	public ConfirmaMatriculaRequestConverter confirmaMatriculaRequestConverter() {
		return new ConfirmaMatriculaRequestConverter();
	}
	
	@Bean
	public ConfirmaMatriculaResponseConverter confirmaMatriculaResponseConverter() {
		return new ConfirmaMatriculaResponseConverter();
	}
}
