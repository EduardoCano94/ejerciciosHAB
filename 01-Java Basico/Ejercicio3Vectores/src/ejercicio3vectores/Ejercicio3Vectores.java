/*
Ejercicio Nº 3 - Arreglos: Vectores - Individual
Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas
máximas de la última semana, calcule la temperatura máxima promedio que hubo.
Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente 
temperatura máxima de cada día. Una vez almacenadas las temperaturas,
deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla. */
package ejercicio3vectores;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class Ejercicio3Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] temperatura = new double [7];
        double temperaturaTotal=0;
        
        System.out.println("===Temperatura===");
        
        for(int dia = 0; dia<temperatura.length; dia++){
             System.out.print("Ingrese la temperatura máxima del día " + (dia + 1) + ": ");
            temperatura[dia] = scanner.nextDouble();
            
            temperaturaTotal += temperatura[dia];
        }
        double temperaturaPromedio = temperaturaTotal/temperatura.length;
        
        System.out.println("\n--- Resumen de Temperaturas ---");
        System.out.println("Temperaturas máximas registradas:");
        
        
        for (int dia = 0; dia < temperatura.length; dia++) {
            System.out.println("Día " + (dia + 1) + ": " + temperatura[dia] + "°C");
        }
        
        System.out.printf("Temperatura máxima promedio:" + temperaturaPromedio + "°C");
        
        scanner.close();
    }
    
}
