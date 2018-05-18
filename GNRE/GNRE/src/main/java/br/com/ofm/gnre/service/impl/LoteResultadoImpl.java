package br.com.ofm.gnre.service.impl;

import java.net.URL;
import java.security.Security;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.ofm.gnre.app.ObjectFactory;
import br.com.ofm.gnre.model.TConsLoteGNRE;
import br.com.ofm.gnre.model.TResultLoteGNRE;
import br.com.ofm.gnre.service.LoteResultadoService;
import br.com.ofm.gnre.util.InfoUtil;
import br.com.ofm.gnre.util.XMLUtil;
import br.com.ofm.gnre.vo.LoteResultadoVO;
import br.com.ofm.gnre.www.webservice.gnreresultadolote.GnreResultadoLoteStub;
import br.com.ofm.gnre.www.webservice.gnreresultadolote.GnreResultadoLoteStub.GnreCabecMsg;
import br.com.ofm.gnre.www.webservice.gnreresultadolote.GnreResultadoLoteStub.GnreDadosMsg;

public class LoteResultadoImpl implements LoteResultadoService {

	@SuppressWarnings("restriction")
	public LoteResultadoVO consultaLoteResultadoPorNumeroReciboLoteRecepcao(String numeroReciboLoteRecepcao,
			String caminhoCertificado, String senhaCertificado, String caminhoCarcets) throws Exception {

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
          
        URL url = new URL("https://www.gnre.pe.gov.br/gnreWS/services/GnreResultadoLote");
        
        GnreResultadoLoteStub stub = new GnreResultadoLoteStub(url.toString());  
        GnreCabecMsg cabecMsg = new GnreResultadoLoteStub.GnreCabecMsg();  
        cabecMsg.setVersaoDados("1.00");  
        GnreDadosMsg dadosMsg = new GnreResultadoLoteStub.GnreDadosMsg();  
          
        ObjectFactory factory = new ObjectFactory();  
        TConsLoteGNRE consLoteGNRE = factory.createTConsLoteGNRE();  
        consLoteGNRE.setAmbiente("1");  
        consLoteGNRE.setNumeroRecibo(numeroReciboLoteRecepcao);
          
        JAXBContext context = JAXBContext.newInstance("br.com.ofm.gnre.app");  
        Marshaller marshaller = context.createMarshaller();  
        marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);  
          
        String xmlLoteResultado = XMLUtil.objectToXML(consLoteGNRE);
        
        InfoUtil.info(xmlLoteResultado);
        
        OMElement ome = AXIOMUtil.stringToOM(xmlLoteResultado);  
        dadosMsg.setExtraElement(ome);  
          
        GnreResultadoLoteStub.GnreRespostaMsg response = stub.consultar(dadosMsg, cabecMsg);  
      
        TResultLoteGNRE resultadoLote = XMLUtil.xmlToObject(response.getExtraElement().toString(), TResultLoteGNRE.class);
        
        InfoUtil.info(resultadoLote.getResultado());
       
		return retornaLoteResultadoVO(resultadoLote);
	}
	
	private LoteResultadoVO retornaLoteResultadoVO(TResultLoteGNRE resultadoLote) {
		
		String[] resultados = resultadoLote.getResultado().split("\n");

		LoteResultadoVO loteResultadoVO = new LoteResultadoVO();

		for (int i = 0; i < resultados.length; i++) {

			if (i == 0) {
				loteResultadoVO.setIdentificadorSolicitante(resultados[i].substring(1, 2));
			}

			if (i == 1) {
				loteResultadoVO.setUfFavorecida(resultados[i].substring(6, 8));
				loteResultadoVO.setCodigoReceita(resultados[i].substring(8, 14));
				loteResultadoVO.setTipoDocumentoEmitente(resultados[i].substring(14, 14));
				loteResultadoVO.setRazaoSocialEmitente(resultados[i].substring(31, 91));
				loteResultadoVO.setEnderecoEmitente(resultados[i].substring(91, 151));
				loteResultadoVO.setMunicipioEmitente(resultados[i].substring(151, 201));
				loteResultadoVO.setUfEmitente(resultados[i].substring(201, 203));
				loteResultadoVO.setCepEmitente(resultados[i].substring(203, 211));
				loteResultadoVO.setTelefoneEmitente(resultados[i].substring(211, 222));
				loteResultadoVO.setTipoDocumentoDestinatario(resultados[i].substring(222, 222));
				loteResultadoVO.setMunicipioDestinatario(resultados[i].substring(239, 289));
				loteResultadoVO.setProduto(resultados[i].substring(289, 544));
				loteResultadoVO.setNumeroDocumentoOrigem(resultados[i].substring(544, 562));
				loteResultadoVO.setConvenio(resultados[i].substring(562, 592));
				loteResultadoVO.setInformacoesComplementares(resultados[i].substring(592, 892));
				loteResultadoVO.setDataVencimento(resultados[i].substring(892, 900));
				loteResultadoVO.setDataLimitePagamento(resultados[i].substring(900, 908));
				loteResultadoVO.setDataPeriodoReferencia(resultados[i].substring(908, 909));
				loteResultadoVO.setDataMesAnoReferencia(resultados[i].substring(909, 915));
				loteResultadoVO.setValorPrincipal(resultados[i].substring(918, 933));
				loteResultadoVO.setAtualizacaoMonetaria(resultados[i].substring(933,948));
				loteResultadoVO.setJuros(resultados[i].substring(948, 963));
				loteResultadoVO.setMulta(resultados[i].substring(963, 978));
				loteResultadoVO.setRepresentacaoNumerica(resultados[i].substring(978, 1026));
				loteResultadoVO.setCodigoBarras(resultados[i].substring(1026, 1070));
				loteResultadoVO.setNumeroControle(resultados[i].substring(1071, 1087));
				loteResultadoVO.setGuiaGeradaContigencia(resultados[i].substring(1097, 1098));
				loteResultadoVO.setReservado(resultados[i].substring(1098, 1224));
			}
		}
		 
		 
		 
		return loteResultadoVO;
		
	}

}

