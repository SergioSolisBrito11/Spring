package variablesCondicionales;

import ejercicios.Entrada;

//15. Pedir el d?a, mes y a?o de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
//30 d?as.
public class Ejercicio15 {

	public static void main(String[] args) {
		int dia;
		int mes;
		int a?o;
		
//		Para que una fecha sea correcta se tiene que cumplir
//		d?a en el rango de 1-30
//		mes en el rango 1-12
//		a?o cualquiera distinto de 0
		
		System.out.println("Introduzca d?a: ");
		dia = Entrada.entero();
		System.out.println("Introduzca mes: ");
		mes = Entrada.entero();
		System.out.println("Introduzca a?o: ");
		a?o = Entrada.entero();
		
		if (dia >= 1 && dia <= 30) {
			if (mes >= 1 && dia <= 12) {
				if (a?o > 0) {
					System.out.println("La fecha: " +  dia +"/" + mes + "/" + a?o + " es correcta");
				}
			}
		}
		else {
			System.out.println("La fecha: " +  dia +"/" + mes + "/" + a?o + " es incorrecta");
		}
	}
}
