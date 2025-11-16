package pe.edu.tecsup._11.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Los streams en Java 8 son una abstracción que permite procesar secuencias de elementos
 *  de una manera funcional (operaciones de filtro, mapa, reducción, etc.).
 *
 */
public class StreamBasic {

	public static void main(String[] args) {
		
        List<Integer> numbers = Arrays.asList(12,21,14,18,13);

        System.out.println(numbers); // Imprimo el listado

        // ---------------------------------------------------------
        //  Obtener el menor valor
        // ---------------------------------------------------------
        Optional<Integer> minValue
                = numbers.stream().min(Integer::compare);

        if(minValue.isPresent())
            System.out.println("Minimum: " + minValue.get());
        
        minValue.ifPresent(value -> System.out.println("Minimum: " + value));

        // ---------------------------------------------------------
        //  Obtener el mayor valor
        // ---------------------------------------------------------
        Optional<Integer> maxValue
                = numbers.stream().max(Integer::compare);

        if(maxValue.isPresent()) 
            System.out.println("Maximum: " + maxValue.get());
        
        maxValue.ifPresent(value -> System.out.print("Maximum: " + value));


        // ---------------------------------------------------------
        //  Obtener los valores ordenados
        // ---------------------------------------------------------
        
        // Caso 1
        Stream<Integer> sortedStream  = numbers.stream()
                                               .sorted();
        System.out.print("\nNumeros ordenados: ");
        sortedStream.forEach((n)->System.out.print(n + " "));

        // Caso 2 : Sorting and collecting results
        List<Integer> sortedNumbers  = numbers.stream()
                                              .sorted()
                                              .collect(Collectors.toList());
        System.out.print("\nNumeros ordenados: " + sortedNumbers);

        // ---------------------------------------------------------
        //  Obtener los valores ordenados y solo impares
        // ---------------------------------------------------------
        
        // Caso 1
        Stream<Integer> filterStream = numbers.stream()
                                              .sorted()
                                              .filter((n)->( n % 2 ) == 1);
                            
        System.out.print("\nNumeros impares: ");
        filterStream.forEach((n)->System.out.print(n + " "));


        // Caso 2 : Filtering and collecting results
        // Use collect(): When you need to transform the elements into a different kind of result, like a collection or a complex object.
        List<Integer> evenNumbers = numbers.stream()
                                           .sorted()
                                           .filter(n -> n % 2 == 1)
                                           .collect(Collectors.toList());

        System.out.print("\nNumeros impares: " + evenNumbers);
       
        // ---------------------------------------------------------
        //  Obtener los valores ordenados, impares y mayores que 15
        // ---------------------------------------------------------
        Stream<Integer> otherFilterStream = numbers.stream()
                                                   .sorted()
                                                   .filter((n)->( n % 2 ) == 1)
                                                   .filter((n)-> n > 15) ;
        
        System.out.print("\nFiltros : ");
        otherFilterStream.forEach((n)->System.out.print(n + " "));
		

        // Use reduce(): When you need to produce a single result from a stream of elements.

        // ---------------------------------------------------------
        //  Obtener la suma de los cuadrados de enteros
        // ---------------------------------------------------------
        // Using Streams to process the List
        int sumOfSquares = numbers.stream()
                                  .map(n -> n * n) // process each number
                                  .reduce(0, Integer::sum);

        System.out.println("\nSuma de cuadrados: " + sumOfSquares);
        
        // ---------------------------------------------------------
        //  Obtener la suma de numeros decimales
        // ---------------------------------------------------------  
        List<Double> numbersDouble = Arrays.asList(2.5, 3.5, 4.0);

        // Using reduce() with Double
        double sum = numbersDouble.stream()
                            .reduce(0.0, Double::sum);

        System.out.println("Sum of doubles: " + sum); // Output: Sum of doubles: 10.0
        
        // ---------------------------------------------------------
        //  Factorial
        // ---------------------------------------------------------  
        List<Integer> otherNumbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce() to calculate factorial
        int factorial = otherNumbers.stream()
                                    .reduce(1, (a, b) -> a * b);

        System.out.println(otherNumbers.size() + "! = " + factorial); // Output: 5! = 120
        
        // ---------------------------------------------------------
        //  Concatenar cadenas
        // ---------------------------------------------------------  
        List<String> words = Arrays.asList("Java", "Streams", "Are", "Powerful");

        // Using reduce() to concatenate strings
        String sentence = words.stream()
                               .reduce("", (partialString, element) -> partialString + " " + element);

        System.out.println("Sentence:" + sentence.trim()); // Output: Sentence: Java Streams Are Powerful
    
        
	}

}

