package variablesCondicionales;

import ejercicios.Entrada;

//19.Pedir dos fechas y mostrar el n�mero de d�as que hay de diferencia. Suponiendo todos los meses de 30 d�as
public class Ejercicio19 {

	public static void main(String[] args) {
		int dia1;
		int mes1;
		int a�o1;
		
		int dia2;
		int mes2;
		int a�o2;
		
		int totalDias;
		
		System.out.println("Fecha 1:");
		System.out.println("Introduce el d�a: ");
		dia1 = Entrada.entero();
		System.out.println("Introduce el mes: ");
		mes1 = Entrada.entero();
		System.out.println("Introduce el a�o: ");
		a�o1 = Entrada.entero();
		
		System.out.println("Fecha 2:");
		System.out.println("Introduce el d�a: ");
		dia2 = Entrada.entero();
		System.out.println("Introduce el mes: ");
		mes2 = Entrada.entero();
		System.out.println("Introduce el a�o: ");
		a�o2 = Entrada.entero();
		
		// suponemos que las fechas introducodas son correctas
		// convertimos las dos fechas a d�as y calculamos la diferencia
		totalDias = dia2-dia1 + 30*(mes2-mes1) + 365 * (a�o2-a�o1);
		
		System.out.println("D�as de diferencia: " + totalDias); 
		
		
		
		
		
	}
}
