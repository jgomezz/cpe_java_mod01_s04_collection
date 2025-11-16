package pe.edu.tecsup._08.lambda;

@FunctionalInterface
interface NumericoTest {
    boolean test(int n);
}

@FunctionalInterface
interface CalculoNumerico {
    double obtenerValor();
}

@FunctionalInterface
interface OperacionMatematica {
    int run(int a, int b);
}

/**
 * Una expresión lambda en Java es una forma corta y clara de representar una instancia
 * de una interfaz funcional. Permite implementar métodos de interfaz con un código conciso.
 */
public class LambdaBasic {

    public static void main(String[] args) {

        // Expresion lambda
        CalculoNumerico cn = () -> 145.4;

        System.out.println(cn.obtenerValor());

        //
        cn = () -> Math.random() * 100;

        System.out.println(cn.obtenerValor());
        System.out.println(cn.obtenerValor());

        NumericoTest nt;
        nt = (n) -> (n % 2) == 0;

        if (!nt.test(21))
            System.out.println("No es par");

        if (nt.test(20))
            System.out.println("Es par");

        nt = (n) -> n >= 0;

        if (!nt.test(-1))
            System.out.println("Es menor que 0");

        if (nt.test(10))
            System.out.println("Es mayor que 0");

        nt = (n) -> {

            return true;

        };

        if (nt.test(10))
            System.out.println("Siempre sera verdadero");

        
        // Expresion lambda : implementa la suma
        OperacionMatematica op = (a, b) -> a + b ;
        System.out.println(op.run(4,5));

        // Expresion lambda : implementa la resta
        op = (a,b) -> a - b ;
        System.out.println(op.run(4,5));

        // Expresion lambda : implementa la multiplicacion
        op = (a,b) -> a * b ;
        System.out.println(op.run(4,5));

        // Expresion lambda : implementa la division
        op = (a,b) -> a / b ;
        System.out.println(op.run(40,5));

    }
}
