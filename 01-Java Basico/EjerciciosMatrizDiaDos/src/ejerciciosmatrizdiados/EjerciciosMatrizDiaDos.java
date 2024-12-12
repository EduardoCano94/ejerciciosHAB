/*Realizar un programa que permita la carga de 15 números en un vector.
Una vez 
cargados, se necesita que el programa cuente e informe por pantalla cuántas 
veces se cargó el número 7.
 
*/
package ejerciciosmatrizdiados;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class EjerciciosMatrizDiaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[15];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 15 números:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); 
                System.out.print("Número " + (i + 1) + ": ");
            }
            numeros[i] = scanner.nextInt();
        }
        int cantidadSietes = 0;
        for (int numero : numeros) {
            if (numero == 7) {
                cantidadSietes++;
            }
        }

    
        System.out.println("El número 7 se cargó " + cantidadSietes + " veces.");

        scanner.close(); 
    }
    
}
