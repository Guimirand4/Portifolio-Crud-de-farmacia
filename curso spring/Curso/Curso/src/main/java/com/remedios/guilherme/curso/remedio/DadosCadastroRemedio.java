package com.remedios.guilherme.curso.remedio;

import java.time.LocalDate;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroRemedio(
		
		@NotBlank
		String nome,
		@Enumerated
		Via via,
		@NotBlank
		String lote,
		
		int quantidade,
		
		@Future
		LocalDate validade,
		@Enumerated
		Laboratorio laboratorio) {

}
