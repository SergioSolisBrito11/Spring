package variablesCondicionales;

import ejercicios.Entrada;

//18.�dem que el ej. 17, suponiendo que cada mes tiene un n�mero distinto de d�as (suponer que febrero tiene siempre 28 d�as). 
public class Ejercicio18 {

	public static void main(String[] args) {
		int dia;
		int mes;
		int a�o;
		int diasDelMes = 0;// guardamos el n�mero de d�as que tiene el mes

		System.out.println("Introduce el d�a: ");
		dia = Entrada.entero();
		System.out.println("Introduce el mes: ");
		mes = Entrada.entero();
		System.out.println("Introduce el a�o: ");
		a�o = Entrada.entero();

//		supongamos que la fecha introducida es correcta

		if (mes == 2)
			diasDelMes = 28;
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			diasDelMes = 30;

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			diasDelMes = 31;

//					incrementamos el d�a
		dia++;
//					si el d�a supera el n�mero de d+ias del mes, lo reiniciamos a 1 e incrementamos el mes
		if (dia >= diasDelMes) {
			dia = 1;
			mes++;

//						si el mes supera 12, lo reiniciamos a 1 e incrementamos el a�o
			if (mes >= 12) {
				mes = 1;
				a�o++;
			}
		}
//					habr�a que tener en cuenta que el a�o pasa de -1 al +1 
//					en este c�digo pasar�amos del a�o -1 al 0(que nunca existi�)
//					para corregirlo:

		if (a�o == 0)
			a�o = 1;
		System.out.println(dia + "/" + mes + "/" + a�o);
	}
}
