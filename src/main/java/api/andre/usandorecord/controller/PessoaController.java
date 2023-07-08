package api.andre.usandorecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import api.andre.usandorecord.model.dto.DadosPessoa;
import api.andre.usandorecord.model.entity.Pessoa;
import api.andre.usandorecord.model.repository.PessoaRepository;

@RestController("/")
public class PessoaController {
	
	@Autowired
	private PessoaRepository repository;
	
	@PostMapping
	public Pessoa addPessoa(@RequestBody DadosPessoa pessoa) { return repository.save(new Pessoa(pessoa)); }

}
