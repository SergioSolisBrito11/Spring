package condicionalesYBucles;

import ejercicios.Entrada;

//1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo. 
public class Ejercicio1 {

	public static void main(String[] args) {
		int num;
		int cuadrado;
		
		System.out.println("Introduce un número: ");
		num = Entrada.entero();
		
		while (num >= 0) {
			cuadrado = num * num;
			System.out.println("El cuadrado del número " + num + " es: " + cuadrado);
			System.out.println("Introduce otro número: ");
			num = Entrada.entero();
		}
		System.out.println("Fin del programa, has introducido un número negativo");
	}
	
}
