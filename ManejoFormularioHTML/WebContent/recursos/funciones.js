function validarForma(forma){
	var usuario = forma.usuario;
	if (usuario.value == "" || usuario.value == "Escribir usuario") {
		alert("Debe proporcionar un nombre de usuario");
		usuario.focus();
		usuario.select();
		return false;
	}
	
	var password = forma.password;
	if (password.value == "" || password.value.length < 3) {
		alert("Debe proporcionar un password al menos de 3 caracteres");
		password.focus();
		password.select();
		return false;s
	}
	
	var tegnologias = forma.tecnologia;
	var checkSeleccionado = false;
	
	for (var i = 0; i < tegnologias.length; i++) {
		if (tegnologias[i].checked) {
			checkSeleccionado = true;
		}
	}
	
	if (!checkSeleccionado) {
		alert("Debe seleccionar una tecnología")
		return false;
	}
	
	var generos = forma.genero;
	var radioSeleccionado = false;
	
	for (var i = 0; i < generos.length; i++) {
		if (generos[i].checked) {
			radioSeleccionado = true;
		}
	}
	
	if (radioSeleccionado == false) {
		alert("Debe seleccionar un género");
		return false;
	}
	
	var ocupacion = forma.ocupacion;
	if (ocupacion.value == "") {
		alert("Debe seleccionar una ocupación");
		return false;
	}
	
//	Formulario válido
	alert("Formulario válido: Enviando datos al servidor");
	return true;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}