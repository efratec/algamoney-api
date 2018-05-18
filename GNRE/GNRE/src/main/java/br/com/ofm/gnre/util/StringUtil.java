package br.com.ofm.gnre.util;

import java.text.Normalizer;
import java.util.List;

import br.com.ofm.gnre.vo.CamposExtrasVO;

public class StringUtil {

	public static String montaCamposExtrasXML(List<CamposExtrasVO> camposExtras) {
		
		String xmlCampoExtra = "";
		
		for (CamposExtrasVO vo : camposExtras) {
		  	xmlCampoExtra = "<campoExtra>".concat("<codigo>").concat(vo.getCodigo()).concat("</codigo>")
					.concat("<tipo>").concat(vo.getTipo()).concat("</tipo>").concat("<valor>").concat(vo.getValor())
					.concat("</valor>").concat("</campoExtra>");
		}
		
		return xmlCampoExtra;
	}
	
	public static boolean isEmptyOrNull(String string) {
		return string == null || string.equals("");
	}
	
	public static boolean isVericaStringsNaoNulasOuNaoVazias(String...strings) {
		
		for (int i = 0; i < strings.length; i++) {
			if (!isEmptyOrNull(strings[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static String removeAcentos(String str) {
		str = str.replaceAll("\r", "");
		str = str.replaceAll("\t", "");
		str = str.replaceAll("\n", "");
		str = str.replaceAll("&", "E");
		str = str.replaceAll("°", "");
		str = str.replaceAll(">\\s+<", "><");
		CharSequence cs = new StringBuilder(str == null ? "" : str);
		return Normalizer.normalize(cs, Normalizer.Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	}
	
	public static void main(String[] args) {
		System.out.println(isVericaStringsNaoNulasOuNaoVazias(null,null));
	}

}
