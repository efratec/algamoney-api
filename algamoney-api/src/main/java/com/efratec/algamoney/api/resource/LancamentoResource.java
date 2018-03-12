package com.efratec.algamoney.api.resource;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.efratec.algamoney.api.event.RecursoCriadoEvent;
import com.efratec.algamoney.api.model.Lancamento;
import com.efratec.algamoney.api.repository.LancamentoRepository;
import com.efratec.algamoney.api.repository.filter.LancamentoFilter;
import com.efratec.algamoney.api.service.LancamentoService;
import com.efratec.algamoney.api.service.exceptions.PessoaInexistenteOuInativaException;
import com.efratec.algamoney.api.util.MensagemValidacao;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {
	
	@Autowired LancamentoRepository lancamentoRepository;
	@Autowired LancamentoService lancamentoService;
	@Autowired ApplicationEventPublisher publish;
	@Autowired MessageSource messageSource;
	
	@GetMapping
	public Page<Lancamento> pesquisarLancamentos(LancamentoFilter lancamentoFilter, Pageable pageable) {
		return lancamentoRepository.filtrar(lancamentoFilter,pageable);
	}
	
	@PostMapping
	public ResponseEntity<Lancamento> criarLancamento(@Valid @RequestBody Lancamento lancamento, HttpServletResponse response){
		Lancamento novoLancamento = lancamentoService.salvar(lancamento);
		publish.publishEvent(new RecursoCriadoEvent(this, response, novoLancamento.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(novoLancamento);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Lancamento> buscarLancamentos(@PathVariable Long codigo){
		Lancamento lancamentoRetornado = lancamentoRepository.findOne(codigo);
		return lancamentoRetornado != null ? ResponseEntity.ok(lancamentoRetornado) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removerLancamento(@PathVariable Long codigo) {
		lancamentoService.removerLancamentoPorCodigo(codigo);
	}
	
	@ExceptionHandler({PessoaInexistenteOuInativaException.class})
	public ResponseEntity<Object> handlePessoaInexistenteOuInativaException(PessoaInexistenteOuInativaException ex){
		String mensagemValidacao = messageSource.getMessage("pessoa.inexistente-ou-inativa", null, LocaleContextHolder.getLocale());
		String mensagemDesenvolvedor = ExceptionUtils.getRootCauseMessage(ex);
		List<MensagemValidacao> erros = Arrays.asList(new MensagemValidacao(mensagemValidacao, mensagemDesenvolvedor));
		return ResponseEntity.badRequest().body(erros);
	}

}
