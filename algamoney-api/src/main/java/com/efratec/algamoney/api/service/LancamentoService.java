package com.efratec.algamoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efratec.algamoney.api.model.Lancamento;
import com.efratec.algamoney.api.model.Pessoa;
import com.efratec.algamoney.api.repository.LancamentoRepository;
import com.efratec.algamoney.api.repository.PessoaRepository;
import com.efratec.algamoney.api.service.exceptions.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired LancamentoRepository lancamentoRepository;
	@Autowired PessoaRepository pessoRepository;
	
	public Lancamento salvar(Lancamento entidade) {
		Pessoa pessoaLancamento = pessoRepository.findOne(entidade.getPessoa().getCodigo());

		if (pessoaLancamento == null || pessoaLancamento.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}

		return lancamentoRepository.save(entidade);
	}
	
	
	public void removerLancamentoPorCodigo(Long codigoLancamento) {
		if (codigoLancamento != null) {
			lancamentoRepository.delete(lancamentoRepository.findOne(codigoLancamento));
		}
	}

}
