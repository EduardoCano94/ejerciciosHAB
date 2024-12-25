package logica;

public class PlayStation extends Consola {
    private String norma;
    private boolean chipeadaONo;
    private double tamanioMemoryCard;

    public PlayStation(String norma, boolean chipeadaONo, double tamanioMemoryCard, String codigo_consola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        super(codigo_consola, nombre, empresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.chipeadaONo = chipeadaONo;
        this.tamanioMemoryCard = tamanioMemoryCard;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isChipeadaONo() {
        return chipeadaONo;
    }

    public void setChipeadaONo(boolean chipeadaONo) {
        this.chipeadaONo = chipeadaONo;
    }

    public double getTamanioMemoryCard() {
        return tamanioMemoryCard;
    }

    public void setTamanioMemoryCard(double tamanioMemoryCard) {
        this.tamanioMemoryCard = tamanioMemoryCard;
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
        System.out.println("Cargando juego PS2. Por favor espere");
    }
    
    public void leerDvd(String nombreJuego){
        System.out.println("Leyendo juego: " + nombreJuego);    
    }
    
    public void grabarEnMemoria(){
        System.out.println("El juego se ha guardado correctamente en la memory card");
    }
    
}
