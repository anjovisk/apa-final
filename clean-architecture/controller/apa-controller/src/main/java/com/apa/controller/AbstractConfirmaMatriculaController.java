package com.apa.controller;

import com.apa.application.usecases.ConfirmaMatriculaUseCase;
import com.apa.application.usecases.dto.ConfirmarMatriculaDTO;
import com.apa.application.usecases.dto.MatriculaConfirmadaDTO;
import com.apa.controller.dto.ConfirmaMatriculaRequestDTO;
import com.apa.controller.dto.ConfirmaMatriculaResponseDTO;
import com.apa.controller.dto.ResponseDTO;
import com.apa.controller.dto.ResponseDTO.ResponseStatus;
import com.apa.controller.dto.converter.Converter;
import com.apa.domain.exceptions.MatriculaException;

public abstract class AbstractConfirmaMatriculaController implements ConfirmaMatriculaController {
	protected AbstractConfirmaMatriculaController(ConfirmaMatriculaUseCase confirmaMatriculaUseCase,
			Converter<ConfirmaMatriculaRequestDTO, ConfirmarMatriculaDTO> confirmaMatriculaRequestConverter,
			Converter<MatriculaConfirmadaDTO, ConfirmaMatriculaResponseDTO> confirmaMatriculaResponseConverter) {
		this.confirmaMatriculaUseCase = confirmaMatriculaUseCase;
		this.confirmaMatriculaRequestConverter = confirmaMatriculaRequestConverter;
		this.confirmaMatriculaResponseConverter = confirmaMatriculaResponseConverter;
	}
	
	private ConfirmaMatriculaUseCase confirmaMatriculaUseCase;
	private Converter<ConfirmaMatriculaRequestDTO, ConfirmarMatriculaDTO> confirmaMatriculaRequestConverter;
	private Converter<MatriculaConfirmadaDTO, ConfirmaMatriculaResponseDTO> confirmaMatriculaResponseConverter;
	
	public ResponseDTO<ConfirmaMatriculaResponseDTO> confirmar(ConfirmaMatriculaRequestDTO confirmaMatriculaRequest) {
		ResponseDTO<ConfirmaMatriculaResponseDTO> response = new ResponseDTO<ConfirmaMatriculaResponseDTO>();
		try {
			ConfirmarMatriculaDTO confirmarMatricula = confirmaMatriculaRequestConverter.converter(confirmaMatriculaRequest);
			response.setResultado(confirmaMatriculaResponseConverter.converter(confirmaMatriculaUseCase.confirmar(confirmarMatricula)));
			response.setStatus(ResponseStatus.OK);
		} catch (MatriculaException e) {
			response.setStatus(ResponseStatus.FAIL);
			response.addMensagem(e.getMessage());
		}
		return response;
	}
}
