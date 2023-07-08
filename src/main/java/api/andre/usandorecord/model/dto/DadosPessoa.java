package api.andre.usandorecord.model.dto;

import api.andre.usandorecord.model.Estado;

public record DadosPessoa(
		String nome,
		String sobrenome,
		String cpf,
		Estado estado) {}