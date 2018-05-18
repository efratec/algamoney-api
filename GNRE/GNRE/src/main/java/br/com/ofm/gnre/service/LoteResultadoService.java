package br.com.ofm.gnre.service;

import br.com.ofm.gnre.vo.LoteResultadoVO;



public interface LoteResultadoService {
	
	LoteResultadoVO consultaLoteResultadoPorNumeroReciboLoteRecepcao(String numeroReciboLoteRecepcao,
			String caminhoCertificado, String senhaCertificado, String caminhoCarcets) throws Exception;

}
