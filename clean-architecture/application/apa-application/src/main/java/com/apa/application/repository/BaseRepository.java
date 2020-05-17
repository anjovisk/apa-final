package com.apa.application.repository;

import java.util.Optional;

public interface BaseRepository<T, ID> {
	T salvar(T t);
	T atualizar(T t);
	void apagar(ID id);
	Optional<? extends T> recuperar(ID id);
}
