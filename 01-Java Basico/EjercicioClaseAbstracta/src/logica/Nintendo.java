package logica;

public class Nintendo extends Consola {
    private String norma;
    private boolean leeCartuchosPirata;

    public Nintendo(String norma, boolean leeCartuchosPirata, String codigo_consola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        super(codigo_consola, nombre, empresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.leeCartuchosPirata = leeCartuchosPirata;
    }

    

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isLeeCartuchosPirata() {
        return leeCartuchosPirata;
    }

    public void setLeeCartuchosPirata(boolean leeCartuchosPirata) {
        this.leeCartuchosPirata = leeCartuchosPirata;
    }

    public String getCodigo_consola() {
        return codigo_consola;
    }

    public void setCodigo_consola(String codigo_consola) {
        this.codigo_consola = codigo_consola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaDesarrollo() {
        return empresaDesarrollo;
    }

    public void setEmpresaDesarrollo(String empresaDesarrollo) {
        this.empresaDesarrollo = empresaDesarrollo;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    
    

    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego Nintendo64. Por favor espere"); 
    }
    public void leerCartucho(String nombreJuego){
        System.out.println("Leyendo Cartucho: " + nombreJuego);
    }
  
}
