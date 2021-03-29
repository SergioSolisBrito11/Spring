package condicionalesYBucles;

import ejercicios.Entrada;

//5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.
public class Ejercicio5 {

	public static void main(String[] args) {
		int num;
		int  intento;
		
		System.out.println("Introduce el número que se va adivinar: ");
		num = Entrada.entero();
		
		System.out.println("Introduce el número que creas!");
		intento = Entrada.entero();
		while (num != intento) {
			if (num > intento) {
				System.err.println("Error! Mete un número más alto!");
			}else {
				System.err.println("Error! Mete un número más bajo" );
			}
			
			System.out.println("Introduce otro número: ");
			intento = Entrada.entero();
		}
		
		System.out.println("Excelente! acertaste!");
	}
}
