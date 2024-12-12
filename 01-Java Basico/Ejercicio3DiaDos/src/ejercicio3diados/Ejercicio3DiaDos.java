/*
Ejercicios de Estructuras repetitivas:
Escribe un programa que permita al usuario ingresar números positivos 
y vaya acumulando la suma de estos. El programa debe detenerse cuando el usuario
ingrese un número negativo, y en ese momento debe mostrar
la suma total de los números positivos ingresados.*/
package ejercicio3diados;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class Ejercicio3DiaDos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        
        while (true) {
            
            System.out.print("Ingrese un número positivo (o un número negativo para terminar): ");
            int numero = scanner.nextInt();

            
            if (numero < 0) {
                break;
            }

           
            suma += numero;
        }

       
        System.out.println("La suma total de los números positivos ingresados es: " + suma);

        
        scanner.close();
    }
    
}
