/*
 */
package ejemplo4diados;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class Ejemplo4DiaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int cont = 0;
        
        while(cont<=10){
            System.out.println("Estoy en el numero: " + cont);
            cont = cont+1;
        }*/
       
       //programa que permite ungresar kas edades de las personas y 
       //que pare su ejecucion al encontrar una persona mayor a 70
       
        System.out.println("Ingrese su edad");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        
     while (edad<=70){
         System.out.println("Ingrese su edad");
         edad = teclado.nextInt();
     }
        System.out.println("Persona encontrada");
        
        
    }
    
}
