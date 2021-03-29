package variablesCondicionales;

import ejercicios.Entrada;

//18.Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días). 
public class Ejercicio18 {

	public static void main(String[] args) {
		int dia;
		int mes;
		int año;
		int diasDelMes = 0;// guardamos el número de días que tiene el mes

		System.out.println("Introduce el día: ");
		dia = Entrada.entero();
		System.out.println("Introduce el mes: ");
		mes = Entrada.entero();
		System.out.println("Introduce el año: ");
		año = Entrada.entero();

//		supongamos que la fecha introducida es correcta

		if (mes == 2)
			diasDelMes = 28;
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			diasDelMes = 30;

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			diasDelMes = 31;

//					incrementamos el día
		dia++;
//					si el día supera el número de d+ias del mes, lo reiniciamos a 1 e incrementamos el mes
		if (dia >= diasDelMes) {
			dia = 1;
			mes++;

//						si el mes supera 12, lo reiniciamos a 1 e incrementamos el año
			if (mes >= 12) {
				mes = 1;
				año++;
			}
		}
//					habría que tener en cuenta que el año pasa de -1 al +1 
//					en este código pasaríamos del año -1 al 0(que nunca existió)
//					para corregirlo:

		if (año == 0)
			año = 1;
		System.out.println(dia + "/" + mes + "/" + año);
	}
}
