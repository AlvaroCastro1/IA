package principal;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Alvaro
 */
public class Objeto extends Thread {
    
    private JPanel panel;
    private String cluster;
    private Color color;
    private int x, y;
    private float distancia;
    int radio = 6;
    
    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Objeto{" + "panel=" + panel + ", cluster=" + cluster + ", color=" + color + ", x=" + x + ", y=" + y + ", distancia=" + distancia + ", radio=" + radio + '}';
    }

    public Objeto(JPanel panel, Color color, int x, int y) {
        this.panel = panel;
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public String getCluster() {
        return cluster;
    }

    public void setClase(String cluster) {
        this.cluster = cluster;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    

    public void run() {
        Graphics g = panel.getGraphics();
        g.setColor(color);
        g.fillOval(x - radio, y - radio, radio * 2, radio * 2);
    }
    
}
