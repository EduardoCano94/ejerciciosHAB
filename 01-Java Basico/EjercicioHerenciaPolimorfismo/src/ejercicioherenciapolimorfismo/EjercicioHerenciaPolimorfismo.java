package ejercicioherenciapolimorfismo;

import logica.Empleado;
import logica.EmpleadoDependencia;
import logica.EmpleadoHora;

public class EjercicioHerenciaPolimorfismo {

    public static void main(String[] args) {
    Empleado[] empleados = new Empleado[5];
    
        empleados[0] = new EmpleadoDependencia("Juan Pérez", 2000, 500);
        empleados[1] = new EmpleadoHora("María García", 1500, 40, 25);
        empleados[2] = new EmpleadoDependencia("Carlos Martínez", 2500, 750);
        empleados[3] = new EmpleadoHora("Ana López", 1800, 35, 30);
        empleados[4] = new EmpleadoDependencia("Luis Rodríguez", 2200, 600);

        System.out.println("Información de Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println("Descripción: " + empleado.getDescripcion());
            System.out.println("-------------------");
        }
    }
    }
    

