package ejemploencapsulamiento;

import logica.Mascota;

public class EjemploEncapsulamiento {

    public static void main(String[] args) {
        Mascota masco = new Mascota();
        
        masco.setNombre("Ibra");
        masco.getNombre();
        String nombre = masco.nombre;
        System.out.println(nombre);
        
        
        
        
    }
    
}
