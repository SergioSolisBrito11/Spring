package variablesCondicionales;

import ejercicios.Entrada;

//22.Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis. 
public class Ejercicio22 {

	public static void main(String[] args) {
		int num;
		int unidades;
		int decenas;
		boolean y = true;
//		esta versión muestra a 11 como diez y uno
//		es una forma de hacerlo bastante burda
//		se puede poner algunos condicionales para los números 11, 12, 13...
//		y otro condicional para mostra "y"

		System.out.println("Introduzca un número entre 0 y 99: ");
		num = Entrada.entero();
		
//		cuando ingresemos 0
		if (num == 0) {
			System.out.println("cero");
		}
//		cuando no sea necesario concatenar el "y"
		if (num <= 10 || num % 10 == 0) {
			y = false;
		}else {//cuando sea necesario concatenar el "y"
			y = true;
		}
		
		
		unidades = num % 10;
		decenas = num / 10;
		
	

		switch (decenas) {
		case 0:
			System.out.println("");
			break;
		case 1:
			System.out.println("diez");
			break;
		case 2:
			System.out.println("veinte");
			break;
		case 3:
			System.out.println("treinta");
			break;
		case 4:
			System.out.println("cuarenta");
			break;
		case 5:
			System.out.println("cincuenta");
			break;
		case 6:
			System.out.println("sesenta");
			break;
		case 7:
			System.out.println("setenta");
			break;
		case 8:
			System.out.println("ochenta");
			break;
		case 9:
			System.out.println("noventa");
			break;

		default:
			if (num >= 10) {
				System.err.println("Error: Debes introducir un número entre 0 y 99");
			}
			break;
		}
//		System.out.println(y);
		if (y == true) {
			System.out.println(" y ");
		}
		
		switch (unidades) {
		case 0:
			System.out.println("");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6:
			System.out.println("seis");
			break;
		case 7:
			System.out.println("siete");
			break;
		case 8:
			System.out.println("ocho");
			break;
		case 9:
			System.out.println("nueve");
			break;
		default:
			if (unidades < 0) {
				System.err.println("Error debes introducir un número entre el 0 y el 99");
			}
			break;
		}
	}
}
