package variablesCondicionales;

import ejercicios.Entrada;

//6. Pedir dos n�meros y decir si uno es m�ltiplo del otro.
public class Ejercicio6 {
	public static void main(String[] args) {
		int n1;
		int n2;
		
		System.out.println("Introduce un n�mero: ");
		n1= Entrada.entero();
		System.out.println("Intoduce otro n�mero: ");
		n2 = Entrada.entero();
		
		if (n1 % n2 == 0) {
			System.out.println("Son m�ltiplos");
		}
		else {
			System.out.println("No son m�ltiplos");
		}
	}
}
//public class Ejercicio6 {
//	public static void main(String[] args) {
//		int n1, n2;
//		System.out.print("Introduce un n�mero: ");
//		n1 = Entrada.entero();
//		System.out.print("Introduce otro n�mero: ");
//		n2 = Entrada.entero();
//		if (n1 % n2 == 0)
//			System.out.println("Son m�ltiplos");
//		else
//			System.out.println("No son m�ltiplos");
//	}
//}