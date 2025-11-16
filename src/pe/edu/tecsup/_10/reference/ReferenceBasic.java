package pe.edu.tecsup._10.reference;

import java.util.Arrays;
import java.util.List;

/**
 * Los métodos de referencia son una forma concisa de referirse a un método
 * sin ejecutarlo. Son útiles para hacer que el código sea más legible.
 */
public class ReferenceBasic {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Juan", "Pedro", "Maria");

        names.forEach(System.out::println); // Método de referencia
    }
}
