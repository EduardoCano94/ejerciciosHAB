package ejerciciohashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioHashMap {

    private static Map<Integer, Double> estudiantes = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ingresarEstudiante();
                    break;
                case 2:
                    buscarPorMatricula();
                    break;
                case 3:
                    buscarPorPromedio();
                    break;
                case 4:
                    mostrarTodosEstudiantes();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    // Método para mostrar el menú de opciones
    private static void mostrarMenu() {
        System.out.println("\n--- Sistema de Gestión de Notas ---");
        System.out.println("1. Ingresar nuevo estudiante");
        System.out.println("2. Buscar estudiante por matrícula");
        System.out.println("3. Buscar estudiantes por rango de promedio");
        System.out.println("4. Mostrar todos los estudiantes");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void ingresarEstudiante() {
        try {
            System.out.print("Ingrese el número de matrícula: ");
            int matricula = scanner.nextInt();

            if (estudiantes.containsKey(matricula)) {
                System.out.println("Ya existe un estudiante con esta matrícula.");
                return;
            }

            System.out.print("Ingrese el promedio del estudiante: ");
            double promedio = scanner.nextDouble();

            // Validar que el promedio esté en un rango válido
            if (promedio < 0 || promedio > 10) {
                System.out.println("Promedio inválido. Debe estar entre 0 y 10.");
                return;
            }

            estudiantes.put(matricula, promedio);
            System.out.println("Estudiante agregado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al ingresar los datos. Intente nuevamente.");
            scanner.nextLine(); // Limpiar buffer de errores
        }
    }

    // Método para buscar estudiante por matrícula
    private static void buscarPorMatricula() {
        try {
            System.out.print("Ingrese el número de matrícula a buscar: ");
            int matricula = scanner.nextInt();

            // Buscar en el HashMap
            if (estudiantes.containsKey(matricula)) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Matrícula: " + matricula + 
                                   ", Promedio: " + estudiantes.get(matricula));
            } else {
                System.out.println("No se encontró ningún estudiante con esa matrícula.");
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el estudiante.");
            scanner.nextLine(); // Limpiar buffer de errores
        }
    }

    // Método para buscar estudiantes por rango de promedio
    private static void buscarPorPromedio() {
        try {
            System.out.print("Ingrese el promedio mínimo: ");
            double promedioMinimo = scanner.nextDouble();
            System.out.print("Ingrese el promedio máximo: ");
            double promedioMaximo = scanner.nextDouble();

            // Bandera para verificar si se encontraron estudiantes
            boolean encontrados = false;

            System.out.println("Estudiantes en el rango de promedio:");
            for (Map.Entry<Integer, Double> entrada : estudiantes.entrySet()) {
                if (entrada.getValue() >= promedioMinimo && entrada.getValue() <= promedioMaximo) {
                    System.out.println("Matrícula: " + entrada.getKey() + 
                                       ", Promedio: " + entrada.getValue());
                    encontrados = true;
                }
            }

            if (!encontrados) {
                System.out.println("No se encontraron estudiantes en ese rango de promedio.");
            }
        } catch (Exception e) {
            System.out.println("Error al buscar estudiantes por promedio.");
            scanner.nextLine(); // Limpiar buffer de errores
        }
    }

    // Método para mostrar todos los estudiantes
    private static void mostrarTodosEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("Lista de todos los estudiantes:");
        for (Map.Entry<Integer, Double> entrada : estudiantes.entrySet()) {
            System.out.println("Matrícula: " + entrada.getKey() + 
                               ", Promedio: " + entrada.getValue());
        }
    }
}
    
    

