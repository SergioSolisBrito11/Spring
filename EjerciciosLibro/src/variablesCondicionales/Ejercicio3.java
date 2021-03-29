package variablesCondicionales;

import ejercicios.Entrada;

//3. Pedir el radio de una circunferencia y calcular su longitud.
public class Ejercicio3 {

	public static void main(String[] args) {
		double l;
		double r;
		System.out.println("Introduce el radio de una circunferencia: ");
		r = Entrada.real();
		l = 2 * Math.PI * r;
		System.out.println("La longitud de una circunferencia de radio "+ r + " es: " + l);
	}
	
	
}
//public static void main(String[] args) {
//	double l,r; // longitud y radio
//	System.out.print("Introduce el radio de una circunferencia: ");
//	r=Entrada.real();
//	l=2*Math.PI*r;
//	System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
//	}
//	}