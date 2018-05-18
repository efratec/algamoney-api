package br.com.ofm.gnre.service.impl;

import br.com.ofm.gnre.util.StringUtil;
import br.com.ofm.gnre.vo.GnreVO;

public class GerarXmlGnre {
	
	public static String gerarXML(GnreVO vo) {
		StringBuilder xml = new StringBuilder();
		xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?> ");
		xml.append("   <TLote_GNRE xmlns=\"http://www.gnre.pe.gov.br\"> ");
		xml.append("<guias>");
		xml.append("   <TDadosGNRE>");
		xml.append("  	<c01_UfFavorecida>".concat(vo.getUfFavorecida()).concat("</c01_UfFavorecida> "));
		xml.append("  	<c02_receita>".concat(vo.getReceita()).concat("</c02_receita> ")) ;
		
		if (!StringUtil.isEmptyOrNull(vo.getDetalhamentoReceita())) {
			xml.append("  	<c25_detalhamentoReceita>".concat(vo.getDetalhamentoReceita()).concat("</c25_detalhamentoReceita>"));
		}
		
		if (vo.getProduto() != null && vo.getInscricaoEstadualEmitente() == null) {
			xml.append("  	<c26_produto>".concat(vo.getProduto()).concat("</c26_produto>"));
		}
		
		if (!StringUtil.isEmptyOrNull(vo.getTipoContribuinteEmitente())){
			xml.append("  	<c27_tipoIdentificacaoEmitente>".concat(vo.getTipoContribuinteEmitente()).concat("</c27_tipoIdentificacaoEmitente> "));
		}
		
		xml.append("  	<c03_idContribuinteEmitente> ");
			if (!StringUtil.isEmptyOrNull(vo.getCpfContribuinteEmitente())){
				xml.append("   	 	<CPF>".concat(vo.getCpfContribuinteEmitente()).concat("</CPF>"));
			}else {
				xml.append("    	<CNPJ>".concat(vo.getCnpjContribuinteEmitente()).concat("</CNPJ>"));
			}
		xml.append("  	</c03_idContribuinteEmitente>");
		
		xml.append("  	<c28_tipoDocOrigem>".concat(vo.getTipoDocOrigem()).concat("</c28_tipoDocOrigem> "));
		xml.append("  	<c04_docOrigem>".concat(vo.getDocOrigem()).concat("</c04_docOrigem>"));
		xml.append("  	<c06_valorPrincipal>".concat(vo.getValorPrincipal()).concat("</c06_valorPrincipal>"));
		
		if (!StringUtil.isEmptyOrNull(vo.getValorTotal())) {
			xml.append("  	<c10_valorTotal>".concat(vo.getValorTotal()).concat("</c10_valorTotal> "));
		}
		
		xml.append("  	<c14_dataVencimento>".concat(vo.getDataVencimento()).concat("</c14_dataVencimento>"));
		
		if (!StringUtil.isEmptyOrNull(vo.getConvenio())) {
			xml.append("  	<c15_convenio>".concat(vo.getConvenio()).concat("</c15_convenio>"));
		}
		
		xml.append("  	<c16_razaoSocialEmitente>".concat(vo.getRazaoSocialEmitente()).concat("</c16_razaoSocialEmitente>"));
		
		if (vo.getInscricaoEstadualEmitente() != null) {
			xml.append(" 	 <c17_inscricaoEstadualEmitente>".concat(vo.getInscricaoEstadualEmitente()).concat("</c17_inscricaoEstadualEmitente>"));
		}
		
		xml.append("  	<c18_enderecoEmitente>".concat(vo.getEnderecoEmitente()).concat("</c18_enderecoEmitente> "));
		xml.append("  	<c19_municipioEmitente>".concat(vo.getMunicipioEmitente()).concat("</c19_municipioEmitente> "));
		xml.append("  	<c20_ufEnderecoEmitente>".concat(vo.getUfEnderecoEmitente()).concat("</c20_ufEnderecoEmitente>"));
		
		if (!StringUtil.isEmptyOrNull(vo.getCepEmitente())) {
			xml.append("  	<c21_cepEmitente>".concat(vo.getCepEmitente()).concat("</c21_cepEmitente> "));
		}
		
		if (!StringUtil.isEmptyOrNull(vo.getTelefoneEmitente())) {
			xml.append("  	<c22_telefoneEmitente>".concat(vo.getTelefoneEmitente()).concat("</c22_telefoneEmitente> "));
		}
	
		xml.append("  	<c34_tipoIdentificacaoDestinatario>".concat(vo.getTipoIdentificacaoEmitente()).concat("</c34_tipoIdentificacaoDestinatario>"));
	  
		/*if (!StringUtil.isVericaStringsNaoNulasOuNaoVazias(vo.getCpfContribuinteDestinatario(),vo.getCnpjContribuinteDestinatario())) {
			xml.append("  	<c35_idContribuinteDestinatario>");
			if (!StringUtil.isEmptyOrNull(vo.getCpfContribuinteDestinatario())) {
				xml.append("    	<CPF>".concat(vo.getCpfContribuinteDestinatario()).concat("</CPF>"));
			}else if (!StringUtil.isEmptyOrNull(vo.getCnpjContribuinteDestinatario())) {
				xml.append("    	<CNPJ>".concat(vo.getCnpjContribuinteDestinatario()).concat("</CNPJ> "));
			}
			xml.append("  	</c35_idContribuinteDestinatario>");
		}*/
		
		if (vo.getInscricaoEstadualDestinatario() != null) {
			xml.append("  <c36_inscricaoEstadualDestinatario>".concat(vo.getInscricaoEstadualDestinatario()).concat("</c36_inscricaoEstadualDestinatario>"));
		}
		xml.append("  <c37_razaoSocialDestinatario>".concat(vo.getRazaoSocialDestinatario()).concat("</c37_razaoSocialDestinatario>"));
		xml.append("  <c38_municipioDestinatario>".concat(vo.getMunicipioDestinatario()).concat("</c38_municipioDestinatario> "));
		xml.append("  <c33_dataPagamento>".concat(vo.getDataPagamento()).concat("</c33_dataPagamento>"));
		xml.append("  <c05_referencia>");

		xml.append("    <periodo>".concat(vo.getPeriodo()).concat("</periodo>"));
		xml.append("    <mes>".concat(vo.getMes()).concat("</mes> "));
		xml.append("    <ano>".concat(vo.getAno()).concat("</ano> "));
			
			if (!StringUtil.isEmptyOrNull(vo.getParcela())) {
				xml.append("    <parcela>".concat(vo.getParcela()).concat("</parcela>"));
			}
			
		xml.append("  </c05_referencia>");
		
		if (vo.getCamposExtras() != null) {
			xml.append("  <c39_camposExtras>");
			xml.append(StringUtil.montaCamposExtrasXML(vo.getCamposExtras()));
			xml.append("  </c39_camposExtras>");
		}
		
		xml.append("</TDadosGNRE>");
		xml.append("	</guias> ");
		xml.append("</TLote_GNRE>");
		
		String xmlNovo = StringUtil.removeAcentos(xml.toString());
		System.out.println(xmlNovo);
		return xmlNovo;
		
	}

}
