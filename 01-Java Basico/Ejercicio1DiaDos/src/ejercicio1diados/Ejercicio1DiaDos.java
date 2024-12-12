/*
Una atracción de parque de diversiones tiene un límite de peso de 100 kg por persona. 
Escribe un programa que, a partir del peso ingresado por un usuario, determine si puede o no
subirse a la atracción. El programa debe mostrar un mensaje indicando 
si puede subir o no, y si no puede, debe informar cuántos kilos excede el límite permitido.
 */
package ejercicio1diados;

import java.util.Scanner;

public class Ejercicio1DiaDos {

    public static void main(String[] args) {
        System.out.println("Ingrese su peso por favor: ");
        Scanner t = new Scanner(System.in);
        double peso = t.nextDouble();

        if (peso <= 100) {
            System.out.println("Puede subir");
        } else {
            double diferencia = peso - 100;
            System.out.println("Lo sentimos no es recomendable que ingrese, sobrepasa el limite por "
                    + diferencia + " Kgs");

        }

    }
}
    
