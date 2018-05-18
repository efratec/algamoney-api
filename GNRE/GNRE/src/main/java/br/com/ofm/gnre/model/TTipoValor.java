
package br.com.ofm.gnre.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TTipoValor.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TTipoValor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TTipoValor", namespace = "http://www.gnre.pe.gov.br")
@XmlEnum
public enum TTipoValor {

    P,
    T,
    A;

    public String value() {
        return name();
    }

    public static TTipoValor fromValue(String v) {
        return valueOf(v);
    }

}
