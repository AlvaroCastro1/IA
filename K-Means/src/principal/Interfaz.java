package principal;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SpinnerNumberModel;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        setear_spiner();
        generar_10_color();
    }

    private int numObjetos;

    private static ArrayList<Objeto> objetos = new ArrayList<>();
    private static ArrayList<Objeto> centroides = new ArrayList<>();
    
    private static ArrayList<Color> colores_clusters = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        sp_x_punto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        sp_y_punto = new javax.swing.JSpinner();
        panel_obj = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_generar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sp_objetos = new javax.swing.JSpinner();
        btn_limpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sp_K = new javax.swing.JSpinner();
        btn_clasidicar = new javax.swing.JButton();

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("X ");

        sp_x_punto.setModel(new javax.swing.SpinnerNumberModel(2, 2, 5, 1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Y ");

        sp_y_punto.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_obj.setBackground(new java.awt.Color(236, 236, 236));
        panel_obj.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_obj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_obj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_objMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_objLayout = new javax.swing.GroupLayout(panel_obj);
        panel_obj.setLayout(panel_objLayout);
        panel_objLayout.setHorizontalGroup(
            panel_objLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        panel_objLayout.setVerticalGroup(
            panel_objLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(250, 243, 176));

        btn_generar.setBackground(new java.awt.Color(250, 243, 176));
        btn_generar.setText("Generar ");
        btn_generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_generarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_generarMouseExited(evt);
            }
        });
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Objetos");

        sp_objetos.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        sp_objetos.setFocusable(false);
        sp_objetos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_objetosStateChanged(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(250, 243, 176));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseExited(evt);
            }
        });
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel7.setText("K");

        sp_K.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btn_clasidicar.setBackground(new java.awt.Color(250, 243, 176));
        btn_clasidicar.setText("Clasificar");
        btn_clasidicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clasidicarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clasidicarMouseExited(evt);
            }
        });
        btn_clasidicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clasidicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_clasidicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(sp_K, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(sp_objetos)
                        .addGap(6, 6, 6))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sp_objetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_K, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(115, 115, 115)
                .addComponent(btn_clasidicar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_obj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_obj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed

        numObjetos = (int) sp_objetos.getValue();

        Objeto objeto_temporal = null;

        for (int i = 0; i < numObjetos; i++) {

            int x = Numero_Random(0, panel_obj.getWidth());
            int y = Numero_Random(0, panel_obj.getHeight());

            objeto_temporal = new Objeto(panel_obj, Color.black, x, y);

            objeto_temporal.start();

            objetos.add(objeto_temporal);

        }

    }//GEN-LAST:event_btn_generarActionPerformed

    private void btn_generarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generarMouseEntered
        btn_generar.setBackground(new java.awt.Color(249, 227, 163));
    }//GEN-LAST:event_btn_generarMouseEntered

    private void btn_generarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generarMouseExited
        btn_generar.setBackground(new java.awt.Color(250, 243, 176));
    }//GEN-LAST:event_btn_generarMouseExited

    private void btn_limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseEntered
        btn_limpiar.setBackground(new java.awt.Color(249, 227, 163));
    }//GEN-LAST:event_btn_limpiarMouseEntered

    private void btn_limpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseExited
        btn_limpiar.setBackground(new java.awt.Color(250, 243, 176));
    }//GEN-LAST:event_btn_limpiarMouseExited

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // limpia el panel por completo
        panel_obj.removeAll();
        panel_obj.revalidate();
        panel_obj.repaint();
        // quitar todos los objetos de la lista
        objetos.clear();
        centroides.clear();

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_clasidicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clasidicarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clasidicarMouseEntered

    private void btn_clasidicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clasidicarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clasidicarMouseExited

    private void btn_clasidicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clasidicarActionPerformed
        // K clusters
        int numClusters = (int) sp_K.getValue();
        
        // generar k colores para cada cluster
        for (int i = colores_clusters.size() -1; i < numClusters; i++) {
            colores_clusters.add(new Color( Numero_Random(0, 255), Numero_Random(0, 255), Numero_Random(0, 255) ));
        }
        
        ArrayList<Cluster> clusters = kMeans(objetos, centroides);

        for (int i = 0; i < clusters.size(); i++) {
            System.out.println("Cluster " + i + " Centroide: (" + clusters.get(i).centroide.getX() + ", " + clusters.get(i).centroide.getY() + ")");
            System.out.println("Puntos en el cluster:");
            for (Objeto punto : clusters.get(i).getObjetos_cluster()) {
                System.out.println("(" + punto.getX() + ", " + punto.getY() + ")");
            }
            System.out.println();
        }
    }//GEN-LAST:event_btn_clasidicarActionPerformed

    private void sp_objetosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_objetosStateChanged
        int max = (int) sp_K.getValue();
        SpinnerNumberModel spinnerModel_x = new SpinnerNumberModel(1, 1, max, 1);
        sp_K.setModel(spinnerModel_x);
    }//GEN-LAST:event_sp_objetosStateChanged

    private void panel_objMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_objMouseClicked

        int x = evt.getX();
        int y = evt.getY();
        Objeto objeto_agregado = new Objeto(panel_obj, Color.RED, x, y);

        try {
            objeto_agregado.start();
            objeto_agregado.join(); // Espera a que el hilo termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        centroides.add(objeto_agregado);

        sp_K.setValue(centroides.size());
    }//GEN-LAST:event_panel_objMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    public void setear_spiner() {

        //JSpinner.DefaultEditor spinnerEditor_y1 = (JSpinner.DefaultEditor) sp_objetos.getEditor();
        //spinnerEditor_y1.getTextField().setEditable(false);
        SpinnerNumberModel spinnerModel_K = new SpinnerNumberModel(1, 1, panel_obj.getWidth(), 1);
        sp_K.setModel(spinnerModel_K);

    }

    public static int Numero_Random(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("El primer número debe ser menor que el segundo número.");
        }

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

// esta funcion se encargara de hacer todo el proceso 
// para asignar a cada cluster los objetos mas cercanos

// devuelve un arrayL con los cluster
// cluster contiene una lista de objetos

// necesita a los objetos randoms
// y los centroides que ha ingresado el usuario


public void generar_10_color(){
    colores_clusters.add( Color.ORANGE );
    colores_clusters.add( Color.decode("#77dd77") );
    colores_clusters.add( Color.PINK );
    colores_clusters.add( Color.MAGENTA );
    colores_clusters.add( Color.decode("#590000") );
    colores_clusters.add( Color.LIGHT_GRAY );
    colores_clusters.add( Color.decode("#84b6f4") );
    colores_clusters.add( Color.gray );
    colores_clusters.add( Color.decode("#c5d084") );
    colores_clusters.add( Color.decode("#008a5f") );
}

public static ArrayList<Cluster> kMeans(ArrayList<Objeto> objetos_del_panel, ArrayList<Objeto> centroides_del_panel) {
        ArrayList<Cluster> clusters = new ArrayList<>();

        // Inicializar clusters con centroides iniciales
        for (int i = 0; i < centroides_del_panel.size(); i++) {
            // nuevo cluster                    recibe el centoide
            Cluster cluster_temp = new Cluster(centroides_del_panel.get(i));
            // color unico
            cluster_temp.setColor_identificador(colores_clusters.get(i));
            // lista de clusters
            clusters.add(cluster_temp);
        }

        // variable que verifica si ha llegado a una posible solucion al no haber cambios en el centroide final
        boolean convergencia = false;
        while (!convergencia) {
            // Asignar puntos a clusters
                // primero nos aseguramos de no mantener puntos guardados 
            for (Cluster cluster : clusters) {
                cluster.getObjetos_cluster().clear();
            }

            buscar_y_asignar_mas_cercano(clusters, objetos);

            // Calcular el promedio de X & Y
            convergencia = true;
            for (Cluster cluster : clusters) {
                double sumaX = 0, sumaY = 0;
                for (Objeto punto : cluster.getObjetos_cluster()) {
                    sumaX += punto.getX();
                    sumaY += punto.getY();
                }
                // crear un objeto para ver si existe una gran diferencia entre el old_centoride y new_centoride
                Objeto nuevoCentroide = new Objeto( (int) sumaX / cluster.getObjetos_cluster().size(), (int) sumaY / cluster.getObjetos_cluster().size());
                // va a regresar un DOUBLE pero al graficarlo solo ocupa la parte ENTERA
                if (calcularDistancia(nuevoCentroide, cluster.centroide) > 0.1) {
                    // exite una diferencia significativa, entonces se vuelve a repetir el proceso
                    convergencia = false;
                }
                cluster.setCentroide(nuevoCentroide);
                // pintar nuevo centroide

                Objeto temp = new Objeto(panel_obj, cluster.getColor_identificador(), cluster.getCentroide().getX(), cluster.getCentroide().getY());
                temp.setRadio(9);
                temp.start();
                // otro para 
                Objeto centro = new Objeto(panel_obj, Color.red, cluster.getCentroide().getX(), cluster.getCentroide().getY());
                centro.setRadio(2);
                centro.start();
            }
        }

        return clusters;
    }

    public static void buscar_y_asignar_mas_cercano(ArrayList<Cluster> clusters, ArrayList<Objeto> objetos ){

        for (Objeto objeto : objetos) {

            Cluster clusterMasCercano = null;

            double distanciaMinima = Double.MAX_VALUE;

            // comparamos el objeto actual con cada cluster
            for (Cluster cluster : clusters) {
                double distancia = calcularDistancia(objeto, cluster.getCentroide());
                // empezamos en 0
                if (distancia < distanciaMinima) {
                    // la distancia actual es mas pequeña que la anterior
                    distanciaMinima = distancia;
                    clusterMasCercano = cluster;
                }
            }
            clusterMasCercano.getObjetos_cluster().add(objeto);
            // pintamos los puntos del color de su cluster temporal
            Objeto temp = new Objeto(panel_obj, clusterMasCercano.getColor_identificador(), objeto.getX(), objeto.getY());
            temp.setRadio(5);
            temp.start();
            // hacemos una pausa pequeña para ver el movimiento de cada objeto
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static double calcularDistancia(Objeto p1, Objeto p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getX() - p2.getX();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clasidicar;
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel panel_obj;
    private javax.swing.JSpinner sp_K;
    private javax.swing.JSpinner sp_objetos;
    private javax.swing.JSpinner sp_x_punto;
    private javax.swing.JSpinner sp_y_punto;
    // End of variables declaration//GEN-END:variables

}
