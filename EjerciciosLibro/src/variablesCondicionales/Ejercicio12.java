package variablesCondicionales;

import ejercicios.Entrada;

//12.. Pedir un n�mero entre 0 y 9.999 y mostrarlo con las cifras al rev�s.
public class Ejercicio12 {

	public static void main(String[] args) {

		int num;
		int dm;
		int um;
		int c;
		int d;
		int u;

		System.out.println("Introduzca un n�mero entre 0 y 99,999");
		num = Entrada.entero();

//		unidad
		u = num % 10;
		num = num / 10;

//		decenas
		d = num % 10;
		num = num / 10;

//		centenas
		c = num % 10;
		num = num / 10;

//		unidades de millar
		um = num % 10;
		num = num / 10;

//		decenas de millar
		dm = num;

//		Lo imprimimos al rev�s:
		System.out.println(u + " " + d + " " + c + " " + um + " " + dm);

		// otra forma de hacerlo es
		num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
		System.out.println(num);

	}
}
