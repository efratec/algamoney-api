
package br.com.ofm.gnre.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TSimNao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TSimNao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TSimNao", namespace = "http://www.gnre.pe.gov.br")
@XmlEnum
public enum TSimNao {

    S,
    N;

    public String value() {
        return name();
    }

    public static TSimNao fromValue(String v) {
        return valueOf(v);
    }

}
