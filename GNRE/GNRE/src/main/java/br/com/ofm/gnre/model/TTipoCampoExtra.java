
package br.com.ofm.gnre.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TTipoCampoExtra.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TTipoCampoExtra">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TTipoCampoExtra", namespace = "http://www.gnre.pe.gov.br")
@XmlEnum
public enum TTipoCampoExtra {

    T,
    N,
    D;

    public String value() {
        return name();
    }

    public static TTipoCampoExtra fromValue(String v) {
        return valueOf(v);
    }

}
