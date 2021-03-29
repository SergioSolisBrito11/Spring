package condicionalesYBucles;

import ejercicios.Entrada;

//6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
public class Ejercicio6 {
	public static void main(String[] args) {
		int num;
		int suma = 0;
		
		System.out.println("Introduce un número");
		num = Entrada.entero();
//		Lo más optimo era hacer este ejercicio con un doWhile
		
		if (num == 0) {
			System.out.println("Suma total de número introducidos: " + num);
		}
		
		while(num != 0) {
			suma = suma + num;
			
			System.out.println("Suma total de número introducidos: " + suma);
			
			System.out.println("Introduce otro número: ");
			num = Entrada.entero();
		}
		System.out.println("Fin del prograna, has introdicido un cero");
	}
}
