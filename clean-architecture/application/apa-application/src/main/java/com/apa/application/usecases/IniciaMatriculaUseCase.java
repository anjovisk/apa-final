package com.apa.application.usecases;

import com.apa.application.usecases.dto.MatriculaIniciadaDTO;
import com.apa.application.usecases.dto.SolicitacaoIniciarMatriculaDTO;
import com.apa.domain.exceptions.MatriculaException;

public interface IniciaMatriculaUseCase {
	MatriculaIniciadaDTO iniciarMatricula(SolicitacaoIniciarMatriculaDTO solicitacaoIniciarMatricula) throws MatriculaException;
}
