package logica;

public class Motocicleta extends Vehiculo{
    private double cilindrada;

    public Motocicleta() {
        super(); 
        this.cilindrada = 0.0;
    }
    
    public Motocicleta(String marca, String modelo, int anio, double cilindrada) {
        super(marca, modelo, anio); // Llama al constructor de la clase padre
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada;
    }

    
    
}
