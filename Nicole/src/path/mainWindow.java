
package path;
//
import Clases.AlgoritmoDijkstra;
import Clases.DatosGraficos;
import Clases.PintanrDibujos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

////////hhhhhh

public class mainWindow extends javax.swing.JFrame {
    
    //Holaaaaa, esto sirve??
     private int Numerotope = 0;//Numero de nodos 
    
    DatosGraficos arboles = new DatosGraficos();

    public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintanrDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintanrDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }
    
   

    /**
     * Creates new form mainWindow
     */
    public mainWindow() {
        
        initComponents();
        Destiny.setEnabled(true);
        Origin.setEnabled(true);
        buscar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        labelOrigen = new javax.swing.JLabel();
        labelDestiny = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Origin = new javax.swing.JComboBox<>();
        Destiny = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setForeground(new java.awt.Color(0, 153, 255));
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(0, 153, 255));

        labelOrigen.setText("Origen");

        labelDestiny.setText("Destiny");

        buscar.setText("Consult");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("La mejor ruta es:");

        Origin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Alajuelita", "Aserrí", "Barbacoas", "Ciudad Colón", "Curridabat", "Desamparados", "Escazú", "Guadalupe", "Hatillo", "Moravia", "Sabanilla", "San Pedro", "Santa Ana", "Santiago", "Tibás", "" }));
        Origin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriginActionPerformed(evt);
            }
        });

        Destiny.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Alajuelita", "Aserrí", "Barbacoas", "Ciudad Colón", "Curridabat", "Desamparados", "Escazú", "Guadalupe", "Hatillo", "Moravia", "Sabanilla", "San Pedro", "Santa Ana", "Santiago", "Tibás", " " }));
        Destiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinyActionPerformed(evt);
            }
        });

        jButton1.setText("Ayuda viajero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Mostrar.setText("Buscar Camino");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(labelOrigen)
                                .addGap(9, 9, 9)
                                .addComponent(Origin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(labelDestiny)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Destiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Mostrar)
                .addGap(256, 256, 256)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Mostrar))
                .addGap(22, 22, 22)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Origin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOrigen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDestiny)
                            .addComponent(Destiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/path/mapa_cantones.jpeg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        jPanel1.getAccessibleContext().setAccessibleName(getName());

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {                                               
        //jMenuItem2.setEnabled(false);
        Origin.setEnabled(true);
        Mostrar.setEnabled(false);
        Mostrar.setVisible(false);
        txt.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());
        
        int Matriz[][] = {
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            
        };

        double coe[][] = {
            {0, 57.4, 0, 0, 147, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {57.4, 0, 0, 0, 0, 69.1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 55.6, 0, 0, 0, 0, 0, 0, 26.4},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 71.8, 0, 0, 0},
            {147, 0, 0, 0, 0, 0, 0, 0, 0, 0, 327.4, 0, 0, 0, 0},
            {0, 69.1, 0, 0, 0, 0, 0, 0, 93.3, 0, 0, 86.5, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 61.7, 0, 0, 0, 0, 0, 0, 42.7},
            {0, 0, 55.6, 0, 0, 93.3, 0, 61.7, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 109},
            {0, 0, 0, 0, 327.4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 86.5, 0, 0, 0, 0, 0, 0, 56.1, 0, 0},
            {0, 0, 0, 71.8, 0, 0, 0, 0, 0, 0, 0, 56.1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 86.9},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 86.9, 0},};

        int xx1[] = {425, 375, 280, 540, 440, 425, 275, 260, 350, 170, 600, 450, 470, 160, 140};
        int yy1[] = {405, 485, 540, 550, 185, 530, 430, 630, 550, 370, 425, 550, 615, 520, 585};
        String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
      
        for (int j = 0; j < 22; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 22; j++) {
            for (int k = 0; k < 22; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
            }
        }
        Numerotope = 15;
        PintarFiguras(Numerotope, arboles);
    } 
     
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) Origin.getSelectedItem();
        nombreDestino = (String) Destiny.getSelectedItem();
        
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
        if ("Guadalupe".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("Moravia".equals(nombreOrigen)) {
            origen = 7;
        }
        if ("Tibás".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("Alajuelita".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("Hatillo".equals(nombreOrigen)) {
            origen = 10;
        }
        if ("Curridabat".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("San Pedro".equals(nombreOrigen)) {
            origen = 12;
        }
        if ("Sabanilla".equals(nombreOrigen)) {
            origen = 13;
        }
        if ("Desamparados".equals(nombreOrigen)) {
            origen = 14;
        }
        if ("San Antonio".equals(nombreOrigen)) {
            origen = 15;
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
        if ("Guadalupe".equals(nombreDestino)) {
            origen = 6;
        }
        if ("Moravia".equals(nombreDestino)) {
            origen = 7;
        }
        if ("Tibás".equals(nombreDestino)) {
            origen = 8;
        }
        if ("Alajuelita".equals(nombreDestino)) {
            origen = 9;
        }
        if ("Hatillo".equals(nombreDestino)) {
            origen = 10;
        }
        if ("Curridabat".equals(nombreDestino)) {
            origen = 11;
        }
        if ("San Pedro".equals(nombreDestino)) {
            origen = 12;
        }
        if ("Sabanilla".equals(nombreDestino)) {
            origen = 13;
        }
        if ("Desamparados".equals(nombreDestino)) {
            origen = 14;
        }
        if ("San Antonio".equals(nombreDestino)) {
            origen = 15;
        }
        
        
        
        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txt.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
            txt.setText("Intenta de nuevo!!");
            txt.setEnabled(false);
            txt.setForeground(Color.RED);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            Font fuente = new Font("Arial", Font.BOLD, 18);
            txt.setFont(fuente);
            txt.setText("No hay ningun error :)");
            txt.setForeground(Color.BLUE);
            txt.setEnabled(false);
            
            //kmRecorridos.setText(Dijkstra.getAcumulado() + " KM");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void OriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OriginActionPerformed
        Destiny.setEnabled(true);
    }//GEN-LAST:event_OriginActionPerformed

    private void DestinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinyActionPerformed
        buscar.setEnabled(true);
        
    }//GEN-LAST:event_DestinyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AyudaViajero ayuda = new AyudaViajero();
        ayuda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarActionPerformed

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentAdded

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> Destiny;
    private javax.swing.JButton Mostrar;
    public static javax.swing.JComboBox<String> Origin;
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDestiny;
    private javax.swing.JLabel labelOrigen;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
  
}
