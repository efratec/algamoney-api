package br.com.ofm.gnre.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.ofm.gnre.model.Relatorio;
import br.com.ofm.gnre.service.RelatorioService;
import br.com.ofm.gnre.service.impl.RelatorioCacheService;
import br.com.ofm.gnre.service.impl.RelatorioServiceImpl;

@Controller
@RequestMapping("/relatorio")
public class RelatorioController {
	
	@Autowired
	private RelatorioCacheService relatorioCacheService;

	@Autowired
	private RelatorioService relatorioServiceImpl;
	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public void teste(HttpServletRequest request, HttpServletResponse response) {

		
			try {
				response.getWriter().println("CHEGOU");
			} catch (IOException ex) {
				ex.printStackTrace();
			}
	}


	@RequestMapping(value = "/consultar/{chave}/{relatorio}", method = RequestMethod.GET)
	public void consultar(@PathVariable("chave") String chave, @PathVariable("relatorio") String relatorioNome,
			HttpServletRequest request, HttpServletResponse response) {

		try {
			relatorioServiceImpl.imprimir(relatorioCacheService.getRelatorio(chave), request, response);
		} catch (Exception e) {
			e.printStackTrace();

			try {
				response.getWriter().println(e.getMessage());
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	@ResponseBody
	@RequestMapping(value = "/gerar/{relatorio}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public void gerar(@PathVariable("relatorio") String relatorioNome, @RequestParam Map<String, Object> parametros,
			HttpServletRequest request, HttpServletResponse response) throws IOException {

		if (parametros != null) {
			parametros = RelatorioServiceImpl.tratarTiposDeParametros(parametros);
		}
		
		Relatorio relatorio = new Relatorio(relatorioNome, parametros, getIdEmpresaParametros(parametros));
		String key = relatorioCacheService.addRelatorio(relatorio);

		response.sendRedirect("../consultar/" + key + "/" + relatorioNome);
	}
	
	private Long getIdEmpresaParametros(Map<String, Object> parametros) {
		if (parametros == null) 
			return null;
		
		if (parametros.containsKey("idEmpresa") && parametros.get("idEmpresa") != null) {
			
			return Long.parseLong(parametros.get("idEmpresa").toString());
		}
		
		return null;
	}
	

}
