package br.com.ofm.gnre.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ofm.gnre.model.Relatorio;

public interface RelatorioService {
	
	void imprimir(Relatorio relatorio, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
