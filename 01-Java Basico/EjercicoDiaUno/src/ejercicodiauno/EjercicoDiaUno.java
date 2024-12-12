package ejercicodiauno;

public class EjercicoDiaUno {

    public static void main(String[] args) {
        System.out.println("Hola bienvenido al sistema");
        String nombre = "Eduardo";
        System.out.println("Hola "+ nombre + " bienvenido al sistema");
        
        //Declaracion de variables y asignacion de valores
        int dias = 7;
        double numeroDecimal = 3.15;
        boolean esVerdadero = true;
        String apellidos= "Cano Alarcon";
        
        // Ejercicio Nº 2 - Tipos de Datos
        
        //Impresion valores
         System.out.println("Dias de la semana: " + dias);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Valor booleano: " + esVerdadero);
        System.out.println("Apellidos: " + apellidos);   
        
        // Declaración de variables con errores intencionados
        // int numeroEntero = "texto";          // Error: Asignación de String a int
        // double numeroDecimal = "3.14";      // Error: Asignación de String a double
        // boolean esVerdadero = 1;            // Error: Asignación de int a boolean
        // String texto = 12345;               // Error: Asignación de int a String (sin conversión explícita)
        
    }
}
