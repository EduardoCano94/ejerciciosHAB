package logica;

public abstract class Empleado {
     protected String nombre;
    protected double salarioBase;

    public Empleado() {}
    
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getDescripcion() {
        return "Empleado genérico con salario base de " + salarioBase;
    }
}
