package paquete;

public class Persona {
	String nombre;
	char genero;
	int edad;
	String direccion;
	
	Persona(){	
	}
	
	Persona(String nombre){
		this.nombre = nombre;
	}
	
	Persona(String nombre, char genero, int edad, String direccion){
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona {nombre = " + nombre + ", g�nero = " + genero + ", edad = " + edad + ", direcci�n = " + direccion +"}"; 
	}
	
}
