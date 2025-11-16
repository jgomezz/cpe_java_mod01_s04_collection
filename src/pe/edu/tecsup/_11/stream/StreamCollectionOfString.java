package pe.edu.tecsup._11.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectionOfString {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anny" , "David");

        List<String> filteredNames = names.stream()            // Source
            .filter(name -> name.startsWith("A"))             // Intermediate Operation
            .map(String::toUpperCase)                         // Intermediate Operation
            .sorted()                                         // Intermediate Operation
            .collect(Collectors.toList());                    // Terminal Operation
        
        System.out.println(filteredNames);

    }

}
