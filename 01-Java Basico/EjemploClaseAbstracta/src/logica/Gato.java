package logica;

public class Gato extends Animal {

    public Gato(String nombre, String color) {
        super(nombre, color);
    }
    

    @Override
    public void comer() {
        System.out.println("Estoy comiendo soy un gato");}

    @Override
    public void hacerSonido() {
        System.out.println("soy un gato, miau ");
    }
    
}
