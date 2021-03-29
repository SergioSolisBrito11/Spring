package condicionalesYBucles;

import ejercicios.Entrada;

//4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
public class Ejercicio4 {

	public static void main(String[] args) {
		int num;
		int contador = 0;

		System.out.println("Introduce un número: ");
		num = Entrada.entero();

		while (num >= 0) {
			contador++;
			System.out.println("Total de números introducidos: " + contador);

			System.out.println("Introduce otro número: ");
			num = Entrada.entero();
		}
		System.out.println("Fin del programa, has introducido un número negativo");

	}
}
