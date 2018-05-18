package br.com.ofm.gnre.service.impl;

import java.net.URL;
import java.security.Security;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.ofm.gnre.model.TRetLoteGNRE;
import br.com.ofm.gnre.service.LoteRecepcaoService;
import br.com.ofm.gnre.util.InfoUtil;
import br.com.ofm.gnre.util.XMLUtil;
import br.com.ofm.gnre.vo.GnreVO;
import br.com.ofm.gnre.www.webservice.gnreloterecepcao.GnreLoteRecepcaoStub;
import br.com.ofm.gnre.www.webservice.gnreloterecepcao.GnreLoteRecepcaoStub.ProcessarResponse;

/** 
* GNRE - Guia Nacional de Recolhimento de Tributos Estaduais (LoteRecepcao).
*  
* @author Efraim Tenorio
* 
* Interface do Servi�o Java para Envio do Lote de Recep��o da GNRE 
*  
*/ 

public class LoteRecepcaoServiceImpl implements LoteRecepcaoService {

	@SuppressWarnings("restriction")
	public TRetLoteGNRE enviarLoteRecepcao(String xmlLoteRecepcao, String caminhoCertificado, String senhaCertificado,
			String caminhoCarcets) {
		
		try {  
    		
			System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");  
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
      
            System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");  
            System.clearProperty("javax.net.ssl.keyStore");  
            System.clearProperty("javax.net.ssl.keyStorePassword");  
            System.clearProperty("javax.net.ssl.trustStore");  
            System.setProperty("javax.net.ssl.keyStore", caminhoCertificado);  
            System.setProperty("javax.net.ssl.keyStorePassword", senhaCertificado);  
      
            System.setProperty("javax.net.ssl.trustStoreType", "JKS");  
            System.setProperty("javax.net.ssl.trustStore", caminhoCarcets);  
    		
            URL url = new URL("https://www.gnre.pe.gov.br/gnreWS/services/GnreLoteRecepcao");  
  
            OMElement ome = AXIOMUtil.stringToOM(xmlLoteRecepcao);  
              
            GnreLoteRecepcaoStub.GnreDadosMsg dadosMsg = new GnreLoteRecepcaoStub.GnreDadosMsg();    
            dadosMsg.setExtraElement(ome);    
            
            GnreLoteRecepcaoStub.GnreCabecMsg cabecMsg = new GnreLoteRecepcaoStub.GnreCabecMsg();    
            
            cabecMsg.setVersaoDados("1.00");  
  
            GnreLoteRecepcaoStub stub = new GnreLoteRecepcaoStub(url.toString());  
            ProcessarResponse response = stub.processar(dadosMsg, cabecMsg);  
           
            if (response != null) {  
                InfoUtil.info(response.getExtraElement().toString());  
                return XMLUtil.xmlToObject(response.getExtraElement().toString(), TRetLoteGNRE.class);
            }  
            
        } catch (Exception e) {  
            InfoUtil.error(e.toString());
            return null;
        }
		
		return null;
	}
	
	public String montarXMLGnre(GnreVO gnreVO) {
		return GerarXmlGnre.gerarXML(gnreVO);
	}


}
