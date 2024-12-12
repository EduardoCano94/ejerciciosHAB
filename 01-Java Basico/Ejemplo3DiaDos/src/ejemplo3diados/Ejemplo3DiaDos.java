/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3diados;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class Ejemplo3DiaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 al 7 para saber que dia de la semana es; ");
        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt();
        
        switch(dia){
            case 1: System.out.println("El dia es lunes");
            break;
            case 2: System.out.println("El dia es martes");
            break;
            case 3: System.out.println("El dia es miercoles");
            break;
            case 4: System.out.println("El dia es jueves");
            break;
            case 5: System.out.println("El dia es viernes");
            break;
            case 6: System.out.println("El dia es sabado");
            break;
            case 7: System.out.println("El dia es domingo");
            break;
            
            default: System.out.println("ingreso un numero no valido");
            break;
        }
            
        
        
        
    }
    
}
