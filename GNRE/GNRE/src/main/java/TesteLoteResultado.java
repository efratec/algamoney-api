import java.net.URL;
import java.security.Security;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.ofm.gnre.app.ObjectFactory;
import br.com.ofm.gnre.model.TConsLoteGNRE;
import br.com.ofm.gnre.model.TResultLoteGNRE;
import br.com.ofm.gnre.util.XMLUtil;
import br.com.ofm.gnre.www.webservice.gnreresultadolote.GnreResultadoLoteStub;
import br.com.ofm.gnre.www.webservice.gnreresultadolote.GnreResultadoLoteStub.GnreCabecMsg;
import br.com.ofm.gnre.www.webservice.gnreresultadolote.GnreResultadoLoteStub.GnreDadosMsg;

public class TesteLoteResultado {

    public static final String cacertsPath = "C:\\Users\\efraim.silva\\NFeCacerts";
    public static final String caminhoCertificado = "c:\\dir_certificado\\Certificado.pfx";
    public static final String keyStorePassword = "ceal2017";
    public static final char[] passwordPin = keyStorePassword.toCharArray();

    public TesteLoteResultado() { }

    public static void main(String[] args) throws Exception {
    	
    	System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");  
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
  
        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");  
  
        System.clearProperty("javax.net.ssl.keyStore");  
        System.clearProperty("javax.net.ssl.keyStorePassword");  
        System.clearProperty("javax.net.ssl.trustStore");  
  
        System.setProperty("javax.net.ssl.keyStore", "C:\\dir_certificado\\Certificado.pfx");  
        System.setProperty("javax.net.ssl.keyStorePassword", keyStorePassword);  
  
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");  
        System.setProperty("javax.net.ssl.trustStore", cacertsPath);  
          
        URL url = new URL("https://www.gnre.pe.gov.br/gnreWS/services/GnreResultadoLote");
        GnreResultadoLoteStub stub = new GnreResultadoLoteStub(url.toString());  
          
        GnreCabecMsg cabecMsg = new GnreResultadoLoteStub.GnreCabecMsg();  
        cabecMsg.setVersaoDados("1.00");  
          
        GnreDadosMsg dadosMsg = new GnreResultadoLoteStub.GnreDadosMsg();  
          
        ObjectFactory factory = new ObjectFactory();  
        TConsLoteGNRE consLoteGNRE = factory.createTConsLoteGNRE();  
        consLoteGNRE.setAmbiente("1");  
        consLoteGNRE.setNumeroRecibo("1830733874");  // 1819545420
          
        JAXBContext context = JAXBContext.newInstance("br.com.ofm.gnre.app");  
        Marshaller marshaller = context.createMarshaller();  
        marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);  
          
        //File f = new File("c:\\consulta_lote.xml");  
        //marshaller.marshal(consLoteGNRE, f);  
        String xml = XMLUtil.objectToXML(consLoteGNRE);  
          
        System.out.println("XML: " +  xml);  
        OMElement ome = AXIOMUtil.stringToOM(xml);  
        dadosMsg.setExtraElement(ome);  
          
        GnreResultadoLoteStub.GnreRespostaMsg response = stub.consultar(dadosMsg, cabecMsg);  
        TResultLoteGNRE resultado = XMLUtil.xmlToObject(response.getExtraElement().toString(), TResultLoteGNRE.class);
        System.out.println(resultado.getResultado()/*"resposta: " + response.getExtraElement().toString()*/);  
       
        String[] partes = resultado.getResultado().split("\n");
		
		
		for (int i = 0; i < partes.length; i++) {
			
			if (i == 0) {
				String parte = partes[i];
				System.out.println("CNPJ/CPF/IE : " + parte.substring(1, 2));
			}
			
			if (i == 1) {
				String parte = partes[i];
				System.out.println("UF Favorecida : " + parte.substring(6, 8));
				System.out.println("Código da Receita : " + parte.substring(8, 14));
				System.out.println("Razão Social Emitente : " + parte.substring(31, 91));
				System.out.println("Endereço Emitente : " + parte.substring(91, 151));
				System.out.println("Município Emitente : " + parte.substring(151, 201));
				System.out.println("UF Emitente : " + parte.substring(201, 203));
				System.out.println("CEP Emitente : " + parte.substring(203, 211));
				System.out.println("Telefone Emitente : " + parte.substring(211, 222));
				System.out.println("Municipio Destinatário : " + parte.substring(239, 289));
				System.out.println("Produto : " + parte.substring(289, 544));
				System.out.println("Nº Documento de Origem : " + parte.substring(544, 562));
				System.out.println("Convenio : " + parte.substring(562, 592));
				System.out.println("Informações Complementares : " + parte.substring(592, 892));
				System.out.println("Data de Vencimento : " + parte.substring(892, 900));
				System.out.println("Data Limite de Pagamento : " + parte.substring(900, 908));
				System.out.println("Período de Referência : " + parte.substring(908, 909));
				System.out.println("MêS/Ano de Referência : " + parte.substring(909, 915));
				System.out.println("Parcela : " + parte.substring(915, 918));
				System.out.println("Valor Principal : " + parte.substring(918, 933));
				System.out.println("Atualização Monetária : " + parte.substring(933, 948));
				System.out.println("Juros : " + parte.substring(948,963));
				System.out.println("Multa : " + parte.substring(963,978));
				System.out.println("Representação Numérica : " + parte.substring(978,1026));
				System.out.println("Código de Barras : " + parte.substring(1026,1070));
				System.out.println("Qtd de Vias : " + parte.substring(1070,1070));
				System.out.println("Nº Controle : " + parte.substring(1071,1087));
				System.out.println("Identificador da Guia : " + parte.substring(1087,1097));
				System.out.println("Guia Gerada em Contigência : " + parte.substring(1097,1098));
				System.out.println("Reservado : " + parte.substring(1098,1224));
			}
		}
       
    }

}











