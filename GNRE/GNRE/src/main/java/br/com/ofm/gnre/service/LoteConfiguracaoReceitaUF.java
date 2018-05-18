package br.com.ofm.gnre.service;

import br.com.ofm.gnre.model.TConfigUf;
import br.com.ofm.gnre.model.TSimNao;
import br.com.ofm.gnre.model.TUf;

public interface LoteConfiguracaoReceitaUF {
	
	TConfigUf retornaConfiguracaoUF(TUf uf, String codigoReceita,String caminhoCertificado,TSimNao courier, String senhaCertificado, String cacertsPath);

}
