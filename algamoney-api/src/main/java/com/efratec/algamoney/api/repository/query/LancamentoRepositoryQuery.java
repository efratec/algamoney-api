package com.efratec.algamoney.api.repository.query;

import java.util.List;

import com.efratec.algamoney.api.model.Lancamento;
import com.efratec.algamoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	List<Lancamento> filtrar(LancamentoFilter filter);

}
