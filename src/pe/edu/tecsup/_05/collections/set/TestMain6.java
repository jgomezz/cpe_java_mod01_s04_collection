package pe.edu.tecsup._05.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TestMain6 {

	public static void main(String[] args) {
		
		Set<Persona> personas = new HashSet<Persona>();
		personas.add( new Persona("73456582", "Juan Velardes") );
		personas.add( new Persona("45238754", "Miguel Chavez") );
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
//		for (Persona persona : personas) {
//			System.out.println(persona);
//		}

		// Se debe implementar los metodos hashCode e equals para no permitir
		// objeto repetidos
		
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		
	}

}
