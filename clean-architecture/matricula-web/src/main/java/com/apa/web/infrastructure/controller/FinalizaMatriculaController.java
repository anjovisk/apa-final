package com.apa.web.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apa.application.usecases.ConfirmaMatriculaUseCase;
import com.apa.application.usecases.dto.ConfirmarMatriculaDTO;
import com.apa.application.usecases.dto.MatriculaConfirmadaDTO;
import com.apa.controller.AbstractConfirmaMatriculaController;
import com.apa.controller.dto.ConfirmaMatriculaRequestDTO;
import com.apa.controller.dto.ConfirmaMatriculaResponseDTO;
import com.apa.controller.dto.ResponseDTO;
import com.apa.controller.dto.ResponseDTO.ResponseStatus;
import com.apa.controller.dto.converter.Converter;

@RestController
@RequestMapping("/public/v1/aluno")
public class FinalizaMatriculaController extends AbstractConfirmaMatriculaController implements com.apa.controller.ConfirmaMatriculaController {
	@Autowired
	FinalizaMatriculaController(ConfirmaMatriculaUseCase confirmaMatriculaUseCase,
			Converter<ConfirmaMatriculaRequestDTO, ConfirmarMatriculaDTO> confirmaMatriculaRequestConverter,
			Converter<MatriculaConfirmadaDTO, ConfirmaMatriculaResponseDTO> confirmaMatriculaResponseConverter) {
		super(confirmaMatriculaUseCase, confirmaMatriculaRequestConverter, confirmaMatriculaResponseConverter);
	}
	
	@RequestMapping(path =  "/{idAluno}/matriculas/{idMatricula}/confirmar", method = RequestMethod.POST)
	public ResponseEntity<?> getInscricoes(@PathVariable("idAluno") Long idAluno,
			@PathVariable("idMatricula") Long idMatricula) {
		ConfirmaMatriculaRequestDTO confirmaMatriculaRequest = new ConfirmaMatriculaRequestDTO();
		confirmaMatriculaRequest.setIdAluno(idAluno);
		confirmaMatriculaRequest.setIdMatricula(idMatricula);
		ResponseDTO<ConfirmaMatriculaResponseDTO> confirmaMatriculaResponse = confirmar(confirmaMatriculaRequest);
		return ResponseEntity
				.status(confirmaMatriculaResponse.getStatus().equals(ResponseStatus.OK) ? HttpStatus.OK : HttpStatus.BAD_REQUEST)
				.body(confirmaMatriculaResponse);
	}
}
