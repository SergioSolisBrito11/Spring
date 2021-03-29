package condicionalesYBucles;

import ejercicios.Entrada;

//5. Realizar un juego para adivinar un n�mero. Para ello pedir un n�mero N, y luego ir pidiendo n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.
public class Ejercicio5 {

	public static void main(String[] args) {
		int num;
		int  intento;
		
		System.out.println("Introduce el n�mero que se va adivinar: ");
		num = Entrada.entero();
		
		System.out.println("Introduce el n�mero que creas!");
		intento = Entrada.entero();
		while (num != intento) {
			if (num > intento) {
				System.err.println("Error! Mete un n�mero m�s alto!");
			}else {
				System.err.println("Error! Mete un n�mero m�s bajo" );
			}
			
			System.out.println("Introduce otro n�mero: ");
			intento = Entrada.entero();
		}
		
		System.out.println("Excelente! acertaste!");
	}
}
