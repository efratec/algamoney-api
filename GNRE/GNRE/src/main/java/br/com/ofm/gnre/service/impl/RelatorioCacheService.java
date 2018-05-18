package br.com.ofm.gnre.service.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.ofm.gnre.model.Relatorio;

@Service
public class RelatorioCacheService {
	
	final int maxSize = 5000;

	private LinkedHashMap<String, Relatorio> relatoriosCache = new LinkedHashMap<String, Relatorio>() {
		
		private static final long serialVersionUID = 1L;

		@Override
        protected boolean removeEldestEntry(@SuppressWarnings("rawtypes") final Map.Entry eldest) {
            return size() > maxSize;
        }
	};
	
	public String addRelatorio(Relatorio relatorio) {
		String key = UUID.randomUUID().toString();
		relatoriosCache.put(key, relatorio);
		
		return key;
	}
	
	public Relatorio getRelatorio(String key) {
		if (!relatoriosCache.containsKey(key))
			throw new RuntimeException("Relatório não disponível");
		
		return relatoriosCache.get(key);
	}
	
}
