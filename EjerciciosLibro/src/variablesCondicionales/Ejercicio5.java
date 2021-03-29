package variablesCondicionales;

import ejercicios.Entrada;

//5. Pedir un número e indicar si es positivo o negativo.
public class Ejercicio5 {
	public static void main(String[] args) {
		int n1;
		
		System.out.println("Introduce un número;");
		n1 = Entrada.entero();
		
		if (n1 < 0) {
			System.out.println("El número: " + n1 + " es negativo");
		}
		else {
			if (n1 == 0) {
				System.out.println("El número introducido es 0");
			}
			else {
				System.out.println("El número " + n1 + " es positivo");
			}
		}
	}
		
}
//public class Ejercicio5 {
//	public class Main {
//		public static void main(String[] args) {
//			int num;
//			System.out.print("Introduce un número: ");
//			num = Entrada.entero();
//			if (num < 0)
//				System.out.println("Negativo");
//			else
//				// suponemos que el 0 es positivo.
//				System.out.println("Positivo");
//		}
//	}
//}
