package com.apa.controller.dto.converter;

import com.apa.application.usecases.dto.ConfirmarMatriculaDTO;
import com.apa.controller.dto.ConfirmaMatriculaRequestDTO;

public class ConfirmaMatriculaRequestConverter implements Converter<ConfirmaMatriculaRequestDTO, ConfirmarMatriculaDTO> {
	@Override
	public ConfirmarMatriculaDTO converter(ConfirmaMatriculaRequestDTO from) {
		ConfirmarMatriculaDTO resultado = new ConfirmarMatriculaDTO();
		resultado.setIdAluno(from.getIdAluno());
		resultado.setIdMatricula(from.getIdMatricula());
		return resultado;
	}
}
