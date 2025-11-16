package pe.edu.tecsup._04.collections.list._04_sort_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort3 {
	
	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<Student>();
		
		al.add(new Student("Jose",21));
		al.add(new Student("Pedro", 23));
		al.add(new Student("Maria",20));
		al.add(new Student("Alberto",23));
		al.add(new Student("Jaime",24));
		al.add(new Student("Samir",26));
        al.add(new Student("Jaime",21));

		// Se debe implementar el metodo compareTo en la clase Student
		
		Collections.sort(al);
		//Collections.sort(al,Collections.reverseOrder());
		
		for (Student s : al) 
			System.out.println(s.name + " " + s.age);
		
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


