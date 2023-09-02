package com.mycompany.knn_3d;

import java.awt.Color;

/**
 *
 * @author Alvaro
 */
public class Clase {

    objeto[] objetos;
    double[] x;
    double[] y;
    double[] z;
    String nom_clase;
    Color color;

    @Override
    public String toString() {
        return "Clase{" + "nom_clase=" + nom_clase + " con "+ objetos.length + " objetos en total";
    }

    public Clase(objeto[] objetos, Color color, String nombre) {
        this.objetos = objetos;
        this.color = color;
        this.nom_clase = nombre;
        setear_componentes();
    }

    public objeto[] getObjetos() {
        return objetos;
    }

    public void setObjetos(objeto[] objetos) {
        this.objetos = objetos;
    }

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getY() {
        return y;
    }

    public void setY(double[] y) {
        this.y = y;
    }

    public double[] getZ() {
        return z;
    }

    public void setZ(double[] z) {
        this.z = z;
    }

    public String getNom_clase() {
        return nom_clase;
    }

    public void setNom_clase(String nom_clase) {
        this.nom_clase = nom_clase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setear_componentes() {
        x = new double[objetos.length];
        y = new double[objetos.length];
        z = new double[objetos.length];

        for (int i = 0; i < objetos.length; i++) {
            x[i] = objetos[i].getX();
            y[i] = objetos[i].getY();
            z[i] = objetos[i].getZ();
        }
    }
}
