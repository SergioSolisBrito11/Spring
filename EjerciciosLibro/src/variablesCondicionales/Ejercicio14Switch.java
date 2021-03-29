package variablesCondicionales;

import ejercicios.Entrada;

//14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
public class Ejercicio14Switch {

	public static void main(String[] args) {
		int nota;
		
		System.out.println("Introduzca una nota");
		nota =  Entrada.entero();
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("INSUFICIENTE");
			break;
		case 5:
			System.out.println("SUFICIENTTE");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 7:
		case 8:
			System.out.println("NOTABLE");
			break;
		case 9:
		case 10:
			System.out.println("SOBRESALIENTE");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
}
