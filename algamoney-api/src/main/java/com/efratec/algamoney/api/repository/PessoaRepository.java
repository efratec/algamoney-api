package com.efratec.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efratec.algamoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
