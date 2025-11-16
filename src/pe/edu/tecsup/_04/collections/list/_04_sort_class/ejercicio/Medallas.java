package pe.edu.tecsup._04.collections.list._04_sort_class.ejercicio;

public record Medallas(int nroOro, int nroPlata, int nroBronce) implements Comparable<Medallas> {

    @Override
    public int compareTo(Medallas other) {

        int cmpOro = Integer.compare(this.nroOro, other.nroOro);

        return cmpOro;


    }
}
