/*
Escribe un programa que permita al usuario ingresar un número
entero positivo y luego imprima la tabla de multiplicar 
de ese número del 1 al 10.
 */
package ejercicio4diados;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class Ejercicio4DiaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        while (true) {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
            
            if (numero > 0) {
                break; 
            }
             
            System.out.println("Error: Por favor ingrese un número entero positivo.");
        }

        System.out.println("Tabla de multiplicar del " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        
        scanner.close();
    }
    
}
