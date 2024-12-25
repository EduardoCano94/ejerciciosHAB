
package ejemplohashmap;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

    public static void main(String[] args) {
        
       Map<Integer, Double> estaturas = new HashMap<>();
       
       //agregar valores
       estaturas.put(1, 1.79);
       estaturas.put(2, 1.67);
       estaturas.put(3, 1.58);
       estaturas.put(4, 1.95);
       
       //Busqueda 
       double estatura = estaturas.get(3);
       
       //busqueda por key
       boolean estaOno = estaturas.containsValue("1.54");
       
    }
    
}
