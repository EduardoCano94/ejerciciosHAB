/*Imagina que eres un cajero en un supermercado. 
Crea un programa en Java que permita ingresar el precio de varios
productos comprados por un cliente.
  */
package ejercicio2estructurasrepetiitivas;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class Ejercicio2EstructurasRepetiitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        double precio;
        double total=0;
        System.out.println("=== Sistema de Cobro ===");
        System.out.println("Ingrese el precio de los productos. Para finalizar, ingrese cero (0).");

        while (true) {
            System.out.println( "Ingrese el precio del producto: ");
            
            precio = scanner.nextDouble();
           
            if (precio<= 0) {
                break; 
            }
            
          total += precio;
        }
        
        System.out.println("Total: " + total +  " $");
        
        
        
    
        scanner.close();
    }
    
}
