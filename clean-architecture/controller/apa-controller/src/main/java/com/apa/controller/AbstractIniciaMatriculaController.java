package com.apa.controller;

import com.apa.application.usecases.IniciaMatriculaUseCase;
import com.apa.application.usecases.dto.MatriculaIniciadaDTO;
import com.apa.application.usecases.dto.SolicitacaoIniciarMatriculaDTO;
import com.apa.controller.dto.IniciaMatriculaRequestDTO;
import com.apa.controller.dto.IniciaMatriculaResponseDTO;
import com.apa.controller.dto.ResponseDTO;
import com.apa.controller.dto.ResponseDTO.ResponseStatus;
import com.apa.controller.dto.converter.Converter;
import com.apa.domain.exceptions.MatriculaException;

public abstract class AbstractIniciaMatriculaController implements IniciaMatriculaController {
	protected AbstractIniciaMatriculaController(IniciaMatriculaUseCase iniciaMatriculaUseCase,
			Converter<IniciaMatriculaRequestDTO, SolicitacaoIniciarMatriculaDTO> iniciaMatriculaRequestConverter,
			Converter<MatriculaIniciadaDTO, IniciaMatriculaResponseDTO> iniciaMatriculaResponseConverter) {
		this.iniciaMatriculaUseCase = iniciaMatriculaUseCase;
		this.iniciaMatriculaRequestConverter = iniciaMatriculaRequestConverter;
		this.iniciaMatriculaResponseConverter = iniciaMatriculaResponseConverter;
	}
	
	private IniciaMatriculaUseCase iniciaMatriculaUseCase;
	private Converter<IniciaMatriculaRequestDTO, SolicitacaoIniciarMatriculaDTO> iniciaMatriculaRequestConverter;
	private Converter<MatriculaIniciadaDTO, IniciaMatriculaResponseDTO> iniciaMatriculaResponseConverter;
	
	public ResponseDTO<IniciaMatriculaResponseDTO> iniciar(IniciaMatriculaRequestDTO iniciaMatriculaRequest) {
		ResponseDTO<IniciaMatriculaResponseDTO> response = new ResponseDTO<IniciaMatriculaResponseDTO>();
		try {
			SolicitacaoIniciarMatriculaDTO solicitacaoIniciarMatricula = iniciaMatriculaRequestConverter.converter(iniciaMatriculaRequest);
			response.setResultado(iniciaMatriculaResponseConverter.converter(iniciaMatriculaUseCase.iniciarMatricula(solicitacaoIniciarMatricula)));
			response.setStatus(ResponseStatus.OK);
		} catch (MatriculaException e) {
			response.setStatus(ResponseStatus.FAIL);
			response.addMensagem(e.getMessage());
		}
		return response;
	}
}
