
package br.com.ofm.gnre.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="situacaoConsulta">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[1-9][0-9]{2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="descricao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exigeUfFavorecida" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c01_UfFavorecida" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exigeReceita" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c02_receita" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="receitas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="receita" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="exigeContribuinteEmitente" type="{http://www.gnre.pe.gov.br}TSimNao" minOccurs="0"/>
 *                             &lt;element name="exigeDetalhamentoReceita">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c25_detalhamentoReceita" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhamentosReceita" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="detalhamentoReceita" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codigo">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="[0-9]{6}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="descricao">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exigeProduto">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c26_produto" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="produtos" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="produto" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codigo">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="descricao">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exigePeriodoReferencia">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c05_referencia" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exigePeriodoApuracao" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="periodo" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="periodosApuracao" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="periodoApuracao" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codigo">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0"/>
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                       &lt;enumeration value="3"/>
 *                                                       &lt;enumeration value="4"/>
 *                                                       &lt;enumeration value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exigeParcela" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="parcela" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="valorExigido">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoValor">
 *                                     &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exigeDocumentoOrigem">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c04_docOrigem" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="tiposDocumentosOrigem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tipoDocumentoOrigem" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codigo">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="[0-9]{2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c28_tipoDocOrigem" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exigeContribuinteDestinatario" type="{http://www.gnre.pe.gov.br}TSimNao"/>
 *                             &lt;element name="exigeDataVencimento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c14_dataVencimento" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exigeDataPagamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c33_dataPagamento" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exigeConvenio" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c15_convenio" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exigeCamposAdicionais">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
 *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c39_camposExtras" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="camposAdicionais" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="campoAdicional" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="obrigatorio" type="{http://www.gnre.pe.gov.br}TSimNao"/>
 *                                                 &lt;element name="codigo">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                                                         &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="codigo" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="tipo">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoCampoExtra">
 *                                                         &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="tipo" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="tamanho" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="casasDecimais" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="titulo" type="{http://www.gnre.pe.gov.br}TString"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="campoExtra" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="codigo" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{6}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="descricao" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;maxLength value="60"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="courier" type="{http://www.gnre.pe.gov.br}TSimNao" default="N" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
    "situacaoConsulta",
    "exigeUfFavorecida",
    "exigeReceita",
    "receitas"
})
@XmlRootElement(name = "TConfigUf", namespace = "http://www.gnre.pe.gov.br")
public class TConfigUf {

    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
    protected String ambiente;
    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
    @XmlSchemaType(name = "string")
    protected TUf uf;
    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
    protected SituacaoConsulta situacaoConsulta;
    @XmlElement(namespace = "http://www.gnre.pe.gov.br", defaultValue = "S")
    protected ExigeUfFavorecida exigeUfFavorecida;
    @XmlElement(namespace = "http://www.gnre.pe.gov.br", defaultValue = "S")
    protected ExigeReceita exigeReceita;
    @XmlElement(namespace = "http://www.gnre.pe.gov.br")
    protected Receitas receitas;

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
     * Obt�m o valor da propriedade situacaoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoConsulta }
     *     
     */
    public SituacaoConsulta getSituacaoConsulta() {
        return situacaoConsulta;
    }

    /**
     * Define o valor da propriedade situacaoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoConsulta }
     *     
     */
    public void setSituacaoConsulta(SituacaoConsulta value) {
        this.situacaoConsulta = value;
    }

    /**
     * Obt�m o valor da propriedade exigeUfFavorecida.
     * 
     * @return
     *     possible object is
     *     {@link ExigeUfFavorecida }
     *     
     */
    public ExigeUfFavorecida getExigeUfFavorecida() {
        return exigeUfFavorecida;
    }

    /**
     * Define o valor da propriedade exigeUfFavorecida.
     * 
     * @param value
     *     allowed object is
     *     {@link ExigeUfFavorecida }
     *     
     */
    public void setExigeUfFavorecida(ExigeUfFavorecida value) {
        this.exigeUfFavorecida = value;
    }

    /**
     * Obt�m o valor da propriedade exigeReceita.
     * 
     * @return
     *     possible object is
     *     {@link ExigeReceita }
     *     
     */
    public ExigeReceita getExigeReceita() {
        return exigeReceita;
    }

    /**
     * Define o valor da propriedade exigeReceita.
     * 
     * @param value
     *     allowed object is
     *     {@link ExigeReceita }
     *     
     */
    public void setExigeReceita(ExigeReceita value) {
        this.exigeReceita = value;
    }

    /**
     * Obt�m o valor da propriedade receitas.
     * 
     * @return
     *     possible object is
     *     {@link Receitas }
     *     
     */
    public Receitas getReceitas() {
        return receitas;
    }

    /**
     * Define o valor da propriedade receitas.
     * 
     * @param value
     *     allowed object is
     *     {@link Receitas }
     *     
     */
    public void setReceitas(Receitas value) {
        this.receitas = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c02_receita" />
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
    public static class ExigeReceita {

        @XmlValue
        protected TSimNao value;
        @XmlAttribute(name = "campo", required = true)
        protected TCamposGNRE campo;

        /**
         * Obt�m o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link TSimNao }
         *     
         */
        public TSimNao getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link TSimNao }
         *     
         */
        public void setValue(TSimNao value) {
            this.value = value;
        }

        /**
         * Obt�m o valor da propriedade campo.
         * 
         * @return
         *     possible object is
         *     {@link TCamposGNRE }
         *     
         */
        public TCamposGNRE getCampo() {
            if (campo == null) {
                return TCamposGNRE.C_02_RECEITA;
            } else {
                return campo;
            }
        }

        /**
         * Define o valor da propriedade campo.
         * 
         * @param value
         *     allowed object is
         *     {@link TCamposGNRE }
         *     
         */
        public void setCampo(TCamposGNRE value) {
            this.campo = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c01_UfFavorecida" />
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
    public static class ExigeUfFavorecida {

        @XmlValue
        protected TSimNao value;
        @XmlAttribute(name = "campo", required = true)
        protected TCamposGNRE campo;

        /**
         * Obt�m o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link TSimNao }
         *     
         */
        public TSimNao getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link TSimNao }
         *     
         */
        public void setValue(TSimNao value) {
            this.value = value;
        }

        /**
         * Obt�m o valor da propriedade campo.
         * 
         * @return
         *     possible object is
         *     {@link TCamposGNRE }
         *     
         */
        public TCamposGNRE getCampo() {
            if (campo == null) {
                return TCamposGNRE.C_01_UF_FAVORECIDA;
            } else {
                return campo;
            }
        }

        /**
         * Define o valor da propriedade campo.
         * 
         * @param value
         *     allowed object is
         *     {@link TCamposGNRE }
         *     
         */
        public void setCampo(TCamposGNRE value) {
            this.campo = value;
        }

    }


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
     *         &lt;element name="receita" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="exigeContribuinteEmitente" type="{http://www.gnre.pe.gov.br}TSimNao" minOccurs="0"/>
     *                   &lt;element name="exigeDetalhamentoReceita">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c25_detalhamentoReceita" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhamentosReceita" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="detalhamentoReceita" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codigo">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="[0-9]{6}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="descricao">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="exigeProduto">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c26_produto" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="produtos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="produto" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codigo">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="descricao">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="exigePeriodoReferencia">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c05_referencia" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="exigePeriodoApuracao" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="periodo" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="periodosApuracao" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="periodoApuracao" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codigo">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="0"/>
     *                                             &lt;enumeration value="1"/>
     *                                             &lt;enumeration value="2"/>
     *                                             &lt;enumeration value="3"/>
     *                                             &lt;enumeration value="4"/>
     *                                             &lt;enumeration value="5"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="exigeParcela" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="parcela" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="valorExigido">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoValor">
     *                           &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="exigeDocumentoOrigem">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c04_docOrigem" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="tiposDocumentosOrigem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tipoDocumentoOrigem" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codigo">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="[0-9]{2}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c28_tipoDocOrigem" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="exigeContribuinteDestinatario" type="{http://www.gnre.pe.gov.br}TSimNao"/>
     *                   &lt;element name="exigeDataVencimento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c14_dataVencimento" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="exigeDataPagamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c33_dataPagamento" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="exigeConvenio" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c15_convenio" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="exigeCamposAdicionais">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
     *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c39_camposExtras" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="camposAdicionais" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="campoAdicional" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="obrigatorio" type="{http://www.gnre.pe.gov.br}TSimNao"/>
     *                                       &lt;element name="codigo">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *                                               &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="codigo" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="tipo">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoCampoExtra">
     *                                               &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="tipo" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="tamanho" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="casasDecimais" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="titulo" type="{http://www.gnre.pe.gov.br}TString"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="campoExtra" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="codigo" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{6}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="descricao" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;maxLength value="60"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="courier" type="{http://www.gnre.pe.gov.br}TSimNao" default="N" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
        "receita"
    })
    public static class Receitas {

        @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
        protected List<Receita> receita;

        /**
         * Gets the value of the receita property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the receita property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReceita().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Receita }
         * 
         * 
         */
        public List<Receita> getReceita() {
            if (receita == null) {
                receita = new ArrayList<Receita>();
            }
            return this.receita;
        }


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
         *         &lt;element name="exigeContribuinteEmitente" type="{http://www.gnre.pe.gov.br}TSimNao" minOccurs="0"/>
         *         &lt;element name="exigeDetalhamentoReceita">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c25_detalhamentoReceita" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhamentosReceita" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="detalhamentoReceita" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codigo">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="[0-9]{6}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="descricao">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="exigeProduto">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c26_produto" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="produtos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="produto" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codigo">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="descricao">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="exigePeriodoReferencia">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c05_referencia" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="exigePeriodoApuracao" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="periodo" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="periodosApuracao" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="periodoApuracao" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codigo">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="0"/>
         *                                   &lt;enumeration value="1"/>
         *                                   &lt;enumeration value="2"/>
         *                                   &lt;enumeration value="3"/>
         *                                   &lt;enumeration value="4"/>
         *                                   &lt;enumeration value="5"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="exigeParcela" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="parcela" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="valorExigido">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoValor">
         *                 &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="exigeDocumentoOrigem">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c04_docOrigem" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="tiposDocumentosOrigem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tipoDocumentoOrigem" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codigo">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="[0-9]{2}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c28_tipoDocOrigem" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="exigeContribuinteDestinatario" type="{http://www.gnre.pe.gov.br}TSimNao"/>
         *         &lt;element name="exigeDataVencimento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c14_dataVencimento" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="exigeDataPagamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c33_dataPagamento" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="exigeConvenio" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c15_convenio" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="exigeCamposAdicionais">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
         *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c39_camposExtras" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="camposAdicionais" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="campoAdicional" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="obrigatorio" type="{http://www.gnre.pe.gov.br}TSimNao"/>
         *                             &lt;element name="codigo">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
         *                                     &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="codigo" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="tipo">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoCampoExtra">
         *                                     &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="tipo" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="tamanho" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="casasDecimais" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="titulo" type="{http://www.gnre.pe.gov.br}TString"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="campoExtra" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="codigo" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{6}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="descricao" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;maxLength value="60"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="courier" type="{http://www.gnre.pe.gov.br}TSimNao" default="N" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "exigeContribuinteEmitente",
            "exigeDetalhamentoReceita",
            "detalhamentosReceita",
            "exigeProduto",
            "produtos",
            "exigePeriodoReferencia",
            "exigePeriodoApuracao",
            "periodosApuracao",
            "exigeParcela",
            "valorExigido",
            "exigeDocumentoOrigem",
            "tiposDocumentosOrigem",
            "exigeContribuinteDestinatario",
            "exigeDataVencimento",
            "exigeDataPagamento",
            "exigeConvenio",
            "exigeCamposAdicionais",
            "camposAdicionais"
        })
        public static class Receita {

            @XmlElement(namespace = "http://www.gnre.pe.gov.br", defaultValue = "S")
            @XmlSchemaType(name = "string")
            protected TSimNao exigeContribuinteEmitente;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
            protected ExigeDetalhamentoReceita exigeDetalhamentoReceita;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br")
            protected DetalhamentosReceita detalhamentosReceita;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
            protected ExigeProduto exigeProduto;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br")
            protected Produtos produtos;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
            protected ExigePeriodoReferencia exigePeriodoReferencia;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br")
            protected ExigePeriodoApuracao exigePeriodoApuracao;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br")
            protected PeriodosApuracao periodosApuracao;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br")
            protected ExigeParcela exigeParcela;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
            protected ValorExigido valorExigido;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
            protected ExigeDocumentoOrigem exigeDocumentoOrigem;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br")
            protected TiposDocumentosOrigem tiposDocumentosOrigem;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
            @XmlSchemaType(name = "string")
            protected TSimNao exigeContribuinteDestinatario;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", defaultValue = "S")
            protected ExigeDataVencimento exigeDataVencimento;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", defaultValue = "S")
            protected ExigeDataPagamento exigeDataPagamento;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", defaultValue = "N")
            protected ExigeConvenio exigeConvenio;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
            protected ExigeCamposAdicionais exigeCamposAdicionais;
            @XmlElement(namespace = "http://www.gnre.pe.gov.br")
            protected CamposAdicionais camposAdicionais;
            @XmlAttribute(name = "codigo", required = true)
            protected String codigo;
            @XmlAttribute(name = "descricao", required = true)
            protected String descricao;
            @XmlAttribute(name = "courier")
            protected TSimNao courier;

            /**
             * Obt�m o valor da propriedade exigeContribuinteEmitente.
             * 
             * @return
             *     possible object is
             *     {@link TSimNao }
             *     
             */
            public TSimNao getExigeContribuinteEmitente() {
                return exigeContribuinteEmitente;
            }

            /**
             * Define o valor da propriedade exigeContribuinteEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link TSimNao }
             *     
             */
            public void setExigeContribuinteEmitente(TSimNao value) {
                this.exigeContribuinteEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade exigeDetalhamentoReceita.
             * 
             * @return
             *     possible object is
             *     {@link ExigeDetalhamentoReceita }
             *     
             */
            public ExigeDetalhamentoReceita getExigeDetalhamentoReceita() {
                return exigeDetalhamentoReceita;
            }

            /**
             * Define o valor da propriedade exigeDetalhamentoReceita.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigeDetalhamentoReceita }
             *     
             */
            public void setExigeDetalhamentoReceita(ExigeDetalhamentoReceita value) {
                this.exigeDetalhamentoReceita = value;
            }

            /**
             * Obt�m o valor da propriedade detalhamentosReceita.
             * 
             * @return
             *     possible object is
             *     {@link DetalhamentosReceita }
             *     
             */
            public DetalhamentosReceita getDetalhamentosReceita() {
                return detalhamentosReceita;
            }

            /**
             * Define o valor da propriedade detalhamentosReceita.
             * 
             * @param value
             *     allowed object is
             *     {@link DetalhamentosReceita }
             *     
             */
            public void setDetalhamentosReceita(DetalhamentosReceita value) {
                this.detalhamentosReceita = value;
            }

            /**
             * Obt�m o valor da propriedade exigeProduto.
             * 
             * @return
             *     possible object is
             *     {@link ExigeProduto }
             *     
             */
            public ExigeProduto getExigeProduto() {
                return exigeProduto;
            }

            /**
             * Define o valor da propriedade exigeProduto.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigeProduto }
             *     
             */
            public void setExigeProduto(ExigeProduto value) {
                this.exigeProduto = value;
            }

            /**
             * Obt�m o valor da propriedade produtos.
             * 
             * @return
             *     possible object is
             *     {@link Produtos }
             *     
             */
            public Produtos getProdutos() {
                return produtos;
            }

            /**
             * Define o valor da propriedade produtos.
             * 
             * @param value
             *     allowed object is
             *     {@link Produtos }
             *     
             */
            public void setProdutos(Produtos value) {
                this.produtos = value;
            }

            /**
             * Obt�m o valor da propriedade exigePeriodoReferencia.
             * 
             * @return
             *     possible object is
             *     {@link ExigePeriodoReferencia }
             *     
             */
            public ExigePeriodoReferencia getExigePeriodoReferencia() {
                return exigePeriodoReferencia;
            }

            /**
             * Define o valor da propriedade exigePeriodoReferencia.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigePeriodoReferencia }
             *     
             */
            public void setExigePeriodoReferencia(ExigePeriodoReferencia value) {
                this.exigePeriodoReferencia = value;
            }

            /**
             * Obt�m o valor da propriedade exigePeriodoApuracao.
             * 
             * @return
             *     possible object is
             *     {@link ExigePeriodoApuracao }
             *     
             */
            public ExigePeriodoApuracao getExigePeriodoApuracao() {
                return exigePeriodoApuracao;
            }

            /**
             * Define o valor da propriedade exigePeriodoApuracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigePeriodoApuracao }
             *     
             */
            public void setExigePeriodoApuracao(ExigePeriodoApuracao value) {
                this.exigePeriodoApuracao = value;
            }

            /**
             * Obt�m o valor da propriedade periodosApuracao.
             * 
             * @return
             *     possible object is
             *     {@link PeriodosApuracao }
             *     
             */
            public PeriodosApuracao getPeriodosApuracao() {
                return periodosApuracao;
            }

            /**
             * Define o valor da propriedade periodosApuracao.
             * 
             * @param value
             *     allowed object is
             *     {@link PeriodosApuracao }
             *     
             */
            public void setPeriodosApuracao(PeriodosApuracao value) {
                this.periodosApuracao = value;
            }

            /**
             * Obt�m o valor da propriedade exigeParcela.
             * 
             * @return
             *     possible object is
             *     {@link ExigeParcela }
             *     
             */
            public ExigeParcela getExigeParcela() {
                return exigeParcela;
            }

            /**
             * Define o valor da propriedade exigeParcela.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigeParcela }
             *     
             */
            public void setExigeParcela(ExigeParcela value) {
                this.exigeParcela = value;
            }

            /**
             * Obt�m o valor da propriedade valorExigido.
             * 
             * @return
             *     possible object is
             *     {@link ValorExigido }
             *     
             */
            public ValorExigido getValorExigido() {
                return valorExigido;
            }

            /**
             * Define o valor da propriedade valorExigido.
             * 
             * @param value
             *     allowed object is
             *     {@link ValorExigido }
             *     
             */
            public void setValorExigido(ValorExigido value) {
                this.valorExigido = value;
            }

            /**
             * Obt�m o valor da propriedade exigeDocumentoOrigem.
             * 
             * @return
             *     possible object is
             *     {@link ExigeDocumentoOrigem }
             *     
             */
            public ExigeDocumentoOrigem getExigeDocumentoOrigem() {
                return exigeDocumentoOrigem;
            }

            /**
             * Define o valor da propriedade exigeDocumentoOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigeDocumentoOrigem }
             *     
             */
            public void setExigeDocumentoOrigem(ExigeDocumentoOrigem value) {
                this.exigeDocumentoOrigem = value;
            }

            /**
             * Obt�m o valor da propriedade tiposDocumentosOrigem.
             * 
             * @return
             *     possible object is
             *     {@link TiposDocumentosOrigem }
             *     
             */
            public TiposDocumentosOrigem getTiposDocumentosOrigem() {
                return tiposDocumentosOrigem;
            }

            /**
             * Define o valor da propriedade tiposDocumentosOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link TiposDocumentosOrigem }
             *     
             */
            public void setTiposDocumentosOrigem(TiposDocumentosOrigem value) {
                this.tiposDocumentosOrigem = value;
            }

            /**
             * Obt�m o valor da propriedade exigeContribuinteDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link TSimNao }
             *     
             */
            public TSimNao getExigeContribuinteDestinatario() {
                return exigeContribuinteDestinatario;
            }

            /**
             * Define o valor da propriedade exigeContribuinteDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link TSimNao }
             *     
             */
            public void setExigeContribuinteDestinatario(TSimNao value) {
                this.exigeContribuinteDestinatario = value;
            }

            /**
             * Obt�m o valor da propriedade exigeDataVencimento.
             * 
             * @return
             *     possible object is
             *     {@link ExigeDataVencimento }
             *     
             */
            public ExigeDataVencimento getExigeDataVencimento() {
                return exigeDataVencimento;
            }

            /**
             * Define o valor da propriedade exigeDataVencimento.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigeDataVencimento }
             *     
             */
            public void setExigeDataVencimento(ExigeDataVencimento value) {
                this.exigeDataVencimento = value;
            }

            /**
             * Obt�m o valor da propriedade exigeDataPagamento.
             * 
             * @return
             *     possible object is
             *     {@link ExigeDataPagamento }
             *     
             */
            public ExigeDataPagamento getExigeDataPagamento() {
                return exigeDataPagamento;
            }

            /**
             * Define o valor da propriedade exigeDataPagamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigeDataPagamento }
             *     
             */
            public void setExigeDataPagamento(ExigeDataPagamento value) {
                this.exigeDataPagamento = value;
            }

            /**
             * Obt�m o valor da propriedade exigeConvenio.
             * 
             * @return
             *     possible object is
             *     {@link ExigeConvenio }
             *     
             */
            public ExigeConvenio getExigeConvenio() {
                return exigeConvenio;
            }

            /**
             * Define o valor da propriedade exigeConvenio.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigeConvenio }
             *     
             */
            public void setExigeConvenio(ExigeConvenio value) {
                this.exigeConvenio = value;
            }

            /**
             * Obt�m o valor da propriedade exigeCamposAdicionais.
             * 
             * @return
             *     possible object is
             *     {@link ExigeCamposAdicionais }
             *     
             */
            public ExigeCamposAdicionais getExigeCamposAdicionais() {
                return exigeCamposAdicionais;
            }

            /**
             * Define o valor da propriedade exigeCamposAdicionais.
             * 
             * @param value
             *     allowed object is
             *     {@link ExigeCamposAdicionais }
             *     
             */
            public void setExigeCamposAdicionais(ExigeCamposAdicionais value) {
                this.exigeCamposAdicionais = value;
            }

            /**
             * Obt�m o valor da propriedade camposAdicionais.
             * 
             * @return
             *     possible object is
             *     {@link CamposAdicionais }
             *     
             */
            public CamposAdicionais getCamposAdicionais() {
                return camposAdicionais;
            }

            /**
             * Define o valor da propriedade camposAdicionais.
             * 
             * @param value
             *     allowed object is
             *     {@link CamposAdicionais }
             *     
             */
            public void setCamposAdicionais(CamposAdicionais value) {
                this.camposAdicionais = value;
            }

            /**
             * Obt�m o valor da propriedade codigo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * Define o valor da propriedade codigo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

            /**
             * Obt�m o valor da propriedade descricao.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescricao() {
                return descricao;
            }

            /**
             * Define o valor da propriedade descricao.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescricao(String value) {
                this.descricao = value;
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
                if (courier == null) {
                    return TSimNao.N;
                } else {
                    return courier;
                }
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
             *         &lt;element name="campoAdicional" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="obrigatorio" type="{http://www.gnre.pe.gov.br}TSimNao"/>
             *                   &lt;element name="codigo">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
             *                           &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="codigo" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="tipo">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoCampoExtra">
             *                           &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="tipo" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="tamanho" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="casasDecimais" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="titulo" type="{http://www.gnre.pe.gov.br}TString"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="campoExtra" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
                "campoAdicional"
            })
            public static class CamposAdicionais {

                @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                protected List<CampoAdicional> campoAdicional;

                /**
                 * Gets the value of the campoAdicional property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the campoAdicional property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCampoAdicional().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CampoAdicional }
                 * 
                 * 
                 */
                public List<CampoAdicional> getCampoAdicional() {
                    if (campoAdicional == null) {
                        campoAdicional = new ArrayList<CampoAdicional>();
                    }
                    return this.campoAdicional;
                }


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
                 *         &lt;element name="obrigatorio" type="{http://www.gnre.pe.gov.br}TSimNao"/>
                 *         &lt;element name="codigo">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                 *                 &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="codigo" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="tipo">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoCampoExtra">
                 *                 &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="tipo" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="tamanho" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="casasDecimais" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="titulo" type="{http://www.gnre.pe.gov.br}TString"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="campoExtra" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "obrigatorio",
                    "codigo",
                    "tipo",
                    "tamanho",
                    "casasDecimais",
                    "titulo"
                })
                public static class CampoAdicional {

                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    @XmlSchemaType(name = "string")
                    protected TSimNao obrigatorio;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected Codigo codigo;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected Tipo tipo;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br")
                    protected Integer tamanho;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br")
                    protected Integer casasDecimais;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String titulo;
                    @XmlAttribute(name = "campo", required = true)
                    protected TCamposGNRE campo;

                    /**
                     * Obt�m o valor da propriedade obrigatorio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSimNao }
                     *     
                     */
                    public TSimNao getObrigatorio() {
                        return obrigatorio;
                    }

                    /**
                     * Define o valor da propriedade obrigatorio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSimNao }
                     *     
                     */
                    public void setObrigatorio(TSimNao value) {
                        this.obrigatorio = value;
                    }

                    /**
                     * Obt�m o valor da propriedade codigo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Codigo }
                     *     
                     */
                    public Codigo getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define o valor da propriedade codigo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Codigo }
                     *     
                     */
                    public void setCodigo(Codigo value) {
                        this.codigo = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tipo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Tipo }
                     *     
                     */
                    public Tipo getTipo() {
                        return tipo;
                    }

                    /**
                     * Define o valor da propriedade tipo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Tipo }
                     *     
                     */
                    public void setTipo(Tipo value) {
                        this.tipo = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tamanho.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getTamanho() {
                        return tamanho;
                    }

                    /**
                     * Define o valor da propriedade tamanho.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setTamanho(Integer value) {
                        this.tamanho = value;
                    }

                    /**
                     * Obt�m o valor da propriedade casasDecimais.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getCasasDecimais() {
                        return casasDecimais;
                    }

                    /**
                     * Define o valor da propriedade casasDecimais.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setCasasDecimais(Integer value) {
                        this.casasDecimais = value;
                    }

                    /**
                     * Obt�m o valor da propriedade titulo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitulo() {
                        return titulo;
                    }

                    /**
                     * Define o valor da propriedade titulo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTitulo(String value) {
                        this.titulo = value;
                    }

                    /**
                     * Obt�m o valor da propriedade campo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TCamposGNRE }
                     *     
                     */
                    public TCamposGNRE getCampo() {
                        if (campo == null) {
                            return TCamposGNRE.CAMPO_EXTRA;
                        } else {
                            return campo;
                        }
                    }

                    /**
                     * Define o valor da propriedade campo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TCamposGNRE }
                     *     
                     */
                    public void setCampo(TCamposGNRE value) {
                        this.campo = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                     *       &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="codigo" />
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
                    public static class Codigo {

                        @XmlValue
                        protected int value;
                        @XmlAttribute(name = "campo")
                        protected TCamposGNRE campo;

                        /**
                         * Obt�m o valor da propriedade value.
                         * 
                         */
                        public int getValue() {
                            return value;
                        }

                        /**
                         * Define o valor da propriedade value.
                         * 
                         */
                        public void setValue(int value) {
                            this.value = value;
                        }

                        /**
                         * Obt�m o valor da propriedade campo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TCamposGNRE }
                         *     
                         */
                        public TCamposGNRE getCampo() {
                            if (campo == null) {
                                return TCamposGNRE.CODIGO;
                            } else {
                                return campo;
                            }
                        }

                        /**
                         * Define o valor da propriedade campo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TCamposGNRE }
                         *     
                         */
                        public void setCampo(TCamposGNRE value) {
                            this.campo = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoCampoExtra">
                     *       &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="tipo" />
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
                    public static class Tipo {

                        @XmlValue
                        protected TTipoCampoExtra value;
                        @XmlAttribute(name = "campo")
                        protected TCamposGNRE campo;

                        /**
                         * C�digo do tipo de dados dos Campos Extras:
                         * 	T - Texto
                         * 	N - Num�rico
                         * 	D - Data
                         *   		
                         * 
                         * @return
                         *     possible object is
                         *     {@link TTipoCampoExtra }
                         *     
                         */
                        public TTipoCampoExtra getValue() {
                            return value;
                        }

                        /**
                         * Define o valor da propriedade value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TTipoCampoExtra }
                         *     
                         */
                        public void setValue(TTipoCampoExtra value) {
                            this.value = value;
                        }

                        /**
                         * Obt�m o valor da propriedade campo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TCamposGNRE }
                         *     
                         */
                        public TCamposGNRE getCampo() {
                            if (campo == null) {
                                return TCamposGNRE.TIPO;
                            } else {
                                return campo;
                            }
                        }

                        /**
                         * Define o valor da propriedade campo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TCamposGNRE }
                         *     
                         */
                        public void setCampo(TCamposGNRE value) {
                            this.campo = value;
                        }

                    }

                }

            }


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
             *         &lt;element name="detalhamentoReceita" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codigo">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="[0-9]{6}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="descricao">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
                "detalhamentoReceita"
            })
            public static class DetalhamentosReceita {

                @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                protected List<DetalhamentoReceita> detalhamentoReceita;

                /**
                 * Gets the value of the detalhamentoReceita property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the detalhamentoReceita property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDetalhamentoReceita().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DetalhamentoReceita }
                 * 
                 * 
                 */
                public List<DetalhamentoReceita> getDetalhamentoReceita() {
                    if (detalhamentoReceita == null) {
                        detalhamentoReceita = new ArrayList<DetalhamentoReceita>();
                    }
                    return this.detalhamentoReceita;
                }


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
                 *         &lt;element name="codigo">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="[0-9]{6}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="descricao">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="255"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "codigo",
                    "descricao"
                })
                public static class DetalhamentoReceita {

                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String codigo;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String descricao;

                    /**
                     * Obt�m o valor da propriedade codigo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define o valor da propriedade codigo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigo(String value) {
                        this.codigo = value;
                    }

                    /**
                     * Obt�m o valor da propriedade descricao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescricao() {
                        return descricao;
                    }

                    /**
                     * Define o valor da propriedade descricao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescricao(String value) {
                        this.descricao = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c39_camposExtras" />
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
            public static class ExigeCamposAdicionais {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.C_39_CAMPOS_EXTRAS;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c15_convenio" />
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
            public static class ExigeConvenio {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.C_15_CONVENIO;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c33_dataPagamento" />
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
            public static class ExigeDataPagamento {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.C_33_DATA_PAGAMENTO;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c14_dataVencimento" />
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
            public static class ExigeDataVencimento {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.C_14_DATA_VENCIMENTO;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c25_detalhamentoReceita" />
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
            public static class ExigeDetalhamentoReceita {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.C_25_DETALHAMENTO_RECEITA;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c04_docOrigem" />
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
            public static class ExigeDocumentoOrigem {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.C_04_DOC_ORIGEM;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="parcela" />
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
            public static class ExigeParcela {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.PARCELA;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="periodo" />
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
            public static class ExigePeriodoApuracao {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.PERIODO;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c05_referencia" />
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
            public static class ExigePeriodoReferencia {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.C_05_REFERENCIA;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TSimNao">
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c26_produto" />
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
            public static class ExigeProduto {

                @XmlValue
                protected TSimNao value;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSimNao }
                 *     
                 */
                public TSimNao getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSimNao }
                 *     
                 */
                public void setValue(TSimNao value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.C_26_PRODUTO;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }


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
             *         &lt;element name="periodoApuracao" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codigo">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="0"/>
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                         &lt;enumeration value="3"/>
             *                         &lt;enumeration value="4"/>
             *                         &lt;enumeration value="5"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
                "periodoApuracao"
            })
            public static class PeriodosApuracao {

                @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                protected List<PeriodoApuracao> periodoApuracao;

                /**
                 * Gets the value of the periodoApuracao property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the periodoApuracao property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPeriodoApuracao().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PeriodoApuracao }
                 * 
                 * 
                 */
                public List<PeriodoApuracao> getPeriodoApuracao() {
                    if (periodoApuracao == null) {
                        periodoApuracao = new ArrayList<PeriodoApuracao>();
                    }
                    return this.periodoApuracao;
                }


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
                 *         &lt;element name="codigo">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="0"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *               &lt;enumeration value="4"/>
                 *               &lt;enumeration value="5"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
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
                    "codigo",
                    "descricao"
                })
                public static class PeriodoApuracao {

                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String codigo;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String descricao;

                    /**
                     * Obt�m o valor da propriedade codigo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define o valor da propriedade codigo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigo(String value) {
                        this.codigo = value;
                    }

                    /**
                     * Obt�m o valor da propriedade descricao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescricao() {
                        return descricao;
                    }

                    /**
                     * Define o valor da propriedade descricao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescricao(String value) {
                        this.descricao = value;
                    }

                }

            }


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
             *         &lt;element name="produto" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codigo">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="descricao">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
                "produto"
            })
            public static class Produtos {

                @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                protected List<Produto> produto;

                /**
                 * Gets the value of the produto property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the produto property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProduto().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Produto }
                 * 
                 * 
                 */
                public List<Produto> getProduto() {
                    if (produto == null) {
                        produto = new ArrayList<Produto>();
                    }
                    return this.produto;
                }


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
                 *         &lt;element name="codigo">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="descricao">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="255"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "codigo",
                    "descricao"
                })
                public static class Produto {

                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String codigo;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String descricao;

                    /**
                     * Obt�m o valor da propriedade codigo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define o valor da propriedade codigo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigo(String value) {
                        this.codigo = value;
                    }

                    /**
                     * Obt�m o valor da propriedade descricao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescricao() {
                        return descricao;
                    }

                    /**
                     * Define o valor da propriedade descricao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescricao(String value) {
                        this.descricao = value;
                    }

                }

            }


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
             *         &lt;element name="tipoDocumentoOrigem" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codigo">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="[0-9]{2}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="campo" use="required" type="{http://www.gnre.pe.gov.br}TCamposGNRE" fixed="c28_tipoDocOrigem" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tipoDocumentoOrigem"
            })
            public static class TiposDocumentosOrigem {

                @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                protected List<TipoDocumentoOrigem> tipoDocumentoOrigem;
                @XmlAttribute(name = "campo", required = true)
                protected TCamposGNRE campo;

                /**
                 * Gets the value of the tipoDocumentoOrigem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tipoDocumentoOrigem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTipoDocumentoOrigem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TipoDocumentoOrigem }
                 * 
                 * 
                 */
                public List<TipoDocumentoOrigem> getTipoDocumentoOrigem() {
                    if (tipoDocumentoOrigem == null) {
                        tipoDocumentoOrigem = new ArrayList<TipoDocumentoOrigem>();
                    }
                    return this.tipoDocumentoOrigem;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    if (campo == null) {
                        return TCamposGNRE.C_28_TIPO_DOC_ORIGEM;
                    } else {
                        return campo;
                    }
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }


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
                 *         &lt;element name="codigo">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="[0-9]{2}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="descricao" type="{http://www.gnre.pe.gov.br}TString"/>
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
                    "codigo",
                    "descricao"
                })
                public static class TipoDocumentoOrigem {

                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String codigo;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String descricao;

                    /**
                     * Obt�m o valor da propriedade codigo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define o valor da propriedade codigo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigo(String value) {
                        this.codigo = value;
                    }

                    /**
                     * Obt�m o valor da propriedade descricao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescricao() {
                        return descricao;
                    }

                    /**
                     * Define o valor da propriedade descricao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescricao(String value) {
                        this.descricao = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.gnre.pe.gov.br>TTipoValor">
             *       &lt;attribute name="campo" type="{http://www.gnre.pe.gov.br}TCamposGNRE" />
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
            public static class ValorExigido {

                @XmlValue
                protected TTipoValor value;
                @XmlAttribute(name = "campo")
                protected TCamposGNRE campo;

                /**
                 * Obt�m o valor da propriedade value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TTipoValor }
                 *     
                 */
                public TTipoValor getValue() {
                    return value;
                }

                /**
                 * Define o valor da propriedade value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TTipoValor }
                 *     
                 */
                public void setValue(TTipoValor value) {
                    this.value = value;
                }

                /**
                 * Obt�m o valor da propriedade campo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public TCamposGNRE getCampo() {
                    return campo;
                }

                /**
                 * Define o valor da propriedade campo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCamposGNRE }
                 *     
                 */
                public void setCampo(TCamposGNRE value) {
                    this.campo = value;
                }

            }

        }

    }


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
     *         &lt;element name="codigo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[1-9][0-9]{2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="descricao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "codigo",
        "descricao"
    })
    public static class SituacaoConsulta {

        @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
        protected String codigo;
        @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
        protected String descricao;

        /**
         * Obt�m o valor da propriedade codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define o valor da propriedade codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obt�m o valor da propriedade descricao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescricao() {
            return descricao;
        }

        /**
         * Define o valor da propriedade descricao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescricao(String value) {
            this.descricao = value;
        }

    }

}
