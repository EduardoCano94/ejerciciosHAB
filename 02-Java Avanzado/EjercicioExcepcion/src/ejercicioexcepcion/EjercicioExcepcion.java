package ejercicioexcepcion;

import java.util.Scanner;
import logica.MontoInvalidoException;

public class EjercicioExcepcion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numeroTarjeta = 0;
        double monto = 0;
        String nombreCliente = "";

        while (true) {
            try {
                System.out.print("Ingrese el número de tarjeta (16 dígitos): ");
                 String input = scanner.nextLine();

                 if (input.length() != 16 || !input.matches("\\d+")) {
            throw new NumberFormatException("El número de tarjeta es inválido. Debe contener 16 dígitos numéricos.");
        }

        numeroTarjeta = Long.parseLong(input);
        break; 
    } catch (NumberFormatException e) {
        System.out.println("Error: " + e.getMessage());
        }

    
        while (true) {
            try {
                System.out.print("Ingrese el monto de la compra (valor positivo): ");
                String montoStr = scanner.nextLine();
                monto = Double.parseDouble(montoStr);

                if (monto <= 0) {
                    throw new MontoInvalidoException("El monto debe ser un valor positivo mayor a 0.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un valor numérico para el monto.");
            } catch (MontoInvalidoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Ingrese el nombre del cliente: ");
                nombreCliente = scanner.nextLine();

                if (nombreCliente.trim().isEmpty()) {
                    throw new IllegalArgumentException("El nombre no puede estar vacío o solo contener espacios.");
                }
                break; 
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("\nCompra realizada con éxito:");
        System.out.println("Número de tarjeta: " + numeroTarjeta);
        System.out.println("Monto: $" + monto);
        System.out.println("Nombre del cliente: " + nombreCliente);
    }
    }
}
    
