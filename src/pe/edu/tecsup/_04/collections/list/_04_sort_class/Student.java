package pe.edu.tecsup._04.collections.list._04_sort_class;

public class Student implements Comparable<Student> {
	
	public String name;
	public Integer age;
    public Integer s;

	public Student(String name, Integer age) {
		this.name = name;
	    this.age = age;

    }

	/**
	 * retorna 0 si son iguales
	 * retorna -1 si this.name es menor a person.name (lexicograficamente)
	 * retorna +1 si this.name es mayor a person.name (lexicograficamente)
	 * 
	 */
	public int compareTo(Student person) {
		// logica de negocio

        // Primero comparamos por nombre
        int nameComparison = name.compareTo(person.name);
        if (nameComparison != 0) {
            return nameComparison;
        }

        // Si los nombres son iguales, comparamos por edad
        return age.compareTo(person.age);

//        return name.compareTo(person.name);

	}
}