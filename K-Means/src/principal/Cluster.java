package principal;

import java.awt.Color;
import java.util.ArrayList;
import principal.Objeto;

public class Cluster {

    Objeto centroide;
    ArrayList<Objeto> puntos;
    Color color_identificador;

    public Cluster(Objeto centroide) {
        this.centroide = centroide;
        this.puntos = new ArrayList<>();
    }

    public Color getColor_identificador() {
        return color_identificador;
    }

    public void setColor_identificador(Color color_identificador) {
        this.color_identificador = color_identificador;
    }

    public Objeto getCentroide() {
        return centroide;
    }

    public void setCentroide(Objeto centroide) {
        this.centroide = centroide;
    }

    public ArrayList<Objeto> getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList<Objeto> puntos) {
        this.puntos = puntos;
    }
}
