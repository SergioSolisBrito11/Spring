package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.web.app.model.Usuario;

//Un controlador tiene métodos de acción o "handler" que manejará una petición HTTP del usuario
@Controller
//Con "@RequestMapping" indicamos cuál será nuestra ruta de primer nivel
@RequestMapping("/app")
public class IndexController {
	
//	Con la anotación @Value podemos inyectar el valor del texto desde el archivo properties
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;

//	"@RequestMapping" por default es de tipo GET, también se pueden usar anotaciones específicas como @GetMapping, @PostMapping, etc
//	Un método puede estar mapeado a más de una ruta
	@GetMapping({ "/index", "/", "", "home" })
	// Para pasar datos desde el controlador a la vista podemos usar la interfaz
	// "Model", la clase "ModelMap" o la interfaz "Map"
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Sergio");
		usuario.setApellido("Solís");
		usuario.setEmail("sergio@gamil.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));

		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {

		model.addAttribute("titulo", textoListar);
		return "listar";
	}

	// @ModelAttribute() es otra forma de pasar datos a la vista
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("Sergio", "Solis", "sergio@gail.com"),
				new Usuario("Ana", "Pérez", "ana@gail.com"), new Usuario("Pablo", "Brito", "pablo@gail.com"),
				new Usuario("Juana", "Alpizar", "juana@outlook.es"));
		
		return usuarios;
	}
}
