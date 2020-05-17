package com.apa.controller.dto.converter;

import com.apa.application.usecases.dto.MatriculaConfirmadaDTO;
import com.apa.controller.dto.ConfirmaMatriculaResponseDTO;

public class ConfirmaMatriculaResponseConverter implements Converter<MatriculaConfirmadaDTO, ConfirmaMatriculaResponseDTO> {
	@Override
	public ConfirmaMatriculaResponseDTO converter(MatriculaConfirmadaDTO from) {
		ConfirmaMatriculaResponseDTO resultado = new ConfirmaMatriculaResponseDTO()
				.comIdMatricula(from.getIdMatricula())
				.comIdAluno(from.getIdAluno())
				.comNomeAluno(from.getNomeAluno())
				.comNumeroMatricula(from.getNumeroMatricula())
				.comDisciplinas(from.getDisciplinas());
		return resultado;
	}
}
