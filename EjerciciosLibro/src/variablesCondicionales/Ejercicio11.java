package variablesCondicionales;

import ejercicios.Entrada;

//11. Pedir un n�mero entre 0 y 9.999 y decir cuantas cifras tiene.
public class Ejercicio11 {

	public static void main(String[] args) {
		int num;

		System.out.println("Introduzca un n�mero entre 0 y 99.999: ");
		num = Entrada.entero();

		if (num < 10) {
			System.out.println("El n�mero: " + num + " tiene una cifra");
		} else {
			if (num < 100) {
				System.out.println("El n�mero: " + num + " tiene dos cifras");
			} else {
				if (num < 1000) {
					System.out.println("El n�mero: " + num + " tiene tres cifras");
				} else {
					if (num < 10000) {
						System.out.println("El n�mero: " + num + " tiene cuatro cifras");
					} else {
						if (num < 100000) {
							System.out.println("El n�mero: " + num + " tiene cinco cifras");
						}
					}
				}
			}
		}

	}
}
