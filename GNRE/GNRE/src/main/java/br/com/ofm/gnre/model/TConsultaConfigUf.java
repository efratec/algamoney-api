
package br.com.ofm.gnre.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ambiente">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="uf" type="{http://www.gnre.pe.gov.br}TUf"/>
 *         &lt;element name="receita" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TReceita">
 *                 &lt;attribute name="courier" type="{http://www.gnre.pe.gov.br}TSimNao" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "ambiente",
    "uf",
    "receita"
})
@XmlRootElement(name = "TConsultaConfigUf", namespace = "http://www.gnre.pe.gov.br")
public class TConsultaConfigUf {

    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
    protected String ambiente;
    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
    @XmlSchemaType(name = "string")
    protected TUf uf;
    @XmlElement(namespace = "http://www.gnre.pe.gov.br")
    protected Receita receita;

    /**
     * Obt�m o valor da propriedade ambiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * Define o valor da propriedade ambiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbiente(String value) {
        this.ambiente = value;
    }

    /**
     * Obt�m o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link TUf }
     *     
     */
    public TUf getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link TUf }
     *     
     */
    public void setUf(TUf value) {
        this.uf = value;
    }

    /**
     * Obt�m o valor da propriedade receita.
     * 
     * @return
     *     possible object is
     *     {@link Receita }
     *     
     */
    public Receita getReceita() {
        return receita;
    }

    /**
     * Define o valor da propriedade receita.
     * 
     * @param value
     *     allowed object is
     *     {@link Receita }
     *     
     */
    public void setReceita(Receita value) {
        this.receita = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TReceita">
     *       &lt;attribute name="courier" type="{http://www.gnre.pe.gov.br}TSimNao" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Receita {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "courier")
        protected TSimNao courier;

        /**
         * Obt�m o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obt�m o valor da propriedade courier.
         * 
         * @return
         *     possible object is
         *     {@link TSimNao }
         *     
         */
        public TSimNao getCourier() {
            return courier;
        }

        /**
         * Define o valor da propriedade courier.
         * 
         * @param value
         *     allowed object is
         *     {@link TSimNao }
         *     
         */
        public void setCourier(TSimNao value) {
            this.courier = value;
        }

    }

}
