package condicionalesYBucles;

import ejercicios.Entrada;

//7. Pedir números hasta que se introduzca uno negativo, y calcular la media.
public class Ejercicio7 {

	public static void main(String[] args) {
		int num;
		int suma;
		int elementos;
		
		float media;//la media puede ser en decimales
		
//		num: guardará los números introducidos por el usuario
//		suma: almacenará la suma de todos los números introducidos
//		elementos: será un contador que indicará la cantidad de números de elementos
		
		
		System.out.println("Introduce un número: ");
		num = Entrada.entero();
		
		suma = 0;
		elementos = 0;
		
		while (num >= 0) {//nos interesan los positivos y el cero
			suma += num;
			elementos++;
			
			System.out.println("Introduce otro número: ");
			num = Entrada.entero();
		}
		
		if (elementos == 0) {//daría un error de división por cero
			System.out.println("Imposible hacer la media");
		}else {
			media = (float)suma/elementos;
			System.out.println("La media es: " + media);
		}
		
		
		
	}
}
