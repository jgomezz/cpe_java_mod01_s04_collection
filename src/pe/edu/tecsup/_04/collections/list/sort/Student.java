package pe.edu.tecsup._04.collections.list.sort;

public class Student implements Comparable<Student> {
	
	public String name;
	public Integer s;

	public Student(String name) {
		this.name = name;
	}

	/**
	 * retorna 0 si son iguales
	 * retorna -1 si this.name es menor a person.name (lexicograficamente)
	 * retorna +1 si this.name es mayor a person.name (lexicograficamente)
	 * 
	 */
	public int compareTo(Student person) {
		// logica de negocio
		return name.compareTo(person.name);

	}
}