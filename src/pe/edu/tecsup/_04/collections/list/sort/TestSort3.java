package pe.edu.tecsup._04.collections.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort3 {
	
	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<Student>();
		
		al.add(new Student("Jose"));
		al.add(new Student("Pedro"));
		al.add(new Student("Maria"));
		al.add(new Student("Alberto"));
		al.add(new Student("Jaime"));
		al.add(new Student("Samir"));

		// Se debe implementar el metodo compareTo en la clase Student
		
		//Collections.sort(al);
		Collections.sort(al,Collections.reverseOrder());
		
		for (Student s : al) 
			System.out.println(s.name);
		
	}
}

/**
 * Dada la clase MarcaProducto , que se usara para almacenar el nombre de una marca
 *  que puede ser "HP" ,"Lenovo" , "Samsung"
 * 
 * Crear un listado denominado nombresMarcas y ordenarlo alfabeticamente por 
 * 
 * el nombre
 * 
 */


