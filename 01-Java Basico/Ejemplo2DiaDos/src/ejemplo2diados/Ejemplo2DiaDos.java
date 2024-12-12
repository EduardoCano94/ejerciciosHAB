/*
    Una universidad clasifica las notas de los estudiantes en diferentes niveles de rendimiento.
        Escribe un programa que, a partir de una nota numérica ingresada por el usuario, determine el
        nivel de rendimiento del estudiante. Las categorías son las siguientes:
            Si la nota es menor a 60, el rendimiento es "Insuficiente".
            Si la nota está entre 60 y 80, el rendimiento es "Bueno".
            Si la nota está entre 81 y 90, el rendimiento es "Notable".
            Si la nota es mayor a 90, el rendimiento es "Excelente".
  */
package ejemplo2diados;

import java.util.Scanner;

/**
 *
 * @author edu_c
 */
public class Ejemplo2DiaDos {
    public static void main(String[] args) {
        System.out.println("Ingrese la nota: ");
        Scanner nota = new Scanner (System.in);
        double calificacion = nota.nextDouble();
        
        if(calificacion<60){
            System.out.println("El rendimiento es insuficiente");
        }
        else{
            if(calificacion>=60 && calificacion <=80){
                System.out.println("El rendimiento del alumno es bueno");
            }
            else{
                if(calificacion >=81 && calificacion<=90){
                    System.out.println("El rendimiento del alumon es notable");
            }
                else{
                    if(calificacion>90){
                        System.out.println("El rendimiento del alumno es Excelente");
                    }
        }
        }
        
        
}
        
        
    }
    
}
