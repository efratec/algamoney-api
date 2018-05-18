package br.com.ofm.gnre.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import br.com.ofm.gnre.model.TConsLoteGNRE;

public class XMLUtil {
	
 public static String objectToXML(TConsLoteGNRE tConsLoteGNRE) {
        String xmlString = "";
        try {
            JAXBContext context = JAXBContext.newInstance(TConsLoteGNRE.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            StringWriter sw = new StringWriter();
            m.marshal(tConsLoteGNRE, sw);
            xmlString = sw.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlString;
    }
    
    public static <T> T xmlToObject(String xml, Class<T> classe) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(classe);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return unmarshaller.unmarshal(new StreamSource(new StringReader(xml)), classe).getValue();
	}

}
