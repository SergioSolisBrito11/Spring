package variablesCondicionales;

import ejercicios.Entrada;

//20.Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente. 
public class Ejercicio20 {

	public static void main(String[] args) {

		int hora;
		int minuto;
		int segundo;

		System.out.println("Introduce la hora: ");
		hora = Entrada.entero();
		System.out.println("Introduce el minuto: ");
		minuto = Entrada.entero();
		System.out.println("Introduce el segundo: ");
		segundo = Entrada.entero();

//		supongamos que se intoduce una hora correcta
//		incrementamos el segundo

		segundo++;

//		si los segundos superanlos 59, los reiniciamos a 0 e incrementamos los minutos

		if (segundo >= 60) {
			segundo = 0;
			minuto ++;
			
//			si los minutos superan los 59,los reiniciamos a 0 e incrementamos la hora
			if (minuto >= 60) {
				minuto = 0;
				hora++;
//				si la hora supera 23, la reiniciamos a 0
				if (hora >= 24) {
					hora  = 0;
				}
			}
		}
		System.out.println("Hora: " + hora + ":" + minuto + ":" + segundo);

	}
}
