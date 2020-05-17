package com.apa.controller.dto.converter;

import com.apa.application.usecases.dto.SolicitacaoInscricaoDTO;
import com.apa.controller.dto.InscricaoRequestDTO;

public class InscricaoRequestConverter implements Converter<InscricaoRequestDTO, SolicitacaoInscricaoDTO> {
	@Override
	public SolicitacaoInscricaoDTO converter(InscricaoRequestDTO from) {
		SolicitacaoInscricaoDTO resultado = new SolicitacaoInscricaoDTO();
		resultado.setIdDisciplina(from.getIdDisciplina());
		resultado.setIdTurma(from.getIdTurma());
		resultado.setIdAluno(from.getIdAluno());
		return resultado;
	}
}
