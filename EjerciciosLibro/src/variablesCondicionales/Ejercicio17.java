package variablesCondicionales;

import ejercicios.Entrada;

//17.Pedir el d�a, mes y a�o de una fecha correcta y mostrar la fecha del d�a siguiente. suponer que todos los meses tienen 30 d�as. 
public class Ejercicio17 {

	public static void main(String[] args) {
		int dia;
		int mes;
		int a�o;

		System.out.println("Introduce el d�a: ");
		dia = Entrada.entero();
		System.out.println("Introduce el mes: ");
		mes = Entrada.entero();
		System.out.println("Introduce el a�o: ");
		a�o = Entrada.entero();

//		supongamos que la fecha introducida es correcta

//		incrementamos el d�a
		dia++;

//		si el d�a supera 30, lo reiniciamos a 1 e incrementamos el mes
		if (dia >= 30) {
			dia = 1;
			mes++;
		}
//			si el mes supera 12, lo reiniciamos e incrementamos el a�o
		if (mes >= 12) {
			mes = 1;
			a�o++;
		}
//				habr�a que tener en cuenta que el a�o pasa del -1 al +1
//				en este c�digo pasar�amos del a�o -1 al 0(que nunca existi�)
//				para conseguirlo:
		if (a�o == 0) 
			a�o = 1;
			System.out.println(dia + "/" + mes + "/" + a�o);	
	}
}
