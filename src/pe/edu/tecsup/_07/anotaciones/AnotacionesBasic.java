package pe.edu.tecsup._07.anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface
Matricula{
    
    String ciclo();
    
    int creditos();
}


public class AnotacionesBasic {

    public static void main(String[] args) {

        usingAnnotation();
       
    }

    @Matricula(ciclo = "2022", creditos = 24 )  
    public static void usingAnnotation() {

        try {
            
            Method method 
                = (new AnotacionesBasic()).getClass().getMethod("usingAnnotation");
         
            Matricula matricula =  method.getAnnotation(Matricula.class);
            
            System.out.println(matricula.ciclo());
            System.out.println(matricula.creditos());
            
        } catch (NoSuchMethodException e) {
            System.out.println("Metodo no encontrado");
        }
    }
}
