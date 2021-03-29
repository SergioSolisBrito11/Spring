package variablesCondicionales;

import ejercicios.Entrada;

//7. Pedir dos números y decir cual es el mayor.
public class Ejercicio7 {
	
	public static void main(String[] args) {
		int n1;
		int n2;
		
		System.out.println("Introduce un número: ");
		n1 = Entrada.entero();
		System.out.println("Introduce otro número:");
		n2 = Entrada.entero();
		
		if (n1 > n2) {
			System.out.println("El número "+ n1 + " es mayor que el número " + n2);
		}
		else {
			if (n1 < n2) {
				System.out.println("El número "+ n1 + " es menor que el número " + n2);
			}
			else {
				System.out.println("Ambos números son iguales");
			}
		}
	}
}
//public class Ejercicio7 {
//	public static void main(String[] args) {
//		int n1, n2;
//		System.out.print("Introduce un número: ");
//		n1 = Entrada.entero();
//		System.out.print("Introduce otro número: ");
//		n2 = Entrada.entero();
//// si ambos números son iguales diría que n2 es mayor que n1
//		if (n1 > n2)
//			System.out.println(n1 + " es mayor que " + n2);
//		else
//			System.out.println(n2 + " es mayor que " + n1);
//	}
//}