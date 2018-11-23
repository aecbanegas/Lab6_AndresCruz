
package lab6_andrescruz;

public class Secuestro extends Delito{
    int dias;
    int edad_victima;

    public Secuestro(int dias, int edad_victima, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable, "Secuestro");
        this.dias = dias;
        this.edad_victima = edad_victima;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(int edad_victima) {
        this.edad_victima = edad_victima;
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
        return "Secuestro{" + "dias=" + dias + ", edad_victima=" + edad_victima + '}';
    }
    
}
