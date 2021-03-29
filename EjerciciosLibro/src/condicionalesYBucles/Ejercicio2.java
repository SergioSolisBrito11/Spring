package condicionalesYBucles;
//2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.

import ejercicios.Entrada;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un número: ");
		num = Entrada.entero();
		
		while (num != 0) {
			if (num > 0) {
				System.out.println("El número introducido es positivo");
			}else {
				System.out.println("El número introducido es negativo");
			}
			
			System.out.println("Introduce otro número: ");
			num = Entrada.entero();
		}
		System.out.println("Fin del programa, has introducido el número 0");
	}
}
