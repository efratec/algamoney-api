package com.efratec.algamoney.api.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efratec.algamoney.api.event.RecursoCriadoEvent;
import com.efratec.algamoney.api.model.Lancamento;
import com.efratec.algamoney.api.repository.LancamentoRepository;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {
	
	@Autowired LancamentoRepository lancamentoRepository;
	@Autowired ApplicationEventPublisher publish;
	
	@GetMapping
	public List<Lancamento> listarLancamentos() {
		return lancamentoRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Lancamento> criarLancamento(@Valid @RequestBody Lancamento lancamento, HttpServletResponse response){
		Lancamento novoLancamento = lancamentoRepository.save(lancamento);
		publish.publishEvent(new RecursoCriadoEvent(this, response, novoLancamento.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(novoLancamento);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Lancamento> buscarLancamentos(@PathVariable Long codigo){
		Lancamento lancamentoRetornado = lancamentoRepository.findOne(codigo);
		return lancamentoRetornado != null ? ResponseEntity.ok(lancamentoRetornado) : ResponseEntity.notFound().build();
	}

}
