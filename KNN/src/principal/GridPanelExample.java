import javax.swing.*;
import java.awt.*;

public class GridPanelExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Panel con Cuadrícula Etiquetada");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel_obj = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    int interval = 50; // Tamaño del intervalo de la cuadrícula
                    int width = getWidth();
                    int height = getHeight();
                    setBackground(Color.white);

                    // Dibujar líneas horizontales y agregar etiquetas
                    for (int y = 0; y <= height; y += interval) {
                        g.drawLine(0, y, width, y);
                        g.drawString(Integer.toString(y), 5, y + 12); // Etiqueta en el lado izquierdo
                    }

                    // Dibujar líneas verticales y agregar etiquetas
                    for (int x = 0; x <= width; x += interval) {
                        g.drawLine(x, 0, x, height);
                        g.drawString(Integer.toString(x), x + 5, 12); // Etiqueta en la parte superior
                    }
                }
            };

            frame.add(panel_obj);
            frame.setSize(700, 450);
            frame.setVisible(true);
        });
    }
}
