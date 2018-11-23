
package lab6_andrescruz;

public class Asesinato extends Delito{
    String arma;
    int victimas;

    public Asesinato(String arma, int victimas, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable, "Asesinato");
        this.arma = arma;
        this.victimas = victimas;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVictimas() {
        return victimas;
    }

    public void setVictimas(int victimas) {
        this.victimas = victimas;
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
        return "Asesinato{" + "arma=" + arma + ", victimas=" + victimas + '}';
    }
    
    
    
}
