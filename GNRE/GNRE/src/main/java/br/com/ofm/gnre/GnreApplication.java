package br.com.ofm.gnre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import br.com.ofm.gnre.app.GnreProperty;

@SpringBootApplication
@EnableConfigurationProperties(GnreProperty.class)
public class GnreApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GnreApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(GnreApplication.class, args);
	}

}
