package variablesCondicionales;

import ejercicios.Entrada;

//9. Pedir dos números y mostrarlos ordenados de mayor a menor.
public class Ejercicio9 {

	public static void main(String[] args) {
		int n1; 
		int n2;
		
		System.out.println("Introduce un número: ");
		n1 = Entrada.entero();
		
		System.out.println("Introduce otro número: ");
		n2 = Entrada.entero();
		
		if (n1 > n2) {
			System.out.println("De mayor a menor: "  + n1 + ", " + n2);
		}
		else {
			System.out.println("De mayor a menor: "  + n2 + ", " + n1);

		}
	}
}
