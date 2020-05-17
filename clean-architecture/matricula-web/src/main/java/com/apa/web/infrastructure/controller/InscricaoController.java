package com.apa.web.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apa.application.usecases.InscricaoUseCase;
import com.apa.application.usecases.dto.InscricaoEfetuadaDTO;
import com.apa.application.usecases.dto.SolicitacaoInscricaoDTO;
import com.apa.controller.AbstractInscricaoController;
import com.apa.controller.dto.InscricaoRequestDTO;
import com.apa.controller.dto.InscricaoResponseDTO;
import com.apa.controller.dto.ResponseDTO;
import com.apa.controller.dto.ResponseDTO.ResponseStatus;
import com.apa.controller.dto.converter.Converter;

@RestController
@RequestMapping("/public/v1/aluno")
public class InscricaoController extends AbstractInscricaoController implements com.apa.controller.InscricaoController {
	@Autowired
	InscricaoController(InscricaoUseCase inscricaoUseCase,
			Converter<InscricaoRequestDTO, SolicitacaoInscricaoDTO> inscricaoRequestConverter,
			Converter<InscricaoEfetuadaDTO, InscricaoResponseDTO> inscricaoResponseConverter) {
		super(inscricaoUseCase, inscricaoRequestConverter, inscricaoResponseConverter);
	}
	
	@RequestMapping(path =  "/{idAluno}/inscricoes", method = RequestMethod.POST)
	public ResponseEntity<?> getInscricoes(@PathVariable("idAluno") Long idAluno, 
			@RequestBody InscricaoRequestDTO inscricaoRequest) {
		ResponseDTO<InscricaoResponseDTO> inscricaoResponse = inscrever(inscricaoRequest);
		return ResponseEntity
				.status(inscricaoResponse.getStatus().equals(ResponseStatus.OK) ? HttpStatus.OK : HttpStatus.BAD_REQUEST)
				.body(inscricaoResponse);
	}
}
