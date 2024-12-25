package logica;

public class EmpleadoDependencia extends Empleado {

   private double bono;
    public EmpleadoDependencia() {}

    public EmpleadoDependencia(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
    
    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    @Override
    public String getDescripcion() {
        return "Empleado de Tiempo Completo con salario base de " + salarioBase + 
               " y bono adicional de " + bono;
    }
    
}
