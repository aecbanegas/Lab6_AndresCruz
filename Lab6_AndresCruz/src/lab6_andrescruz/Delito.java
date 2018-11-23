package lab6_andrescruz;

public class Delito {
    String descripcion;
    String gravedad;
    String culpable;
    String tipo;

    public Delito(String descripcion, String gravedad, String culpable, String tipo) {
        this.descripcion = descripcion;
        this.gravedad = gravedad;
        this.culpable = culpable;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getCulpable() {
        return culpable;
    }

    public void setCulpable(String culpable) {
        this.culpable = culpable;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
