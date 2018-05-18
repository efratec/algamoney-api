package br.com.ofm.gnre.vo;

/** 
* GNRE - Guia Nacional de Recolhimento de Tributos Estaduais (LoteRecepcao). 
*  
* Classe LoteResultadoVO para receber os dados da consulta do webservice
*  
* @author Efraim Tenorio 2018
* @since  03/04/2018
*  
*/ 

public class LoteResultadoVO {
	
	private String identificadorSolicitante;
	private String ufFavorecida;
	private String codigoReceita;
	
	//Emitente
	private String tipoDocumentoEmitente;
	private String razaoSocialEmitente;
	private String enderecoEmitente;
	private String municipioEmitente;
	private String ufEmitente;
	private String cepEmitente;
	private String telefoneEmitente;
	
	//Destinatario
	private String municipioDestinatario;
	private String tipoDocumentoDestinatario;
	
	private String produto;
	private String numeroDocumentoOrigem;
	private String convenio;
	private String informacoesComplementares;
	private String dataVencimento;
	private String dataLimitePagamento;
	private String dataPeriodoReferencia;
	private String dataMesAnoReferencia;
	private String parcela;
	private String valorPrincipal;
	private String atualizacaoMonetaria;
	private String juros;
	private String multa;
	private String RepresentacaoNumerica;
	private String codigoBarras;
	private String identificadorGuia;
	private String guiaGeradaContigencia;
	private String reservado;
	private String numeroControle;
	
	public String getUfFavorecida() {
		return ufFavorecida;
	}
	public void setUfFavorecida(String ufFavorecida) {
		this.ufFavorecida = ufFavorecida;
	}
	public String getCodigoReceita() {
		return codigoReceita;
	}
	public void setCodigoReceita(String codigoReceita) {
		this.codigoReceita = codigoReceita;
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
	public String getUfEmitente() {
		return ufEmitente;
	}
	public void setUfEmitente(String ufEmitente) {
		this.ufEmitente = ufEmitente;
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
	public String getMunicipioDestinatario() {
		return municipioDestinatario;
	}
	public void setMunicipioDestinatario(String municipioDestinatario) {
		this.municipioDestinatario = municipioDestinatario;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getNumeroDocumentoOrigem() {
		return numeroDocumentoOrigem;
	}
	public void setNumeroDocumentoOrigem(String numeroDocumentoOrigem) {
		this.numeroDocumentoOrigem = numeroDocumentoOrigem;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getInformacoesComplementares() {
		return informacoesComplementares;
	}
	public void setInformacoesComplementares(String informacoesComplementares) {
		this.informacoesComplementares = informacoesComplementares;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getDataLimitePagamento() {
		return dataLimitePagamento;
	}
	public void setDataLimitePagamento(String dataLimitePagamento) {
		this.dataLimitePagamento = dataLimitePagamento;
	}
	public String getDataPeriodoReferencia() {
		return dataPeriodoReferencia;
	}
	public void setDataPeriodoReferencia(String dataPeriodoReferencia) {
		this.dataPeriodoReferencia = dataPeriodoReferencia;
	}
	public String getDataMesAnoReferencia() {
		return dataMesAnoReferencia;
	}
	public void setDataMesAnoReferencia(String dataMesAnoReferencia) {
		this.dataMesAnoReferencia = dataMesAnoReferencia;
	}
	public String getParcela() {
		return parcela;
	}
	public void setParcela(String parcela) {
		this.parcela = parcela;
	}
	public String getValorPrincipal() {
		return valorPrincipal;
	}
	public void setValorPrincipal(String valorPrincipal) {
		this.valorPrincipal = valorPrincipal;
	}
	public String getAtualizacaoMonetaria() {
		return atualizacaoMonetaria;
	}
	public void setAtualizacaoMonetaria(String atualizacaoMonetaria) {
		this.atualizacaoMonetaria = atualizacaoMonetaria;
	}
	public String getJuros() {
		return juros;
	}
	public void setJuros(String juros) {
		this.juros = juros;
	}
	public String getMulta() {
		return multa;
	}
	public void setMulta(String multa) {
		this.multa = multa;
	}
	public String getRepresentacaoNumerica() {
		return RepresentacaoNumerica;
	}
	public void setRepresentacaoNumerica(String representacaoNumerica) {
		RepresentacaoNumerica = representacaoNumerica;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getIdentificadorGuia() {
		return identificadorGuia;
	}
	public void setIdentificadorGuia(String identificadorGuia) {
		this.identificadorGuia = identificadorGuia;
	}
	public String getGuiaGeradaContigencia() {
		return guiaGeradaContigencia;
	}
	public void setGuiaGeradaContigencia(String guiaGeradaContigencia) {
		this.guiaGeradaContigencia = guiaGeradaContigencia;
	}
	public String getReservado() {
		return reservado;
	}
	public void setReservado(String reservado) {
		this.reservado = reservado;
	}
	public String getIdentificadorSolicitante() {
		return identificadorSolicitante;
	}
	public void setIdentificadorSolicitante(String identificadorSolicitante) {
		this.identificadorSolicitante = identificadorSolicitante;
	}
	public String getRazaoSocialEmitente() {
		return razaoSocialEmitente;
	}
	public void setRazaoSocialEmitente(String razaoSocialEmitente) {
		this.razaoSocialEmitente = razaoSocialEmitente;
	}
	public String getNumeroControle() {
		return numeroControle;
	}
	public void setNumeroControle(String numeroControle) {
		this.numeroControle = numeroControle;
	}
	public String getTipoDocumentoEmitente() {
		return tipoDocumentoEmitente;
	}
	public void setTipoDocumentoEmitente(String tipoDocumentoEmitente) {
		this.tipoDocumentoEmitente = tipoDocumentoEmitente;
	}
	public String getTipoDocumentoDestinatario() {
		return tipoDocumentoDestinatario;
	}
	public void setTipoDocumentoDestinatario(String tipoDocumentoDestinatario) {
		this.tipoDocumentoDestinatario = tipoDocumentoDestinatario;
	}
	
	
}
