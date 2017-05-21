package vista;

import java.awt.Dimension;

public class Marco extends javax.swing.JFrame {

    public Marco() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCARGO = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mm = new javax.swing.JLabel();
        hh = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Slider1 = new javax.swing.JMenu();
        llama_interfaz_principal = new javax.swing.JMenuItem();
        Slider2 = new javax.swing.JMenu();
        llamaLibreria = new javax.swing.JMenuItem();
        llamaVestuario = new javax.swing.JMenuItem();
        llamaCasayPesca = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Slider3 = new javax.swing.JMenu();
        llamaUsuarios = new javax.swing.JMenuItem();
        Slider4 = new javax.swing.JMenu();
        llama_interfaz_informes = new javax.swing.JMenuItem();
        Slider5 = new javax.swing.JMenu();
        llama_interfaz_linea_credito = new javax.swing.JMenuItem();
        Slider6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARAHUE");

        jPanel1.setBackground(new java.awt.Color(56, 98, 127));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(56, 98, 127)));
        jPanel1.setForeground(new java.awt.Color(102, 204, 255));

        jPanel2.setBackground(new java.awt.Color(56, 98, 127));

        lb_user.setForeground(new java.awt.Color(255, 255, 255));
        lb_user.setText("NOMBRE USUARIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("|");

        lbCARGO.setForeground(new java.awt.Color(255, 255, 255));
        lbCARGO.setText("CARGO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_user)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCARGO)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_user)
                    .addComponent(jLabel2)
                    .addComponent(lbCARGO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(56, 98, 127));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(":");

        mm.setForeground(new java.awt.Color(255, 255, 255));
        mm.setText("mm");

        hh.setForeground(new java.awt.Color(255, 255, 255));
        hh.setText("hh");

        ss.setForeground(new java.awt.Color(255, 255, 255));
        ss.setText("ss");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("|");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(jLabel3)
                .addComponent(mm)
                .addComponent(hh)
                .addComponent(ss)
                .addComponent(jLabel9)
                .addComponent(jLabel4))
        );

        fecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("FECHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fecha)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addGap(0, 239, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Contenedor.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Slider1.setText("Ventas");

        llama_interfaz_principal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        llama_interfaz_principal.setText("Generar Venta Boleta");
        llama_interfaz_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llama_interfaz_principalActionPerformed(evt);
            }
        });
        Slider1.add(llama_interfaz_principal);

        jMenuBar1.add(Slider1);

        Slider2.setText("Inventario");

        llamaLibreria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        llamaLibreria.setText("Inventario Libreria");
        llamaLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaLibreriaActionPerformed(evt);
            }
        });
        Slider2.add(llamaLibreria);

        llamaVestuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        llamaVestuario.setText("Inventario Vestuario");
        llamaVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaVestuarioActionPerformed(evt);
            }
        });
        Slider2.add(llamaVestuario);

        llamaCasayPesca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        llamaCasayPesca.setText("Inventario Casa y Pesca");
        llamaCasayPesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaCasayPescaActionPerformed(evt);
            }
        });
        Slider2.add(llamaCasayPesca);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Administracion Inventario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Slider2.add(jMenuItem2);

        jMenuBar1.add(Slider2);

        Slider3.setText("Usuarios");

        llamaUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        llamaUsuarios.setText("Usuario");
        llamaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaUsuariosActionPerformed(evt);
            }
        });
        Slider3.add(llamaUsuarios);

        jMenuBar1.add(Slider3);

        Slider4.setText("Reportes");

        llama_interfaz_informes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        llama_interfaz_informes.setText("Reportes Venta");
        llama_interfaz_informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llama_interfaz_informesActionPerformed(evt);
            }
        });
        Slider4.add(llama_interfaz_informes);

        jMenuBar1.add(Slider4);

        Slider5.setText("Linea de Credito");
        Slider5.setEnabled(false);

        llama_interfaz_linea_credito.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        llama_interfaz_linea_credito.setText("Linea de Credito");
        Slider5.add(llama_interfaz_linea_credito);

        jMenuBar1.add(Slider5);

        Slider6.setText("CAJA");

        jMenuItem3.setText("CAJA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Slider6.add(jMenuItem3);

        jMenuBar1.add(Slider6);

        menu_salir.setText("Cambiar de Usuario");
        menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llama_interfaz_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llama_interfaz_principalActionPerformed
        Venta_b Form = new Venta_b();
        Form.setVisible(true);
        String cargo = lbCARGO.getText();
        switch (cargo) {
            case "LIBRERIA":

                break;
            case "VESTUARIO":

                break;
            case "CASA Y PESCA":

                break;
        }
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llama_interfaz_principalActionPerformed

    private void menu_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_salirMouseClicked
//        interfaz_login il = new interfaz_login();
//        lb_user.setText("NOMBRE USUARIO");
//        lbCARGO.setText("CARGO");
//        il.setVisible(true);
//        this.add(il);
//        Dimension desktopSize = this.getSize();
//        Dimension FrameSize = il.getSize();
//        il.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2 - 60);
//        Contenedor.removeAll();
//        Contenedor.updateUI();
//        Contenedor.add(il);
//
//        timer = new Timer(1000, new cronometro());
//        timer.start();
//        Main.Slider1.setEnabled(false);
//        Main.Slider2.setEnabled(false);
//        Main.Slider3.setEnabled(false);
//        Main.Slider4.setEnabled(false);
//        Main.Slider5.setEnabled(false);
    }//GEN-LAST:event_menu_salirMouseClicked

    private void llamaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaUsuariosActionPerformed
        Usuarios Form = new Usuarios();
        Form.setVisible(true);
        String cargo = lbCARGO.getText();
        switch (cargo) {
            case "LIBRERIA":

                break;
            case "VESTUARIO":

                break;
            case "CASA Y PESCA":

                break;
        }
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llamaUsuariosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Caja Form = new Caja();
        Form.setVisible(true);
        String cargo = lbCARGO.getText();
        switch (cargo) {
            case "LIBRERIA":

                break;
            case "VESTUARIO":

                break;
            case "CASA Y PESCA":

                break;
        }
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void llamaLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaLibreriaActionPerformed
        Inventario Form = new Inventario();
        Form.sql.Tabla_Inventario(1, "LIBRERIA", "");
        Form.categoria = "LIBRERIA";
        Form.setVisible(true);
        String cargo = lbCARGO.getText();
        switch (cargo) {
            case "LIBRERIA":

                break;
            case "VESTUARIO":

                break;
            case "CASA Y PESCA":

                break;
        }
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llamaLibreriaActionPerformed

    private void llamaVestuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaVestuarioActionPerformed
        Inventario Form = new Inventario();
        Form.sql.Tabla_Inventario(1, "VESTUARIO", "");
        Form.categoria = "VESTUARIO";
        Form.setVisible(true);
        String cargo = lbCARGO.getText();
        switch (cargo) {
            case "LIBRERIA":

                break;
            case "VESTUARIO":

                break;
            case "CASA Y PESCA":

                break;
        }
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llamaVestuarioActionPerformed

    private void llamaCasayPescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaCasayPescaActionPerformed
        Inventario Form = new Inventario();
        Form.sql.Tabla_Inventario(1, "CASA Y PESCA", "");
        Form.categoria = "CASA Y PESCA";
        Form.setVisible(true);
        String cargo = lbCARGO.getText();
        switch (cargo) {
            case "LIBRERIA":

                break;
            case "VESTUARIO":

                break;
            case "CASA Y PESCA":

                break;
        }
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llamaCasayPescaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Inventario_Administracion Form = new Inventario_Administracion();
        Form.sql.Tabla_Inventario(1, "", "");
        Form.setVisible(true);
        String cargo = lbCARGO.getText();
        switch (cargo) {
            case "LIBRERIA":

                break;
            case "VESTUARIO":

                break;
            case "CASA Y PESCA":

                break;
        }
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void llama_interfaz_informesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llama_interfaz_informesActionPerformed
        Reportes Form = new Reportes();
        Form.setVisible(true);
        String cargo = lbCARGO.getText();
        switch (cargo) {
            case "LIBRERIA":

                break;
            case "VESTUARIO":

                break;
            case "CASA Y PESCA":

                break;
        }
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llama_interfaz_informesActionPerformed

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
            java.util.logging.Logger.getLogger(Marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Contenedor;
    public static javax.swing.JMenu Slider1;
    public static javax.swing.JMenu Slider2;
    public static javax.swing.JMenu Slider3;
    public static javax.swing.JMenu Slider4;
    public static javax.swing.JMenu Slider5;
    public static javax.swing.JMenu Slider6;
    public static javax.swing.JLabel fecha;
    public static javax.swing.JLabel hh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lbCARGO;
    public static javax.swing.JLabel lb_user;
    private javax.swing.JMenuItem llamaCasayPesca;
    private javax.swing.JMenuItem llamaLibreria;
    private javax.swing.JMenuItem llamaUsuarios;
    private javax.swing.JMenuItem llamaVestuario;
    private javax.swing.JMenuItem llama_interfaz_informes;
    public static javax.swing.JMenuItem llama_interfaz_linea_credito;
    private javax.swing.JMenuItem llama_interfaz_principal;
    private javax.swing.JMenu menu_salir;
    public static javax.swing.JLabel mm;
    public static javax.swing.JLabel ss;
    // End of variables declaration//GEN-END:variables
}
