package com.apa.controller;

import com.apa.controller.dto.InscricaoRequestDTO;
import com.apa.controller.dto.InscricaoResponseDTO;
import com.apa.controller.dto.ResponseDTO;

public interface InscricaoController {
	ResponseDTO<InscricaoResponseDTO> inscrever(InscricaoRequestDTO inscricaoRequest);
}
