package variablesCondicionales;

import ejercicios.Entrada;

//15. Pedir el d?a, mes y a?o de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
//30 d?as.
public class Ejercicio15Distinto {

	public static void main(String[] args) {
		int dia;
		int mes;
		int a?o;
		
		System.out.println("Introduzca el dia: ");
		dia = Entrada.entero();
		System.out.println("Introduzca el mes: ");
		mes = Entrada.entero();
		System.out.println("Introduzca el a?o: ");
		a?o = Entrada.entero();
		
		if (dia >= 1 && dia <=30) {
			if (mes >=1 && mes <= 12) {
				if (a?o > 0) {
					System.out.println("Fecha correcta");
				}else {
					System.out.println("A?o incorrecto");
				}
			}else {
				System.out.println("Mes incorrecto");
			}
		}else {
			System.out.println("D?a incorrecto");
		}
	}
}
