package pe.edu.tecsup._01.enumeration.ejercicio.solucion02;

// Usando inner class

enum EstadoAsistencia {
    ASISTIO,
    FALTO,
    JUSTIFICO,
    TARDE
}


record Asistencia(String codigo, String nombre, String apellido, EstadoAsistencia estado) {

    @Override
    public String toString() {
        return String.format("Asistencia[codigo=%s, nombre=%s, apellido=%s, estado=%s]",
                codigo, nombre, apellido, estado);
    }

}


public class Aplicacion {

    public static void main(String[] args) {
        Asistencia a1 = new Asistencia("001", "Juan", "Perez", EstadoAsistencia.ASISTIO);
        Asistencia a2 = new Asistencia("002", "Maria", "Lopez", EstadoAsistencia.FALTO);
        Asistencia a3 = new Asistencia("003", "Carlos", "Gomez", EstadoAsistencia.JUSTIFICO);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
