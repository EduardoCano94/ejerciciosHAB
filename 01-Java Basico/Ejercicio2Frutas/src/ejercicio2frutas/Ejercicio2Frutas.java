package ejercicio2frutas;

import java.util.Scanner;
import logica.Fruta;

public class Ejercicio2Frutas {

    public static void main(String[] args) {
        System.out.println("====Bienvenido al sistema");
        Fruta frut = new Fruta();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Ingrese los datos de la fruta que desea cargar");
        
        System.out.println("Ingrese el nombre de la fruta ");
        frut.setNombre(scanner.nextLine());
        
        System.out.println("Ingrese el color de la fruta ");
        frut.setColor(scanner.nextLine());
        
        System.out.println("Ingrese el tipo de la cascara de la fruta ");
        frut.setTipoCascara(scanner.nextLine());
        
        System.out.println("Ingrese las calorias de la fruta ");
        scanner = new Scanner(System.in);
        frut.setCalorias(scanner.nextDouble());
        
        System.out.println("¿La fruta es comestible? ingrese 'y' si es así o 'n' si no es comestible ");
        scanner = new Scanner(System.in);
        String opcion = scanner.next();
        
        if(opcion.equals("y")){
            frut.setEsComeestible(true);
        }
        else{
            frut.setEsComeestible(false);
        }
        //mostrar datos 
        if(frut.isEsComeestible()== true){
            opcion= "Si";
        }
        else{
            opcion= "No";
        }
        System.out.println("la fruta cargada es: " + 
                "Nombre: " + frut.getNombre() + " Color: " + frut.getColor() + 
                " Tipo de cascara: " + frut.getTipoCascara() +
                " Calorias: " + frut.getCalorias() + " ¿Es comestible? " + opcion );
        
        System.out.println(frut.toString());
        
        
    }
    
    
}
