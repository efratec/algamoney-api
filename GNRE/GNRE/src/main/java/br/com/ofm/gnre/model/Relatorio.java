package br.com.ofm.gnre.model;

import java.util.Map;

public class Relatorio {

	public String relatorio; 
	private Map<String, Object> parametros;
	private Long idEmpresa;
	
	public Relatorio(String relatorio, Map<String, Object> parametros, Long idEmpresa) {
		super();
		this.relatorio = relatorio;
		this.parametros = parametros;
		this.idEmpresa = idEmpresa;
	}
	
	public String getRelatorio() {
		return relatorio;
	}
	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}
	public Map<String, Object> getParametros() {
		return parametros;
	}
	public void setParametros(Map<String, Object> parametros) {
		this.parametros = parametros;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

}
	
