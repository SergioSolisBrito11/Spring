package condicionalesYBucles;

import ejercicios.Entrada;

//7. Pedir n�meros hasta que se introduzca uno negativo, y calcular la media.
public class Ejercicio7 {

	public static void main(String[] args) {
		int num;
		int suma;
		int elementos;
		
		float media;//la media puede ser en decimales
		
//		num: guardar� los n�meros introducidos por el usuario
//		suma: almacenar� la suma de todos los n�meros introducidos
//		elementos: ser� un contador que indicar� la cantidad de n�meros de elementos
		
		
		System.out.println("Introduce un n�mero: ");
		num = Entrada.entero();
		
		suma = 0;
		elementos = 0;
		
		while (num >= 0) {//nos interesan los positivos y el cero
			suma += num;
			elementos++;
			
			System.out.println("Introduce otro n�mero: ");
			num = Entrada.entero();
		}
		
		if (elementos == 0) {//dar�a un error de divisi�n por cero
			System.out.println("Imposible hacer la media");
		}else {
			media = (float)suma/elementos;
			System.out.println("La media es: " + media);
		}
		
		
		
	}
}
