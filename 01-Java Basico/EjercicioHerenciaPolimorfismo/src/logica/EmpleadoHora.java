package logica;

public class EmpleadoHora extends Empleado {

    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoHora() {}

    public EmpleadoHora(String nombre, double salarioBase, 
                            int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String getDescripcion() {
        return "Empleado Por Hora trabajando " + horasTrabajadas + 
               " horas a una tarifa de " + tarifaPorHora + " por hora";
    }
    
}
