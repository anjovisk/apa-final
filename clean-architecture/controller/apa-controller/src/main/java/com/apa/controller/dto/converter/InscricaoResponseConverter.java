package com.apa.controller.dto.converter;

import com.apa.application.usecases.dto.InscricaoEfetuadaDTO;
import com.apa.controller.dto.InscricaoResponseDTO;

public class InscricaoResponseConverter implements Converter<InscricaoEfetuadaDTO, InscricaoResponseDTO> {
	@Override
	public InscricaoResponseDTO converter(InscricaoEfetuadaDTO from) {
		InscricaoResponseDTO resultado = new InscricaoResponseDTO()
				.comData(from.getData())
				.comIdAluno(from.getIdAluno())
				.comNomeAluno(from.getNomeAluno())
				.comIdDisciplina(from.getIdDisciplina())
				.comNomeDisciplina(from.getNomeDisciplina());
		return resultado;
	}
}
