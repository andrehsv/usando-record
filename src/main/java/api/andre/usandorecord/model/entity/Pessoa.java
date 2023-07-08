package api.andre.usandorecord.model.entity;

import api.andre.usandorecord.model.Estado;
import api.andre.usandorecord.model.dto.DadosPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String sobrenome;
	private String cpf;
	
	@Enumerated(EnumType.STRING)
	private Estado estado;
	
	public Pessoa(DadosPessoa dados) {
		this.nome = dados.nome();
		this.sobrenome = dados.sobrenome();
		this.cpf = dados.cpf();
		this.estado = dados.estado();
	}

}
