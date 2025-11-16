package pe.edu.tecsup._02.wrapper;

public class Aplicacion {

    public static void main(String[] args) {

        
        System.out.println(".... Usando Wrapper ....!");
        
        // Byte, Short, Integer, and Long

        int nro = 100;
        
        Integer iNro =  Integer.valueOf(nro);
        
        System.out.println(nro + ", " +  iNro);
        
        
        int nroRecup = iNro.intValue();
        
        System.out.println("Entero recuperado " +  nroRecup);
        
        
        // autoboxing
        Integer otroNro = 200;
        
        int otroNroRecp = otroNro;
        
        
        // Float Double
        
        float dec = 1.2425f;
        
        Float fDec = Float.valueOf(dec);
        
        float decRep = fDec.floatValue();
        
        System.out.println("Decimal recuperado " + decRep);
    
        // Boolean


        // Ejercicio

        int edad = 30;

        Integer edadWrapper = edad; // autoboxing

        System.out.println("Edad Wrapper: " + edadWrapper);


        Integer impuesto = 1500;

        int impuestoPrimitivo = impuesto; // unboxing

        System.out.println("impuesto : " + impuestoPrimitivo);







    }
}
