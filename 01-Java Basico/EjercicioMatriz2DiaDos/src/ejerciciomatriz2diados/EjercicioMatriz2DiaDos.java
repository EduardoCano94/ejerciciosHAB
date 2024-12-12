/*
  */
package ejerciciomatriz2diados;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class EjercicioMatriz2DiaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[][] alumnos = new double[4][4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las notas de los alumnos (3 notas por alumno):");

        for (int i = 0; i < 4; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print("  Nota " + (j + 1) + ": ");
                    if (scanner.hasNextDouble()) {
                        double nota = scanner.nextDouble();
                        if (nota >= 0 && nota <= 10) {
                            alumnos[i][j] = nota;
                            break;
                        } else {
                            System.out.println("  La nota debe estar entre 0 y 10.");
                        }
                    } else {
                        System.out.println("  Por favor, ingrese un número válido.");
                        scanner.next(); 
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += alumnos[i][j];
            } 
            alumnos[i][3] = Math.round((suma / 3) * 100.0) / 100.0;
        }

        System.out.println("\nNotas y promedios de los alumnos:");
        System.out.println("Alumno\tNota 1\tNota 2\tNota 3\tPromedio");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f%n", 
                              i + 1, alumnos[i][0], alumnos[i][1], alumnos[i][2], alumnos[i][3]);
        }

        scanner.close(); 
    }
    
}
