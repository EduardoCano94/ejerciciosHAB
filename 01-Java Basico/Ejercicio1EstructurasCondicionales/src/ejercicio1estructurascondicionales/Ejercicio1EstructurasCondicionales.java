/*
Una recital permite únicamente el ingreso de mayores de 18 años. 
Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante 
un mensaje en pantalla si 
la persona puede o no ingresar al evento. El programa debe mostrar 
(según cada caso) un mensaje informando la situación. */
package ejercicio1estructurascondicionales;

import java.util.Scanner;

public class Ejercicio1EstructurasCondicionales {

  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite su edad antes de ingresar: ");
      int edad = scanner.nextInt();
      
       if(edad>=18){
            System.out.println("Felicidades puede ingresar");
        }
        else {
            System.out.println("Lo sentimos no cumple con la mayoria de edad");
        }
        
        System.out.println("Gracias por usar nuestro sistema");
      
      
      
      
      
      
    }
    
}
