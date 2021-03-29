package estructuras_control

fun main(args: Array<String>){
	
	var a = 10
	var b = 10
	var c = 10
	var numeroMayor:Int
	
//	if(a > b){
//		println("La variable a es mayor que la variable b")
//	}else{
//		println("La variable b es mayor que la variable a")
//	}
	// la siguiente línea es lo mismo que lo de arriba
	if ( a > b) println("La variable a es mayor que la variable b")else println("La variable b es mayor que la variable a")
	
	numeroMayor = if(a > b && a > c) a else if(b > a && b > c ) b else c
	
	println("La variable más alta vale: " + numeroMayor)
}