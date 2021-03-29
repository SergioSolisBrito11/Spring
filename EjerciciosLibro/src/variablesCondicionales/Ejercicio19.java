package variablesCondicionales;

import ejercicios.Entrada;

//19.Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días
public class Ejercicio19 {

	public static void main(String[] args) {
		int dia1;
		int mes1;
		int año1;
		
		int dia2;
		int mes2;
		int año2;
		
		int totalDias;
		
		System.out.println("Fecha 1:");
		System.out.println("Introduce el día: ");
		dia1 = Entrada.entero();
		System.out.println("Introduce el mes: ");
		mes1 = Entrada.entero();
		System.out.println("Introduce el año: ");
		año1 = Entrada.entero();
		
		System.out.println("Fecha 2:");
		System.out.println("Introduce el día: ");
		dia2 = Entrada.entero();
		System.out.println("Introduce el mes: ");
		mes2 = Entrada.entero();
		System.out.println("Introduce el año: ");
		año2 = Entrada.entero();
		
		// suponemos que las fechas introducodas son correctas
		// convertimos las dos fechas a días y calculamos la diferencia
		totalDias = dia2-dia1 + 30*(mes2-mes1) + 365 * (año2-año1);
		
		System.out.println("Días de diferencia: " + totalDias); 
		
		
		
		
		
	}
}
