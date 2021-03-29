package condicionalesYBucles;

import ejercicios.Entrada;

//6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
public class Ejercicio6Distinto {

	public static void main(String[] args) {
		int num;
		int suma = 0;
		
		do {
			System.out.println("Introduce un número: ");
			num = Entrada.entero();
			suma = suma + num;
		} while (num != 0);	
		System.out.println("La suma total de números introducidos es: " + suma);

	}
}
