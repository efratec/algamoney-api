package br.com.ofm.gnre.app;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("gnre")
public class GnreProperty {
	
	private String diretorioRelatorio;

	public String getDiretorioRelatorio() {
		return diretorioRelatorio;
	}

	public void setDiretorioRelatorio(String diretorioRelatorio) {
		this.diretorioRelatorio = diretorioRelatorio;
	}
}

