package pe.edu.tecsup._01.enumeration;

public class Aplicacion {

    public static void main(String[] args) {

        System.out.println(".... Usando comparacion con Enum ....!");
        
        CiudadPeru visitando = CiudadPeru.Lima;
                
        if (visitando == CiudadPeru.Trujillo)           
            System.out.println("Estoy comiendo un Seco a la norteña");
        else if (visitando == CiudadPeru.Lima)
            System.out.println("Estoy comiendo un Ceviche");
        else if (visitando == CiudadPeru.Arequipa)
            System.out.println("Estoy comiendo un Rocoto relleno");
     
                
        System.out.println(".... Usando valueOf() ....!");
        
        CiudadPeru lima = CiudadPeru.valueOf("Lima");
        System.out.println("Lima es " + lima);
        
        
        System.out.println(".... Usando ordinal() ....!");
        
        CiudadPeru ciudades[] = CiudadPeru.values();
        
        for (CiudadPeru ciudad : ciudades) {
            System.out.println(ciudad + " tiene el orden "+ciudad.ordinal());
        }

        System.out.println(".... Usando comparaciones ....!");
        
        
        if(CiudadPeru.Lima.equals(CiudadPeru.Lima))
            System.out.println("Son iguales");
        
        if(CiudadPeru.Lima == CiudadPeru.Lima)
            System.out.println("Son iguales");

        if(CiudadPeru.Lima.compareTo(CiudadPeru.Trujillo) > 0)
            System.out.println("Es mayor > ");
        
        if(CiudadPeru.Lima.compareTo(CiudadPeru.Trujillo) < 0)
            System.out.println("Es menor < ");
        
        if(CiudadPeru.Lima.compareTo(CiudadPeru.Trujillo) == 0)
            System.out.println("Es igual == ");        
    }
}
