
package lab6_andrescruz;

import java.util.ArrayList;

public class Criminal {
    String nombre;
    int edad;
    String identidad;
    int celda;
    ArrayList<Delito>delitos=new ArrayList();
    int condena;

    public Criminal(String nombre, int edad, String identidad, int celda, int condena) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.celda = celda;
        this.condena = condena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public int getCelda() {
        return celda;
    }

    public void setCelda(int celda) {
        this.celda = celda;
    }

    public ArrayList<Delito> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<Delito> delitos) {
        this.delitos = delitos;
    }

    public int getCondena() {
        return condena;
    }

    public void setCondena(int condena) {
        this.condena = condena;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
