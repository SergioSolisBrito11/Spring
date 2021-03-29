package com.condominio;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//Esta clase sirve para lo de tomcat
public class ServletInitializer extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CondominioApplication.class);//ayuda arrancar el proyecto en modo war, en jar no es necesario
	}
}
