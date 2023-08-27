package principal;

import java.awt.Color;
import java.util.ArrayList;
import principal.Objeto;

public class Cluster {
    // lo representa un centoide
    Objeto centroide;
    // se le  los puntos mas cercanos
    ArrayList<Objeto> objetos_cluster;
    // tiene un color la clase o cluster
    Color color_identificador;

    public Cluster(Objeto centroide) {
        this.centroide = centroide;
        this.objetos_cluster = new ArrayList<>();
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

    public ArrayList<Objeto> getObjetos_cluster() {
        return objetos_cluster;
    }

    public void setObjetos_cluster(ArrayList<Objeto> objetos_cluster) {
        this.objetos_cluster = objetos_cluster;
    }
}
