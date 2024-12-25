
package ejemploherencia;

import logica.Gato;
import logica.Perro;

public class EjemploHerencia {

    public static void main(String[] args) {
        Perro perro = new Perro(5, "Ibra", 12, "cafe");
        Gato gato = new Gato(5, "Garfield", 15, "anaranjado");
        perro.comer();
        gato.comer();
        
        
    }
    
}
