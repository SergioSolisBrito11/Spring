package variablesCondicionales;

import ejercicios.Entrada;

//4. Pedir dos n�meros y decir si son iguales o no.
public class Ejercicio4 {
		public static void main(String[] args) {
			int n1;
			int n2;
			System.out.println("Introduce un n�mero: ");
			n1 = Entrada.entero();
			System.out.println("Introduce otro n�mero: ");
			n2 = Entrada.entero();
			
			if (n1 == n2) {
				System.out.println("Ambos n�meros son iguales");
			}
			else {
				System.out.println("No son iguales");
			}
		}
}
//public class Ejercicio4 {
//	public static void main(String[] args) {
//		int n1, n2;
//		System.out.print("Introduce un n�mero: ");
//		n1 = Entrada.entero();
//		System.out.print("Introduce otro n�mero: ");
//		n2 = Entrada.entero();
//		if (n1 == n2)
//			System.out.println("Son iguales");
//		else
//			System.out.println("No son iguales");
//	}
//}