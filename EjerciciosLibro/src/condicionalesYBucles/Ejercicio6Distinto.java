package condicionalesYBucles;

import ejercicios.Entrada;

//6. Pedir n�meros hasta que se teclee un 0, mostrar la suma de todos los n�meros introducidos.
public class Ejercicio6Distinto {

	public static void main(String[] args) {
		int num;
		int suma = 0;
		
		do {
			System.out.println("Introduce un n�mero: ");
			num = Entrada.entero();
			suma = suma + num;
		} while (num != 0);	
		System.out.println("La suma total de n�meros introducidos es: " + suma);

	}
}
