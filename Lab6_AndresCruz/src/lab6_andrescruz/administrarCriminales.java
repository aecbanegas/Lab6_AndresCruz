package lab6_andrescruz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarCriminales {

    private ArrayList<Criminal> listaPersona = new ArrayList();
    private File archivo = null;

    public administrarCriminales(String path) {
        archivo = new File(path);
    }

    public void setCriminal(Criminal p) {
        this.listaPersona.add(p);
    }

    public ArrayList<Criminal> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Criminal> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public File getArchivo() {
        return archivo;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Criminal criminal : listaPersona) {
                bw.write(criminal.getNombre() + ";");
                bw.write(criminal.getEdad() + ";");
                bw.write(criminal.getIdentidad() + ";");
                bw.write(criminal.getCelda() + ";");
                bw.write(criminal.getCondena() + ";");
                for (int i = 0; i < criminal.getDelitos().size(); i++) {
                    bw.write(criminal.getDelitos().get(i).getTipo() + ",");
                    switch (criminal.getDelitos().get(i).getTipo()) {
                        case "Robo":
                            if (i != criminal.getDelitos().size() - 1) {
                                bw.write(((Robo) criminal.getDelitos().get(i)).getNombre() + ",");
                                bw.write(((Robo) criminal.getDelitos().get(i)).getValor() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable() + ",");
                            } else {
                                bw.write(((Robo) criminal.getDelitos().get(i)).getNombre() + ",");
                                bw.write(((Robo) criminal.getDelitos().get(i)).getValor() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable());
                            }
//                            Delitos.add(new Robo(s2.next(), s2.nextDouble(), s2.next(), s2.next(), s2.next()));
                            break;
                        case "Asesinato":
                            if (i != criminal.getDelitos().size() - 1) {
                                bw.write(((Asesinato) criminal.getDelitos().get(i)).getArma() + ",");
                                bw.write(((Asesinato) criminal.getDelitos().get(i)).getVictimas() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable() + ",");
                            } else {
                                bw.write(((Asesinato) criminal.getDelitos().get(i)).getArma() + ",");
                                bw.write(((Asesinato) criminal.getDelitos().get(i)).getVictimas() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable());
                            }
//                            Delitos.add(new Asesinato(s2.next(), s2.nextInt(), s2.next(), s2.next(), s2.next()));
                            break;
                        case "Secuestro":
                            if (i != criminal.getDelitos().size() - 1) {
                                bw.write(((Secuestro) criminal.getDelitos().get(i)).getDias() + ",");
                                bw.write(((Secuestro) criminal.getDelitos().get(i)).getEdad_victima() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable() + ",");
//                                Delitos.add(new Secuestro(s2.nextInt(), s2.nextInt(), s2.next(), s2.next(), s2.next()));
                            } else {
                                bw.write(((Secuestro) criminal.getDelitos().get(i)).getDias() + ",");
                                bw.write(((Secuestro) criminal.getDelitos().get(i)).getEdad_victima() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable());
                            }
                            break;
                        case "Trafico":
                            if (i != criminal.getDelitos().size() - 1) {
                                bw.write(((Trafico) criminal.getDelitos().get(i)).getProducto() + ",");
                                bw.write(((Trafico) criminal.getDelitos().get(i)).getPeso() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable() + ",");
                            } else {
                                bw.write(((Trafico) criminal.getDelitos().get(i)).getProducto() + ",");
                                bw.write(((Trafico) criminal.getDelitos().get(i)).getPeso() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable());
                            }
                            break;
                        case "Violacion":
                            if (i != criminal.getDelitos().size() - 1) {
                                bw.write(((Violacion) criminal.getDelitos().get(i)).getEdad() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable() + ",");
                            } else {
                                bw.write(((Violacion) criminal.getDelitos().get(i)).getEdad() + ",");
                                bw.write(criminal.getDelitos().get(i).getDescripcion() + ",");
                                bw.write(criminal.getDelitos().get(i).getGravedad() + ",");
                                bw.write(criminal.getDelitos().get(i).getCulpable());
                            }
                            break;
                    }
                }
                bw.write(";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPersona = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersona.add(new Criminal(sc.next(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt()));
                    ArrayList<Delito> Delitos = listaPersona.get(listaPersona.size() - 1).getDelitos();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        String tipo = s2.next();
                        if (tipo.equals("Robo")) {
                            Delitos.add(new Robo(s2.next(), s2.nextDouble(), s2.next(), s2.next(), s2.next()));
                        }
                        if (tipo.equals("Secuestro")) {
                            Delitos.add(new Secuestro(s2.nextInt(), s2.nextInt(), s2.next(), s2.next(), s2.next()));
                        }
                        if (tipo.equals("Trafico")) {
                            Delitos.add(new Trafico(s2.next(), s2.nextDouble(), s2.next(), s2.next(), s2.next()));
                        }
                        if (tipo.equals("Violacion")) {
                            Delitos.add(new Violacion(s2.nextInt(), s2.next(), s2.next(), s2.next()));
                        }
                        if (tipo.equals("Asesinato")) {
                            Delitos.add(new Asesinato(s2.next(), s2.nextInt(), s2.next(), s2.next(), s2.next()));
                        }
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("no lo lee");
            }
            sc.close();
        }
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "lista=" + listaPersona;
    }

}
