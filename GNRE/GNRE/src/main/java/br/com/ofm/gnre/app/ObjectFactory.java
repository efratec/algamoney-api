package br.com.ofm.gnre.app;

import javax.xml.bind.annotation.XmlRegistry;

import br.com.ofm.gnre.model.TConfigUf;
import br.com.ofm.gnre.model.TConsLoteGNRE;
import br.com.ofm.gnre.model.TConsultaConfigUf;
import br.com.ofm.gnre.model.TLoteGNRE;
import br.com.ofm.gnre.model.TResultLoteGNRE;
import br.com.ofm.gnre.model.TRetLoteGNRE;
import br.com.ofm.gnre.service.impl.GnreCabecMsg;
import br.com.ofm.gnre.service.impl.GnreDadosMsg;
import br.com.ofm.gnre.service.impl.GnreRespostaMsg;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the br.com.tropicalia.model package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.tropicalia.model
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GnreDadosMsg }
     */
    public GnreDadosMsg createGnreDadosMsg() {
        return new GnreDadosMsg();
    }

    /**
     * Create an instance of {@link GnreRespostaMsg }
     */
    public GnreRespostaMsg createGnreRespostaMsg() {
        return new GnreRespostaMsg();
    }

    /**
     * Create an instance of {@link GnreCabecMsg }
     */
    public GnreCabecMsg createGnreCabecMsg() {
        return new GnreCabecMsg();
    }

    /**
     * Create an instance of {@link TLoteGNRE }
     */
    public TLoteGNRE createTLoteGNRE() {
        return new TLoteGNRE();
    }

    /**
     * Create an instance of {@link TLoteGNRE.Guias }
     */
    public TLoteGNRE.Guias createTLoteGNREGuias() {
        return new TLoteGNRE.Guias();
    }

    /**
     * Create an instance of {@link TLoteGNRE.Guias.TDadosGNRE }
     */
    public TLoteGNRE.Guias.TDadosGNRE createTLoteGNREGuiasTDadosGNRE() {
        return new TLoteGNRE.Guias.TDadosGNRE();
    }

    /**
     * Create an instance of {@link TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras }
     */
    public TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras createTLoteGNREGuiasTDadosGNREC39CamposExtras() {
        return new TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras();
    }

    /**
     * Create an instance of {@link TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente }
     */
    public TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente createTLoteGNREGuiasTDadosGNREC03IdContribuinteEmitente() {
        return new TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente();
    }

    /**
     * Create an instance of {@link TLoteGNRE.Guias.TDadosGNRE.C35IdContribuinteDestinatario }
     */
    public TLoteGNRE.Guias.TDadosGNRE.C35IdContribuinteDestinatario createTLoteGNREGuiasTDadosGNREC35IdContribuinteDestinatario() {
        return new TLoteGNRE.Guias.TDadosGNRE.C35IdContribuinteDestinatario();
    }

    /**
     * Create an instance of {@link TLoteGNRE.Guias.TDadosGNRE.C05Referencia }
     */
    public TLoteGNRE.Guias.TDadosGNRE.C05Referencia createTLoteGNREGuiasTDadosGNREC05Referencia() {
        return new TLoteGNRE.Guias.TDadosGNRE.C05Referencia();
    }

    /**
     * Create an instance of {@link TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras.CampoExtra }
     */
    public TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras.CampoExtra createTLoteGNREGuiasTDadosGNREC39CamposExtrasCampoExtra() {
        return new TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras.CampoExtra();
    }

    /**
     * Create an instance of {@link TConfigUf }
     */
    public TConfigUf createTConfigUf() {
        return new TConfigUf();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas }
     */
    public TConfigUf.Receitas createTConfigUfReceitas() {
        return new TConfigUf.Receitas();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita }
     */
    public TConfigUf.Receitas.Receita createTConfigUfReceitasReceita() {
        return new TConfigUf.Receitas.Receita();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.CamposAdicionais }
     */
    public TConfigUf.Receitas.Receita.CamposAdicionais createTConfigUfReceitasReceitaCamposAdicionais() {
        return new TConfigUf.Receitas.Receita.CamposAdicionais();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.CamposAdicionais.CampoAdicional }
     */
    public TConfigUf.Receitas.Receita.CamposAdicionais.CampoAdicional createTConfigUfReceitasReceitaCamposAdicionaisCampoAdicional() {
        return new TConfigUf.Receitas.Receita.CamposAdicionais.CampoAdicional();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.TiposDocumentosOrigem }
     */
    public TConfigUf.Receitas.Receita.TiposDocumentosOrigem createTConfigUfReceitasReceitaTiposDocumentosOrigem() {
        return new TConfigUf.Receitas.Receita.TiposDocumentosOrigem();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.PeriodosApuracao }
     */
    public TConfigUf.Receitas.Receita.PeriodosApuracao createTConfigUfReceitasReceitaPeriodosApuracao() {
        return new TConfigUf.Receitas.Receita.PeriodosApuracao();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.Produtos }
     */
    public TConfigUf.Receitas.Receita.Produtos createTConfigUfReceitasReceitaProdutos() {
        return new TConfigUf.Receitas.Receita.Produtos();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.DetalhamentosReceita }
     */
    public TConfigUf.Receitas.Receita.DetalhamentosReceita createTConfigUfReceitasReceitaDetalhamentosReceita() {
        return new TConfigUf.Receitas.Receita.DetalhamentosReceita();
    }

    /**
     * Create an instance of {@link TConfigUf.SituacaoConsulta }
     */
    public TConfigUf.SituacaoConsulta createTConfigUfSituacaoConsulta() {
        return new TConfigUf.SituacaoConsulta();
    }

    /**
     * Create an instance of {@link TConfigUf.ExigeUfFavorecida }
     */
    public TConfigUf.ExigeUfFavorecida createTConfigUfExigeUfFavorecida() {
        return new TConfigUf.ExigeUfFavorecida();
    }

    /**
     * Create an instance of {@link TConfigUf.ExigeReceita }
     */
    public TConfigUf.ExigeReceita createTConfigUfExigeReceita() {
        return new TConfigUf.ExigeReceita();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigeDetalhamentoReceita }
     */
    public TConfigUf.Receitas.Receita.ExigeDetalhamentoReceita createTConfigUfReceitasReceitaExigeDetalhamentoReceita() {
        return new TConfigUf.Receitas.Receita.ExigeDetalhamentoReceita();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigeProduto }
     */
    public TConfigUf.Receitas.Receita.ExigeProduto createTConfigUfReceitasReceitaExigeProduto() {
        return new TConfigUf.Receitas.Receita.ExigeProduto();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigePeriodoReferencia }
     */
    public TConfigUf.Receitas.Receita.ExigePeriodoReferencia createTConfigUfReceitasReceitaExigePeriodoReferencia() {
        return new TConfigUf.Receitas.Receita.ExigePeriodoReferencia();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigePeriodoApuracao }
     */
    public TConfigUf.Receitas.Receita.ExigePeriodoApuracao createTConfigUfReceitasReceitaExigePeriodoApuracao() {
        return new TConfigUf.Receitas.Receita.ExigePeriodoApuracao();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigeParcela }
     */
    public TConfigUf.Receitas.Receita.ExigeParcela createTConfigUfReceitasReceitaExigeParcela() {
        return new TConfigUf.Receitas.Receita.ExigeParcela();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ValorExigido }
     */
    public TConfigUf.Receitas.Receita.ValorExigido createTConfigUfReceitasReceitaValorExigido() {
        return new TConfigUf.Receitas.Receita.ValorExigido();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigeDocumentoOrigem }
     */
    public TConfigUf.Receitas.Receita.ExigeDocumentoOrigem createTConfigUfReceitasReceitaExigeDocumentoOrigem() {
        return new TConfigUf.Receitas.Receita.ExigeDocumentoOrigem();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigeDataVencimento }
     */
    public TConfigUf.Receitas.Receita.ExigeDataVencimento createTConfigUfReceitasReceitaExigeDataVencimento() {
        return new TConfigUf.Receitas.Receita.ExigeDataVencimento();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigeDataPagamento }
     */
    public TConfigUf.Receitas.Receita.ExigeDataPagamento createTConfigUfReceitasReceitaExigeDataPagamento() {
        return new TConfigUf.Receitas.Receita.ExigeDataPagamento();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigeConvenio }
     */
    public TConfigUf.Receitas.Receita.ExigeConvenio createTConfigUfReceitasReceitaExigeConvenio() {
        return new TConfigUf.Receitas.Receita.ExigeConvenio();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.ExigeCamposAdicionais }
     */
    public TConfigUf.Receitas.Receita.ExigeCamposAdicionais createTConfigUfReceitasReceitaExigeCamposAdicionais() {
        return new TConfigUf.Receitas.Receita.ExigeCamposAdicionais();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.CamposAdicionais.CampoAdicional.Codigo }
     */
    public TConfigUf.Receitas.Receita.CamposAdicionais.CampoAdicional.Codigo createTConfigUfReceitasReceitaCamposAdicionaisCampoAdicionalCodigo() {
        return new TConfigUf.Receitas.Receita.CamposAdicionais.CampoAdicional.Codigo();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.CamposAdicionais.CampoAdicional.Tipo }
     */
    public TConfigUf.Receitas.Receita.CamposAdicionais.CampoAdicional.Tipo createTConfigUfReceitasReceitaCamposAdicionaisCampoAdicionalTipo() {
        return new TConfigUf.Receitas.Receita.CamposAdicionais.CampoAdicional.Tipo();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.TiposDocumentosOrigem.TipoDocumentoOrigem }
     */
    public TConfigUf.Receitas.Receita.TiposDocumentosOrigem.TipoDocumentoOrigem createTConfigUfReceitasReceitaTiposDocumentosOrigemTipoDocumentoOrigem() {
        return new TConfigUf.Receitas.Receita.TiposDocumentosOrigem.TipoDocumentoOrigem();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.PeriodosApuracao.PeriodoApuracao }
     */
    public TConfigUf.Receitas.Receita.PeriodosApuracao.PeriodoApuracao createTConfigUfReceitasReceitaPeriodosApuracaoPeriodoApuracao() {
        return new TConfigUf.Receitas.Receita.PeriodosApuracao.PeriodoApuracao();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.Produtos.Produto }
     */
    public TConfigUf.Receitas.Receita.Produtos.Produto createTConfigUfReceitasReceitaProdutosProduto() {
        return new TConfigUf.Receitas.Receita.Produtos.Produto();
    }

    /**
     * Create an instance of {@link TConfigUf.Receitas.Receita.DetalhamentosReceita.DetalhamentoReceita }
     */
    public TConfigUf.Receitas.Receita.DetalhamentosReceita.DetalhamentoReceita createTConfigUfReceitasReceitaDetalhamentosReceitaDetalhamentoReceita() {
        return new TConfigUf.Receitas.Receita.DetalhamentosReceita.DetalhamentoReceita();
    }

    /**
     * Create an instance of {@link TConsultaConfigUf }
     */
    public TConsultaConfigUf createTConsultaConfigUf() {
        return new TConsultaConfigUf();
    }

    /**
     * Create an instance of {@link TConsultaConfigUf.Receita }
     */
    public TConsultaConfigUf.Receita createTConsultaConfigUfReceita() {
        return new TConsultaConfigUf.Receita();
    }

    /**
     * Create an instance of {@link TConsLoteGNRE }
     */
    public TConsLoteGNRE createTConsLoteGNRE() {
        return new TConsLoteGNRE();
    }

    /**
     * Create an instance of {@link TRetLoteGNRE }
     */
    public TRetLoteGNRE createTRetLoteGNRE() {
        return new TRetLoteGNRE();
    }

    /**
     * Create an instance of {@link TRetLoteGNRE.SituacaoRecepcao }
     */
    public TRetLoteGNRE.SituacaoRecepcao createTRetLoteGNRESituacaoRecepcao() {
        return new TRetLoteGNRE.SituacaoRecepcao();
    }

    /**
     * Create an instance of {@link TRetLoteGNRE.Recibo }
     */
    public TRetLoteGNRE.Recibo createTRetLoteGNRERecibo() {
        return new TRetLoteGNRE.Recibo();
    }

    /**
     * Create an instance of {@link TResultLoteGNRE }
     */
    public TResultLoteGNRE createTResultLoteGNRE() {
        return new TResultLoteGNRE();
    }

    /**
     * Create an instance of {@link TResultLoteGNRE.SituacaoProcess }
     */
    public TResultLoteGNRE.SituacaoProcess createTResultLoteGNRESituacaoProcess() {
        return new TResultLoteGNRE.SituacaoProcess();
    }

}