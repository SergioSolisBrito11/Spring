package variablesCondicionales;

import ejercicios.Entrada;

//7. Pedir dos n�meros y decir cual es el mayor.
public class Ejercicio7 {
	
	public static void main(String[] args) {
		int n1;
		int n2;
		
		System.out.println("Introduce un n�mero: ");
		n1 = Entrada.entero();
		System.out.println("Introduce otro n�mero:");
		n2 = Entrada.entero();
		
		if (n1 > n2) {
			System.out.println("El n�mero "+ n1 + " es mayor que el n�mero " + n2);
		}
		else {
			if (n1 < n2) {
				System.out.println("El n�mero "+ n1 + " es menor que el n�mero " + n2);
			}
			else {
				System.out.println("Ambos n�meros son iguales");
			}
		}
	}
}
//public class Ejercicio7 {
//	public static void main(String[] args) {
//		int n1, n2;
//		System.out.print("Introduce un n�mero: ");
//		n1 = Entrada.entero();
//		System.out.print("Introduce otro n�mero: ");
//		n2 = Entrada.entero();
//// si ambos n�meros son iguales dir�a que n2 es mayor que n1
//		if (n1 > n2)
//			System.out.println(n1 + " es mayor que " + n2);
//		else
//			System.out.println(n2 + " es mayor que " + n1);
//	}
//}