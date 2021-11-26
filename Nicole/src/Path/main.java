package Path;

import Logic.Grafics;
import Logic.Paint;
import Logic.Dijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose H Elel
 */
public class main extends javax.swing.JFrame {

    private int Numerotope = 0;//Numero de nodos 
    
    Grafics arboles = new Grafics();

    public static void PintarFiguras(int tope, Grafics arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    Paint.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            Paint.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    public main() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtKMAcumulados = new javax.swing.JTextArea();
        BuscarCamino = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JButton();
        ImgMapa = new javax.swing.JLabel();
        kmRecorridos2 = new javax.swing.JLabel();
        EleccionOrigen = new javax.swing.JComboBox<>();
        EleccionDestino = new javax.swing.JComboBox<>();
        txtDestino = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        MostrarCaminos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Path Finder");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 115, 223));
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtKMAcumulados.setColumns(20);
        txtKMAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKMAcumulados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, 240, -1));

        BuscarCamino.setBackground(new java.awt.Color(153, 153, 153));
        BuscarCamino.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        BuscarCamino.setText("Buscar");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 100, 30));

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Exit");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 80, 40));

        ImgMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mapa_canton1.png"))); // NOI18N
        jPanel1.add(ImgMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 510));

        kmRecorridos2.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos2.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        kmRecorridos2.setText("La mejor ruta es:");
        kmRecorridos2.setOpaque(true);
        getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, -1, -1));

        EleccionOrigen.setBackground(new java.awt.Color(102, 102, 102));
        EleccionOrigen.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Alajuelita", "Aserrí", "Barbacoas", "Ciudad Colón", "Dota", "Desamparados", "Escazú", "Turrubares", "Hatillo", "Pérez Zeledón", "Vázquez de Coronado", "Tarrazu ", "Santa Ana", "Santiago", "Acosta", " " }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 200, -1));

        EleccionDestino.setBackground(new java.awt.Color(153, 153, 153));
        EleccionDestino.setEditable(true);
        EleccionDestino.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Alajuelita", "Aserrí", "Barbacoas", "Ciudad Colón", "Dota", "Desamparados", "Escazú", "Turrubares", "Hatillo", "Pérez Zeledón", "Vázquez de Coronado", "Tarrazu ", "Santa Ana", "Santiago", "Acosta", " " }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));

        txtDestino.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        txtDestino.setText("Destiny:");
        txtDestino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        txtOrigen.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        txtOrigen.setText("Origin:");
        txtOrigen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        MostrarCaminos.setBackground(new java.awt.Color(51, 51, 51));
        MostrarCaminos.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jButton1.setText("Information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 255, 102));
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mapa1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 630, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();

        if ("Barbacoas".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("Santiago".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Aserrí".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("Ciudad Colón".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("Santa Ana".equals(nombreOrigen)) {
            origen = 4;
        }
        if ("Escazú".equals(nombreOrigen)) {
            origen = 5;
        }
        if ("Vázquez de Coronado".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("Pérez Zeledón".equals(nombreOrigen)) {
            origen = 7;
        }
        if ("Acosta".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("Alajuelita".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("Hatillo".equals(nombreOrigen)) {
            origen = 10;
        }
        if ("Dota".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("Turrubares".equals(nombreOrigen)) {
            origen = 12;
        }
        if ("Tarrazu".equals(nombreOrigen)) {
            origen = 13;
        }
        if ("Desamparados".equals(nombreOrigen)) {
            origen = 14;
        }
       
        
// Destinos 
         if ("Barbacoas".equals(nombreDestino)) {
            origen = 0;
        }
        if ("Santiago".equals(nombreDestino)) {
            origen = 1;
        }
        if ("Aserrí".equals(nombreDestino)) {
            origen = 2;
        }
        if ("Ciudad Colón".equals(nombreDestino)) {
            origen = 3;
        }
        if ("Santa Ana".equals(nombreDestino)) {
            origen = 4;
        }
        if ("Escazú".equals(nombreDestino)) {
            origen = 5;
        }
        if ("Vázquez de Coronado".equals(nombreDestino)) {
            origen = 6;
        }
        if ("Pérez Zeledón".equals(nombreDestino)) {
            origen = 7;
        }
        if ("Acosta".equals(nombreDestino)) {
            origen = 8;
        }
        if ("Alajuelita".equals(nombreDestino)) {
            origen = 9;
        }
        if ("Hatillo".equals(nombreDestino)) {
            origen = 10;
        }
        if ("Dota".equals(nombreDestino)) {
            origen = 11;
        }
        if ("Turrubares".equals(nombreDestino)) {
            origen = 12;
        }
        if ("Tarrazu".equals(nombreDestino)) {
            origen = 13;
        }
        if ("Desamparados".equals(nombreDestino)) {
            origen = 14;
        }   

        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
            txtKMAcumulados.setText("Intenta de nuevo!!");
            txtKMAcumulados.setEnabled(false);
            txtKMAcumulados.setForeground(Color.RED);

        } else {
            Dijkstra Dijkstra = new Dijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("No hay ningun error :)");
            txtKMAcumulados.setForeground(Color.BLUE);
            txtKMAcumulados.setEnabled(false);
            
           // kmRecorridos.setText(Dijkstra.getAcumulado() + " KM");
        }


    }//GEN-LAST:event_BuscarCaminoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        EleccionOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);
        txtKMAcumulados.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());

        int Matriz[][] = {
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        double coe[][] = {
            {0, 57.4, 0, 0, 147, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {57.4, 0, 0, 0, 0, 69.1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 55.6, 0, 0, 0, 0, 0, 0, 26.4, 0, 0, 85.1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 71.8, 0, 0, 0, 0, 0, 0, 0, 0, 26},
            {147, 0, 0, 0, 0, 0, 0, 0, 0, 0, 327.4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 69.1, 0, 0, 0, 0, 0, 0, 93.3, 0, 0, 86.5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 71.3},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 158, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 61.7, 0, 0, 0, 0, 0, 0, 42.7, 0, 85.5, 0, 95.3, 0, 0},
            {0, 0, 55.6, 0, 0, 93.3, 0, 61.7, 0, 0, 0, 0, 0, 0, 0, 45.7, 0, 82.3, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 109, 0, 0, 0, 86, 0},
            {0, 0, 0, 0, 327.4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 116.7},
            {0, 0, 0, 0, 0, 86.5, 0, 0, 0, 0, 0, 0, 56.1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 71.8, 0, 0, 0, 0, 0, 0, 0, 56.1, 0, 0, 0, 0, 0, 70.5, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 86.9, 0, 50.6, 0, 76.3, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 86.9, 0, 0, 0, 0, 0, 54.9, 0, 0},
            {0, 0, 26, 0, 0, 0, 0, 42.7, 45.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 109, 0, 0, 0, 50.6, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 85.5, 82.3, 0, 0, 0, 70.5, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 85.1, 0, 0, 0, 158, 0, 0, 0, 0, 0, 0, 76.3, 0, 0, 0, 0, 0, 0, 53.7, 0},
            {0, 0, 0, 0, 0, 0, 0, 95.3, 0, 0, 0, 0, 0, 0, 54.9, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 86, 0, 0, 0, 0, 0, 0, 0, 0, 53.7, 0, 0, 0},
            {0, 0, 0, 26, 0, 71.3, 0, 0, 0, 0, 116.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},};

        int xx1[] = {290, 375, 280, 540, 440, 425, 275, 260, 350, 170, 600, 450, 470, 160, 140};
        int yy1[] = {125, 485, 540, 550, 185, 530, 430, 630, 550, 370, 425, 550, 615, 520, 585};
        String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
      
        for (int j = 0; j < 14; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 14; j++) {
            for (int k = 0; k < 14; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
            }
        }///
        Numerotope = 15;
        PintarFiguras(Numerotope, arboles);
    
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AyudaViajero ayuda = new AyudaViajero();
        ayuda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel ImgMapa;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JTextArea txtKMAcumulados;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
}
