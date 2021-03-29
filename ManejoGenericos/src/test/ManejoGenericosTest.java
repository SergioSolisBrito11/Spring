package test;

import genericos.ClaseGenerica;

public class ManejoGenericosTest {

	public static void main(String[] args) {
		ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
		objetoInt.obtenerTipo();
		
		ClaseGenerica<String> objetoString = new ClaseGenerica("Prueba");
		objetoString.obtenerTipo();
		
		ClaseGenerica<Double> objetoDouble = new ClaseGenerica(23.2);
		objetoDouble.obtenerTipo();
		
		ClaseGenerica<Float> objetoFloat  =new ClaseGenerica(23.3f);
		objetoFloat.obtenerTipo();
		
//		No funciona con tipos primitivos en clases genéricas
//		ClaseGenerica<int> objetoPrimitivo = new ClaseGenerica(23);
	}
}
