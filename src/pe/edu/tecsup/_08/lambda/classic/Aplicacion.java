package pe.edu.tecsup._08.lambda.classic;


interface CalculoNumerico {
    double obtenerValor();
}

class CalculoNumeroImpl_1 implements CalculoNumerico {

    @Override
    public double obtenerValor() {
        return 145.4;
    }
}

class CalculoNumeroImpl_2 implements CalculoNumerico{

        @Override
        public double obtenerValor() {
            return  Math.random() * 100;
    }

}



public class Aplicacion {

    public static void main(String[] args) {

        CalculoNumerico cn;

        cn = new CalculoNumeroImpl_1(); // () -> 145.4;
        System.out.println(cn.obtenerValor());

        //
        cn = new CalculoNumeroImpl_2(); // () -> Math.random() * 100;
        System.out.println(cn.obtenerValor());
        System.out.println(cn.obtenerValor());


    }

}
