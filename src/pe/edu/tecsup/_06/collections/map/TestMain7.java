package pe.edu.tecsup._06.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestMain7 {

	public static void main(String[] args) {
		
		// < llave, valor >
		Map<Integer, Persona> personas	= new HashMap<Integer, Persona>();
		
		Persona p1 = new Persona("73456582", "Juan Velardes");
		Persona p2 = new Persona("45238754", "Miguel Chavez");
		Persona p3 = new Persona("76438643", "Jaime Farfan");
		
		personas.put(1001,p1);
		personas.put(1002,p2);
		personas.put(1003,p3);
		
		// Obtengo un valor por la llave
		System.out.println(personas.get(1001));		
				
		// Obtengo todas las llaves
		System.out.println(personas.keySet());		
		
		// Obtengo todos los valores
		System.out.println(personas.values());
		
		Collection<Persona> c = personas.values();		
		
		for (Persona p : c) {
			System.out.println(p);
		}
		
		
	}

}
