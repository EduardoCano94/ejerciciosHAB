package logica;

public class Automovil extends Vehiculo {
    private int cantidadPuertas;
    
    public Automovil() {
        super(); 
        this.cantidadPuertas = 0;
    }

    public Automovil(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio); // Llama al constructor de la clase padre
        this.cantidadPuertas = cantidadPuertas;
    }

    
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void acelerar() {
        System.out.println("El auto está acelerando");
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantidad de Puertas: " + cantidadPuertas;
    }
    
}
