package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.services.IServicio;

@Controller
public class IndexController {
	
	//Podemos inyectar desde atributos,métodos set y Contructor(con el Constructor se puede omitir la anotación @Autowired)
	@Autowired
	@Qualifier("miServicioPrincipal")
	private IServicio servicio;
	
	public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}

	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

	
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}

	
	
	
}
