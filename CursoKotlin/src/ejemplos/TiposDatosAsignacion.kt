package ejemplos
/*
 Tipos de datos:
 Tipos Numéricos Bit ancho
 Double				64
 Float				32
 Long				64
 Int				32
 Short				16
 Byte				8
 
 Characters,String, Arrays, Booleans 
 */
fun main(args: Array<String>){
	//Caracteres
//	var numero:Int = 18.9;// error de tipo
	var numero:Double = 12.8;
	var flotante = 34.3f;
	
	println("El número es: " + numero);
	
	var char:Char = '8';
	var charToInt:Int = char.toInt() - 48;
	
	var suma:Int= charToInt + 8;
	
	println(char)
	println(charToInt)
	println(suma)
	
	//Strings
	var cadena:String = "Juan"
	
	println(cadena[2])
	
//	Tipos de Datos: Strings con secuencia de escape y Strings Puros(raw strings)
	var nombre:String = "Sergio\n\tSolís";
	var nombreOtro:String = """Oscar
				Solís"""//Se utilizan comillas triples para denotar que es un String puro
	var dinero:Int = 100
	println(nombre)
	println(nombreOtro.length)
	println(nombreOtro + nombre)
	
	
	println("Mi nombre es: $cadena y tiene ${cadena.length} caracteres")
	println("Mi nombre es: $cadena y tengo ${'$'}$dinero dolares")
	
//	Arreglos
	
	var i = 1
	
	var arreglo:Array<String> = arrayOf("Sergio", "Solís", "Brito")
	
	println("Arreglo en posición número 2: " + arreglo[2])
	
//	Any
	
	var cualquiera:Any = "Juan";
	
	println("El valor de la variable 'cualquiera' es: "+ cualquiera)
}

