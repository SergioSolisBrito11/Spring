package variablesCondicionales;

import ejercicios.Entrada;

//17.Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días. 
public class Ejercicio17 {

	public static void main(String[] args) {
		int dia;
		int mes;
		int año;

		System.out.println("Introduce el día: ");
		dia = Entrada.entero();
		System.out.println("Introduce el mes: ");
		mes = Entrada.entero();
		System.out.println("Introduce el año: ");
		año = Entrada.entero();

//		supongamos que la fecha introducida es correcta

//		incrementamos el día
		dia++;

//		si el día supera 30, lo reiniciamos a 1 e incrementamos el mes
		if (dia >= 30) {
			dia = 1;
			mes++;
		}
//			si el mes supera 12, lo reiniciamos e incrementamos el año
		if (mes >= 12) {
			mes = 1;
			año++;
		}
//				habría que tener en cuenta que el año pasa del -1 al +1
//				en este código pasaríamos del año -1 al 0(que nunca existió)
//				para conseguirlo:
		if (año == 0) 
			año = 1;
			System.out.println(dia + "/" + mes + "/" + año);	
	}
}
