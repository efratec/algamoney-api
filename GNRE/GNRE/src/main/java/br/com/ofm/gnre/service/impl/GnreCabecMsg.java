package br.com.ofm.gnre.service.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versaoDados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "versaoDados"
})
@XmlRootElement(name = "gnreCabecMsg")
public class GnreCabecMsg {

    protected String versaoDados;

    /**
     * Obtém o valor da propriedade versaoDados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoDados() {
        return versaoDados;
    }

    /**
     * Define o valor da propriedade versaoDados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoDados(String value) {
        this.versaoDados = value;
    }

}
