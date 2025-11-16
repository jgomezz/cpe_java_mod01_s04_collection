package pe.edu.tecsup._04.collections.list._02_class.ejercicio;

import java.util.ArrayList;
import java.util.List;

enum ZonaTicket {
    TribunaNorte,
    Occidente,
    Oriente,
    VIP
}

record BoletoDigital ( String codigoQR, String nombreEvento, ZonaTicket zona) {
}


public class Aplicacion {

    public static void main(String[] args) {

        BoletoDigital bd01 = new BoletoDigital("QR001", "Concierto Shakira", ZonaTicket.VIP);
        BoletoDigital bd02 = new BoletoDigital("QR002", "Concierto Shakira", ZonaTicket.Oriente);
        BoletoDigital bd03 = new BoletoDigital("QR001", "Concierto Shakira", ZonaTicket.TribunaNorte);
        BoletoDigital bd04 = new BoletoDigital("QR004", "Concierto Shakira", ZonaTicket.Occidente);


        List<BoletoDigital> boletoRegistrados = new ArrayList<>();

        // TO DO

    }
}
