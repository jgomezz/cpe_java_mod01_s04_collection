package pe.edu.tecsup._06.collections.map;

public class Persona {

	private String dni;
	
	private String nombres;

	public Persona() {
		super();
	}

	public Persona(String dni, String nombres) {
		super();
		this.dni = dni;
		this.nombres = nombres;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombres=" + nombres + "]";
	}

	@Override
	public boolean equals(Object object) {
		System.out.println("comparacion");
		if(object instanceof Persona) {
			Persona persona = (Persona) object;
			if(persona.dni != null && persona.dni.equals(this.dni)) {
				return true;
			}
		}
		return false;
	}
	
}
