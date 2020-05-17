package com.apa.application.usecases;

import com.apa.application.usecases.dto.ConfirmarMatriculaDTO;
import com.apa.application.usecases.dto.MatriculaConfirmadaDTO;
import com.apa.domain.exceptions.MatriculaException;

public interface ConfirmaMatriculaUseCase {
	MatriculaConfirmadaDTO confirmar(ConfirmarMatriculaDTO confirmarMatricula) throws MatriculaException;
}
