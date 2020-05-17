package com.apa.web.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apa.application.usecases.IniciaMatriculaUseCase;
import com.apa.application.usecases.dto.MatriculaIniciadaDTO;
import com.apa.application.usecases.dto.SolicitacaoIniciarMatriculaDTO;
import com.apa.controller.AbstractIniciaMatriculaController;
import com.apa.controller.dto.IniciaMatriculaRequestDTO;
import com.apa.controller.dto.IniciaMatriculaResponseDTO;
import com.apa.controller.dto.ResponseDTO;
import com.apa.controller.dto.ResponseDTO.ResponseStatus;
import com.apa.controller.dto.converter.Converter;

@RestController
@RequestMapping("/public/v1/aluno")
public class IniciaMatriculaController extends AbstractIniciaMatriculaController implements com.apa.controller.IniciaMatriculaController {
	@Autowired
	IniciaMatriculaController(IniciaMatriculaUseCase iniciaMatriculaUseCase,
			Converter<IniciaMatriculaRequestDTO, SolicitacaoIniciarMatriculaDTO> iniciaMatriculaRequestConverter,
			Converter<MatriculaIniciadaDTO, IniciaMatriculaResponseDTO> iniciaMatriculaResponseConverter) {
		super(iniciaMatriculaUseCase, iniciaMatriculaRequestConverter, iniciaMatriculaResponseConverter);
	}
	
	@RequestMapping(path =  "/{idAluno}/matriculas", method = RequestMethod.POST)
	public ResponseEntity<?> getInscricoes(@PathVariable("idAluno") Long idAluno) {
		IniciaMatriculaRequestDTO iniciaMatriculaRequest = new IniciaMatriculaRequestDTO();
		iniciaMatriculaRequest.setIdAluno(idAluno);
		ResponseDTO<IniciaMatriculaResponseDTO> matriculaIniciadaResponse = iniciar(iniciaMatriculaRequest);
		return ResponseEntity
				.status(matriculaIniciadaResponse.getStatus().equals(ResponseStatus.OK) ? HttpStatus.OK : HttpStatus.BAD_REQUEST)
				.body(matriculaIniciadaResponse);
	}
}
