package com.efratec.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efratec.algamoney.api.model.Lancamento;
import com.efratec.algamoney.api.repository.query.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
	

}
