package com.apa.web.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
