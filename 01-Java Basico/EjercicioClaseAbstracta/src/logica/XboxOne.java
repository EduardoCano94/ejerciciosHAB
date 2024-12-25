package logica;

public class XboxOne extends Consola{
    private boolean conectadaInternet;
    private boolean calidad4KActiva;
    private boolean permiteDescargaAutomatica;

    public XboxOne(boolean conectadaInternet, boolean calidad4KActiva, boolean permiteDescargaAutomatica, String codigo_consola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        super(codigo_consola, nombre, empresaDesarrollo, anioLanzamiento);
        this.conectadaInternet = conectadaInternet;
        this.calidad4KActiva = calidad4KActiva;
        this.permiteDescargaAutomatica = permiteDescargaAutomatica;
    }

    public boolean isConectadaInternet() {
        return conectadaInternet;
    }

    public void setConectadaInternet(boolean conectadaInternet) {
        this.conectadaInternet = conectadaInternet;
    }

    public boolean isCalidad4KActiva() {
        return calidad4KActiva;
    }

    public void setCalidad4KActiva(boolean calidad4KActiva) {
        this.calidad4KActiva = calidad4KActiva;
    }

    public boolean isPermiteDescargaAutomatica() {
        return permiteDescargaAutomatica;
    }

    public void setPermiteDescargaAutomatica(boolean permiteDescargaAutomatica) {
        this.permiteDescargaAutomatica = permiteDescargaAutomatica;
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
        System.out.println("Cargando juego Xbox. Por favor espere");    }
    
    public void leerJuegoDigital(String nombreJuego) {
        System.out.println("Leyendo " + nombreJuego + " desde tienda");
    }
    
    
}
