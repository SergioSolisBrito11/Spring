package condicionalesYBucles;

import ejercicios.Entrada;

//4. Pedir n�meros hasta que se teclee uno negativo, y mostrar cu�ntos n�meros se han introducido.
public class Ejercicio4 {

	public static void main(String[] args) {
		int num;
		int contador = 0;

		System.out.println("Introduce un n�mero: ");
		num = Entrada.entero();

		while (num >= 0) {
			contador++;
			System.out.println("Total de n�meros introducidos: " + contador);

			System.out.println("Introduce otro n�mero: ");
			num = Entrada.entero();
		}
		System.out.println("Fin del programa, has introducido un n�mero negativo");

	}
}
