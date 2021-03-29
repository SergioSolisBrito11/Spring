package utileria;

import java.io.*;

public class Archivo {

	public static void crearArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("El archivo se ha creado correctamente");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
	}
	
	public static void escribirArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			String contenido = "Contenido a escribir en el archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de la escritura");
			salida.close();
			System.out.println("Se ha escrito correctamente al archivo");
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	
	public static void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			while(lectura != null) {
				System.out.println(lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}catch(IOException e) {
			e.printStackTrace(System.out);
		}
	}
	
	public static void anexarArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
			String contenido = "Anexando informaci�n al archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de anexar");
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
}
















