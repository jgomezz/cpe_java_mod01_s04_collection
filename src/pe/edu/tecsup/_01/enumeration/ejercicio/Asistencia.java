package pe.edu.tecsup._01.enumeration.ejercicio;

public record Asistencia(String codigo, String nombre, String apellido, EstadoAsistencia estado) {

    @Override
    public String toString() {
        return String.format("Asistencia[codigo=%s, nombre=%s, apellido=%s, estado=%s]",
                codigo, nombre, apellido, estado);
    }

}
