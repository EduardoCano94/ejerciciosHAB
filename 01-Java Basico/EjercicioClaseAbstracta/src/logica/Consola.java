package logica;

public abstract class Consola {
    protected String codigo_consola;
    protected String nombre;
    protected String empresaDesarrollo;
    protected int anioLanzamiento;

    protected Consola (String codigo_consola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        this.codigo_consola = codigo_consola;
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    protected abstract void cargarJuego();
    
}
