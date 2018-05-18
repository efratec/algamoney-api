import java.net.URL;
import java.security.Security;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.ofm.gnre.service.impl.GerarXmlGnre;
import br.com.ofm.gnre.vo.GnreVO;
import br.com.ofm.gnre.www.webservice.gnreloterecepcao.GnreLoteRecepcaoStub;
import br.com.ofm.gnre.www.webservice.gnreloterecepcao.GnreLoteRecepcaoStub.ProcessarResponse;

/** 
	* GNRE - Guia Nacional de Recolhimento de Tributos Estaduais (LoteRecepcao). 
	*  
	* @author Copyright (c) 2011 Maciel Gonçalves 
	* @Modify Efraim Tenorio
	*  
	* Este programa é software livre, você pode redistribuí-lo e ou modificá-lo 
	* sob os termos da Licença Pública Geral GNU como publicada pela Free 
	* Software Foundation, tanto a versão 2 da Licença, ou (a seu critério) 
	* qualquer versão posterior. 
	*  
	* http://www.gnu.org/licenses/gpl.txt 
	*  
	*/  

public class TesteLoteRecepcao {
    
    private static String montaXMLTeste(){
    	GnreVO vo = new GnreVO();
    	vo.setUfFavorecida("AL");
    	vo.setReceita("100021");//100048
    	vo.setProduto("11");
    	vo.setTipoIdentificacaoEmitente("1");
    	vo.setCnpjContribuinteEmitente("12272084000100");
    	vo.setInscricaoEstadualEmitente("240071778");
    	vo.setTipoDocOrigem("10");
    	vo.setDocOrigem("000049");
    	vo.setValorPrincipal("108.00");
    	vo.setDataVencimento("2018-01-26");
    	vo.setRazaoSocialEmitente("OFM SYSTEMS");
    	vo.setEnderecoEmitente("RUA BARAO DE JARAGUA");
    	vo.setMunicipioEmitente("04302");
    	vo.setUfEnderecoEmitente("AL");
    	vo.setTipoIdentificaoDestinatario("1");
    	vo.setRazaoSocialDestinatario("CARAJAS MATERIAL DE CONSTRUCAO LTDA");
    	vo.setMunicipioDestinatario("27043");
    	vo.setDataPagamento("2018-05-19");
    	vo.setPeriodo("0");
    	vo.setMes("01");
    	vo.setAno("2018");
    	
    	return GerarXmlGnre.gerarXML(vo);
    }	
    
    private static void enviarLoteRecepcao() {
    	try {  
    		
    		System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");  
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
      
            System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");  
            System.clearProperty("javax.net.ssl.keyStore");  
            System.clearProperty("javax.net.ssl.keyStorePassword");  
            System.clearProperty("javax.net.ssl.trustStore");  
            System.setProperty("javax.net.ssl.keyStore", "C:\\dir_certificado\\Certificado.pfx");  
            System.setProperty("javax.net.ssl.keyStorePassword", "ceal2017");  
      
            System.setProperty("javax.net.ssl.trustStoreType", "JKS");  
            System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\efraim.silva\\NFeCacerts");  
    		
            //URL url = new URL("https://www.gnre-h.pe.gov.br/gnreWS/services/GnreLoteRecepcao");
              URL url = new URL("https://www.gnre.pe.gov.br/gnreWS/services/GnreLoteRecepcao");  
  
            String xml = montaXMLTeste();    
            OMElement ome = AXIOMUtil.stringToOM(xml);  
              
            GnreLoteRecepcaoStub.GnreDadosMsg dadosMsg = new GnreLoteRecepcaoStub.GnreDadosMsg();    
            dadosMsg.setExtraElement(ome);    
            
            GnreLoteRecepcaoStub.GnreCabecMsg cabecMsg = new GnreLoteRecepcaoStub.GnreCabecMsg();    
            /**  
             * Versao do XML  
             */    
            cabecMsg.setVersaoDados("1.00");  // Confirmar a versão correta.  
  
            GnreLoteRecepcaoStub stub = new GnreLoteRecepcaoStub(url.toString());  
            ProcessarResponse response = stub.processar(dadosMsg, cabecMsg);  
           
            if (response != null) {  
                info(response.getExtraElement().toString());  
            }  
            
        } catch (Exception e) {  
            error(e.toString());  
        }
    }
    
    /**  
     * Log Info.  
     * @param log  
     */    
    private static void info(String log) {    
        System.out.println("INFO: " + log);    
    }    
    
    /**  
     * Log Error.  
     * @param log  
     */    
    private static void error(String log) {    
        System.out.println("ERROR: " + log);    
    }    
    
	  
    public static void main(String[] args) {  
          enviarLoteRecepcao();
    }
    
} 	
    	
    	
    	