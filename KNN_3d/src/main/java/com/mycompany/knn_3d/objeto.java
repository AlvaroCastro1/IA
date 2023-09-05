package com.mycompany.knn_3d;
// interfaz que permite que los objetos de una clase sean comparables entre sí
import java.awt.*;

public class objeto implements Comparable<objeto> {

    private String clase;
    private Color color;
    private double x, y, z;
    private double distancia;

    

    public objeto(String clase, Color color, double x, double y, double z) {
        this.clase = clase;
        this.color = color;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int compareTo(objeto otro) {
        return Double.compare(this.distancia, otro.distancia);
    }
    
    // negativo si distancia es menor que la distancia a comparar
    // cero si distancia es igual 
    // positivo si distancia es mayor

    @Override
    public String toString() {
        return "objeto{" + "clase=" + clase + ", (" + x + ", " + y +", " + z + "), distancia=" + distancia + '}';
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    
}
