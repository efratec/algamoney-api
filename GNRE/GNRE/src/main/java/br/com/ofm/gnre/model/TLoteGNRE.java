
package br.com.ofm.gnre.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="guias">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TDadosGNRE" maxOccurs="3000">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="c01_UfFavorecida" type="{http://www.gnre.pe.gov.br}TUf"/>
 *                             &lt;element name="c02_receita" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{6}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c25_detalhamentoReceita" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{6}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c26_produto" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c27_tipoIdentificacaoEmitente" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
 *                             &lt;element name="c03_idContribuinteEmitente" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
 *                                       &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="c28_tipoDocOrigem" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c04_docOrigem" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{1,18}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c06_valorPrincipal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
 *                             &lt;element name="c10_valorTotal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
 *                             &lt;element name="c14_dataVencimento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
 *                             &lt;element name="c15_convenio" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c16_razaoSocialEmitente" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c17_inscricaoEstadualEmitente" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
 *                             &lt;element name="c18_enderecoEmitente" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c19_municipioEmitente" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
 *                             &lt;element name="c20_ufEnderecoEmitente" type="{http://www.gnre.pe.gov.br}TUf" minOccurs="0"/>
 *                             &lt;element name="c21_cepEmitente" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{8}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c22_telefoneEmitente" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{6,11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c34_tipoIdentificacaoDestinatario" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
 *                             &lt;element name="c35_idContribuinteDestinatario" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
 *                                       &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="c36_inscricaoEstadualDestinatario" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
 *                             &lt;element name="c37_razaoSocialDestinatario" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c38_municipioDestinatario" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
 *                             &lt;element name="c33_dataPagamento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
 *                             &lt;element name="c05_referencia" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="periodo" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="0"/>
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="mes" type="{http://www.gnre.pe.gov.br}TMes" minOccurs="0"/>
 *                                       &lt;element name="ano" type="{http://www.gnre.pe.gov.br}TAno" minOccurs="0"/>
 *                                       &lt;element name="parcela" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="c39_camposExtras" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="campoExtra" maxOccurs="3">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
 *                                                 &lt;element name="valor">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="100"/>
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
 *                             &lt;element name="c42_identificadorGuia" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="10"/>
 *                                   &lt;pattern value="[0-9]{1,10}"/>
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
    "guias"
})
@XmlRootElement(name = "TLote_GNRE", namespace = "http://www.gnre.pe.gov.br")
public class TLoteGNRE {

    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
    protected Guias guias;

    /**
     * Obt�m o valor da propriedade guias.
     * 
     * @return
     *     possible object is
     *     {@link Guias }
     *     
     */
    public Guias getGuias() {
        return guias;
    }

    /**
     * Define o valor da propriedade guias.
     * 
     * @param value
     *     allowed object is
     *     {@link Guias }
     *     
     */
    public void setGuias(Guias value) {
        this.guias = value;
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
     *         &lt;element name="TDadosGNRE" maxOccurs="3000">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="c01_UfFavorecida" type="{http://www.gnre.pe.gov.br}TUf"/>
     *                   &lt;element name="c02_receita" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{6}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c25_detalhamentoReceita" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{6}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c26_produto" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c27_tipoIdentificacaoEmitente" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
     *                   &lt;element name="c03_idContribuinteEmitente" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
     *                             &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="c28_tipoDocOrigem" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c04_docOrigem" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{1,18}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c06_valorPrincipal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
     *                   &lt;element name="c10_valorTotal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
     *                   &lt;element name="c14_dataVencimento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
     *                   &lt;element name="c15_convenio" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c16_razaoSocialEmitente" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c17_inscricaoEstadualEmitente" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
     *                   &lt;element name="c18_enderecoEmitente" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c19_municipioEmitente" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
     *                   &lt;element name="c20_ufEnderecoEmitente" type="{http://www.gnre.pe.gov.br}TUf" minOccurs="0"/>
     *                   &lt;element name="c21_cepEmitente" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{8}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c22_telefoneEmitente" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{6,11}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c34_tipoIdentificacaoDestinatario" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
     *                   &lt;element name="c35_idContribuinteDestinatario" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
     *                             &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="c36_inscricaoEstadualDestinatario" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
     *                   &lt;element name="c37_razaoSocialDestinatario" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c38_municipioDestinatario" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
     *                   &lt;element name="c33_dataPagamento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
     *                   &lt;element name="c05_referencia" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="periodo" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;enumeration value="0"/>
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="mes" type="{http://www.gnre.pe.gov.br}TMes" minOccurs="0"/>
     *                             &lt;element name="ano" type="{http://www.gnre.pe.gov.br}TAno" minOccurs="0"/>
     *                             &lt;element name="parcela" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="c39_camposExtras" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="campoExtra" maxOccurs="3">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
     *                                       &lt;element name="valor">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="100"/>
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
     *                   &lt;element name="c42_identificadorGuia" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="10"/>
     *                         &lt;pattern value="[0-9]{1,10}"/>
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
        "tDadosGNRE"
    })
    public static class Guias {

        @XmlElement(name = "TDadosGNRE", namespace = "http://www.gnre.pe.gov.br", required = true)
        protected List<TDadosGNRE> tDadosGNRE;

        /**
         * Gets the value of the tDadosGNRE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tDadosGNRE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTDadosGNRE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TDadosGNRE }
         * 
         * 
         */
        public List<TDadosGNRE> getTDadosGNRE() {
            if (tDadosGNRE == null) {
                tDadosGNRE = new ArrayList<TDadosGNRE>();
            }
            return this.tDadosGNRE;
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
         *         &lt;element name="c01_UfFavorecida" type="{http://www.gnre.pe.gov.br}TUf"/>
         *         &lt;element name="c02_receita" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{6}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c25_detalhamentoReceita" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{6}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c26_produto" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c27_tipoIdentificacaoEmitente" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
         *         &lt;element name="c03_idContribuinteEmitente" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
         *                   &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="c28_tipoDocOrigem" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c04_docOrigem" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{1,18}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c06_valorPrincipal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
         *         &lt;element name="c10_valorTotal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
         *         &lt;element name="c14_dataVencimento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
         *         &lt;element name="c15_convenio" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c16_razaoSocialEmitente" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c17_inscricaoEstadualEmitente" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
         *         &lt;element name="c18_enderecoEmitente" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c19_municipioEmitente" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
         *         &lt;element name="c20_ufEnderecoEmitente" type="{http://www.gnre.pe.gov.br}TUf" minOccurs="0"/>
         *         &lt;element name="c21_cepEmitente" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{8}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c22_telefoneEmitente" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{6,11}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c34_tipoIdentificacaoDestinatario" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
         *         &lt;element name="c35_idContribuinteDestinatario" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
         *                   &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="c36_inscricaoEstadualDestinatario" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
         *         &lt;element name="c37_razaoSocialDestinatario" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c38_municipioDestinatario" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
         *         &lt;element name="c33_dataPagamento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
         *         &lt;element name="c05_referencia" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="periodo" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;enumeration value="0"/>
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="mes" type="{http://www.gnre.pe.gov.br}TMes" minOccurs="0"/>
         *                   &lt;element name="ano" type="{http://www.gnre.pe.gov.br}TAno" minOccurs="0"/>
         *                   &lt;element name="parcela" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="c39_camposExtras" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="campoExtra" maxOccurs="3">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
         *                             &lt;element name="valor">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="100"/>
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
         *         &lt;element name="c42_identificadorGuia" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="10"/>
         *               &lt;pattern value="[0-9]{1,10}"/>
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
            "c01UfFavorecida",
            "c02Receita",
            "c25DetalhamentoReceita",
            "c26Produto",
            "c27TipoIdentificacaoEmitente",
            "c03IdContribuinteEmitente",
            "c28TipoDocOrigem",
            "c04DocOrigem",
            "c06ValorPrincipal",
            "c10ValorTotal",
            "c14DataVencimento",
            "c15Convenio",
            "c16RazaoSocialEmitente",
            "c17InscricaoEstadualEmitente",
            "c18EnderecoEmitente",
            "c19MunicipioEmitente",
            "c20UfEnderecoEmitente",
            "c21CepEmitente",
            "c22TelefoneEmitente",
            "c34TipoIdentificacaoDestinatario",
            "c35IdContribuinteDestinatario",
            "c36InscricaoEstadualDestinatario",
            "c37RazaoSocialDestinatario",
            "c38MunicipioDestinatario",
            "c33DataPagamento",
            "c05Referencia",
            "c39CamposExtras",
            "c42IdentificadorGuia"
        })
        public static class TDadosGNRE {

            @XmlElement(name = "c01_UfFavorecida", namespace = "http://www.gnre.pe.gov.br", required = true)
            @XmlSchemaType(name = "string")
            protected TUf c01UfFavorecida;
            @XmlElement(name = "c02_receita", namespace = "http://www.gnre.pe.gov.br")
            protected String c02Receita;
            @XmlElement(name = "c25_detalhamentoReceita", namespace = "http://www.gnre.pe.gov.br")
            protected String c25DetalhamentoReceita;
            @XmlElement(name = "c26_produto", namespace = "http://www.gnre.pe.gov.br")
            protected String c26Produto;
            @XmlElement(name = "c27_tipoIdentificacaoEmitente", namespace = "http://www.gnre.pe.gov.br")
            protected String c27TipoIdentificacaoEmitente;
            @XmlElement(name = "c03_idContribuinteEmitente", namespace = "http://www.gnre.pe.gov.br")
            protected C03IdContribuinteEmitente c03IdContribuinteEmitente;
            @XmlElement(name = "c28_tipoDocOrigem", namespace = "http://www.gnre.pe.gov.br")
            protected String c28TipoDocOrigem;
            @XmlElement(name = "c04_docOrigem", namespace = "http://www.gnre.pe.gov.br")
            protected String c04DocOrigem;
            @XmlElement(name = "c06_valorPrincipal", namespace = "http://www.gnre.pe.gov.br")
            protected String c06ValorPrincipal;
            @XmlElement(name = "c10_valorTotal", namespace = "http://www.gnre.pe.gov.br")
            protected String c10ValorTotal;
            @XmlElement(name = "c14_dataVencimento", namespace = "http://www.gnre.pe.gov.br")
            protected String c14DataVencimento;
            @XmlElement(name = "c15_convenio", namespace = "http://www.gnre.pe.gov.br")
            protected String c15Convenio;
            @XmlElement(name = "c16_razaoSocialEmitente", namespace = "http://www.gnre.pe.gov.br")
            protected String c16RazaoSocialEmitente;
            @XmlElement(name = "c17_inscricaoEstadualEmitente", namespace = "http://www.gnre.pe.gov.br")
            protected String c17InscricaoEstadualEmitente;
            @XmlElement(name = "c18_enderecoEmitente", namespace = "http://www.gnre.pe.gov.br")
            protected String c18EnderecoEmitente;
            @XmlElement(name = "c19_municipioEmitente", namespace = "http://www.gnre.pe.gov.br")
            protected String c19MunicipioEmitente;
            @XmlElement(name = "c20_ufEnderecoEmitente", namespace = "http://www.gnre.pe.gov.br")
            @XmlSchemaType(name = "string")
            protected TUf c20UfEnderecoEmitente;
            @XmlElement(name = "c21_cepEmitente", namespace = "http://www.gnre.pe.gov.br")
            protected String c21CepEmitente;
            @XmlElement(name = "c22_telefoneEmitente", namespace = "http://www.gnre.pe.gov.br")
            protected String c22TelefoneEmitente;
            @XmlElement(name = "c34_tipoIdentificacaoDestinatario", namespace = "http://www.gnre.pe.gov.br")
            protected String c34TipoIdentificacaoDestinatario;
            @XmlElement(name = "c35_idContribuinteDestinatario", namespace = "http://www.gnre.pe.gov.br")
            protected C35IdContribuinteDestinatario c35IdContribuinteDestinatario;
            @XmlElement(name = "c36_inscricaoEstadualDestinatario", namespace = "http://www.gnre.pe.gov.br")
            protected String c36InscricaoEstadualDestinatario;
            @XmlElement(name = "c37_razaoSocialDestinatario", namespace = "http://www.gnre.pe.gov.br")
            protected String c37RazaoSocialDestinatario;
            @XmlElement(name = "c38_municipioDestinatario", namespace = "http://www.gnre.pe.gov.br")
            protected String c38MunicipioDestinatario;
            @XmlElement(name = "c33_dataPagamento", namespace = "http://www.gnre.pe.gov.br")
            protected String c33DataPagamento;
            @XmlElement(name = "c05_referencia", namespace = "http://www.gnre.pe.gov.br")
            protected C05Referencia c05Referencia;
            @XmlElement(name = "c39_camposExtras", namespace = "http://www.gnre.pe.gov.br")
            protected C39CamposExtras c39CamposExtras;
            @XmlElement(name = "c42_identificadorGuia", namespace = "http://www.gnre.pe.gov.br")
            protected String c42IdentificadorGuia;

            /**
             * Obt�m o valor da propriedade c01UfFavorecida.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getC01UfFavorecida() {
                return c01UfFavorecida;
            }

            /**
             * Define o valor da propriedade c01UfFavorecida.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setC01UfFavorecida(TUf value) {
                this.c01UfFavorecida = value;
            }

            /**
             * Obt�m o valor da propriedade c02Receita.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC02Receita() {
                return c02Receita;
            }

            /**
             * Define o valor da propriedade c02Receita.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC02Receita(String value) {
                this.c02Receita = value;
            }

            /**
             * Obt�m o valor da propriedade c25DetalhamentoReceita.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC25DetalhamentoReceita() {
                return c25DetalhamentoReceita;
            }

            /**
             * Define o valor da propriedade c25DetalhamentoReceita.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC25DetalhamentoReceita(String value) {
                this.c25DetalhamentoReceita = value;
            }

            /**
             * Obt�m o valor da propriedade c26Produto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC26Produto() {
                return c26Produto;
            }

            /**
             * Define o valor da propriedade c26Produto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC26Produto(String value) {
                this.c26Produto = value;
            }

            /**
             * Obt�m o valor da propriedade c27TipoIdentificacaoEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC27TipoIdentificacaoEmitente() {
                return c27TipoIdentificacaoEmitente;
            }

            /**
             * Define o valor da propriedade c27TipoIdentificacaoEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC27TipoIdentificacaoEmitente(String value) {
                this.c27TipoIdentificacaoEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade c03IdContribuinteEmitente.
             * 
             * @return
             *     possible object is
             *     {@link C03IdContribuinteEmitente }
             *     
             */
            public C03IdContribuinteEmitente getC03IdContribuinteEmitente() {
                return c03IdContribuinteEmitente;
            }

            /**
             * Define o valor da propriedade c03IdContribuinteEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link C03IdContribuinteEmitente }
             *     
             */
            public void setC03IdContribuinteEmitente(C03IdContribuinteEmitente value) {
                this.c03IdContribuinteEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade c28TipoDocOrigem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC28TipoDocOrigem() {
                return c28TipoDocOrigem;
            }

            /**
             * Define o valor da propriedade c28TipoDocOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC28TipoDocOrigem(String value) {
                this.c28TipoDocOrigem = value;
            }

            /**
             * Obt�m o valor da propriedade c04DocOrigem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC04DocOrigem() {
                return c04DocOrigem;
            }

            /**
             * Define o valor da propriedade c04DocOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC04DocOrigem(String value) {
                this.c04DocOrigem = value;
            }

            /**
             * Obt�m o valor da propriedade c06ValorPrincipal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC06ValorPrincipal() {
                return c06ValorPrincipal;
            }

            /**
             * Define o valor da propriedade c06ValorPrincipal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC06ValorPrincipal(String value) {
                this.c06ValorPrincipal = value;
            }

            /**
             * Obt�m o valor da propriedade c10ValorTotal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC10ValorTotal() {
                return c10ValorTotal;
            }

            /**
             * Define o valor da propriedade c10ValorTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC10ValorTotal(String value) {
                this.c10ValorTotal = value;
            }

            /**
             * Obt�m o valor da propriedade c14DataVencimento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC14DataVencimento() {
                return c14DataVencimento;
            }

            /**
             * Define o valor da propriedade c14DataVencimento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC14DataVencimento(String value) {
                this.c14DataVencimento = value;
            }

            /**
             * Obt�m o valor da propriedade c15Convenio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC15Convenio() {
                return c15Convenio;
            }

            /**
             * Define o valor da propriedade c15Convenio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC15Convenio(String value) {
                this.c15Convenio = value;
            }

            /**
             * Obt�m o valor da propriedade c16RazaoSocialEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC16RazaoSocialEmitente() {
                return c16RazaoSocialEmitente;
            }

            /**
             * Define o valor da propriedade c16RazaoSocialEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC16RazaoSocialEmitente(String value) {
                this.c16RazaoSocialEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade c17InscricaoEstadualEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC17InscricaoEstadualEmitente() {
                return c17InscricaoEstadualEmitente;
            }

            /**
             * Define o valor da propriedade c17InscricaoEstadualEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC17InscricaoEstadualEmitente(String value) {
                this.c17InscricaoEstadualEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade c18EnderecoEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC18EnderecoEmitente() {
                return c18EnderecoEmitente;
            }

            /**
             * Define o valor da propriedade c18EnderecoEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC18EnderecoEmitente(String value) {
                this.c18EnderecoEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade c19MunicipioEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC19MunicipioEmitente() {
                return c19MunicipioEmitente;
            }

            /**
             * Define o valor da propriedade c19MunicipioEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC19MunicipioEmitente(String value) {
                this.c19MunicipioEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade c20UfEnderecoEmitente.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getC20UfEnderecoEmitente() {
                return c20UfEnderecoEmitente;
            }

            /**
             * Define o valor da propriedade c20UfEnderecoEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setC20UfEnderecoEmitente(TUf value) {
                this.c20UfEnderecoEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade c21CepEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC21CepEmitente() {
                return c21CepEmitente;
            }

            /**
             * Define o valor da propriedade c21CepEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC21CepEmitente(String value) {
                this.c21CepEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade c22TelefoneEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC22TelefoneEmitente() {
                return c22TelefoneEmitente;
            }

            /**
             * Define o valor da propriedade c22TelefoneEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC22TelefoneEmitente(String value) {
                this.c22TelefoneEmitente = value;
            }

            /**
             * Obt�m o valor da propriedade c34TipoIdentificacaoDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC34TipoIdentificacaoDestinatario() {
                return c34TipoIdentificacaoDestinatario;
            }

            /**
             * Define o valor da propriedade c34TipoIdentificacaoDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC34TipoIdentificacaoDestinatario(String value) {
                this.c34TipoIdentificacaoDestinatario = value;
            }

            /**
             * Obt�m o valor da propriedade c35IdContribuinteDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link C35IdContribuinteDestinatario }
             *     
             */
            public C35IdContribuinteDestinatario getC35IdContribuinteDestinatario() {
                return c35IdContribuinteDestinatario;
            }

            /**
             * Define o valor da propriedade c35IdContribuinteDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link C35IdContribuinteDestinatario }
             *     
             */
            public void setC35IdContribuinteDestinatario(C35IdContribuinteDestinatario value) {
                this.c35IdContribuinteDestinatario = value;
            }

            /**
             * Obt�m o valor da propriedade c36InscricaoEstadualDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC36InscricaoEstadualDestinatario() {
                return c36InscricaoEstadualDestinatario;
            }

            /**
             * Define o valor da propriedade c36InscricaoEstadualDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC36InscricaoEstadualDestinatario(String value) {
                this.c36InscricaoEstadualDestinatario = value;
            }

            /**
             * Obt�m o valor da propriedade c37RazaoSocialDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC37RazaoSocialDestinatario() {
                return c37RazaoSocialDestinatario;
            }

            /**
             * Define o valor da propriedade c37RazaoSocialDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC37RazaoSocialDestinatario(String value) {
                this.c37RazaoSocialDestinatario = value;
            }

            /**
             * Obt�m o valor da propriedade c38MunicipioDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC38MunicipioDestinatario() {
                return c38MunicipioDestinatario;
            }

            /**
             * Define o valor da propriedade c38MunicipioDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC38MunicipioDestinatario(String value) {
                this.c38MunicipioDestinatario = value;
            }

            /**
             * Obt�m o valor da propriedade c33DataPagamento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC33DataPagamento() {
                return c33DataPagamento;
            }

            /**
             * Define o valor da propriedade c33DataPagamento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC33DataPagamento(String value) {
                this.c33DataPagamento = value;
            }

            /**
             * Obt�m o valor da propriedade c05Referencia.
             * 
             * @return
             *     possible object is
             *     {@link C05Referencia }
             *     
             */
            public C05Referencia getC05Referencia() {
                return c05Referencia;
            }

            /**
             * Define o valor da propriedade c05Referencia.
             * 
             * @param value
             *     allowed object is
             *     {@link C05Referencia }
             *     
             */
            public void setC05Referencia(C05Referencia value) {
                this.c05Referencia = value;
            }

            /**
             * Obt�m o valor da propriedade c39CamposExtras.
             * 
             * @return
             *     possible object is
             *     {@link C39CamposExtras }
             *     
             */
            public C39CamposExtras getC39CamposExtras() {
                return c39CamposExtras;
            }

            /**
             * Define o valor da propriedade c39CamposExtras.
             * 
             * @param value
             *     allowed object is
             *     {@link C39CamposExtras }
             *     
             */
            public void setC39CamposExtras(C39CamposExtras value) {
                this.c39CamposExtras = value;
            }

            /**
             * Obt�m o valor da propriedade c42IdentificadorGuia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC42IdentificadorGuia() {
                return c42IdentificadorGuia;
            }

            /**
             * Define o valor da propriedade c42IdentificadorGuia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC42IdentificadorGuia(String value) {
                this.c42IdentificadorGuia = value;
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
             *       &lt;choice>
             *         &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
             *         &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cnpj",
                "cpf"
            })
            public static class C03IdContribuinteEmitente {

                @XmlElement(name = "CNPJ", namespace = "http://www.gnre.pe.gov.br")
                protected String cnpj;
                @XmlElement(name = "CPF", namespace = "http://www.gnre.pe.gov.br")
                protected String cpf;

                /**
                 * Obt�m o valor da propriedade cnpj.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCNPJ() {
                    return cnpj;
                }

                /**
                 * Define o valor da propriedade cnpj.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCNPJ(String value) {
                    this.cnpj = value;
                }

                /**
                 * Obt�m o valor da propriedade cpf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCPF() {
                    return cpf;
                }

                /**
                 * Define o valor da propriedade cpf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCPF(String value) {
                    this.cpf = value;
                }

            }


            /**
             * 
             * 														Informa��es de
             * 														per�odo de
             * 														apura��o
             * 													
             * 
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="periodo" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="mes" type="{http://www.gnre.pe.gov.br}TMes" minOccurs="0"/>
             *         &lt;element name="ano" type="{http://www.gnre.pe.gov.br}TAno" minOccurs="0"/>
             *         &lt;element name="parcela" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
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
                "periodo",
                "mes",
                "ano",
                "parcela"
            })
            public static class C05Referencia {

                @XmlElement(namespace = "http://www.gnre.pe.gov.br")
                protected String periodo;
                @XmlElement(namespace = "http://www.gnre.pe.gov.br")
                protected String mes;
                @XmlElement(namespace = "http://www.gnre.pe.gov.br")
                protected String ano;
                @XmlElement(namespace = "http://www.gnre.pe.gov.br")
                protected String parcela;

                /**
                 * Obt�m o valor da propriedade periodo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPeriodo() {
                    return periodo;
                }

                /**
                 * Define o valor da propriedade periodo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPeriodo(String value) {
                    this.periodo = value;
                }

                /**
                 * Obt�m o valor da propriedade mes.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMes() {
                    return mes;
                }

                /**
                 * Define o valor da propriedade mes.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMes(String value) {
                    this.mes = value;
                }

                /**
                 * Obt�m o valor da propriedade ano.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAno() {
                    return ano;
                }

                /**
                 * Define o valor da propriedade ano.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAno(String value) {
                    this.ano = value;
                }

                /**
                 * Obt�m o valor da propriedade parcela.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParcela() {
                    return parcela;
                }

                /**
                 * Define o valor da propriedade parcela.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParcela(String value) {
                    this.parcela = value;
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
             *       &lt;choice>
             *         &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
             *         &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cnpj",
                "cpf"
            })
            public static class C35IdContribuinteDestinatario {

                @XmlElement(name = "CNPJ", namespace = "http://www.gnre.pe.gov.br")
                protected String cnpj;
                @XmlElement(name = "CPF", namespace = "http://www.gnre.pe.gov.br")
                protected String cpf;

                /**
                 * Obt�m o valor da propriedade cnpj.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCNPJ() {
                    return cnpj;
                }

                /**
                 * Define o valor da propriedade cnpj.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCNPJ(String value) {
                    this.cnpj = value;
                }

                /**
                 * Obt�m o valor da propriedade cpf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCPF() {
                    return cpf;
                }

                /**
                 * Define o valor da propriedade cpf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCPF(String value) {
                    this.cpf = value;
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
             *         &lt;element name="campoExtra" maxOccurs="3">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
             *                   &lt;element name="valor">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="100"/>
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
                "campoExtra"
            })
            public static class C39CamposExtras {

                @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                protected List<CampoExtra> campoExtra;

                /**
                 * Gets the value of the campoExtra property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the campoExtra property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCampoExtra().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CampoExtra }
                 * 
                 * 
                 */
                public List<CampoExtra> getCampoExtra() {
                    if (campoExtra == null) {
                        campoExtra = new ArrayList<CampoExtra>();
                    }
                    return this.campoExtra;
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
                 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
                 *         &lt;element name="valor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="100"/>
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
                    "tipo",
                    "valor"
                })
                public static class CampoExtra {

                    @XmlElement(namespace = "http://www.gnre.pe.gov.br")
                    protected int codigo;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    @XmlSchemaType(name = "string")
                    protected TTipoCampoExtra tipo;
                    @XmlElement(namespace = "http://www.gnre.pe.gov.br", required = true)
                    protected String valor;

                    /**
                     * Obt�m o valor da propriedade codigo.
                     * 
                     */
                    public int getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define o valor da propriedade codigo.
                     * 
                     */
                    public void setCodigo(int value) {
                        this.codigo = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tipo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TTipoCampoExtra }
                     *     
                     */
                    public TTipoCampoExtra getTipo() {
                        return tipo;
                    }

                    /**
                     * Define o valor da propriedade tipo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TTipoCampoExtra }
                     *     
                     */
                    public void setTipo(TTipoCampoExtra value) {
                        this.tipo = value;
                    }

                    /**
                     * Obt�m o valor da propriedade valor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValor() {
                        return valor;
                    }

                    /**
                     * Define o valor da propriedade valor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValor(String value) {
                        this.valor = value;
                    }

                }

            }

        }

    }

}
