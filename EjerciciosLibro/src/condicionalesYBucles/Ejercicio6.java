package condicionalesYBucles;

import ejercicios.Entrada;

//6. Pedir n�meros hasta que se teclee un 0, mostrar la suma de todos los n�meros introducidos.
public class Ejercicio6 {
	public static void main(String[] args) {
		int num;
		int suma = 0;
		
		System.out.println("Introduce un n�mero");
		num = Entrada.entero();
//		Lo m�s optimo era hacer este ejercicio con un doWhile
		
		if (num == 0) {
			System.out.println("Suma total de n�mero introducidos: " + num);
		}
		
		while(num != 0) {
			suma = suma + num;
			
			System.out.println("Suma total de n�mero introducidos: " + suma);
			
			System.out.println("Introduce otro n�mero: ");
			num = Entrada.entero();
		}
		System.out.println("Fin del prograna, has introdicido un cero");
	}
}
