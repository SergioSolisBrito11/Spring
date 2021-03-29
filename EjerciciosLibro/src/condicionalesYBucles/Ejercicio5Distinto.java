package condicionalesYBucles;

import ejercicios.Entrada;

//5. Realizar un juego para adivinar un n�mero. Para ello pedir un n�mero N, y luego ir pidiendo n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.
public class Ejercicio5Distinto {

	public static void main(String[] args) {
		int num;
		int intento;
		
		num = (int)(Math.random()*100)+1;
//		System.out.println(num);
		
		System.out.println("Introduce el n�mero que creas correcto: ");
		intento = Entrada.entero();
		
		while (num != intento) {
			if (num > intento) {
				System.err.println("Error! Introduce un n�mero mayor: ");
			}else {
				System.err.println("Error! Introduce un n�mero menor:  ");
			}
			
			System.out.println("Introduce otro n�mero: ");
			intento = Entrada.entero();
		}
		System.out.println("Excelente! Acertaste!");
	}	
}
