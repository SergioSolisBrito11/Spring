package paquete;

public class PersonaMain {
	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Sergio");
		persona.setEdad(30);
		persona.setGenero('M');
		persona.setDireccion("Atasta");
		System.out.println(persona);
		
		Empleado empleado = new Empleado(null, 0);
		System.out.println("empleado " + empleado);
	}
}
