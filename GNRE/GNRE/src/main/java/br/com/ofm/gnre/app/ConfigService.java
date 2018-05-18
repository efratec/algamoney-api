package br.com.ofm.gnre.app;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class ConfigService {

    private static InputStream defaultConfig(String name, String library)
            throws UnsupportedEncodingException {
        StringBuilder conf = new StringBuilder();
        conf.append("name = ")
                .append(name)
                .append("\n\r")
                .append("library = ")
                .append(library)
                .append("\n\r")
                .append("showInfo = true");
        return new ByteArrayInputStream(conf.toString().getBytes("UTF-8"));
    }

    public static InputStream tokenAladdin() throws UnsupportedEncodingException {
        return defaultConfig("eToken", "C:\\Windows\\System32\\eTPKCS11.dll");
    }

}