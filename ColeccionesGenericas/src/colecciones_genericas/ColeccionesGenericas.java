package colecciones_genericas;

import java.util.*;

public class ColeccionesGenericas {

	public static void main(String[] args) {
		List<String> miLista = new ArrayList<>();
		miLista.add("Juan");
		miLista.add("Ana");
		miLista.add("Sergio");
		miLista.add("Oscar");
		miLista.add("Oscar");
		
		imprimir(miLista);
		
		Set<String> miSet = new HashSet();
		miSet.add("cadena");
		miSet.add("100");
		miSet.add("cadena");
	
		
		imprimir(miSet);
		
		Map<String, String> miMapa = new HashMap();
		miMapa.put("1", "Juan");
		miMapa.put("2", "Carlos");
		miMapa.put("3", "Sergio");
		miMapa.put("3", "Ana");
		miMapa.put("4","Juan");
		
		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
		
		System.out.println(miMapa.get("3"));
		
		
	}
	
	private static void imprimir(Collection<String> col) {
		for (String elemento: col) {
			System.out.println("elemento: " + elemento);
		}
		System.out.println("");
	}
}
