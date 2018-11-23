
package lab6_andrescruz;

public class Trafico extends Delito{
    String producto;
    double peso;

    public Trafico(String producto, double peso, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable, "Trafico");
        this.producto = producto;
        this.peso = peso;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    @Override
    public String toString() {
        return "Trafico{" + "producto=" + producto + ", peso=" + peso + '}';
    }
    
}
