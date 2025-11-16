package pe.edu.tecsup._04.collections.list._02_class;

import java.util.ArrayList;
import java.util.List;

public class TestMain3 {

	public static void main(String[] args) {
		
		Persona persona2 = new Persona("45238754", "Miguel Chavez");
		
		List<Persona> personas = new ArrayList<>();
	
		// agrego 3 objetos a la lista personas
		personas.add( new Persona("73456582", "Juan Velardes") );
		personas.add( new Persona("45238754", "Miguel Chavez") );
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		// For each
		for (Persona persona : personas) {
			// llamar el metodo toString() del objeto
			System.out.println(persona); 
		}

		// Esta la info de persona2 en la lista de personas?
		// Se debe implementar el metodo equals en la clase Persona
		
		if(personas.contains( persona2 )) {
			System.out.println("Tenemos a Miguel");
		} else {
			System.out.println("Miguel no esta");
		}

		
/*
		if(personas.contains( new Persona("76438643", "Jaime Farfan"))) {
			System.out.println("Tenemos a JF");
		} else {
			System.out.println("JF no esta");
		}
//*/		
	}

}

 /* Crear la clase Auto , que tenga los atributos
    modelo y nombre
    
    Crear una coleccion de Autos y almacenarlos en un List
    
     -  auto 1 => modelo = "X001" , nombre ="Toyota" 
     -  auto 2 => modelo = "X002" , nombre ="Nissan" 
     -  auto 3 => modelo = "X003" , nombre ="Pegaut" 
     
    Buscar si el siguiente auto4 esta en la lista
    
     -  auto 4 => modelo = "X002" , nombre ="Nissan"
     
    Comparar modelo y nombre 
     
  */




