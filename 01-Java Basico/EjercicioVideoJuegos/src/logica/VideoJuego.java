package logica;

public class VideoJuego {
    String codigo;
    String titulo;
    String consola;
    int cantidadJugadores; 
    String categoría;

    public VideoJuego() {
    }

    public VideoJuego(String codigo, String titulo, String consola, int cantidadJugadores, String categoría) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadJugadores = cantidadJugadores;
        this.categoría = categoría;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + "codigo=" + codigo + ", titulo=" + titulo + ", consola=" + consola + ", cantidadJugadores=" + cantidadJugadores + ", categor\u00eda=" + categoría + '}';
    }
    
    
    
    
    
}
