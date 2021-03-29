package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Esta clase representa una clase de lógica de negocio
//También se puede usar @Service 
//@Primary y
@Component("miServicioPrincipal")
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		// TODO Auto-generated method stub
		return "Ejecutando algún servicio importante simple...";
	}
}
