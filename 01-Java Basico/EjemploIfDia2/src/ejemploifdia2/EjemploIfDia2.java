package ejemploifdia2;

import java.util.Scanner;

public class EjemploIfDia2 {

    public static void main(String[] args) {
        //quiero avisar si una persona es mayor de edad o no
        System.out.println("Ingrese su edad para saber si es mayor");
        Scanner t = new Scanner (System.in);
        int edad = t.nextInt();
        
        if(edad>=18){
            System.out.println("Felicicdades es mayor de edad");
        }
        else {
            System.out.println("Lo sentimos no cumple con la mayoria de edad");
        }
        
        System.out.println("Gracias por usar nuestro sistema");
        
    }
    
}
