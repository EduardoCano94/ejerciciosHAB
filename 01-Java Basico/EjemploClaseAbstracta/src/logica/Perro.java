package logica;

/**
 *
 * @author edu_c
 */
public class Perro extends Animal {

    public Perro(String nombre, String color) {
        super(nombre, color);
    }
    


    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro guau guau"); }

    @Override
    public void comer() {
        System.out.println("Soy un perro y estoy comiendo"); 
    }
    
    
}
