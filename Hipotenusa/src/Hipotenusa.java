import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		double c;
		double b;
		double solucion;
		
		Scanner sca = new Scanner (System.in);
		System.out.println("Ingresa el primer número");
		c = sca.nextDouble();
		System.out.println("Ingresa el primer número");
		b = sca.nextDouble();
		
		solucion = Math.sqrt((c*c) + (b*b));
		
		System.out.println("La solución es: " + solucion);
	}
}
