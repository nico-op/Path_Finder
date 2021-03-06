package Path;

import Path.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AyudaViajero extends javax.swing.JFrame {
    
    /**
     * Creates new form AyudaViajero
     */
    @SuppressWarnings("unchecked")
    
    /**
     * In a list the different places that can be consulted are added. 
     */
    public AyudaViajero() {
        initComponents();
        List cities = new LinkedList<>();
        
        cities.add("Dota");
        cities.add("Aserrí");
        cities.add("Barbacoas");
        cities.add("Hatillo");
        cities.add("Santa Ana");
        cities.add("Santiago");
        cities.add("Vázquez de Coronado");
        cities.add("Desamparados");
        cities.add("Tarrazu");
        cities.add("Alajuelita");
        cities.add("Acosta");
        cities.add("Escazú");
        cities.add("Pérez Zeledón");
        cities.add("Ciudad Colón");
        cities.add("Turrubares");
        
        // The sorting algorithm is used.
        Collections.sort(cities);
        Lugares.addItem("Seleccione un lugar");
        cities.forEach(city -> {
            Lugares.addItem((String) city);
        });
     
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") ///
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        popupMenu3 = new java.awt.PopupMenu();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lugares = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        popupMenu3.setLabel("popupMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 710));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione un lugar ");

        Lugares.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Lugares.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LugaresItemStateChanged(evt);
            }
        });
        Lugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LugaresActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label1.setText("Más información sobre los lugares");

        mostrar.setColumns(20);
        mostrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        jButton1.setText("Atrás");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lugares, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        main mainn = new main();
        mainn.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void LugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LugaresActionPerformed
   
    }//GEN-LAST:event_LugaresActionPerformed
    /*
    In Item Places, the information of the places is added, this information is 
    displayed according to the selected place
    */
    private void LugaresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LugaresItemStateChanged
        // TODO add your handling code here:
        String lugar = (String)Lugares.getSelectedItem();
        
        if (lugar.equals("Alajuelita"))
          mostrar.setText("Habitantes:\n" +"-12,875 \n\nLugares interés:\n" + "-Cruz de Alajuelita\n" + "-La Piedra del Minero \n\nComidas:\n" + "-Restaurante Mirador America\n" +
          "-La cabaña de Toño \n\nGasolineras:\n" + "-ANATOTC S.A\n" + "-Servicentro J.S.M Alajuelita" );

        if (lugar.equals("Tarrazu"))
            mostrar.setText("Habitantes:\n" +"-16,280 \n\nLugares interés:\n" + "-Finca las Lomas\n" + "-Cerro la Trinidad  \n\nComidas:\n" + "-Vista del Lago Coffee Tour\n" + "-Lagos Los Angeles  \n\nGasolineras:\n" +
            "-Estación de Servicio el Cruce" );

        if (lugar.equals("Barbacoas"))
            mostrar.setText("Habitantes:\n" +"-3692 \n\nLugares interés:\n" + "-Mirador al Golfo de Nicoya\n" + "-Finca la Alejandría \n\nComidas:\n" + "-Bar Karibu\n" + 
            "-Donde Perola Puriscal \n\nGasolineras:\n" + "-No posee" );

        if (lugar.equals("Acosta"))
            mostrar.setText("Habitantes:\n" +"-21,335 \n\nLugares interés:\n" + "-Pamaguelos Acosta\n" + "-Unifami Centro Comercial \n\nComidas:\n" + "-Restaurante Los Pozos\n" +
            "-Cafetería El 7 de cada mes \n\nGasolineras:\n" + "-Multiservicios La Rampa");

        if (lugar.equals("Vázquez de Coronado"))
            mostrar.setText("Habitantes:\n" +"-60,486 \n\nLugares interés:\n" + "-Instituto de Clodomiro Picado\n" + "-Iglesia San Pedro de Coronado \n\nComidas:\n" + "-Restaurante entre Nubes\n" + 
            "-La Cabaña de Cascajal \n\nGasolineras:\n" + "-Servicentro El Trapiche S.A\n" + "-Bomba Combustibles De Coronado Ltda" );
        
        if (lugar.equals("Desamparados"))
            mostrar.setText("Habitantes:\n" +"-33,866 \n\nLugares interés:\n" + "-Multicentro Desamparados Mall\n" + "-Estadio Cuty Monge \n\nComidas:\n" + "-Sosa San Lorenzo\n" + 
            "-Soda Yoguis \n\nGasolineras:\n" + "-Metrópoli Gas LP\n" + "-Blueflame" );
        
        if (lugar.equals("Dota"))
            mostrar.setText("Habitantes:\n" +"-6948 \n\nLugares interés:\n" + "-Parque Nacional los Quetzales\n" + "-Reserva Biológica Cerro Vueltas \n\nComidas:\n" + "-Bar y Restaurante La Catarata\n" +
            "-Miriam`s Quetzals \n\nGasolineras:\n" + "-Estación de Servicios Santa María");
        
        if (lugar.equals("Aserrí"))
            mostrar.setText("Habitantes:\n" +"-28,191 \n\nLugares interés:\n" + "-Parque Acuático Los Sueños\n" + "-Parque de Aserrí \n\nComidas:\n" + "-Chicharronera Cacique Acserí\n" +
            "-Papa John's Pizza \n\nGasolineras:\n" + "-Gasolinera Trova\n" + "-Gasotica Aserrí" );
        
        if (lugar.equals("Santiago"))
            mostrar.setText("Habitantes:\n" +"-11,512 \n\nLugares interés:\n" + "-Parque del Agricultor\n" + "-Kamakiri Centro Recreativo \n\nComidas:\n" + "-Pops\n" +
            "-Heladería y Soda Caprichos \n\nGasolineras:\n" + "-Delta Puriscal\n" + "-Estación de Servicio San Juan" );
        
        if (lugar.equals("Hatillo"))
            mostrar.setText("Habitantes:\n" +"-50,511 \n\nLugares interés:\n" + "-Centro Comercial Plaza América \n" + "-Alpízar's Sport Center \n\nComidas:\n" + "-Pizza Hut\n" + 
            "-Burger King \n\nGasolineras:\n" + "-Lavacar las Américas\n" + "-UNO" );
        
        if (lugar.equals("Santa Ana"))
            mostrar.setText("Habitantes:\n" +"-60,453 \n\nLugares interés:\n" + "-Hacienda La Chimba\n" + "-Santa Ana Town Center \n\nComidas:\n" + "-McDonald’s\n" +
            "-Andiamo Là \n\nGasolineras:\n" + "-Gasolinera Montes\n" + "-Gasolinera Lindora y Gas Lp" );
        
        if (lugar.equals("Turrubares"))
            mostrar.setText("Habitantes:\n" +"-1,357 \n\nLugares interés:\n" + "-Villa Turrubares\n" + "-Parroquia San Pablo de Turrubares \n\nComidas:\n" + 
            "-Cabinas y Restaurante Guailichu\n" + "-Soda Chuy  \n\nGasolineras:\n" + "-Gasolinera Migas San Pablo");
        
        if (lugar.equals("Ciudad Colón"))
            mostrar.setText("Habitantes:\n" +"-16,088 \n\nLugares interés:\n" + "-Los pochotes\n" + "-Waterfall Ciudad Colón \n\nComidas:\n" + "-Restaurante conservatorium\n" +
            "-Antojitos de Villa  \n\nGasolineras:\n" + "-Delta Mora\n" + "-Servicentro los Ángeles" );
        
        if (lugar.equals("Pérez Zeledón"))
            mostrar.setText("Habitantes:\n" +"-143,117 \n\nLugares interés:\n" + "-Parque Central Pérez Zeledón\n " + "-Cerro Pelón\n" +
            "-Cerro Chirripó \n\nComidas:\n" + "-Finca la Molina\n" +"-Páramo Cafe  \n\nGasolineras:\n" + "-Trova Gasolinera\n" + "-Servicentro Tanok" );
        
        if (lugar.equals("Escazú"))
            mostrar.setText("Habitantes:\n" +"56,509 \n\nLugares interés:\n" + "-Mirador Escondido\n" + "-Parque de Bello Horizonte \n\nComidas:\n" + "-La Casona De Laly\n" +
            "-La Posada de las Brujas  \n\nGasolineras:\n" + "No posee" );
        
        if (lugar.equals("Seleccione un lugar"))
            mostrar.setText("");
        
        
        
    }//GEN-LAST:event_LugaresItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyudaViajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Lugares;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JTextArea mostrar;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private java.awt.PopupMenu popupMenu3;
    // End of variables declaration//GEN-END:variables
}
