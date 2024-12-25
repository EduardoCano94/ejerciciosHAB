
package ejemplotrycatch;

public class EjemploTryCatch {

  
    public static void main(String[] args) {
    int edades[] = new int[3];
        try {
            edades[3] = 15; // Esto genera un ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El número ingresado está fuera del rango del arreglo.");
        }
    }
}
        
