package pe.edu.tecsup._09.optional;

import java.util.Optional;

/**
 * Optional es un contenedor que puede o no contener
 * un valor no nulo. Su uso puede prevenir NullPointerException en tu código.
 */
public class OptionalBasic {

    public static void main(String[] args) {

        String msgRaw = null;
        Optional<String> msg = Optional.ofNullable(msgRaw);

        if(msg.isPresent())
            System.out.println(msg.get()); // Imprime si no es nulo

        msg.ifPresent(System.out::println); // Imprime si no es nulo


    }
}
