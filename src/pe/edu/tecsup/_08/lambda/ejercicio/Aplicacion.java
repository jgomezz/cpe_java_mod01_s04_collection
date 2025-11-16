package pe.edu.tecsup._08.lambda.ejercicio;


interface Operacion {
    int ejecutar(int a, int b);
}

class OperacionSuma implements Operacion {
    @Override
    public int ejecutar(int a, int b) {
        return a+ b ;
    }
}
class OperacionResta implements Operacion {

    @Override
    public int ejecutar(int a, int b) {
        return a-b;
    }
}

class OperacionMuliplicacion implements Operacion {

    @Override
    public int ejecutar(int a, int b) {
        return a*b;
    }
}

class OperacionDivision implements Operacion {

    @Override
    public int ejecutar(int a, int b) {
        return a/b;
    }
}


public class Aplicacion {

    public static void main(String[] args) {

        Operacion op;

        op = new OperacionSuma();
        System.out.println(op.ejecutar(4,2));

        op = new OperacionResta();
        System.out.println(op.ejecutar(4,2));

        op = new OperacionMuliplicacion();
        System.out.println(op.ejecutar(4,2));

        op = new OperacionDivision();
        System.out.println(op.ejecutar(4,2));

    }


}
