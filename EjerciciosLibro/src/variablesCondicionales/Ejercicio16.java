package variablesCondicionales;

import ejercicios.Entrada;

//16.Pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 d�as. Sin a�os bisiestos. 
public class Ejercicio16 {
	
	static void main(String[] args) {
		int dia;
		int mes;
		int a�o;
		
		System.out.println("Introduce el d�a: ");
		dia = Entrada.entero();
		System.out.println("Introduce el mes: ");
		mes = Entrada.entero();
		System.out.println("Intoduce el a�o: ");
		a�o = Entrada.entero();
		
		
//		El �nico a�o que no existe es el 0
		if (a�o == 0) {
			System.out.println("Fecha incorrecta");
		}else {
			if (mes == 2 && dia <=28) {
				System.out.println(dia + "/" + mes + "/" + a�o + ": Fecha correcta");
			}else {
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >=1 && dia <=30) {
					System.out.println(dia + "/" + mes +"/" + a�o + ": Fecha correcta");
				}else {
					if ((mes == 1 || mes == 3 || mes == 5 || mes == 8 || mes == 10 || mes == 12) && dia >=1 && dia <= 31) {
						System.out.println(dia + "/" + mes + "/" + a�o + ": Fecha correcta");
					}else {
						System.out.println("Fecha incorrecta");
					}
				}
			}
		}
	}
}
