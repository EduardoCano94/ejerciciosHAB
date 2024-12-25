
package ejercicioclaseabstracta;

import logica.Nintendo;
import logica.PlayStation;
import logica.XboxOne;

public class EjercicioClaseAbstracta {

    public static void main(String[] args) {
       Nintendo n64 = new Nintendo("123", true, "123", 
                              "nintendo", "capcom", 1991);
               
        n64.cargarJuego();
        n64.leerCartucho("Banjo Kazooie");
        
        System.out.println(); 
        
        
        PlayStation ps2 = new PlayStation("123ma", true, 2, "qww", "PS1", "PS", 0);
        ps2.cargarJuego();
        ps2.leerDvd("Fifa 2009");
        ps2.grabarEnMemoria();
        
        System.out.println();
        
        XboxOne xboxOne = new XboxOne(true, true, 
                true, "Xbox", "Xbox", 
                "SONy", 1990);
        xboxOne.cargarJuego();
        xboxOne.leerJuegoDigital("GTA V");
    }
    }
    

