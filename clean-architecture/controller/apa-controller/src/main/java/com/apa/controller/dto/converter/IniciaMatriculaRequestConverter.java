package com.apa.controller.dto.converter;

import com.apa.application.usecases.dto.SolicitacaoIniciarMatriculaDTO;
import com.apa.controller.dto.IniciaMatriculaRequestDTO;

public class IniciaMatriculaRequestConverter implements Converter<IniciaMatriculaRequestDTO, SolicitacaoIniciarMatriculaDTO> {
	@Override
	public SolicitacaoIniciarMatriculaDTO converter(IniciaMatriculaRequestDTO from) {
		SolicitacaoIniciarMatriculaDTO resultado = new SolicitacaoIniciarMatriculaDTO();
		resultado.setIdAluno(from.getIdAluno());
		return resultado;
	}
}
