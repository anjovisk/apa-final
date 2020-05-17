package com.apa.controller;

import com.apa.controller.dto.ConfirmaMatriculaRequestDTO;
import com.apa.controller.dto.ConfirmaMatriculaResponseDTO;
import com.apa.controller.dto.ResponseDTO;

public interface ConfirmaMatriculaController {
	ResponseDTO<ConfirmaMatriculaResponseDTO> confirmar(ConfirmaMatriculaRequestDTO confirmaMatriculaRequest);
}
