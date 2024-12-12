/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomatrizdiados;

/**
 *
 * @author edu_c
 */
public class EjemploMatrizDiaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edades [][] = new int [3][2];
       edades[0][0]= 15;
       edades[0][1]= 35;
       edades[1][0]= 15;
       edades[1][1]= 15;
       edades[2][0]= 15;
       edades[2][1]= 15;
       // cargar por teclado
       for( int f=0; f<edades.length; f++ ){
           for(int c=0; c<edades[0].length; c++){
               System.out.println("Ingrese el valor para la primera fila: " + f + "columna" + c);
           }
       }
      
       
       
       
        }
    }
    

