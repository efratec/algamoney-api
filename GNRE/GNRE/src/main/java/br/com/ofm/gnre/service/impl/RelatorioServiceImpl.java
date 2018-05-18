package br.com.ofm.gnre.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;

import br.com.ofm.gnre.app.GnreProperty;
import br.com.ofm.gnre.model.Relatorio;
import br.com.ofm.gnre.service.RelatorioService;
import br.com.ofm.gnre.util.ParametroUtil;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

@Service
public class RelatorioServiceImpl extends JasperReportsMultiFormatView implements RelatorioService {
	
	@Autowired
	private GnreProperty gnreProperty;
	
	@Autowired
	private DataSource dataSource;
	
	private static final String caminhoRelativoRelatorios = "/relatorios/";

	@Override
	public void imprimir(Relatorio relatorio, HttpServletRequest request, HttpServletResponse response) throws Exception {

		if (relatorio.getParametros() == null) {
			relatorio.setParametros(new HashMap<String, Object>());
		}
		
		String relatorioArquivo = getCaminhoRelatorio().getAbsolutePath() + "/" + relatorio.getRelatorio() + "/" + relatorio.getRelatorio() + ".jasper";
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(relatorioArquivo, relatorio.getParametros(),	dataSource.getConnection());

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("format", "pdf");
		
		renderReport(jasperPrint, model, response);
	}	
	
	private File getCaminhoRelatorio() throws FileNotFoundException {
		if (gnreProperty.getDiretorioRelatorio() != null) {
			return new File(gnreProperty.getDiretorioRelatorio());
		}

		return ResourceUtils.getFile(this.getClass().getResource(caminhoRelativoRelatorios));
	}

	public static Map<String, Object> tratarTiposDeParametros(Map<String, Object> parametros) {
		Map<String, Object> parametrosConvertidos = new HashMap<String, Object>();
		
		String tipo = "";
		for (Map.Entry<String, Object> entry : parametros.entrySet()) {
			if (!entry.getKey().contains(".")) {
				parametrosConvertidos.put(entry.getKey(), ParametroUtil.getString(entry.getValue()));
				continue;
			}
			
			tipo = entry.getKey().substring(0, entry.getKey().indexOf("."));
			
			String chaveSemTipo = entry.getKey().substring(entry.getKey().indexOf(".") + 1, entry.getKey().length());
			
			if ("string".equalsIgnoreCase(tipo)) {
				parametrosConvertidos.put(chaveSemTipo, ParametroUtil.getString(entry.getValue()));
			}
			
			if ("date".equalsIgnoreCase(tipo)) {
				parametrosConvertidos.put(chaveSemTipo,	ParametroUtil.getDate(entry.getValue()));
			}
			
			if ("number".equalsIgnoreCase(tipo)) {
				parametrosConvertidos.put(chaveSemTipo,	ParametroUtil.getBigDecimal(entry.getValue()));
			}
		}
		
		return parametrosConvertidos;
	}

}