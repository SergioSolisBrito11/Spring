package ejemplos
/*
 Estructuras de control:
 Introducción a operadores aritméticos, de coparación y lógicos
 */

fun main(args: Array<String>){
	
	var a = 5
	var b = 3
	var c = -12
	var x = 1
	var y = -1
	
	println(x > y)
	
//	var datoBoleano = a == b
//	println(a == b || c > a)
	
	println("Respuesta de la a: " + (a > 3) + " true")//true
	println("Respuesta de la b: " + (a > b) + " true")//true
	println("Respuesta de la c: " + (a > c) + " true")//true
	println("Respuesta de la d: " + (c > b) + " false")//false
	println("Respuesta de la e: " + (b != a) + " true")//true
	println("Respuesta de la f: " + (a == 8) + " false")//false
	println("Respuesta de la g: " + (b * c == 18) + " false")//false
	println("Respuesta de la h: " + (a * b == -30) + " false")//false
	println("Respuesta de la i: " + (c / b < a) + " true")
	println("Respuesta de la j: " + (c / b == -11) + " false")
	println("Respuesta de la k: " + (c / b == -4) + " true")
	println("Respuesta de la l: " + (a + c + b == 5) + " false")
	println("Respuesta de la m: " + ((a + b == 8) && ( a - b == 2)) + " true")
	println("Respuesta de la n: " + ((a + b == 8)  || ( a - b == 6)) + " true")
	println("Respuesta de la o: " + (a  > b && b > 4 && c < 3) + " false")



}
