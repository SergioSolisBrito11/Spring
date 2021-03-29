package condicionalesYBucles;

import ejercicios.Entrada;

//1. Leer un n�mero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un n�mero negativo. 
public class Ejercicio1 {

	public static void main(String[] args) {
		int num;
		int cuadrado;
		
		System.out.println("Introduce un n�mero: ");
		num = Entrada.entero();
		
		while (num >= 0) {
			cuadrado = num * num;
			System.out.println("El cuadrado del n�mero " + num + " es: " + cuadrado);
			System.out.println("Introduce otro n�mero: ");
			num = Entrada.entero();
		}
		System.out.println("Fin del programa, has introducido un n�mero negativo");
	}
	
}
