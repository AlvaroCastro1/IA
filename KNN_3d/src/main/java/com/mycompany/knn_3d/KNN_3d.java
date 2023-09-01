package com.mycompany.knn_3d;

import javax.swing.JFrame;
import org.math.plot.*;

/**
 *
 * @author Alvaro
 */
public class KNN_3d {

    static double[] x = {1.5, 2.7, 3.2, 4.9, 5.3};
    static double[] y = {1.5, 2.7, 3.2, 4.9, 5.3};

    public static void main(String[] args) {
        // create your PlotPanel (you can use it as a JPanel)
        Plot2DPanel plot = new Plot2DPanel();

        // add a line plot to the PlotPanel
        plot.addLinePlot("my plot", x, y);

        // put the PlotPanel in a JFrame, as a JPanel
        JFrame frame = new JFrame("a plot panel");
        frame.setContentPane(plot);
        frame.setVisible(true);
    }
}
