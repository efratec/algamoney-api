package br.com.ofm.gnre.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class ParametroUtil {

	public static BigDecimal getBigDecimal(Object valor) {
		return ObjectUtil.isObjectNull(valor) ? null : new BigDecimal((String) valor); 
	}

	public static String getString(Object valor) {
		return ObjectUtil.isObjectNull(valor) ? null : String.valueOf(valor);
	}

	public static Date getDate(Object valor) {
		if (ObjectUtil.isObjectNull(valor))
			return null;
		
		String formatoData = getFormatoDeDataAdequado((String) valor);
		SimpleDateFormat formatDate = new SimpleDateFormat(formatoData);

		try {
			return formatDate.parse((String) valor);
		} catch (ParseException e) {
			return null;
		}
	}
	
	private static String getFormatoDeDataAdequado(String valor) {
		String dataNascionalRegEx = "[0-9]{1,2}(/)[0-9]{1,2}(/)[0-9]{4}";
		String dataInternacinoalRegEx = "((?:19|20)\\d\\d)/(0?[1-9]|1[012])/([12][0-9]|3[01]|0?[1-9])";

		if (Pattern.matches(dataNascionalRegEx, valor)) 
			return "dd/MM/yyyy";
		
		if (Pattern.matches(dataInternacinoalRegEx, valor)) 
			return "yyyy-MM-dd";
		
		return "yyyy-MM-dd";
	}
	
	public static Date stringParaDataComTimeZone(String data) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
		try {
			return formatter.parse(data);
		} catch (Exception e1) {
		}
		
		return new Date();
	}
	
	public static void main(String[] args) {
		String dateRegEx="^[0-3]{1}[0-9]{1}/[0-1]{1}[1-2]{1}/[1-9]{1}[0-9]{3}$";
		System.out.println(Pattern.matches(dateRegEx, "01/01/1990"));
	}
	
}
