package ejerciciolista;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Producto;

public class EjercicioLista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();

        while (true) {
            System.out.println("--- INGRESO DE PRODUCTOS ---");
            System.out.print("Ingrese el nombre del producto (o 'Fin' para terminar): ");
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("Fin")) {
                break;
            }

            System.out.print("Ingrese la marca del producto: ");
            String marca = scanner.nextLine().trim();

            System.out.print("Ingrese el precio del producto: ");
            double precio = 0;
            
            while (true) {
                try {
                    precio = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Precio inválido. Ingrese un número válido: ");
                }
            }

            listaProductos.add(new Producto(nombre, marca, precio));
        }

        while (true) {
            System.out.println("\n--- MENÚ DE BÚSQUEDA ---");
            System.out.println("1. Buscar producto");
            System.out.println("2. Salir");
            System.out.print("Elija una opción: ");

            int opcion = 0;
            while (true) {
                try {
                    opcion = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Opción inválida. Ingrese 1 o 2: ");
                }
            }

            switch (opcion) {
                case 1:
                    buscarProducto(listaProductos, scanner);
                    break;
                case 2:
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static void buscarProducto(ArrayList<Producto> listaProductos, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreBusqueda = scanner.nextLine().trim();

        boolean productoEncontrado = false;

        for (Producto producto : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                System.out.println("Producto encontrado:");
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Marca: " + producto.getMarca());
                System.out.println("Precio: $" + producto.getPrecio());
                productoEncontrado = true;
                break;
            }
        }

        if (!productoEncontrado) {
            System.out.println("El producto no se encuentra en la lista.");
            
            System.out.print("¿Desea buscar otro producto? (S/N): ");
            String respuesta = scanner.nextLine().trim();
            
            if (respuesta.equalsIgnoreCase("S")) {
                buscarProducto(listaProductos, scanner);
            }
        }
    }
    }
    
