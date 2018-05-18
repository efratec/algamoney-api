package br.com.ofm.gnre.util;

import java.util.Arrays;
import java.util.List;

import br.com.ofm.gnre.model.TUf;

public class ExcelUtil {
	
	public void gerarRegrasPreenchimentoPorUFAndReceita() {
		
		List<TUf> listaUF = Arrays.asList(TUf.values());
		
		String[] receitas = {""};
		
		List<String> listaReceitas = Arrays.asList(new String[] {"Teste"});
		
		//Para cada Estado, verificar a receita com as devidas regras de prenchimento
		for (TUf tUf : listaUF) {
			
		}
		
	}

}
