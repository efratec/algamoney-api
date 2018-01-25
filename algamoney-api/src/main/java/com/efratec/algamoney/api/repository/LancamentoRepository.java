package com.efratec.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efratec.algamoney.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
	

}
