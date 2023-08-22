package principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        setear_spiner();
    }

    // punto agregado
    static objeto objeto_agregado = null;

    private int numClases;
    private int numObjectosPorClase;

    private Random random = new Random();
    private static ArrayList<objeto> objetos = new ArrayList<>();
    private ArrayList<String> clases = new ArrayList<>();
    private ArrayList<Color> colores = new ArrayList<>();
    private ArrayList<Integer> x_area = new ArrayList<>();
    private ArrayList<Integer> y_area = new ArrayList<>();
    private ArrayList<Integer> x_area_long = new ArrayList<>();
    private ArrayList<Integer> y_area_long = new ArrayList<>();

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
        jLabel1 = new javax.swing.JLabel();
        sp_clases = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        sp_objetos = new javax.swing.JSpinner();
        btn_limpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sp_x_nuevo = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        sp_y_nuevo = new javax.swing.JSpinner();
        btn_agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sp_K = new javax.swing.JSpinner();
        btn_clasidicar = new javax.swing.JButton();
        btn_quitar = new javax.swing.JButton();

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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Clases");

        sp_clases.setModel(new javax.swing.SpinnerNumberModel(2, 2, null, 1));
        sp_clases.setFocusable(false);
        sp_clases.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_clasesStateChanged(evt);
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

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("X");

        sp_x_nuevo.setModel(new javax.swing.SpinnerNumberModel(10, 10, null, 1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Y");

        sp_y_nuevo.setModel(new javax.swing.SpinnerNumberModel(10, 10, null, 1));

        btn_agregar.setBackground(new java.awt.Color(250, 243, 176));
        btn_agregar.setText("Agregar");
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregarMouseExited(evt);
            }
        });
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        jLabel7.setText("K");

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

        btn_quitar.setBackground(new java.awt.Color(250, 243, 176));
        btn_quitar.setText("Quitar P");
        btn_quitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_quitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_quitarMouseExited(evt);
            }
        });
        btn_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_generar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sp_y_nuevo)
                                            .addComponent(sp_x_nuevo)))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_clasidicar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(sp_K))
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn_quitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_objetos)
                            .addComponent(sp_clases))
                        .addGap(6, 6, 6))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sp_clases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sp_objetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sp_x_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sp_y_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btn_quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_K, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_clasidicar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        numClases = (int) sp_clases.getValue();
        numObjectosPorClase = (int) sp_objetos.getValue();

        char letra = 'A';

        for (int i = 0; i < numClases; i++) {
            // generar nombre de clases
            String item = "clase " + letra;
            letra++;

            // generar colores
            Color color_random = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            clases.add(item);
            colores.add(color_random);

            // generar la posicion inicial para las areas
            x_area.add(random.nextInt(panel_obj.getWidth() - 30));
            y_area.add(random.nextInt(panel_obj.getHeight() - 30));

            // generar dimensiones diferentes para cada area
            x_area_long.add(random.nextInt(250));
            y_area_long.add(random.nextInt(250));

        }

        for (int i = 0; i < numClases; i++) {
            String clase = clases.get(i);
            Color color = colores.get(i);
            int x_pos = x_area.get(i);
            int y_pos = y_area.get(i);
            int x_long = x_area_long.get(i);
            int y_long = y_area_long.get(i);
            for (int j = 0; j < numObjectosPorClase; j++) {
                try {
                    // generar e imprimir los puntos en el panel
                    objeto o = new objeto(panel_obj, clase, color, x_pos, y_pos, x_long, y_long);
                    o.start();
                    o.join();
                    System.out.println(o);
                    objetos.add(o);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al generar las clases y objetos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
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
        panel_obj.removeAll();
        panel_obj.revalidate();
        panel_obj.repaint();

        objetos.clear();
        clases.clear();
        colores.clear();
        x_area.clear();
        y_area.clear();
        x_area_long.clear();
        y_area_long.clear();

        objeto_agregado = null;
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseEntered
        btn_agregar.setBackground(new java.awt.Color(249, 227, 163));
    }//GEN-LAST:event_btn_agregarMouseEntered

    private void btn_agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseExited
        btn_agregar.setBackground(new java.awt.Color(250, 243, 176));
    }//GEN-LAST:event_btn_agregarMouseExited

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if (objeto_agregado != null) {
            quitar_punto_agregado();
        }
        objeto_agregado = new objeto(panel_obj, Color.black, (int) sp_x_nuevo.getValue(), (int) sp_y_nuevo.getValue());

        try {
            objeto_agregado.start();
            objeto_agregado.join(); // Espera a que el hilo termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // objetos.add(onjeto_agregado);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_clasidicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clasidicarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clasidicarMouseEntered

    private void btn_clasidicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clasidicarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clasidicarMouseExited

    private void btn_clasidicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clasidicarActionPerformed
        System.out.println(objetos.size());
        // calcular distancia para cada uno de los objetos
        try {
            for (int i = 0; i < objetos.size(); i++) {
                Calculador_de_Distancia c = new Calculador_de_Distancia(objeto_agregado, objetos.get(i));
                c.start();
                c.join();
                objetos.get(i).setDistancia(c.getDistancia());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ordenar para ver cuales son los mas cercanos
        Collections.sort(objetos);

        /*for (int i = 0; i < objetos.size(); i++) {
            System.out.println(objetos.get(i));
        }*/
        // Agrega objetos a la lista votantes
        int k = (int) sp_K.getValue();
        // solo para hacer el empate
        //int k = 4;

        // TOMAR SOLO LOS n PRIMEROS OBJETOS y AÑADIRLOS A LOS BOTANTES
        ArrayList<objeto> votantes = new ArrayList<>();

        for (int i = 0; i < (int) k; i++) {
            // System.out.println(objetos.get(i));
            votantes.add(objetos.get(i));
            System.out.println("v: " + objetos.get(i));
        }

        // crear un nueva lista para buscar la ditancia promedio mas baja
        ArrayList<objeto> votantesSeleccionados = seleccionarVotantes(votantes, k);
        // en un diccionario se añade la clase y numero de las veces repetidas
        Map<String, Integer> frecuenciaClases = calcularFrecuenciaClases(votantesSeleccionados);
        // Encontrar la clase ganadora
        String claseGanadora = encontrarClaseGanadora(frecuenciaClases);

        if (claseGanadora != null) {
            System.out.println("¡La clase ganadora es: " + claseGanadora + "!");
            mostrarGanador(buscarColor(claseGanadora), claseGanadora, claseGanadora);
        } else {
            JOptionPane.showMessageDialog(null, "¡Hay un empate o no hay un ganador claro!", "Advertencia", JOptionPane.WARNING_MESSAGE);

            System.out.println("¡Hay un empate o no hay un ganador claro!");
            // se envia los k vecinos mas cercanos y se calcula su distancia promedio por clase
            encontrarClaseMenorDistanciaPromedio(votantesSeleccionados);
        }


    }//GEN-LAST:event_btn_clasidicarActionPerformed

    private void sp_clasesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_clasesStateChanged
        int max = (int) sp_clases.getValue() * (int) sp_objetos.getValue();
        SpinnerNumberModel spinnerModel_x = new SpinnerNumberModel(1, 1, max, 1);
        sp_K.setModel(spinnerModel_x);
    }//GEN-LAST:event_sp_clasesStateChanged

    private void sp_objetosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_objetosStateChanged
        int max = (int) sp_clases.getValue() * (int) sp_objetos.getValue();
        SpinnerNumberModel spinnerModel_x = new SpinnerNumberModel(1, 1, max, 1);
        sp_K.setModel(spinnerModel_x);
    }//GEN-LAST:event_sp_objetosStateChanged

    private void panel_objMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_objMouseClicked
        if (objeto_agregado != null) {
            quitar_punto_agregado();
        }

        int x = evt.getX();
        int y = evt.getY();
        objeto_agregado = new objeto(panel_obj, Color.black, x, y);

        try {
            objeto_agregado.start();
            objeto_agregado.join(); // Espera a que el hilo termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_panel_objMouseClicked

    private void btn_quitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quitarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_quitarMouseEntered

    private void btn_quitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quitarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_quitarMouseExited

    private void btn_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarActionPerformed
        if (objeto_agregado != null) {
            quitar_punto_agregado();
        }
    }//GEN-LAST:event_btn_quitarActionPerformed

    //
    private static ArrayList<objeto> seleccionarVotantes(ArrayList<objeto> objetos, int k) {
        ArrayList<objeto> votantesSeleccionados = new ArrayList<>();
        for (int i = 0; i < k && i < objetos.size(); i++) {
            votantesSeleccionados.add(objetos.get(i));
        }
        return votantesSeleccionados;
    }

    private static Map<String, Integer> calcularFrecuenciaClases(ArrayList<objeto> votantes) {
        Map<String, Integer> frecuenciaClases = new HashMap<>();
        for (objeto votante : votantes) {
            String clase = votante.getClase();
            frecuenciaClases.put(clase, frecuenciaClases.getOrDefault(clase, 0) + 1);
        }
        return frecuenciaClases;
    }

    private static String encontrarClaseGanadora(Map<String, Integer> frecuenciaClases) {
        // dentro del diccionario se va a buscar el numero mas grande y en caso de existir un empate 
        String claseGanadora = null;
        int frecuenciaMaxima = 0;
        boolean empate = false;

        // recorrer el diicionario
        for (Map.Entry<String, Integer> entrada : frecuenciaClases.entrySet()) {
            int frecuencia = entrada.getValue();

            if (frecuencia > frecuenciaMaxima) {
                frecuenciaMaxima = frecuencia;
                claseGanadora = entrada.getKey();
                // esiste una SOLA clase "favorita"
                empate = false;
            } else if (frecuencia == frecuenciaMaxima) {
                // esiste un empate
                empate = true;
            }
        }

        return (!empate && claseGanadora != null) ? claseGanadora : null;
    }

    private static void encontrarClaseMenorDistanciaPromedio(ArrayList<objeto> votantes) {
        // clase: distancia promedio
        Map<String, Float> distanciaTotalPorClase = new HashMap<>();
        // clase: frecuencia
        Map<String, Integer> cantidadObjetosPorClase = new HashMap<>();

        // Calcular la distancia total y la frecuencia
        for (objeto votante : votantes) {
            String clase = votante.getClase();
            float distancia = votante.getDistancia();
            System.out.println("-> " + clase + "\t d=" + distanciaTotalPorClase.getOrDefault(clase, 0f) + distancia);
            distanciaTotalPorClase.put(clase, distanciaTotalPorClase.getOrDefault(clase, 0f) + distancia);
            cantidadObjetosPorClase.put(clase, cantidadObjetosPorClase.getOrDefault(clase, 0) + 1);
        }

        // Calcular la distancia promedio y encontrar la distancia menor con la clase correspondiente
        float distanciaMenor = Float.MAX_VALUE; // Inicializar la DISTANCIA garantiza que cualquier valor calculado y comparado posteriormente será menor que este valor inicial. 
        String claseDistanciaMenor = null;

        // iterar por cada elemento del dicc
        for (Map.Entry<String, Float> entradaDistancia : distanciaTotalPorClase.entrySet()) {
            String clase = entradaDistancia.getKey();
            float distanciaTotal = entradaDistancia.getValue();
            int cantidadObjetos = cantidadObjetosPorClase.get(clase);

            float distanciaPromedio = distanciaTotal / cantidadObjetos;

            if (distanciaPromedio < distanciaMenor) {
                distanciaMenor = distanciaPromedio;
                claseDistanciaMenor = clase;
            }

            System.out.println("Clase: " + clase + ", Distancia Promedio: " + distanciaPromedio);
        }

        System.out.println("La clase con la distancia promedio más baja es: " + claseDistanciaMenor);
        System.out.println("Distancia Promedio más baja: " + distanciaMenor);
        mostrarGanador(buscarColor(claseDistanciaMenor), "La clase con la distancia promedio más baja es la " + claseDistanciaMenor + "= " + distanciaMenor, claseDistanciaMenor);

    }

    public static Color buscarColor(String clase) {

        objeto foundObj = null;
        for (objeto obj : objetos) {
            if (obj.getClase().equals(clase)) {
                foundObj = obj;
                break;
            }
        }
        return foundObj.getColor();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    public void setear_spiner() {
        SpinnerNumberModel spinnerModel_x = new SpinnerNumberModel(10, 10, panel_obj.getWidth(), 1);
        sp_x_nuevo.setModel(spinnerModel_x);

        // Deshabilita la edición directa en el campo de texto del JSpinner
        JSpinner.DefaultEditor spinnerEditor_x = (JSpinner.DefaultEditor) sp_x_nuevo.getEditor();
        spinnerEditor_x.getTextField().setEditable(false);

        SpinnerNumberModel spinnerModel_y = new SpinnerNumberModel(10, 10, panel_obj.getHeight(), 1);
        sp_y_nuevo.setModel(spinnerModel_y);

        JSpinner.DefaultEditor spinnerEditor_y = (JSpinner.DefaultEditor) sp_y_nuevo.getEditor();
        spinnerEditor_y.getTextField().setEditable(false);

        JSpinner.DefaultEditor spinnerEditor_x1 = (JSpinner.DefaultEditor) sp_clases.getEditor();
        spinnerEditor_x1.getTextField().setEditable(false);

        JSpinner.DefaultEditor spinnerEditor_y1 = (JSpinner.DefaultEditor) sp_objetos.getEditor();
        spinnerEditor_y1.getTextField().setEditable(false);

        SpinnerNumberModel spinnerModel_K = new SpinnerNumberModel(1, 1, panel_obj.getWidth(), 1);
        sp_K.setModel(spinnerModel_K);

    }

    public static void mostrarGanador(Color colorDeFondo, String mensaje, String clase) {

        Color colorDeTexto = Color.BLACK; // Color de texto personalizado

        JPanel panel = new JPanel();
        panel.setBackground(colorDeFondo);

        JLabel label = new JLabel(mensaje);
        label.setForeground(colorDeTexto);
        label.setFont(new Font("Arial", Font.PLAIN, 16));

        panel.add(label);

        JOptionPane.showMessageDialog(null, panel, "Clasificación", JOptionPane.PLAIN_MESSAGE);

        objeto o = new objeto(panel_obj, colorDeFondo, objeto_agregado.getX_objeto(), objeto_agregado.getY_objeto());
        o.start();

        o.setClase(mensaje);
        // contar como nuevo
        objetos.add(o);

        objeto_agregado = null;
    }

    public void quitar_punto_agregado() {
        objeto obj_temp = new objeto(panel_obj, Color.yellow, objeto_agregado.getX_objeto(), objeto_agregado.getY_objeto());
        obj_temp.clearCircle();
        objeto_agregado = null;
    }

    private static void drawLabeledGrid(JPanel panel) {
        panel.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int interval = 50; // Tamaño del intervalo de la cuadrícula
                int width = getWidth();
                int height = getHeight();

                g.setColor(Color.RED);

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
        });
        
        panel.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_clasidicar;
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_quitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel panel_obj;
    private javax.swing.JSpinner sp_K;
    private javax.swing.JSpinner sp_clases;
    private javax.swing.JSpinner sp_objetos;
    private javax.swing.JSpinner sp_x_nuevo;
    private javax.swing.JSpinner sp_x_punto;
    private javax.swing.JSpinner sp_y_nuevo;
    private javax.swing.JSpinner sp_y_punto;
    // End of variables declaration//GEN-END:variables

}

// clase dedicada a calcular la distancia entre el punto y cada punto de las clases
class Calculador_de_Distancia extends Thread {

    public objeto obj1, obj2;
    public float distancia;

    public Calculador_de_Distancia(objeto obj1, objeto obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void run() {
        int x1 = obj1.getX_objeto();
        int y1 = obj1.getY_objeto();
        int x2 = obj2.getX_objeto();
        int y2 = obj2.getY_objeto();

        int dx = x2 - x1;
        int dy = y2 - y1;

        this.setDistancia((float) Math.sqrt(dx * dx + dy * dy));
    }

}
