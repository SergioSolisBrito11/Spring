package variablesCondicionales;

import ejercicios.Entrada;

//16.Pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 d�as. Sin a�os bisiestos. 
public class Ejercicio16Distinto {

	public static void main(String[] args) {
//		int dia;
//		int mes;
//		int a�o;
//		int diasDelMes = 0;
//		boolean fechaCorrecta = true;
//
//		System.out.println("Introduce el d�a:");
//		dia = Entrada.entero();
//		System.out.println("Introduce el mes: ");
//		mes = Entrada.entero();
//		System.out.println("Introduce el a�o:");
//		a�o = Entrada.entero();
//
//		diasDelMes = 0; // si se utiliza un mes fuera del rango, supongamos que los d�as del mes son 0
//
//		if (a�o == 0) {// el �nico a�o que no existe es el 0
//			fechaCorrecta = false;
//		} else {
//			if (dia <= 1 || dia > 31) {// un d�a fuera de rango 1...31 no tiene sentido
//				fechaCorrecta = false;
//			} else {// un mes fuera del rango 1...12 no tiene sentido
//				if (mes < 1 || mes > 12) {
//					fechaCorrecta = false;
//				} else {
//					if (mes == 2) {
//						diasDelMes = 28;
//					} else {
//						if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
//							diasDelMes = 30;
//						} else {
//							if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
//								diasDelMes = 31;
//							}
//						}
//					}
//				}
//			}
//		}
//
//		if (dia > diasDelMes)
//			fechaCorrecta = false;
//
//		if (fechaCorrecta)
//			System.out.println(dia + "/" + mes + "/" + a�o + ": Fecha correcta");
		int dia, mes, a�o;
		int dias_del_mes;
		boolean fecha_correcta = true;
		System.out.print("Introduzca d�a: ");
		dia = Entrada.entero();
		System.out.print("Introduzca mes: ");
		mes = Entrada.entero();
		System.out.print("Introduzca a�o: ");
		a�o = Entrada.entero();

		dias_del_mes = 0; // si se utiliza un mes fuera del rango 1..12 // supondremos que los d�as del
							// mes son 0.
		if (a�o == 0) // el �nico a�o que no existe es el 0
			fecha_correcta = false;
		if (dia < 1 || dia > 31)
			// un d�a fuera del rango 1..31 no tiene sentido
			fecha_correcta = false;
		if (mes < 1 || mes > 12) // un mes fuera del rango 1..12 no tiene sentido
			fecha_correcta = false;
		if (mes == 2)
			dias_del_mes = 28;
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			dias_del_mes = 30;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			dias_del_mes = 31;
		if (dia > dias_del_mes)
			fecha_correcta = false;
		if (fecha_correcta)
			System.out.println(dia + "/" + mes + "/" + a�o + ": Fecha correcta");
		else
			System.out.println(dia + "/" + mes + "/" + a�o +": FECHA INCORRECTA");
	}
}
