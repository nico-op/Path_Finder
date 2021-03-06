package Path;

import Logic.Grafics;
import Logic.Paint;
import Logic.Dijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import Logic.MatrixAPI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicol, Meibel, Adrián, Andrés
 */


public class main extends javax.swing.JFrame {

    private int Numerotope = 0;//Numero de nodos 
    
    Grafics arboles = new Grafics();

    /*
    This method is responsible for painting the lines between the figures 
    according to the start and end coordinates, in addition, it paints the
    points of the nodes.
    */
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

    /*
    This method takes care of initializing the components
    */
    public main() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        TextFieldAnswer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Path Finder");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 115, 223));
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuscarCamino.setBackground(new java.awt.Color(153, 153, 153));
        BuscarCamino.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        BuscarCamino.setText("Search");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 720, 100, 30));

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(204, 204, 255));
        BotonSalir.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        BotonSalir.setText("Exit");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 70, 30));

        ImgMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mapa_canton1.png"))); // NOI18N
        jPanel1.add(ImgMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 630, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 510));

        kmRecorridos2.setBackground(new java.awt.Color(153, 156, 248));
        kmRecorridos2.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        kmRecorridos2.setText("The best route is:");
        kmRecorridos2.setOpaque(true);
        getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, -1, -1));

        EleccionOrigen.setBackground(new java.awt.Color(102, 102, 102));
        EleccionOrigen.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Alajuelita", "Aserrí", "Barbacoas", "Ciudad Colón", "Dota", "Desamparados", "Escazú", "Turrubares", "Hatillo", "Pérez Zeledón", "Vázquez de Coronado", "Tarrazú ", "Santa Ana", "Santiago", "Acosta", " " }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 200, -1));

        EleccionDestino.setBackground(new java.awt.Color(153, 153, 153));
        EleccionDestino.setEditable(true);
        EleccionDestino.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Alajuelita", "Aserrí", "Barbacoas", "Ciudad Colón", "Dota", "Desamparados", "Escazú", "Turrubares", "Hatillo", "Pérez Zeledón", "Vázquez de Coronado", "Tarrazú ", "Santa Ana", "Santiago", "Acosta", " " }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 200, 30));

        txtDestino.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        txtDestino.setText("Destiny:");
        txtDestino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, -1, -1));

        txtOrigen.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        txtOrigen.setText("Origin:");
        txtOrigen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        MostrarCaminos.setBackground(new java.awt.Color(51, 51, 51));
        MostrarCaminos.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        MostrarCaminos.setText("Show Routes");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jButton1.setText("Information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel2.setText("Delay:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, 200, 30));
        getContentPane().add(TextFieldAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 250, 50));

        jLabel1.setBackground(new java.awt.Color(0, 255, 102));
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo (3).jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 620, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The source and destination variables are initialized.
     * @param evt 
     */
    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        try {
            int origen = 0, destino = 0;
            String nombreOrigen, nombreDestino;
            nombreOrigen = (String) EleccionOrigen.getSelectedItem();
            nombreDestino = (String) EleccionDestino.getSelectedItem();
            String data = jTextField1.getText();
            System.out.println("Dato " + data);
            
            if ("Hatillo".equals(nombreOrigen)) {
                origen = 0;
            }   if ("Escazú".equals(nombreOrigen)) {
                origen = 1;
            }   if ("Desamparados".equals(nombreOrigen)) {
                origen = 2;
            }   if ("Barbacoas".equals(nombreOrigen)) {
                origen = 3;
            }   if ("Santiago".equals(nombreOrigen)) {
                origen = 4;
            }   if ("Tarrazú".equals(nombreOrigen)) {
                origen = 5;
            }   if ("Aserrí".equals(nombreOrigen)) {
                origen = 6;
            }   if ("Ciudad Colón".equals(nombreOrigen)) {
                origen = 7;
            }   if ("Santa Ana".equals(nombreOrigen)) {
                origen = 8;
            }   if ("Alajuelita".equals(nombreOrigen)) {
                origen = 9;
            }   if ("Vázquez de Coronado".equals(nombreOrigen)) {
                origen = 10;
            }   if ("Acosta".equals(nombreOrigen)) {
                origen = 11;
            }   if ("Turrubares".equals(nombreOrigen)) {
                origen = 12;
            }   if ("Dota".equals(nombreOrigen)) {
                origen = 13;
            }   if ("Pérez Zeledón".equals(nombreOrigen)) {
                origen = 14;
            }   // Destinos 
            if ("Hatillo".equals(nombreDestino)) {
                destino = 0;
            }   if ("Escazú".equals(nombreDestino)) {
                destino = 1;
            }   if ("Desamparados".equals(nombreDestino)) {
                destino = 2;
            }   if ("Barbacoas".equals(nombreDestino)) {
                destino = 3;
            }   if ("Santiago".equals(nombreDestino)) {
                destino = 4;
            }   if ("Tarrazú".equals(nombreDestino)) {
                destino = 5;
            }   if ("Aserrí".equals(nombreDestino)) {
                destino = 6;
            }   if ("Ciudad Colón".equals(nombreDestino)) {
                destino = 7;
            }   if ("Santa Ana".equals(nombreDestino)) {
                destino = 8;
            }   if ("Alajuelita".equals(nombreDestino)) {
                destino = 9;
            }   if ("Vázquez de Coronado".equals(nombreDestino)) {
                destino = 10;
            }   if ("Acosta".equals(nombreDestino)) {
                destino = 11;
            }   if ("Turrubares".equals(nombreDestino)) {
                destino = 12;
            }   if ("Dota".equals(nombreDestino)) {
                destino = 13;
            }   if ("Pérez Zeledón".equals(nombreDestino)) {
                destino = 14;
            }   if (origen == destino) {
                Font fuente = new Font("Arial", Font.BOLD, 18);
                JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
                
            } else {
                Dijkstra Dijkstra = new Dijkstra(arboles, Numerotope, origen, destino);
                Dijkstra.dijkstra();
                
                Font fuente = new Font("Arial", Font.BOLD, 18);
                
            }   
            MatrixAPI matrix = new MatrixAPI();
            matrix.main(origen, destino, data);
        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
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
    
    /*
    The Show Paths button contains the matrix that indicates which nodes are 
    connected to each other and the distance between them, in addition, the 
    points are located.
    
    */
    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        EleccionOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);

        jPanel1.paint(jPanel1.getGraphics());

        int Matriz[][] = {
          
            {0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}
        };
         double coe[][] = {
            {0, 5.25, 0, 0, 0, 0, 0, 0, 10.5, 2.25, 14.25, 0, 0, 0, 0},
            {5.25, 0, 0, 0, 0, 0, 0, 0, 4.5, 4.5, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 5.25, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 3.75, 0, 0, 0, 0, 0, 0, 0, 11.25, 0, 0},
            {0, 0, 0, 3.75, 0, 0, 0, 15.74, 0, 0, 0, 20.25, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 37.95, 0, 0, 0, 0, 32.45, 0, 45.67, 0},
            {0, 0, 0, 0, 0, 37.95, 0, 0, 0, 4.5, 0, 14.25, 0, 0, 0},
            {0, 0, 0, 0, 15.74, 0, 0, 0, 6.75, 0, 0, 21.0, 0, 0, 0},
            {10.5, 1, 0, 0, 0, 0, 0, 6.75, 0, 0, 0, 0, 0, 0, 0},
            {2.25, 4.5, 5.25, 0, 0, 0, 4.5, 0, 0, 0, 0, 0, 0, 0, 0},
            {14.25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 20.25, 32.25, 14.25, 21.0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 11.25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 45.67, 0, 0, 0, 0, 0, 0, 0, 0, 63.75},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 63.75, 0}
         
        }; 
       
        //  Coordinates where the nodes are located
        int xx1[] = {290,240, 310, 130,170, 320, 270, 210, 240, 275, 350, 220, 90, 390, 480,400};
        int yy1[] = {125,135, 170, 210, 170, 300, 200, 155, 130, 145, 90, 200, 180, 280, 320,400};
        String nom[] = {"1", "2", "3", "4.1", "4.2","5", "6", "7","9", "10", "11", "12", "16", "17", "19", "22"};
      
        
        // X and Y parameters are sent
        for (int j = 0; j < 15; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        
        // The adjacency matrix and the coefficient are sent
        for (int j = 0; j < 15; j++) {
            for (int k = 0; k < 15; k++) {
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
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private static javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel ImgMapa;
    private static javax.swing.JButton MostrarCaminos;
    public static javax.swing.JTextField TextFieldAnswer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables


    
}
