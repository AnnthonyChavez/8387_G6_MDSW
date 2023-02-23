/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Ventanas.Proforma.Cedula;
import static Ventanas.Proforma.Correo;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Area 51
 */
public class ventanaBienvenida extends javax.swing.JFrame {

    //Para separadores
    String barra = File.separator;

    //Para la ubicación del archivo y el nombre del archivo
    String Ubicacion = System.getProperty("user.dir")+barra+"Clientes"+barra;
    
    public ventanaBienvenida() {
        initComponents();
        JLcorreoInvalido.setVisible(false);
    }

    private void crear(){
        String archivo=TFCedula.getText()+".txt";
        File crearUbi = new File(Ubicacion);
        File crearArchivo = new File(Ubicacion+archivo);
        
        if(TFCedula.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese su Nombre");
        }else{
            try{
                if(crearArchivo.exists()){
                    JOptionPane.showMessageDialog(rootPane, "Su cédula ya está registrada");
                }else{
                    crearUbi.mkdirs();
                    Formatter crearFormater = new Formatter(Ubicacion+archivo);
                    crearFormater.format("%s\r\n%s\r\n%s\r\n%s\r\n", "Nombre: " + TFCedula.getText()
                    ,"Apellido: "+ TFApellido.getText()
                    ,"Teléfono: "+ TFTelefono.getText()
                    ,"Correo: "+ TFCorreo.getText());
                    
                crearFormater.close();
                JOptionPane.showMessageDialog(rootPane, "Registro Exitoso");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "Registro incorrecto");
            }
        
        }
    }
    
    //Método para que el usuarion no pueda digitar más de 10 dígitos de la cédula
    public int ContadorCed(){
        String caracteres = TFCedula.getText().replaceAll("[' '\n]", "");
        int num = 10 - caracteres.length();
        return num;
    }
    
    //Método para que el usuario no pueda digitar más de 10 dígitos del teléfono
    public int ContadorTel(){
        String caracteres = TFTelefono.getText().replaceAll("[' '\n]", "");
        int num = 10 - caracteres.length();
        return num;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JBboton = new javax.swing.JButton();
        JBmanual = new javax.swing.JButton();
        JBsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TFApellido = new javax.swing.JTextField();
        JLcorreoInvalido = new javax.swing.JLabel();
        TFCorreo = new javax.swing.JTextField();
        TFCedula = new javax.swing.JTextField();
        TFTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenidos");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBboton.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        JBboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Boton_Siguiente.png"))); // NOI18N
        JBboton.setText("Siguiente");
        JBboton.setContentAreaFilled(false);
        JBboton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Boton_Siguiente_Grande.png"))); // NOI18N
        JBboton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBboton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Boton_Siguiente.png"))); // NOI18N
        JBboton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Boton_Siguiente_Grande.png"))); // NOI18N
        JBboton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbotonActionPerformed(evt);
            }
        });
        JBboton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JBbotonKeyPressed(evt);
            }
        });
        jPanel4.add(JBboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 140, 140));

        JBmanual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Manual_Usuario.jpg"))); // NOI18N
        JBmanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmanualActionPerformed(evt);
            }
        });
        jPanel4.add(JBmanual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 181, 110));

        JBsalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Boton_Salir.png"))); // NOI18N
        JBsalir.setText("Salir");
        JBsalir.setToolTipText("");
        JBsalir.setBorder(null);
        JBsalir.setContentAreaFilled(false);
        JBsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBsalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Boton_Salir.png"))); // NOI18N
        JBsalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Boton_Salir Grande.png"))); // NOI18N
        JBsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirActionPerformed(evt);
            }
        });
        jPanel4.add(JBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 130, 130));

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDOS ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 640, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Logo.JPG"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 210, 110));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "!Por favor¡ Ingrese sus Datos... ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TFApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFApellidoActionPerformed(evt);
            }
        });
        TFApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(TFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 210, 30));

        JLcorreoInvalido.setFont(new java.awt.Font("OCR A Extended", 3, 12)); // NOI18N
        JLcorreoInvalido.setForeground(new java.awt.Color(153, 51, 0));
        JLcorreoInvalido.setText("Correo inválido (*)");
        jPanel1.add(JLcorreoInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 160, 30));

        TFCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCorreoActionPerformed(evt);
            }
        });
        TFCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFCorreoKeyReleased(evt);
            }
        });
        jPanel1.add(TFCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 340, 30));

        TFCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCedulaActionPerformed(evt);
            }
        });
        TFCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(TFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 210, 30));

        TFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTelefonoActionPerformed(evt);
            }
        });
        TFTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(TFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 210, 30));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 2, 14)); // NOI18N
        jLabel5.setText("Cedula:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 30));

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 2, 14)); // NOI18N
        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 80, 30));

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 2, 14)); // NOI18N
        jLabel7.setText("Nombre y Apellido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 30));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 2, 14)); // NOI18N
        jLabel4.setText("Correo electrónico:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 30));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 650, 240));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 590));

        jMenu1.setText("Acceso rápido");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Manual del Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Siguiente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Contactos");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void JBmanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmanualActionPerformed
        // TODO add your handling code here:
        new manualUsuario().setVisible(true);
        
    }//GEN-LAST:event_JBmanualActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new manualUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JBsalirActionPerformed

    //Método para calidar los campos cuando se aprieta el botón siguiente
    private void JBbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbotonActionPerformed
    if (ContadorCed() != 0){
            JOptionPane.showMessageDialog(rootPane, "Ingrese un número de cédula válido (10 dígitos)");
            
        }else if(ContadorTel() != 0){
            JOptionPane.showMessageDialog(rootPane, "Ingrese un número de teléfono válido (10 dígitos)");
        }else if(TFCedula.getText().equals("") || TFApellido.getText().equals("")||
                TFCorreo.getText().equals("")||TFTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "LLene todos los campos");
            
        }else if (verificar_Email(TFCorreo.getText()) == false) {
            JOptionPane.showMessageDialog(rootPane, "LLene correctamente el correo");
        }else{           
            crear();
        Servicios servicios = new Servicios();
        servicios.cliente = TFApellido.getText();
        servicios.cedula = TFCedula.getText();
        servicios.correo = TFCorreo.getText();
        servicios.telefono = TFTelefono.getText();
        servicios.setVisible(true);
        }
    dispose();
    }//GEN-LAST:event_JBbotonActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    //Método para validar solo números en cedula y que pueda digitar 10 digitos máximos
    private void TFCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCedulaKeyTyped
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        if(ContadorCed() == 0){
            evt.consume();
        }
    }//GEN-LAST:event_TFCedulaKeyTyped

    
    //Método para validar solo letras y que pueda digitar espacios
    private void TFApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFApellidoKeyTyped
        Character c = evt.getKeyChar();
        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_TFApellidoKeyTyped

    
    private void JBbotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBbotonKeyPressed

    }//GEN-LAST:event_JBbotonKeyPressed

    //Método para validar solo números en teléfono y que pueda digitar 10 digitos máximos
    private void TFTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFTelefonoKeyTyped
    
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }

        if(ContadorTel() == 0){
            evt.consume();
        }
    }//GEN-LAST:event_TFTelefonoKeyTyped

    //Devuelve verdadero o falso si el correo es válido o no
    public boolean verificar_Email(String correo){
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" 
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(correo);
        return mat.find();
    }
    
    //Para que vaya comparando si el correo es valido y si es valido no mostrar la etiqueta
    private void TFCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCorreoKeyReleased
        
        if(verificar_Email(TFCorreo.getText())){
            JLcorreoInvalido.setVisible(false);
        }else{
            JLcorreoInvalido.setVisible(true);
        }
    }//GEN-LAST:event_TFCorreoKeyReleased

    private void TFApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFApellidoActionPerformed
     Servicios servicios = new Servicios();
        servicios.cliente = TFApellido.getText();   
    }//GEN-LAST:event_TFApellidoActionPerformed

    private void TFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTelefonoActionPerformed
            Servicios servicios = new Servicios();
        servicios.telefono = TFTelefono.getText();
    }//GEN-LAST:event_TFTelefonoActionPerformed

    private void TFCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCorreoActionPerformed
            Servicios servicios = new Servicios();
        servicios.correo = TFCorreo.getText();       
    }//GEN-LAST:event_TFCorreoActionPerformed

    private void TFCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCedulaActionPerformed
             Servicios servicios = new Servicios();
        servicios.cedula = TFCedula.getText();
    }//GEN-LAST:event_TFCedulaActionPerformed
   
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
            java.util.logging.Logger.getLogger(ventanaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaBienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBboton;
    private javax.swing.JButton JBmanual;
    private javax.swing.JButton JBsalir;
    private javax.swing.JLabel JLcorreoInvalido;
    private javax.swing.JTextField TFApellido;
    public static javax.swing.JTextField TFCedula;
    private javax.swing.JTextField TFCorreo;
    private javax.swing.JTextField TFTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
