
package com.mycompany.ejercicicoexcepcion2;

import java.util.List;
import java.util.Scanner;
import logica.Producto;
import persistencia.ControladoraPersistencia;


public class EjercicicoExcepcion2 {

    public static void main(String[] args) {
       ControladoraPersistencia controladora = new ControladoraPersistencia();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n--- Gestión de Productos ---");
            System.out.println("1. Crear producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> {
                        try {
                            System.out.print("Ingrese el nombre del producto: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Ingrese el precio del producto: ");
                            double precio = scanner.nextDouble();
                            System.out.print("Ingrese el stock del producto: ");
                            int stock = scanner.nextInt();
                            
                            if (precio <= 0) {
                                throw new IllegalArgumentException("El precio debe ser mayor que 0");
                            }
                            if (stock < 0) {
                                throw new IllegalArgumentException("El stock no puede ser negativo");
                            }
                            
                            Producto nuevoProducto = new Producto(nombre, precio, stock);
                            controladora.agregarProducto(nuevoProducto);
                            System.out.println("Producto creado exitosamente");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Error al crear el producto");
                        }
                    }
                    case 2 -> {
                        System.out.println("\n--- Lista de Productos ---");
                        List<Producto> productos = controladora.obtenerProductos();
                        if (productos.isEmpty()) {
                            System.out.println("No hay productos registrados");
                        } else {
                            productos.forEach(System.out::println);
                        }
                    }
                    case 3 -> {
                        try {
                            System.out.print("Ingrese el ID del producto a actualizar: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            
                            Producto producto = controladora.obtenerProducto(id);
                            if (producto == null) {
                                System.out.println("No se encontró el producto con ID: " + id);
                                continue;
                            }
                            
                            System.out.print("Nuevo nombre (Enter para mantener actual [" + producto.getNombre() + "]): ");
                            String nombre = scanner.nextLine();
                            if (!nombre.trim().isEmpty()) {
                                producto.setNombre(nombre);
                            }
                            
                            System.out.print("Nuevo precio (0 para mantener actual [" + producto.getPrecio() + "]): ");
                            double precio = scanner.nextDouble();
                            if (precio > 0) {
                                producto.setPrecio(precio);
                            }
                            
                            System.out.print("Nuevo stock (-1 para mantener actual [" + producto.getStock() + "]): ");
                            int stock = scanner.nextInt();
                            if (stock >= 0) {
                                producto.setStock(stock);
                            }
                            
                            controladora.actualizarProducto(producto);
                            System.out.println("Producto actualizado exitosamente");
                        } catch (Exception e) {
                            System.out.println("Error al actualizar el producto");
                        }
                    }
                    case 4 -> {
                        try {
                            System.out.print("Ingrese el ID del producto a eliminar: ");
                            int id = scanner.nextInt();
                            Producto producto = controladora.obtenerProducto(id);
                            if (producto == null) {
                                System.out.println("No se encontró el producto con ID: " + id);
                                continue;
                            }
                            controladora.borrarProducto(id);
                            System.out.println("Producto eliminado exitosamente");
                        } catch (Exception e) {
                            System.out.println("Error al eliminar el producto");
                        }
                    }
                    case 5 -> System.out.println("¡Hasta luego!");
                    default -> System.out.println("Opción no válida");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida");
                scanner.nextLine(); // Limpiar el buffer
                opcion = 0; // Continuar el bucle
            }
        } while (opcion != 5);
        
        scanner.close();
    }
    }

