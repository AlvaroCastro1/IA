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
    private int x_objeto, y_objeto;
    private int x_area, y_area, x_area_rango, y_area_rango;
    private float distancia;
    int radio = 6;

    public Objeto(JPanel panel, Color color, int x_objeto, int y_objeto) {
        this.panel = panel;
        this.color = color;
        this.x_objeto = x_objeto;
        this.y_objeto = y_objeto;
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

    public int getX_objeto() {
        return x_objeto;
    }

    public void setX_objeto(int x_objeto) {
        this.x_objeto = x_objeto;
    }

    public int getY_objeto() {
        return y_objeto;
    }

    public void setY_objeto(int y_objeto) {
        this.y_objeto = y_objeto;
    }

    public int getX_area() {
        return x_area;
    }

    public void setX_area(int x_area) {
        this.x_area = x_area;
    }

    public int getY_area() {
        return y_area;
    }

    public void setY_area(int y_area) {
        this.y_area = y_area;
    }

    public int getX_area_rango() {
        return x_area_rango;
    }

    public void setX_area_rango(int x_area_rango) {
        this.x_area_rango = x_area_rango;
    }

    public int getY_area_rango() {
        return y_area_rango;
    }

    public void setY_area_rango(int y_area_rango) {
        this.y_area_rango = y_area_rango;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }


    
    
    @Override
    public String toString() {
        return "objeto{" + "clase=" + cluster + ", color=" + color + ", posicion objeto=(" + x_objeto + ", " + y_objeto + ")  [" + x_area + " < x < " + (x_area + x_area_rango) + "]  [" + y_area + " < y < " + (y_area + y_area_rango) + " ] D= "+distancia+"}";
    }
    
    
    public void generar_posicion(){
        Random rand = new Random();
        int x = x_area + rand.nextInt(x_area_rango + 1);
        int y = y_area + rand.nextInt(x_area_rango + 1);
        
        // hay que asegurarnos que todos los objetos esten visibles en el panel
        if ( x >= panel.getWidth() ) {
            x = panel.getWidth() - radio;
        } 
        
                
        if ( y >= panel.getHeight() ) {
            y = panel.getHeight() - radio;
        } 
        this.x_objeto = x;
        this.y_objeto = y;   
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x_objeto, y_objeto, 50, 50); // tamaño del círculo
        g.setColor(Color.BLACK);
        // g.drawString(clase, x + 10, y + 30); // colocar el nombre de la clase
    }
    
    public void clearCircle() {
        Graphics g = panel.getGraphics();
        g.setColor(panel.getBackground()); // Usa el color de fondo del panel para borrar
        g.fillOval(x_objeto - radio, y_objeto - radio, radio * 2, radio * 2);
    }
    
    public void run() {
        Graphics g = panel.getGraphics();

        g.setColor(color);
        g.fillOval(x_objeto - radio, y_objeto - radio, radio * 2, radio * 2);
    }
    
}
