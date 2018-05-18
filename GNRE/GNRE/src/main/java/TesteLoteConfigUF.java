import java.util.List;

import br.com.ofm.gnre.model.TConfigUf;
import br.com.ofm.gnre.util.ConfiguracaoReceitaUfUtil;

public class TesteLoteConfigUF {
	
	 public static final String cacertsPath = "C:\\Users\\efraim.silva\\NFeCacerts";
	 public static final String caminhoCertificado = "c:\\dir_certificado\\Certificado.pfx";
	 public static final String keyStorePassword = "ceal2017";
	 public static final char[] passwordPin = keyStorePassword.toCharArray();

	
	public static void main(String[] args) {
		
		List<TConfigUf> listaConfiguUf = ConfiguracaoReceitaUfUtil.listaRegrasPreenchimentoPorUFAnReceita();
		
		System.out.println("Exige UF Favorecida | Exige Receta | UF | Receita | "
				         + "Exite Contribuinte Emitente | Exige Detalhamento Receita | "
				         + "Exige Produto | Exige Valor Exigido | Exige Documento Origem | "
				         + "Exige Período Referência | Exige Contribuinte Destinatário | "
				         + "Exige Data Vencimento | " + "Exige Data Pagamento | "
				         + "Exige Campos Adicionais");
		
		
		for (TConfigUf tConfigUf : listaConfiguUf) {
			try {
			System.out.println(tConfigUf.getExigeUfFavorecida().getValue().toString() + " | "
					+ tConfigUf.getExigeReceita().getValue().toString() + " | " + tConfigUf.getUf().toString() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getCodigo() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getExigeContribuinteEmitente().value() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getExigeDetalhamentoReceita().getValue() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getExigeProduto().getValue().toString() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getValorExigido().getValue().toString() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getExigeDocumentoOrigem().getValue().toString() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getExigePeriodoReferencia().getValue().toString() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getExigeContribuinteDestinatario().value() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getExigeDataVencimento().getValue().toString() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getExigeDataPagamento().getValue().toString() + " | "
					+ tConfigUf.getReceitas().getReceita().iterator().next().getExigeCamposAdicionais().getValue().toString() + " | ");
			} catch (Exception erro) {
				
			}
		}
	}
	
}

