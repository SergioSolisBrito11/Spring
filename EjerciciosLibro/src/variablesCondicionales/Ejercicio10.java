package variablesCondicionales;

import ejercicios.Entrada;

public class Ejercicio10 {
	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		
		System.out.println("Introduce un número: ");
		n1 = Entrada.entero();
		
		System.out.println("Introduce otro número: ");
		n2 = Entrada.entero();
		
		System.out.println("Introduce otro número ");
		n3 = Entrada.entero();
		
		if (n1 > n2 && n2 > n3){//321
			System.out.println(n1 + ", " + n2 + ", " + n3);
		}else {
			if (n1 > n3 && n3 > n2) {//312
				System.out.println(n1 + ", " + n3 + ", " + n2);
			}else {
				if (n2 > n1 && n1 > n3) {//231
					System.out.println(n2 + ", " + n1 + ", " + n3);
				}else {
					if (n2 > n3 && n3 > n1) {//132
						System.out.println(n2 + ", " + n3 + ", " + n1);
					}else {
						if (n3 > n1 && n1 > n2) {//213
							System.out.println(n3 + ", " + n1 + ", " + n2);
						}else {
							if (n3 > n2 && n2 > n1) {//123
								System.out.println(n3 + ", " + n2 + ", " + n1);
							}
						}
					}
				}
			}
		}
	}
}

//public class Ejercicio10 {
//	public static void main(String[] args) {
//		int a, b, c;
//		System.out.print("Introduzca primer número: ");
//		a = Entrada.entero();
//		System.out.print("Introduzca segundo número: ");
//		b = Entrada.entero();
//		System.out.print("Introduzca tercer número: ");
//		c = Entrada.entero();
//		if (a > b && b > c)
//			System.out.println(a + ", " + b + ", " + c);
//		else {
//			if (a > c && c > b)
//				System.out.println(a + ", " + c + ", " + b);
//			else {
//				if (b > a && a > c)
//					System.out.println(b + ", " + a + ", " + c);
//				else {
//					if (b > c && c > a)
//						System.out.println(b + ", " + c + ", " + a);
//					else {
//						if (c > a && a > b)
//							System.out.println(c + ", " + a + ", " + b);
//						else {
//							if (c > b && b > a)
//								System.out.println(c + ", " + b + ", " + a);
//						}
//					}
//				}
//			}
//		}
//	}
//}
