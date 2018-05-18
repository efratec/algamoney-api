package br.com.ofm.gnre.service.impl;

import java.io.StringWriter;
import java.net.URL;
import java.security.Security;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.ofm.gnre.app.ObjectFactory;
import br.com.ofm.gnre.model.TConfigUf;
import br.com.ofm.gnre.model.TConsultaConfigUf;
import br.com.ofm.gnre.model.TSimNao;
import br.com.ofm.gnre.model.TUf;
import br.com.ofm.gnre.service.LoteConfiguracaoReceitaUF;
import br.com.ofm.gnre.util.XMLUtil;
import br.com.ofm.gnre.www.webservice.gnreconfiguf.GnreConfigUFStub;

public class LoteConfiguracaoReceitaUFImpl implements LoteConfiguracaoReceitaUF {
	

	@SuppressWarnings("restriction")
	public TConfigUf retornaConfiguracaoUF(TUf uf, String codigoReceita, String caminhoCertificado, TSimNao courier,
			String senhaCertificado, String cacertsPath) {
	        
        ObjectFactory objectFactory = new ObjectFactory();
		
        TConsultaConfigUf configUf = objectFactory.createTConsultaConfigUf();  
        TConsultaConfigUf.Receita receita = objectFactory.createTConsultaConfigUfReceita();
	    
        receita.setValue(codigoReceita);  
        receita.setCourier(courier);  
          
        configUf.setAmbiente("1");  
        configUf.setUf(uf);  
        configUf.setReceita(receita);  
        
        try {
            JAXBContext jc = JAXBContext.newInstance(TConsultaConfigUf.class);  
            Marshaller marshaller = jc.createMarshaller();  
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
            
            //System.out.println(configUf.getAmbiente());  
  
            URL url = new URL("https://www.gnre.pe.gov.br/gnreWS/services/GnreConfigUF");  
  
            System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");  
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
  
            System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");  
  
            System.clearProperty("javax.net.ssl.keyStore");  
            System.clearProperty("javax.net.ssl.keyStorePassword");  
            System.clearProperty("javax.net.ssl.trustStore");  
  
            System.setProperty("javax.net.ssl.keyStore", caminhoCertificado);  
            System.setProperty("javax.net.ssl.keyStorePassword", senhaCertificado);  
  
            System.setProperty("javax.net.ssl.trustStoreType", "JKS");  
            System.setProperty("javax.net.ssl.trustStore", cacertsPath);  
              
            OMElement ome = AXIOMUtil.stringToOM(jaxbObjectToXML(configUf));  
  
            GnreConfigUFStub.GnreDadosMsg dadosMsg = new GnreConfigUFStub.GnreDadosMsg();  
            dadosMsg.setExtraElement(ome);  
            GnreConfigUFStub.GnreCabecMsg cabecMsg = new GnreConfigUFStub.GnreCabecMsg();  
            cabecMsg.setVersaoDados("1.00");  
            GnreConfigUFStub stub = new GnreConfigUFStub(url.toString());  
  
            stub.consultar(dadosMsg, cabecMsg);  
  
            GnreConfigUFStub.GnreRespostaMsg result = stub.consultar(dadosMsg, cabecMsg);  
  
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
            dbf.setNamespaceAware(true);  
            //System.out.println(result.getExtraElement().toString());  
            
            return XMLUtil.xmlToObject(result.getExtraElement().toString(), TConfigUf.class);
       
        }catch(Exception erro){
            System.out.println(erro);
        }
        
        return null;
    }
	    
    public static String jaxbObjectToXML(TConsultaConfigUf tConsultaConfigUf) {
        String xmlString = "";
        try {
            JAXBContext context = JAXBContext.newInstance(TConsultaConfigUf.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            StringWriter sw = new StringWriter();
            m.marshal(tConsultaConfigUf, sw);
            xmlString = sw.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlString;
        
    }

}
