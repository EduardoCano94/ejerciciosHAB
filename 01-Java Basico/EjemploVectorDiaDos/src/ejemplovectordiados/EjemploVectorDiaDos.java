/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplovectordiados;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class EjemploVectorDiaDos {

  
    public static void main(String[] args) {
        //Arreglos unidimensionales
        int numero[] = new int [5];
        //cargar vector manualmente
        numero[0]= 32;
        numero[1]= 12;
        numero[2]= 2;
        
        //cargar mediante teclado
        System.out.println("Ingreso numeros a guardar");
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i<=4; i++){
            numero[i]= scanner.nextInt();
        }
        //recorrido vector
        for(int i=0; i<=4; i++){
            System.out.println("El vector guardado es " + i + "es:" + numero);
        }
        
        
        
    }
    
}
