package br.com.ofm.gnre.service.impl;

import br.com.ofm.gnre.app.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-12-06T10:12:14.071-02:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://www.gnre.pe.gov.br/webservice/GnreConfigUF", name = "GnreConfigUFSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GnreConfigUFSoap {

    @WebMethod(action = "http://www.gnre.pe.gov.br/webservice/GnreConfigUF/consultar")
    @WebResult(name = "gnreRespostaMsg", targetNamespace = "http://www.gnre.pe.gov.br/webservice/GnreConfigUF", partName = "gnreRespostaMsg")
    public GnreRespostaMsg consultar(
        @WebParam(partName = "gnreDadosMsg", name = "gnreDadosMsg", targetNamespace = "http://www.gnre.pe.gov.br/webservice/GnreConfigUF")
        GnreDadosMsg gnreDadosMsg
    );
}