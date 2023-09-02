package com.mycompany.knn_3d;

import java.awt.Color;
import javax.swing.JFrame;
import org.math.plot.*;

public class KNN_3d {

    static double[] x = {1.5, 2.7, 3.2, 4.9, 5.3};
    static double[] y = {1.5, 2.7, 3.2, 4.9, 5.3};
    static double[] z = {1.0, 2.0, 3.0, 4.0, 5.0}; // Cambiado a un arreglo unidimensional

    public static void main(String[] args) {
        // create your PlotPanel (you can use it as a JPanel)
        Plot3DPanel plot = new Plot3DPanel();
        
        // add a scatter plot to the PlotPanel (points in 3D)
        plot.addScatterPlot("ejemplo", Color.red, x, y, z);

        // put the PlotPanel in a JFrame, as a JPanel
        JFrame frame = new JFrame("Plot Panel");
        frame.setContentPane(plot);
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

