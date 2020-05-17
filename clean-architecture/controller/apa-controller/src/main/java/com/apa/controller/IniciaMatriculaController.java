package com.apa.controller;

import com.apa.controller.dto.IniciaMatriculaRequestDTO;
import com.apa.controller.dto.IniciaMatriculaResponseDTO;
import com.apa.controller.dto.ResponseDTO;

public interface IniciaMatriculaController {
	ResponseDTO<IniciaMatriculaResponseDTO> iniciar(IniciaMatriculaRequestDTO iniciaMatriculaRequest);
}
