package com.efratec.algamoney.api.repository.query;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.efratec.algamoney.api.model.Lancamento;
import com.efratec.algamoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	Page<Lancamento> filtrar(LancamentoFilter filter, Pageable pageable);

}
