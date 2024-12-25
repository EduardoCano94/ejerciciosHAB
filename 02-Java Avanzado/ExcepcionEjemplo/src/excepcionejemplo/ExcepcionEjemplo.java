package excepcionejemplo;

import java.util.Scanner;
import logica.ExcepcionDatoIncorrecto;

public class ExcepcionEjemplo {

    public static void main(String[] args) throws ExcepcionDatoIncorrecto {
    int dato =0;
      Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10");
        dato = teclado.nextInt();
        
        
        if(dato<=0||dato>=10){
            throw new ExcepcionDatoIncorrecto("ingrese un valor no valido");
        }
            
    }
    
    
}
