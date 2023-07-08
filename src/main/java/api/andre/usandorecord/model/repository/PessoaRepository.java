package api.andre.usandorecord.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.andre.usandorecord.model.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {}
