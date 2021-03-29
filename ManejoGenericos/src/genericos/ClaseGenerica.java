package genericos;

public class ClaseGenerica <T>{

//	Definimos la variable de tipo genérico
	T objeto;
	
	public ClaseGenerica(T objeto) {
		this.objeto = objeto;
	}
	
	public void obtenerTipo() {
		System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
	}
	
}
