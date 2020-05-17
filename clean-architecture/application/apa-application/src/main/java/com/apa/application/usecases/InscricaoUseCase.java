package com.apa.application.usecases;

import com.apa.application.usecases.dto.SolicitacaoInscricaoDTO;
import com.apa.application.usecases.dto.InscricaoEfetuadaDTO;
import com.apa.domain.disciplina.inscricao.Inscricao;
import com.apa.domain.exceptions.MatriculaException;

public interface InscricaoUseCase {
	<T extends Inscricao> InscricaoEfetuadaDTO efetuarInscricao(SolicitacaoInscricaoDTO solicitacaoInscricao) throws MatriculaException;
}
