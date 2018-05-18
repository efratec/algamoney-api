package br.com.ofm.gnre.service;

import br.com.ofm.gnre.model.TRetLoteGNRE;
import br.com.ofm.gnre.vo.GnreVO;

/** 
* GNRE - Guia Nacional de Recolhimento de Tributos Estaduais (LoteRecepcao). 
*  
* @author Efraim Tenorio
*
* Interface do Servi�o Java para Envio do Lote de Recep��o da GNRE 
*  
*/ 

public interface LoteRecepcaoService {
	
	String montarXMLGnre(GnreVO gnreVO);

	TRetLoteGNRE enviarLoteRecepcao(String xmlLoteRecepcao, String caminhoCertificado, String senhaCertificado, String caminhoCarcets);

}
