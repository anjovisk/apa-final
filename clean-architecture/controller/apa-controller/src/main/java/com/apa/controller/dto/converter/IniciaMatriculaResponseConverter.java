package com.apa.controller.dto.converter;

import com.apa.application.usecases.dto.MatriculaIniciadaDTO;
import com.apa.controller.dto.IniciaMatriculaResponseDTO;

public class IniciaMatriculaResponseConverter implements Converter<MatriculaIniciadaDTO, IniciaMatriculaResponseDTO> {
	@Override
	public IniciaMatriculaResponseDTO converter(MatriculaIniciadaDTO from) {
		IniciaMatriculaResponseDTO resultado = new IniciaMatriculaResponseDTO()
				.comIdMatricula(from.getIdMatricula())
				.comIdAluno(from.getIdAluno())
				.comNomeAluno(from.getNomeAluno());
		return resultado;
	}
}
