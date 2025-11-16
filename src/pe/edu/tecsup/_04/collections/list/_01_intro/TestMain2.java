package pe.edu.tecsup._04.collections.list._01_intro;

import java.util.ArrayList;
import java.util.List;

public class TestMain2 {

	public static void main(String[] args) {
		
		// Interface var = new Class();
		
		//List nombres = new ArrayList(); // sin parametrizar el tipo de dato
		
		List<String> nombres = new ArrayList<>(); // parametrizado
		
		// Objetos Cadena que se agregan a la lista
		nombres.add("Juan");    // posicion 0
		nombres.add("Miguel");	// posicion 1
		nombres.add("Julio");
		nombres.add("Maria");
		nombres.add("Maria");
		//nombres.add(10);  //No esta permitido
		
		System.out.println(nombres); // Imprimo el listado
		
		String nombre = nombres.get(1); // obtener el reg. de posicion 1
		System.out.println("valor de la posicion 1 --> " + nombre);
		
		// set( posicion, valor )
		nombres.set(1, "Pablo");  // Asignar posicion 1
		
		nombre = nombres.get(1);
		System.out.println(nombre);
		
		System.out.println(nombres); // Imprimo el listado

		
		int index = nombres.indexOf("Maria"); // obtener posicion por nombre
		System.out.println(index);
		
		nombres.set(index, "Helena");
		
		nombres.add("Juan");

		System.out.println(nombres); // Imprimo el listado

		// foreach 
		for (String string : nombres) {
			System.out.println(string);
		}

		
	}

}

/*
 
  Crear un arreglo de tipo List, que tenga lo siguiente cadenas
  
    "A", "E" , "I" , "O" , "U" 
  
  Encontrar la posicion de la E, 
  Reemplazar la letra I por Y
  Remover la letra U
  Imprimir todo el listado

 */


