package condicionalesYBucles;
//2. Leer un n�mero e indicar si es positivo o negativo. El proceso se repetir� hasta que se introduzca un 0.

import ejercicios.Entrada;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un n�mero: ");
		num = Entrada.entero();
		
		while (num != 0) {
			if (num > 0) {
				System.out.println("El n�mero introducido es positivo");
			}else {
				System.out.println("El n�mero introducido es negativo");
			}
			
			System.out.println("Introduce otro n�mero: ");
			num = Entrada.entero();
		}
		System.out.println("Fin del programa, has introducido el n�mero 0");
	}
}
