package logica;

public  abstract class Animal {
    String nombre;
    String color;
    
    protected Animal(String nombre, String color){
    this.color = color;
    this.nombre = nombre;
}

    public void holaAnimal(){
        System.out.println("Hola soy el animal " + nombre);
     
    }
    public abstract void comer();
    public abstract void hacerSonido();
}

