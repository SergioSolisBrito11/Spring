package variablesCondicionales;
//1.Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
//debe indicarlo.
import ejercicios.Entrada;

public class Ejercicio1 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double d;
		
		System.out.println("Introduzca el primer coeficiente:");
		a = Entrada.entero();
		System.out.println("Introduzca el segundo coeficiente:");
		b = Entrada.entero();
		System.out.println("Introduzca el tercer coeficiente:");
		c = Entrada.entero();
		
		//calculamos el determinante
		d = ((b * b) - 4* a * c);
		if (d < 0) {
			System.out.println("No existen soluciones reales");
		}
		else {
			//queda confirmas que sea distinto de 0
			// si a=0 nos encontramos una división por cero.
			x1 = (-b + Math.sqrt(d)/(2 * a));
			x2 = (-b + Math.sqrt(d)/(2 * a));
			System.out.println("Solución: " + x1);
			System.out.println("Solución: " + x2);
		}
		
	}
}
//public static void main(String[] args) {
//double a, b, c; // coeficientes ax^2+bx+c=0
//double x1, x2, d; // soluciones y determinante
//System.out.println("Introduzca primer coeficiente (a):");
//a = Entrada.entero();
//System.out.println("Introduzca segundo coeficiente: (b):");
//b = Entrada.entero();
//System.out.println("Introduzca tercer coeficiente: (c):");
//c = Entrada.entero();
////calculamos el determinante
//d = ((b * b) - 4 * a * c);
//if (d < 0)
//	System.out.println("No existen soluciones reales");
//else {
////queda confirmar que a sea distinto de 0.
//	// si a=0 nos encontramos una división por cero.
//	x1 = (-b + Math.sqrt(d)) / (2 * a);
//	x2 = (-b - Math.sqrt(d)) / (2 * a);
//	System.out.println("Solución: " + x1);
//	System.out.println("Solución: " + x2);
//}
//}