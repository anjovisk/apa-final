package com.apa.controller.dto.converter;

public interface Converter<FROM, TO> {
	TO converter(FROM from);
}
