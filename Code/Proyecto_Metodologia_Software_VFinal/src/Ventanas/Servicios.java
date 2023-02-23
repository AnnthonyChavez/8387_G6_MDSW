/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import static Ventanas.Proforma.Cedula;
import static Ventanas.Proforma.Cliente;
import static Ventanas.Proforma.Correo;
import static Ventanas.Proforma.Telefono;
import static com.sun.tools.javac.tree.TreeInfo.args;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.List;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.table.TableModel;
/**
 *
 * @author Annthony Chavez
 */

public class Servicios extends javax.swing.JFrame { 
    /**
     * Creates new form Servicios
    
    */
    String cliente;
    String cedula;
    String correo;
    String telefono;
  
    public Servicios() {
        initComponents();
    }
      
    public Servicios(String cliente, String cedula, String correo, String telefono) {
        this.cliente = cliente;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MaC = new javax.swing.JCheckBox();
        CP = new javax.swing.JCheckBox();
        DW = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Videos = new javax.swing.JRadioButton();
        Story = new javax.swing.JRadioButton();
        Rell = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TikTok = new javax.swing.JRadioButton();
        FB = new javax.swing.JRadioButton();
        IG = new javax.swing.JRadioButton();
        YT = new javax.swing.JRadioButton();
        Numero = new javax.swing.JComboBox<>();
        Tiempo = new javax.swing.JComboBox<>();
        Sig = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu7.setText("jMenu7");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel1.setText("Servicios adicionales");

        MaC.setText("Marketing de contenidos");

        CP.setText("Campaña publicitaria");

        DW.setText("Diseño Web");
        DW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DW)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CP)
                            .addComponent(MaC))
                        .addGap(0, 27, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(DW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MaC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel2.setText("Tipos de publicaciones");

        Videos.setText("Videos");
        Videos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VideosActionPerformed(evt);
            }
        });

        Story.setText("Historias o Post");

        Rell.setText("Rells");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rell)
                    .addComponent(Story)
                    .addComponent(jLabel2)
                    .addComponent(Videos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Rell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Story)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Videos)
                .addGap(11, 11, 11))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel3.setText("Redes sociales");

        TikTok.setText("Tik-tok");
        TikTok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TikTokActionPerformed(evt);
            }
        });

        FB.setText("Facebook");

        IG.setText("Instagram");

        YT.setText("Youtube");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(YT)
                            .addComponent(TikTok)
                            .addComponent(IG)
                            .addComponent(FB)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(FB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TikTok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(YT)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Numero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numero de publicaciones", "1 a 3 semanales", "4 a 6 semanales", "7 a 9 semanales" }));
        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });

        Tiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiempo", "1 mes", "3 meses", "6 meses", "12 meses" }));
        Tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoActionPerformed(evt);
            }
        });

        Sig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sig.setText("Siguiente");
        Sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigActionPerformed(evt);
            }
        });

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        jMenu4.setText("Acceso rapido");

        jMenu5.setText("Siguiente");
        jMenu4.add(jMenu5);

        jMenu6.setText("Manual de usuario");
        jMenu4.add(jMenu6);
        jMenu4.add(jSeparator1);

        jMenu8.setText("Salir");
        jMenu4.add(jMenu8);

        jMenuBar1.add(jMenu4);

        jMenu11.setText("Contactos");

        jMenu12.setText("Correo electrónico");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("info@inspirecreative.space");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu12.add(jCheckBoxMenuItem2);

        jMenu11.add(jMenu12);

        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Atras)
                        .addGap(66, 66, 66)
                        .addComponent(Sig)
                        .addGap(185, 185, 185))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atras)
                    .addComponent(Sig))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        ventanaBienvenida ventanaBienvenida = new ventanaBienvenida(); 
        ventanaBienvenida.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasActionPerformed

    private void VideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VideosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VideosActionPerformed

    private void DWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DWActionPerformed

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroActionPerformed

    private void TiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempoActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void SigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigActionPerformed
    if (TikTok.isSelected() || FB.isSelected() || IG.isSelected() || YT.isSelected()) {
        if (Videos.isSelected() || Story.isSelected() || Rell.isSelected()) {
           if (Numero.getSelectedIndex() >= 1 && Tiempo.getSelectedIndex() >= 1) {
            ArrayList<String> redesSociales = new ArrayList<>();  
            double precioTikTok = 20;
            double precioFB = 10;
            double precioIG = 10;
            double precioYT = 20;
            double precioDW = 400;
            double precioCP = 20;
            double precioMC = 50;
            double precioUnitario = 0;
            double precioUme = 0,precioT=0, precioUme1 = 0, precioUme2 = 0, precioUme3 = 0, precioUme4 = 0 ,precioUme5 = 0;
            double precioTotal=0;
            if (TikTok.isSelected()) {
                redesSociales.add("TikTok");  
                if (Numero.getSelectedItem().equals("1 a 3 semanales")){
                    precioUnitario = precioTikTok * 3;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                    precioUme = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                    precioUme = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                    precioUme = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                    precioUme = precioUnitario * 48;
                    }             
                    }else if (Numero.getSelectedItem().equals("2 a 4 semanales")){ 
                        precioUnitario = precioTikTok * 4;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme = precioUnitario * 48;     
                    }
                    }else if (Numero.getSelectedItem().equals("4 a 6 semanales")){ 
                        precioUnitario = precioTikTok * 6;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme = precioUnitario * 48;     
                    }
                    }else if (Numero.getSelectedItem().equals("7 a 9 semanales")){ 
                        precioUnitario = precioTikTok * 9;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme = precioUnitario * 48;     
                    }
                    }
                precioTotal += precioUme;
            }
            if (FB.isSelected()) {
                redesSociales.add("Facebook");
                if (Numero.getSelectedItem().equals("1 a 3 semanales")){
                    precioUnitario = precioFB * 3;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                    precioUme1 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                    precioUme1 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                    precioUme1 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                    precioUme1 = precioUnitario * 48;
                    }             
                    }else if (Numero.getSelectedItem().equals("2 a 4 semanales")){ 
                        precioUnitario = precioFB * 4;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme1 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme1 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme1 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme1 = precioUnitario * 48;     
                    }
                    }else if (Numero.getSelectedItem().equals("4 a 6 semanales")){ 
                        precioUnitario = precioFB * 6;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme1 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme1 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme1 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme1 = precioUnitario * 48;     
                    }
                    }else if (Numero.getSelectedItem().equals("7 a 9 semanales")){ 
                        precioUnitario = precioFB * 9;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme1 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme1 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme1 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme1 = precioUnitario * 48;     
                    }
                    }
            precioTotal += precioUme1;
            }
            if (IG.isSelected()) {
                redesSociales.add("Instagram"); 
                if (Numero.getSelectedItem().equals("1 a 3 semanales")){
                    precioUnitario = precioIG * 3;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                    precioUme2 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                    precioUme2 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                    precioUme2 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                    precioUme2 = precioUnitario * 48;
                    }             
                    }else if (Numero.getSelectedItem().equals("2 a 4 semanales")){ 
                        precioUnitario = precioIG * 4;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme2 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme2 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme2 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme2 = precioUnitario * 48;     
                    }
                    }else if (Numero.getSelectedItem().equals("4 a 6 semanales")){ 
                        precioUnitario = precioIG * 6;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme2 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme2 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme2 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme2 = precioUnitario * 48;     
                    }
                    }else if (Numero.getSelectedItem().equals("7 a 9 semanales")){ 
                        precioUnitario = precioIG * 9;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme2 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme2 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme2 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme2 = precioUnitario * 48;     
                    }
                    }
                precioTotal += precioUme2;
            }
            if (YT.isSelected()) {
                redesSociales.add("YouTube");  
                if (Numero.getSelectedItem().equals("1 a 3 semanales")){
                    precioUnitario = precioYT * 3;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                    precioUme3 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                    precioUme3 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                    precioUme3 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                    precioUme3 = precioUnitario * 48;
                    }             
                    }else if (Numero.getSelectedItem().equals("2 a 4 semanales")){ 
                        precioUnitario = precioYT * 4;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme3 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme3 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme3 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme3 = precioUnitario * 48;     
                    }
                    }else if (Numero.getSelectedItem().equals("4 a 6 semanales")){ 
                        precioUnitario = precioYT * 6;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme3 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme3 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme3 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme3 = precioUnitario * 48;     
                    }
                    }else if (Numero.getSelectedItem().equals("7 a 9 semanales")){ 
                        precioUnitario = precioYT * 9;
                    if (Tiempo.getSelectedItem().equals("1 mes")){
                        precioUme3 = precioUnitario * 4;
                    }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                        precioUme3 = precioUnitario * 12; 
                    }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                        precioUme3 = precioUnitario * 24; 
                    }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                        precioUme3 = precioUnitario * 48;     
                    }
                    }
                precioTotal += precioUme3;
            }
            ArrayList<String> tiposPublicacion = new ArrayList<>();
            if (Videos.isSelected()) {
                tiposPublicacion.add("Videos");
            }
            if (Story.isSelected()) {
                tiposPublicacion.add("Story");
            }
            if (Rell.isSelected()) {
                tiposPublicacion.add("Rell");
            }
            ArrayList<String> serviciosAdicionales = new ArrayList<>();
             if (DW.isSelected()) {
                serviciosAdicionales.add("Diseño Web");
                if (Tiempo.getSelectedItem().equals("1 mes")){
                    precioT = precioDW;
                }else if(Tiempo.getSelectedItem().equals("3 meses")) {
                    precioT = precioDW;
                }else if(Tiempo.getSelectedItem().equals("6 meses")) {
                    precioT = precioDW;
                }else if(Tiempo.getSelectedItem().equals("12 meses")) {
                    precioT = precioDW; 
                }
                precioTotal=precioDW;
            }
            if (MaC.isSelected()) {
                serviciosAdicionales.add("Marketing de Contenidos"); 
                precioUnitario= precioMC;
                if(Tiempo.getSelectedItem().equals("1 mes")){
                   precioUme4 = precioUnitario * 1; 
                }else if(Tiempo.getSelectedItem().equals("3 meses")){
                    precioUme4 = precioUnitario * 3;
                }else if(Tiempo.getSelectedItem().equals("6 meses")){
                    precioUme4 = precioUnitario * 6;
                }else if (Tiempo.getSelectedItem().equals("12 meses")){
                    precioUme4 = precioUnitario * 12;
                }
                precioTotal = precioUme4;
                }
            if (CP.isSelected()) {
                serviciosAdicionales.add("Campaña Publicitaria");
                precioUnitario = precioCP;
                if(Tiempo.getSelectedItem().equals("1 mes")){
                   precioUme5 = precioUnitario; 
                }else if(Tiempo.getSelectedItem().equals("3 meses")){
                    precioUme5 = precioUnitario * 3;
                }else if(Tiempo.getSelectedItem().equals("6 meses")){
                    precioUme5 = precioUnitario * 6;
                }else if (Tiempo.getSelectedItem().equals("12 meses")){
                    precioUme5 = precioUnitario * 12;
                }
                precioTotal = precioUme5;
            }
            String tiempo = Tiempo.getSelectedItem().toString();
            String numero = Numero.getSelectedItem().toString();

            // Crear un objeto de tipo DefaultTableModel para la tablaD
            DefaultTableModel model = new DefaultTableModel() { 
                // Override del método isCellEditable para que no se pueda editar la tabla
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            // Agregar las columnas a la tabla
            model.addColumn("Servicio");
            model.addColumn("Descripción");
            model.addColumn("Precio Unitario");
            model.addColumn("Total");
            ArrayList<String> serviciosEnTabla = new ArrayList<>(); // Creamos una lista serviciosEnTabla para mantener un registro de los servicios que ya se han agregado a la tabla
            for (String redSocial : redesSociales) {
                if (redSocial.equals("TikTok")) {
                precioUnitario = precioTikTok;
                precioTotal = precioUme;
                }else if(redSocial.equals("Facebook")){
                precioUnitario = precioFB;
                precioTotal = precioUme1;
                }else if(redSocial.equals("Instagram")){
                precioUnitario = precioIG;
                precioTotal = precioUme2;
                }else if(redSocial.equals("YouTube")){
                precioUnitario = precioYT;
                precioTotal = precioUme3;
                }               
                // Agregar información adicional a la columna Descripcion
                String descripcion =" \n"+tiposPublicacion+"\n "+tiempo+"\n "+numero;
                // Crear una fila y agregarla al modelo
                Vector<Object> fila = new Vector<>();
                fila.addElement(redSocial);
                fila.addElement(descripcion);
                fila.addElement(precioUnitario);
                fila.addElement(precioTotal);
                fila.addElement("");
                model.addRow(fila);
            } 
            for (String servicioAdicional : serviciosAdicionales) {
                String descripcion = null;
                if(servicioAdicional.equals("Diseño Web")){
                 descripcion ="En caso de desear añadir extras se cobrará de 75$ en adelante";
                 precioUnitario = precioDW;
                 precioTotal = precioDW;
                }else if(servicioAdicional.equals("Campaña Publicitaria")){
                 descripcion = tiempo; 
                 precioUnitario = precioCP;
                 precioTotal = precioUme5;
                }else if(servicioAdicional.equals("Marketing de Contenidos")){
                 descripcion = tiempo;
                 precioUnitario = precioMC;
                 precioTotal = precioUme4;
                }
                
                // Crear una fila y agregarla al modelo
                Vector<Object> fila = new Vector<>();
                fila.addElement(servicioAdicional);
                fila.addElement(descripcion);
                fila.addElement(precioUnitario);
                fila.addElement(precioTotal);
                fila.addElement("");
                model.addRow(fila);
            }
                        // Calcular los totales
            double subtotal = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                subtotal += Double.parseDouble(model.getValueAt(i, 3).toString());
            }
            double iva = subtotal * 0.12;
            double total = subtotal + iva;

            // Agregar una nueva fila con los totales
            Vector<Object> filaTotales = new Vector<>();
            filaTotales.addElement("Subtotal");
            filaTotales.addElement("");
            filaTotales.addElement("");
            filaTotales.addElement(subtotal);
            filaTotales.addElement("");
            model.addRow(filaTotales);

            Vector<Object> filaIva = new Vector<>();
            filaIva.addElement("IVA (12%)");
            filaIva.addElement("");
            filaIva.addElement("");
            filaIva.addElement(iva);
            filaIva.addElement("");
            model.addRow(filaIva);

            Vector<Object> filaTotal = new Vector<>();
            filaTotal.addElement("Total");
            filaTotal.addElement("");
            filaTotal.addElement("");
            filaTotal.addElement(total);
            filaTotal.addElement("");
            model.addRow(filaTotal); 
            Proforma proforma = new Proforma(this);
            proforma.setVisible(true);
            // Actualizar la tabla en la ventana Proforma
           proforma.tablaD.setModel(model);
           // Establecer el ancho predeterminado de la columna "Descripción"
            int descripcionColumnWidth = 200;
           proforma.tablaD.getColumnModel().getColumn(1).setPreferredWidth(descripcionColumnWidth);
           // Establecer la clase MultiLineCellRenderer como el renderizador de la columna "Descripción"
           proforma.tablaD.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
           proforma.tablaD.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); 
           
           } else {
                JOptionPane.showMessageDialog(this, "Debes seleccionar un número y un tiempo");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar Tipo de Publicacion");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debes seleccionar Redes Sociales");
    }
     dispose();   
    }//GEN-LAST:event_SigActionPerformed

    private void TikTokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TikTokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TikTokActionPerformed
    
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
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JCheckBox CP;
    private javax.swing.JCheckBox DW;
    private javax.swing.JRadioButton FB;
    private javax.swing.JRadioButton IG;
    private javax.swing.JCheckBox MaC;
    private javax.swing.JComboBox<String> Numero;
    private javax.swing.JRadioButton Rell;
    private javax.swing.JButton Sig;
    private javax.swing.JRadioButton Story;
    private javax.swing.JComboBox<String> Tiempo;
    private javax.swing.JRadioButton TikTok;
    private javax.swing.JRadioButton Videos;
    private javax.swing.JRadioButton YT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
