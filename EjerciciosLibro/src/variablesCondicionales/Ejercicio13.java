package variablesCondicionales;

import ejercicios.Entrada;

//13. Pedir un n?mero entre 0 y 9.999, decir si es capic?a.
public class Ejercicio13 {

	public static void main(String[] args) {
		int num;
		int u;
		int d;
		int c;
		int um;
		int dm;
		
		System.out.println("Introduza un n?mero entre 0 y 99,999");
		num = Entrada.entero();
		
//		unidad
		u = num % 10;
		num = num / 10;
		
//		decenas
		d = num % 10;
		num = num / 10;
		
//		centenas
		c = num % 10;
		num = num / 10;
		
//		unidad de millar
		um = num % 10;
		num = num / 10;
		
//		decenas de millar
		dm = num;
		
//		el n?mero ser? capic?a si las cifras son iguales dos a dos por los extremos
//		las centenas no la tenemos en cuenta.
		
		if (dm == u && um == d) {
			System.out.println("El n?mero es capic?a");
		}else {
			System.out.println("El n?mero NO es capic?a");
		}
		// hay que tener en cuenta que en este ejercicio el n?mero 121 es similar al 00121 y
		// resulta que 121 es capic?a, pero nuestro c?digo lo identifica como NO capic?a. Ya
		// que trabajamos con el 00121. No tendremos en cuenta este peque?o error.
		
	}
}
