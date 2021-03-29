package condicionalesYBucles;

import ejercicios.Entrada;

//5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.
public class Ejercicio5Distinto {

	public static void main(String[] args) {
		int num;
		int intento;
		
		num = (int)(Math.random()*100)+1;
//		System.out.println(num);
		
		System.out.println("Introduce el número que creas correcto: ");
		intento = Entrada.entero();
		
		while (num != intento) {
			if (num > intento) {
				System.err.println("Error! Introduce un número mayor: ");
			}else {
				System.err.println("Error! Introduce un número menor:  ");
			}
			
			System.out.println("Introduce otro número: ");
			intento = Entrada.entero();
		}
		System.out.println("Excelente! Acertaste!");
	}	
}
