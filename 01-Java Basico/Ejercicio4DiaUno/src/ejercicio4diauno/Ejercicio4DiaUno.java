package ejercicio4diauno;

import java.util.Scanner;

public class Ejercicio4DiaUno {
public static void main(String[] args) {
    
 Scanner numero = new Scanner (System.in);
        System.out.println("Ingrese el primer numero entero (SIN DECIMALES), por favor ");
       int num1 = numero.nextInt();
       
        System.out.println("Ingrese el segundo numero (SIN DECIMALES), por favor: ");
        int num2 = numero.nextInt();
        
        int suma = (num1 + num2);
        System.out.println("El resultado de la suma es: " + suma);
        
       int resta = (num1 - num2);
        System.out.println("El resultado de la resta es: " + resta);
        
       int multiplicacion = (num1 * num2);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        
        int division = (num1 / num2);
        System.out.println("El resultado de la division es: " + division);
        
        System.out.println("Gracias por utilizar la app, VUELVA PRONTO");
        
        numero.close();
        
    }
}
