package pe.edu.tecsup._08.lambda.classic;


interface CalculoNumerico2 {
    double obtenerValor();
}

public class AplicacionLambda {

    public static void main(String[] args) {

        CalculoNumerico2 cn;

        cn =  () -> 145.4;
        System.out.println(cn.obtenerValor());

        //
        cn =  () -> Math.random() * 100;
        System.out.println(cn.obtenerValor());
        System.out.println(cn.obtenerValor());

    }

}
