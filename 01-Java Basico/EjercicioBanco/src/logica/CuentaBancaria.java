package logica;
public class CuentaBancaria {
    private String nombre;
    private double cantidadDinero;
    private int numeroCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombre, double cantidadDinero, int numeroCuenta) {
        this.nombre = nombre;
        this.cantidadDinero = cantidadDinero;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "nombre=" + nombre + ", cantidadDinero=" + cantidadDinero + ", numeroCuenta=" + numeroCuenta + '}';
    }
    
    
    
}
