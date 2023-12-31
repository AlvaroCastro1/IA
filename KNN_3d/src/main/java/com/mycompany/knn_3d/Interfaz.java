package com.mycompany.knn_3d;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        generar_10_colores();
    }

    // punto agregado
    static objeto objeto_agregado = null;

    private int numClases;
    private int numObjectosPorClase;

    private Random random = new Random();

    private ArrayList<String> nombre_clases = new ArrayList<>();
    private ArrayList<Color> colores = new ArrayList<>();

    private ArrayList<Integer> x_area = new ArrayList<>();
    private ArrayList<Integer> y_area = new ArrayList<>();
    private ArrayList<Integer> x_area_long = new ArrayList<>();
    private ArrayList<Integer> y_area_long = new ArrayList<>();

    private static ArrayList<objeto> objetos = new ArrayList<>();

    private double a = 0.0;
    private double b = 16.0;

    public static Clase[] clases;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        sp_x_punto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        sp_y_punto = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        btn_generar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sp_clases = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        sp_objetos = new javax.swing.JSpinner();
        btn_limpiar = new javax.swing.JButton();
        sp_x_nuevo = new javax.swing.JSpinner();
        sp_y_nuevo = new javax.swing.JSpinner();
        btn_agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sp_K = new javax.swing.JSpinner();
        btn_clasidicar = new javax.swing.JButton();
        sp_z_nuevo = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_generar_csv = new javax.swing.JButton();
        panel_obj_3D = new org.math.plot.Plot3DPanel();

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("X ");

        sp_x_punto.setModel(new javax.swing.SpinnerNumberModel(2, 2, 5, 1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Y ");

        sp_y_punto.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        sp_x_nuevo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        sp_y_nuevo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

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

        sp_z_nuevo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Z");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Y");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("X");

        btn_generar_csv.setBackground(new java.awt.Color(250, 243, 176));
        btn_generar_csv.setText("Leer");
        btn_generar_csv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_generar_csvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_generar_csvMouseExited(evt);
            }
        });
        btn_generar_csv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_csvActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_objetos)
                            .addComponent(sp_clases))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp_z_nuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sp_y_nuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sp_x_nuevo)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_clasidicar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(sp_K, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_generar_csv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16))))
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
                .addGap(18, 18, 18)
                .addComponent(btn_generar_csv, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_x_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_y_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_z_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_K, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_clasidicar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_obj_3D, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_obj_3D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // Limpia el aaraylist de clases
        clases = null;

        // remueve todos los graficos del panel
        panel_obj_3D.removeAllPlots();

        // obtiene el num de clases y objetos por clase
        numClases = (int) sp_clases.getValue();
        numObjectosPorClase = (int) sp_objetos.getValue();

        // reserva de memoria con del arreglo de clases
        clases = new Clase[numClases];

        // generar nombres y colores para las clases
        char letra = 'A';
        for (int i = 0; i < numClases; i++) {
            // Genera nombre de clases
            String item = "clase " + letra;
            letra++;

            // genera colores aleatorios para las clases
            Color color_random = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            nombre_clases.add(item);
            colores.add(color_random);
        }

        // llenar objetos para cada clase
        for (int i = 0; i < numClases; i++) {
            String clase = nombre_clases.get(i);
            Color color = colores.get(i);

            // arreglo para asignar puntos a una clase
            objeto[] temp_objetos = new objeto[numObjectosPorClase];
            for (int j = 0; j < numObjectosPorClase; j++) {
                // genera objetos y los agrega a la lista de objetos
                objeto o = new objeto(clase, color, generarAleatorioEntre(a, b), generarAleatorioEntre(a, b), generarAleatorioEntre(a, b));
                temp_objetos[j] = o;
                //System.out.println(o);
                // añadir objeto a la lista de objetos
                objetos.add(o);
            }

            // llena la clase actual con los objetos y la agrega al arreglo de clases
            Clase clase_temp = new Clase(temp_objetos, color, clase);
            System.out.println("Se agregó " + clase_temp);
            clases[i] = clase_temp;
        }

        // genera puntos en el panel para cada clase
        for (int i = 0; i < clases.length; i++) {
            //System.out.println(clases[i].getNom_clase());
            panel_obj_3D.addScatterPlot(clases[i].getNom_clase(), clases[i].getColor(), clases[i].getX(), clases[i].getY(), clases[i].getZ());
        }

    }//GEN-LAST:event_btn_generarActionPerformed

    public static double generarAleatorioEntre(double min, double max) {
        Random rand = new Random();
        // n = min + (random * (max - min))
        double numeroAleatorio = min + (rand.nextDouble() * (max - min));
        return numeroAleatorio;
    }

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

        //colores.clear();
        x_area.clear();
        y_area.clear();
        x_area_long.clear();
        y_area_long.clear();

        objeto_agregado = null;

        clases = null;

        //panel_obj_3D.removeAll();
        panel_obj_3D.removeAllPlots();

        //limpiar terminal
        limpiarConsola();

        nombre_clases.clear();

        objetos.clear();


    }//GEN-LAST:event_btn_limpiarActionPerformed

    /*
    https://www.educative.io/answers/get-os-version-name-architecture-and-system-properties-in-java
    https://www.javatpoint.com/java-processbuilder-example
     */
    public static void limpiarConsola() {
        String sistemaOperativo = System.getProperty("os.name").toLowerCase();

        try {
            Process proceso;

            if (sistemaOperativo.contains("win")) {
                // Windows
                proceso = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
            } else if (sistemaOperativo.contains("nix") || sistemaOperativo.contains("nux")
                    || sistemaOperativo.contains("mac")) {
                // Unix/Linux/macOS
                proceso = new ProcessBuilder("clear").inheritIO().start();
            } else {
                // Sistema operativo desconocido
                System.out.println("No se puede limpiar la consola en este sistema operativo.");
                return;
            }

            proceso.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void btn_agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseEntered
        btn_agregar.setBackground(new java.awt.Color(249, 227, 163));
    }//GEN-LAST:event_btn_agregarMouseEntered

    private void btn_agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseExited
        btn_agregar.setBackground(new java.awt.Color(250, 243, 176));
    }//GEN-LAST:event_btn_agregarMouseExited

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        //hacer dible cast 
        // a int para obtener el valor de el spiner
        // y despues a double para graficar
        objeto_agregado = new objeto(null, Color.BLACK, (int) sp_x_nuevo.getValue(), (int) sp_y_nuevo.getValue(), (int) sp_z_nuevo.getValue());

        double[] x = {(double) objeto_agregado.getX()};
        double[] y = {(double) objeto_agregado.getY()};
        double[] z = {(double) objeto_agregado.getZ()};

        panel_obj_3D.addScatterPlot("nuevo", Color.black, x, y, z);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_clasidicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clasidicarMouseEntered
        btn_clasidicar.setBackground(new java.awt.Color(249, 227, 163));
    }//GEN-LAST:event_btn_clasidicarMouseEntered

    private void btn_clasidicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clasidicarMouseExited
        btn_clasidicar.setBackground(new java.awt.Color(250, 243, 176));
    }//GEN-LAST:event_btn_clasidicarMouseExited

    private void btn_clasidicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clasidicarActionPerformed
        // System.out.println(objetos.size());

        // calcular distancia para cada uno de los objetos
        try {
            for (int i = 0; i < objetos.size(); i++) {
                Calculador_de_Distancia c = new Calculador_de_Distancia(objeto_agregado, objetos.get(i));
                c.start();
                c.join();
                objetos.get(i).setDistancia((float) (double) c.getDistancia());
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

        // TOMAR SOLO LOS n PRIMEROS OBJETOS y AÑADIRLOS A LOS VOTANTES
        ArrayList<objeto> votantes = new ArrayList<>();

        for (int i = 0; i < (int) k; i++) {
            // System.out.println(objetos.get(i));
            votantes.add(objetos.get(i));
            System.out.println("votante #" + i + ": " + objetos.get(i));
        }

        // crear un nueva lista para buscar la ditancia promedio mas baja
        //ArrayList<objeto> votantesSeleccionados = seleccionarVotantes(votantes, k);

        // en un diccionario se añade la clase y numero de las veces repetidas
        Map<String, Integer> frecuenciaClases = calcularFrecuenciaClases(votantes);
        // Encontrar la clase ganadora
        String claseGanadora = encontrarClaseGanadora(frecuenciaClases);

        if (claseGanadora != null) {
            System.out.println("¡La clase ganadora es: " + claseGanadora + "!");
            mostrarGanador(buscarColor(claseGanadora), claseGanadora, claseGanadora);
            // volver a pintar
            double[] x = {objeto_agregado.getX()};
            double[] y = {objeto_agregado.getY()};
            double[] z = {objeto_agregado.getZ()};

            borrar_y_pintar();
            
            objeto nuevo = objeto_agregado;
            nuevo.setClase(claseGanadora);
            objetos.add(nuevo);
            
            panel_obj_3D.addScatterPlot("Ganadora " + claseGanadora, buscarColor(claseGanadora), x, y, z);

        } else {
            JOptionPane.showMessageDialog(null, "¡No hay un ganador claro!", "Advertencia", JOptionPane.WARNING_MESSAGE);

            // se envia los k vecinos mas cercanos y se calcula su distancia promedio por clase
            encontrarClaseMenorDistanciaPromedio(votantes);
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

    private void btn_generar_csvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generar_csvMouseEntered
        btn_generar_csv.setBackground(new java.awt.Color(249, 227, 163));
    }//GEN-LAST:event_btn_generar_csvMouseEntered

    private void btn_generar_csvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generar_csvMouseExited
        btn_generar_csv.setBackground(new java.awt.Color(250, 243, 176));
    }//GEN-LAST:event_btn_generar_csvMouseExited

    private void btn_generar_csvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_csvActionPerformed

        // cuadro para seleccionar un archivo cvs
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccione un archivo CSV");

        // establecer ruta inicial
        String initialDirectoryPath = "C:\\Users\\Hp245-User\\Documents\\NetBeansProjects\\IA\\KNN\\";
        File initialDirectory = new File(initialDirectoryPath);
        fileChooser.setCurrentDirectory(initialDirectory);

        // respuesta del cuadro para esperar a que el usuario seleccione un archivo
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // obtener la ruta del archivo
            String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();

            // limpiar la lista de clases
            clases = null;

            // limpiar el panel
            panel_obj_3D.removeAllPlots();

            // solo seran 3 clases de la base de datos iris y 50 elem
            numClases = 3;
            numObjectosPorClase = 50;

            // inicializar el arreglo de clases
            clases = new Clase[numClases];

            // generar nombres y colores para las clases
            char letra = 'A';
            for (int i = 0; i < numClases; i++) {
                // Generar nombre de clases
                String item = "clase " + letra;
                letra++;

                // Generar colores aleatorios para las clases y agregarlos a las listas
                Color color_random = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                nombre_clases.add(item);
                colores.add(color_random);
            }

            // como el archvio empieza en la fila uno y son 50 ...
            int inicio = 1;
            int fin = 51;

            // llenar objetos para cada clase
            for (int i = 0; i < numClases; i++) {
                String clase = nombre_clases.get(i);
                Color color = colores.get(i);

                // leer datos de las columnas x, y, z desde el archivo CSV
                // leerColumna ( archivo , fila de inicio, fila de fin, columna)
                // regresa un arreglo con los datos
                double[] x = leerColumna(selectedFilePath, inicio, fin, 1);
                double[] y = leerColumna(selectedFilePath, inicio, fin, 2);
                double[] z = leerColumna(selectedFilePath, inicio, fin, 3);

                // arreglo para asignar puntos a cada clase
                objeto[] temp_objetos = new objeto[numObjectosPorClase];
                for (int j = 0; j < numObjectosPorClase; j++) {
                    // generar objetos y agregarlos a la lista de objetos
                    objeto o = new objeto(clase, color, x[j], y[j], z[j]);
                    temp_objetos[j] = o;
                    //System.out.println(o);
                    objetos.add(o);
                }

                // llenar el arreglo con clases
                Clase clase_temp = new Clase(temp_objetos, color, clase);
                //System.out.println("Se agregó " + clase_temp);
                clases[i] = clase_temp;

                // incrementar para la siguiente clase
                inicio += 50;
                fin += 50;
            }

            // generar puntos cada clase
            for (int i = 0; i < clases.length; i++) {
                System.out.println(clases[i].getNom_clase());
                panel_obj_3D.addScatterPlot(clases[i].getNom_clase(), clases[i].getColor(), clases[i].getX(), clases[i].getY(), clases[i].getZ());
            }
        }
    }//GEN-LAST:event_btn_generar_csvActionPerformed

    /* https://youtu.be/tD2raUxQRbc */
    private static double[] leerColumna(String nombreArchivoCSV, int numeroInicio, int numeroFin, int numeroColumna) {
        ArrayList<Double> listaDatos = new ArrayList<>(); // Arreglo a devolver

        try {
            // lector de CSV
            CSVReader lectorCSV = new CSVReader(new FileReader(nombreArchivoCSV));

            // leer cada fila
            String[] siguienteLinea;
            int numeroFila = 1;
            while ((siguienteLinea = lectorCSV.readNext()) != null && numeroFila <= numeroFin) {
                if (numeroFila >= numeroInicio) {
                    try {
                        double valorDouble = Double.parseDouble(siguienteLinea[numeroColumna - 1]); // Restar 1 porque los índices comienzan en 0
                        listaDatos.add(valorDouble);
                    } catch (NumberFormatException e) {
                        // ignorar valores que no sean double
                    }
                }
                numeroFila++;
            }

            // cerrar lector
            lectorCSV.close();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        // convertir de Array<double>a un arreglo de double
        double[] arregloDatos = new double[listaDatos.size()];
        for (int i = 0; i < listaDatos.size(); i++) {
            arregloDatos[i] = listaDatos.get(i);
        }
        return arregloDatos;
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
        // dicc que almacenará la distancia promedio por clase
        Map<String, Double> distanciaTotalPorClase = new HashMap<>();
        // dicc que almacenará la cantidad de objetos por clase
        Map<String, Integer> cantidadObjetosPorClase = new HashMap<>();

        // Calcular la distancia total y la frecuencia por clase
        for (objeto votante : votantes) {
            String clase = votante.getClase();
            double distancia = votante.getDistancia();
            
            // suma acumulativa de distancias / count
            
            distanciaTotalPorClase.put(clase, distanciaTotalPorClase.getOrDefault(clase, 0.0) + distancia);
            cantidadObjetosPorClase.put(clase, cantidadObjetosPorClase.getOrDefault(clase, 0) + 1);
        }

        // Calcular la distancia promedio y encontrar la distancia menor con la clase correspondiente
        double distanciaMenor = 0.0;
        //double distanciaMenor = Double.MAX_VALUE; 
        /*https://stackoverflow.com/questions/16146219/java-double-max-value*/
        String claseDistanciaMenor = null;

        for (Map.Entry<String, Double> entradaDistancia : distanciaTotalPorClase.entrySet()) {
            String clase = entradaDistancia.getKey();
            double distanciaTotal = entradaDistancia.getValue();
            int cantidadObjetos = cantidadObjetosPorClase.get(clase);

            double distanciaPromedio = distanciaTotal / cantidadObjetos;

            if (distanciaPromedio < distanciaMenor) {
                distanciaMenor = distanciaPromedio;
                claseDistanciaMenor = clase;
            }

            System.out.println("Clase: " + clase + ", Distancia Promedio: " + distanciaPromedio);
        }

        // Imprimir la clase con la distancia promedio más baja y la distancia promedio
        System.out.println("La clase con la distancia promedio más baja es: " + claseDistanciaMenor);
        System.out.println("Distancia Promedio más baja: " + distanciaMenor);
        mostrarGanador(buscarColor(claseDistanciaMenor), "La clase con la distancia promedio más baja es la " + claseDistanciaMenor + "= " + distanciaMenor, claseDistanciaMenor);
        double[] x = {objeto_agregado.getX()};
        double[] y = {objeto_agregado.getY()};
        double[] z = {objeto_agregado.getZ()};

        // borrar y pintar el gráfico 3D con la clase ganadora
        borrar_y_pintar();
        panel_obj_3D.addScatterPlot("Ganadora " + claseDistanciaMenor, buscarColor(claseDistanciaMenor), x, y, z);
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
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

        objeto o = new objeto(clase, colorDeFondo, objeto_agregado.getX(), objeto_agregado.getY(), objeto_agregado.getZ());

        o.setClase(mensaje);
        // contar como nuevo
        objetos.add(o);

        //objeto_agregado = null;
    }

    public static void borrar_y_pintar() {
        panel_obj_3D.removeAllPlots();
        for (Clase clase : clases) {
            panel_obj_3D.addScatterPlot(clase.getNom_clase(), clase.getColor(), clase.getX(), clase.getY(), clase.getZ());
        }
    }

    public void generar_10_colores() {
        colores.add(Color.decode("#FF0000"));
        colores.add(Color.decode("#0000FF"));
        colores.add(Color.decode("#008000"));
        colores.add(Color.decode("#FFFF00"));
        colores.add(Color.decode("#FFA500"));
        colores.add(Color.decode("#FF00FF"));
        colores.add(Color.decode("#00FFFF"));
        colores.add(Color.decode("#FFC0CB"));
        colores.add(Color.decode("#800080"));
        colores.add(Color.decode("#40E0D0"));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_clasidicar;
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_generar_csv;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private static org.math.plot.Plot3DPanel panel_obj_3D;
    private javax.swing.JSpinner sp_K;
    private javax.swing.JSpinner sp_clases;
    private javax.swing.JSpinner sp_objetos;
    private javax.swing.JSpinner sp_x_nuevo;
    private javax.swing.JSpinner sp_x_punto;
    private javax.swing.JSpinner sp_y_nuevo;
    private javax.swing.JSpinner sp_y_punto;
    private javax.swing.JSpinner sp_z_nuevo;
    // End of variables declaration//GEN-END:variables

}

// clase dedicada a calcular la distancia entre el punto y cada punto de las clases
// distancia euclidiana
class Calculador_de_Distancia extends Thread {

    public objeto obj1, obj2;
    public double distancia;

    public Calculador_de_Distancia(objeto obj1, objeto obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void run() {
        double x1 = obj1.getX();
        double y1 = obj1.getY();
        double z1 = obj1.getZ();

        double x2 = obj2.getX();
        double y2 = obj2.getY();
        double z2 = obj2.getZ();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double dz = z2 - z1;

        this.setDistancia(Math.sqrt(dx * dx + dy * dy + dz * dz));
    }
}
