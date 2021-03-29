package variablesCondicionales;

import ejercicios.Entrada;

//21.Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres... 
public class Ejercicio21 {

	public static void main(String[] args) {
		int nota; 
		
		System.out.println("Introduce una nota numérica entre el 0 y el 10: ");
		nota = Entrada.entero();
		
		switch(nota) {
			case 0:
				System.out.println("CERO");
				break;
			case 1:
				System.out.println("UNO");
				break;
			case 2:
				System.out.println("DOS");
				break;
			case 3:
				System.out.println("TRES");
				break;
			case 4:
				System.out.println("CUATRO");
				break;
			case 5:
				System.out.println("CINCO");
				break;
			case 6:
				System.out.println("SEIS");
				break;
			case 7:
				System.out.println("SIETE");
				break;
			case 8:
				System.out.println("OCHO");
				break;
			case 9:
				System.out.println("NUEVE");
				break;
			case 10:
				System.out.println("DIEZ");
				break;
			default:
				System.err.println("ERROR: DEBES INTRODUCIR UN NÚMERO ENTRE EL 0 Y EL 10");
			
		}
		
		
	}
}
