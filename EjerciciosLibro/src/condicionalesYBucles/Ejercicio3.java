package condicionalesYBucles;

import ejercicios.Entrada;

//3. Leer n�meros hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
public class Ejercicio3 {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un n�mero: ");
		num = Entrada.entero();
		
		while (num !=0) {
			if (num % 2 ==0) {
				System.out.println("El n�mero: " + num + " es par");
			}else {
				System.out.println("El n�mero: " + num + " es impar");
			}
			System.out.println("Introduce otro n�mero: ");
			num = Entrada.entero();
		}
		
		System.out.println("Fin del programa, has introducido un 0");
	}
}
