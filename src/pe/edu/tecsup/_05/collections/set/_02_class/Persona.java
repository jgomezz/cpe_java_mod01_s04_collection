package pe.edu.tecsup._05.collections.set._02_class;

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
	public int hashCode() {
        int hashcode = 0;
        hashcode = this.dni.hashCode();
        hashcode += this.nombres.hashCode();
        return hashcode;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombres=" + nombres + "]";
	}

	@Override
	public boolean equals(Object object) {
		//System.out.println("comparacion");
		if(object instanceof Persona) {
			Persona persona = (Persona) object;
			if(persona.dni != null && persona.dni.equals(this.dni)
					&& persona.nombres != null && persona.nombres.equals(this.nombres)) {
				return true;
			}
		}
		return false;
	}
	
}
