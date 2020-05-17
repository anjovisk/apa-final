package com.apa.controller;

import com.apa.application.usecases.InscricaoUseCase;
import com.apa.application.usecases.dto.InscricaoEfetuadaDTO;
import com.apa.application.usecases.dto.SolicitacaoInscricaoDTO;
import com.apa.controller.dto.InscricaoRequestDTO;
import com.apa.controller.dto.InscricaoResponseDTO;
import com.apa.controller.dto.ResponseDTO;
import com.apa.controller.dto.ResponseDTO.ResponseStatus;
import com.apa.controller.dto.converter.Converter;
import com.apa.domain.exceptions.MatriculaException;

public abstract class AbstractInscricaoController implements InscricaoController {
	protected AbstractInscricaoController(InscricaoUseCase inscricaoUseCase,
			Converter<InscricaoRequestDTO, SolicitacaoInscricaoDTO> inscricaoRequestConverter,
			Converter<InscricaoEfetuadaDTO, InscricaoResponseDTO> inscricaoResponseConverter) {
		this.inscricaoUseCase = inscricaoUseCase;
		this.inscricaoRequestConverter = inscricaoRequestConverter;
		this.inscricaoResponseConverter = inscricaoResponseConverter;
	}
	
	private InscricaoUseCase inscricaoUseCase;
	private Converter<InscricaoRequestDTO, SolicitacaoInscricaoDTO> inscricaoRequestConverter;
	private Converter<InscricaoEfetuadaDTO, InscricaoResponseDTO> inscricaoResponseConverter;
	
	public ResponseDTO<InscricaoResponseDTO> inscrever(InscricaoRequestDTO inscricaoRequest) {
		ResponseDTO<InscricaoResponseDTO> response = new ResponseDTO<InscricaoResponseDTO>();
		try {
			SolicitacaoInscricaoDTO solicitacaoInscricao = inscricaoRequestConverter.converter(inscricaoRequest);
			response.setResultado(inscricaoResponseConverter.converter(inscricaoUseCase.efetuarInscricao(solicitacaoInscricao)));
			response.setStatus(ResponseStatus.OK);
		} catch (MatriculaException e) {
			response.setStatus(ResponseStatus.FAIL);
			response.addMensagem(e.getMessage());
		}
		return response;
	}
}
