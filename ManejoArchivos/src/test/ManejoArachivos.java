package test;

import static utileria.Archivo.*;
public class ManejoArachivos {

	public static void main(String[] args) {
		String nombreArchivo = "c:\\pruebaJava\\archivoPruebaJava.txt";
//		String otroArchivo = "c:\\pruebaJava\\otroArchivoPruebaJava.txt";
//		String archivoEscritorio = "c:\\prueba\\archivoEscritorio.txt";
//		
////		Creamos un archivo
		crearArchivo(nombreArchivo);
//		crearArchivo(otroArchivo);
//		crearArchivo(archivoEscritorio);
//		
////		Escribir a archivo
		escribirArchivo(nombreArchivo);
		
//		Leer archivo
//		leerArchivo(nombreArchivo);
		
//		Anexamos información al archivo
		anexarArchivo(nombreArchivo);
		
		leerArchivo(nombreArchivo);
	}
}
