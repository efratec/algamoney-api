package br.com.ofm.gnre.vo;

import java.util.List;

public class GnreVO {

	private String ufFavorecida;
	private String receita;
	private String detalhamentoReceita;
	private String produto;
	//Emitente
	private String tipoIdentificacaoEmitente;
	private String tipoContribuinteEmitente;
	private String cpfContribuinteEmitente;
	private String cnpjContribuinteEmitente;
	private String tipoDocOrigem;
	private String docOrigem;
	private String valorPrincipal;
	private String valorTotal;
	private String dataVencimento;
	private String convenio;
	private String razaoSocialEmitente;
	private String inscricaoEstadualEmitente;
	private String enderecoEmitente;
	private String municipioEmitente;
	private String ufEnderecoEmitente;
	private String cepEmitente;
	private String telefoneEmitente;
	//Destinatário
	private String tipoIdentificaoDestinatario;
	private String cpfContribuinteDestinatario;
	private String cnpjContribuinteDestinatario;
	private String inscricaoEstadualDestinatario;
	private String razaoSocialDestinatario;
	private String municipioDestinatario;
	private String dataPagamento;
	//Referência
	private String periodo;
	private String mes;
	private String ano;
	private String parcela;
	//Campos Extras
	private List<CamposExtrasVO> camposExtras;
	
	public String getUfFavorecida() {
		return ufFavorecida;
	}
	public void setUfFavorecida(String ufFavorecida) {
		this.ufFavorecida = ufFavorecida;
	}
	public String getReceita() {
		return receita;
	}
	public void setReceita(String receita) {
		this.receita = receita;
	}
	public String getDetalhamentoReceita() {
		return detalhamentoReceita;
	}
	public void setDetalhamentoReceita(String detalhamentoReceita) {
		this.detalhamentoReceita = detalhamentoReceita;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getTipoIdentificacaoEmitente() {
		return tipoIdentificacaoEmitente;
	}
	public void setTipoIdentificacaoEmitente(String tipoIdentificacaoEmitente) {
		this.tipoIdentificacaoEmitente = tipoIdentificacaoEmitente;
	}
	public String getTipoContribuinteEmitente() {
		return tipoContribuinteEmitente;
	}
	public void setTipoContribuinteEmitente(String tipoContribuinteEmitente) {
		this.tipoContribuinteEmitente = tipoContribuinteEmitente;
	}
	public String getCpfContribuinteEmitente() {
		return cpfContribuinteEmitente;
	}
	public void setCpfContribuinteEmitente(String cpfContribuinteEmitente) {
		this.cpfContribuinteEmitente = cpfContribuinteEmitente;
	}
	public String getCnpjContribuinteEmitente() {
		return cnpjContribuinteEmitente;
	}
	public void setCnpjContribuinteEmitente(String cnpjContribuinteEmitente) {
		this.cnpjContribuinteEmitente = cnpjContribuinteEmitente;
	}
	public String getTipoDocOrigem() {
		return tipoDocOrigem;
	}
	public void setTipoDocOrigem(String tipoDocOrigem) {
		this.tipoDocOrigem = tipoDocOrigem;
	}
	public String getDocOrigem() {
		return docOrigem;
	}
	public void setDocOrigem(String docOrigem) {
		this.docOrigem = docOrigem;
	}
	public String getValorPrincipal() {
		return valorPrincipal;
	}
	public void setValorPrincipal(String valorPrincipal) {
		this.valorPrincipal = valorPrincipal;
	}
	public String getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getRazaoSocialEmitente() {
		return razaoSocialEmitente;
	}
	public void setRazaoSocialEmitente(String razaoSocialEmitente) {
		this.razaoSocialEmitente = razaoSocialEmitente;
	}
	public String getInscricaoEstadualEmitente() {
		return inscricaoEstadualEmitente;
	}
	public void setInscricaoEstadualEmitente(String inscricaoEstadualEmitente) {
		this.inscricaoEstadualEmitente = inscricaoEstadualEmitente;
	}
	public String getEnderecoEmitente() {
		return enderecoEmitente;
	}
	public void setEnderecoEmitente(String enderecoEmitente) {
		this.enderecoEmitente = enderecoEmitente;
	}
	public String getMunicipioEmitente() {
		return municipioEmitente;
	}
	public void setMunicipioEmitente(String municipioEmitente) {
		this.municipioEmitente = municipioEmitente;
	}
	public String getUfEnderecoEmitente() {
		return ufEnderecoEmitente;
	}
	public void setUfEnderecoEmitente(String ufEnderecoEmitente) {
		this.ufEnderecoEmitente = ufEnderecoEmitente;
	}
	public String getCepEmitente() {
		return cepEmitente;
	}
	public void setCepEmitente(String cepEmitente) {
		this.cepEmitente = cepEmitente;
	}
	public String getTelefoneEmitente() {
		return telefoneEmitente;
	}
	public void setTelefoneEmitente(String telefoneEmitente) {
		this.telefoneEmitente = telefoneEmitente;
	}
	public String getTipoIdentificaoDestinatario() {
		return tipoIdentificaoDestinatario;
	}
	public void setTipoIdentificaoDestinatario(String tipoIdentificaoDestinatario) {
		this.tipoIdentificaoDestinatario = tipoIdentificaoDestinatario;
	}
	public String getCpfContribuinteDestinatario() {
		return cpfContribuinteDestinatario;
	}
	public void setCpfContribuinteDestinatario(String cpfContribuinteDestinatario) {
		this.cpfContribuinteDestinatario = cpfContribuinteDestinatario;
	}
	public String getCnpjContribuinteDestinatario() {
		return cnpjContribuinteDestinatario;
	}
	public void setCnpjContribuinteDestinatario(String cnpjContribuinteDestinatario) {
		this.cnpjContribuinteDestinatario = cnpjContribuinteDestinatario;
	}
	public String getInscricaoEstadualDestinatario() {
		return inscricaoEstadualDestinatario;
	}
	public void setInscricaoEstadualDestinatario(String inscricaoEstadualDestinatario) {
		this.inscricaoEstadualDestinatario = inscricaoEstadualDestinatario;
	}
	public String getRazaoSocialDestinatario() {
		return razaoSocialDestinatario;
	}
	public void setRazaoSocialDestinatario(String razaoSocialDestinatario) {
		this.razaoSocialDestinatario = razaoSocialDestinatario;
	}
	public String getMunicipioDestinatario() {
		return municipioDestinatario;
	}
	public void setMunicipioDestinatario(String municipioDestinatario) {
		this.municipioDestinatario = municipioDestinatario;
	}
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getParcela() {
		return parcela;
	}
	public void setParcela(String parcela) {
		this.parcela = parcela;
	}
	public List<CamposExtrasVO> getCamposExtras() {
		return camposExtras;
	}
	public void setCamposExtras(List<CamposExtrasVO> camposExtras) {
		this.camposExtras = camposExtras;
	}
	
	
	
	
}
