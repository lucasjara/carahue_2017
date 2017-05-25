/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

//import interfaces.Main;
//import interfaces.interfaz_usuarios2;
import consultas.ConsultasSQL_Abonos;
import consultas.ConsultasSQL_Clientes;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.HistorialAbonos;
//import metodos.ConsultasSQL;

/**
 *
 * @author Zoidiano
 */
public class JPanelModAbonos extends javax.swing.JPanel {

    ConsultasSQL_Abonos sql = new ConsultasSQL_Abonos();
    ConsultasSQL_Clientes sql2 = new ConsultasSQL_Clientes();

    public JPanelModAbonos() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelNuevoCredito = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNumerodeVenta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtAbonado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNuevoAbono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDeuda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        lblCredito = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistadoclientescredito = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRutCredito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalCredito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAbonadoCredito = new javax.swing.JTextField();
        btnlimpiarrut = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCreditoDisponible = new javax.swing.JTextField();

        setBackground(new java.awt.Color(88, 147, 191));

        JPanelNuevoCredito.setBackground(new java.awt.Color(88, 147, 191));
        JPanelNuevoCredito.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(88, 147, 191));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NOMBRE CLIENTE:");

        txtNombreCliente.setEnabled(false);

        BtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar32.png"))); // NOI18N
        BtnLimpiar.setText("HISTORIAL DE ABONOS");
        BtnLimpiar.setEnabled(false);
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close32.png"))); // NOI18N
        BtnCancelar.setText("CERRAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar32.png"))); // NOI18N
        BtnModificar.setText("MODIFICAR");
        BtnModificar.setEnabled(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NUMERO VENTA:");

        txtNumerodeVenta.setEnabled(false);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ABONADO:");

        txtAbonado.setEnabled(false);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TOTAL A PAGAR:");

        txtTotal.setEnabled(false);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NUEVO ABONADO:");

        txtNuevoAbono.setEnabled(false);
        txtNuevoAbono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNuevoAbonoKeyReleased(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DEUDA:");

        txtDeuda.setEnabled(false);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("FECHA ENTREGA:");

        DateChooser.setDateFormatString("dd/MM/yyyy");
        DateChooser.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNuevoAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDeuda))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(txtNumerodeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumerodeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNuevoAbono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(88, 147, 191));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblCredito.setBackground(new java.awt.Color(88, 147, 191));
        lblCredito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCredito.setForeground(new java.awt.Color(255, 255, 255));
        lblCredito.setText("CREDITO DEL CLIENTE");

        tblistadoclientescredito = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Desabilitar Editable
            }
        };
        tblistadoclientescredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero Venta", "Abonado", "Total"
            }
        ));
        tblistadoclientescredito.getTableHeader().setResizingAllowed(false);
        tblistadoclientescredito.getTableHeader().setReorderingAllowed(false);
        tblistadoclientescredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblistadoclientescreditoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblistadoclientescredito);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(88, 147, 191));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DATOS CLIENTE:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RUT:");

        txtRutCredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutCreditoFocusLost(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL CREDITO:");

        txtTotalCredito.setEnabled(false);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CREDITO USADO:");

        txtAbonadoCredito.setEnabled(false);

        btnlimpiarrut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnlimpiarrut.setText("LIMPIAR");
        btnlimpiarrut.setEnabled(false);
        btnlimpiarrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarrutActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CREDITO DISPONIBLE:");

        txtCreditoDisponible.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRutCredito))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalCredito))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCreditoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAbonadoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnlimpiarrut, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRutCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbonadoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCreditoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlimpiarrut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanelNuevoCreditoLayout = new javax.swing.GroupLayout(JPanelNuevoCredito);
        JPanelNuevoCredito.setLayout(JPanelNuevoCreditoLayout);
        JPanelNuevoCreditoLayout.setHorizontalGroup(
            JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelNuevoCreditoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelNuevoCreditoLayout.setVerticalGroup(
            JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JPanelNuevoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JPanelNuevoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutCreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutCreditoFocusLost
        try {
            if (sql2.ValidarRut(txtRutCredito.getText())) {
                String rut = txtRutCredito.getText();
                txtRutCredito.setText(sql2.formatear(rut));
                //consulta existencia rut
                if (sql2.ConsultarRutCliente(txtRutCredito.getText())) {
                    sql.Tabla_Credito(2, txtRutCredito.getText());
                    int total_disponible = 0;
                    int total_credito = 500000; // Obtener por SQL
                    txtTotalCredito.setText(Integer.toString(total_credito));
                    btnlimpiarrut.setEnabled(true);
                    int total_ocupado = 0;
                    for (int i = 0; i < tblistadoclientescredito.getRowCount(); i++) {
                        total_ocupado = Integer.parseInt(tblistadoclientescredito.getValueAt(i, 2).toString()) + total_ocupado;
                    }
                    total_disponible = total_credito - total_ocupado;
                    txtCreditoDisponible.setText(Integer.toString(total_disponible));
                    txtAbonadoCredito.setText(Integer.toString(total_ocupado));
                } else {
                    JOptionPane.showMessageDialog(null, "El rut del cliente no se encuentra registrado");
                    // desabilitar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Rut ingresado no es valido");
                txtRutCredito.setText("");
                //desabilitar();

            }
        } catch (Exception e) {
            txtRutCredito.setText("");
        }
    }//GEN-LAST:event_txtRutCreditoFocusLost

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        //Main.llama_interfaz_linea_credito.doClick();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void tblistadoclientescreditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblistadoclientescreditoMouseClicked
        int fila = tblistadoclientescredito.getSelectedRow();
        //int numero = Integer.parseInt(tbproductosListado.getValueAt(fila, 3).toString());
        txtNumerodeVenta.setText(tblistadoclientescredito.getValueAt(fila, 0).toString());
        txtNombreCliente.setText("LUCAS JARA ESPINOZA");
        txtAbonado.setText(tblistadoclientescredito.getValueAt(fila, 1).toString());
        txtTotal.setText(tblistadoclientescredito.getValueAt(fila, 2).toString());

        txtNuevoAbono.setEnabled(true);
        //sql.ConsultarFechaEntrega(tblistadoclientescredito.getValueAt(fila, 0).toString());
        BtnModificar.setEnabled(true);
        BtnLimpiar.setEnabled(true);
    }//GEN-LAST:event_tblistadoclientescreditoMouseClicked

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        try {
            if (txtDeuda.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "La deuda se encuentra pagada");
            } else if (DateChooser.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una fecha de termino");
            } else if (Integer.parseInt(txtNuevoAbono.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "El Abono debe ser mayor a 0");
            } else if (Integer.parseInt(txtDeuda.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "La deuda no puede ser menor a 0");
            } else {
                int NuevoAbono = Integer.parseInt(txtNuevoAbono.getText());
                int total_abonado = Integer.parseInt(txtAbonado.getText()) + NuevoAbono;
                int numero_venta = Integer.parseInt(txtNumerodeVenta.getText());
                NuevoAbono(NuevoAbono, numero_venta);
                Date fecha = DateChooser.getDate();
                LocalDate fecha_termino = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                ModificarCredito(total_abonado, fecha_termino);
                sql.Tabla_Credito(2, txtRutCredito.getText());
                Limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void txtNuevoAbonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoAbonoKeyReleased
        try {
            int total = Integer.parseInt(txtTotal.getText());
            int Abonado = Integer.parseInt(txtAbonado.getText());
            int Nuevo_Abono = Integer.parseInt(txtNuevoAbono.getText());
            int deuda = (total) - (Abonado + Nuevo_Abono);
            txtDeuda.setText(Integer.toString(deuda));
            DateChooser.setEnabled(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtNuevoAbonoKeyReleased

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        //Historial de ese codigo cliente
        HistorialAbonos ha = new HistorialAbonos();
        ha.setLocationRelativeTo(null);
        ha.setVisible(true);
        sql.Tabla_HistorialAbonos(Integer.parseInt(txtNumerodeVenta.getText()));
        //Limpiar();
        
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void btnlimpiarrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarrutActionPerformed
        txtTotalCredito.setText("");
        txtAbonadoCredito.setText("");
        txtNombreCliente.setText("");
        txtNumerodeVenta.setText("");
        txtAbonado.setText("");
        txtNumerodeVenta.setText("");
        Limpiar();
        btnlimpiarrut.setEnabled(false);
        txtRutCredito.setText("");
        txtCreditoDisponible.setText("");
        LimpiarTabla();
    }//GEN-LAST:event_btnlimpiarrutActionPerformed
    private void NuevoAbono(int CantidadAbonada, int cod_venta) {
        LocalDate fecha_actual = LocalDate.now();
        int id_usuario = 4;
        sql.NuevoAbono(CantidadAbonada, fecha_actual, cod_venta, id_usuario);

    }

    private void ModificarCredito(int abonoacumulado, LocalDate fecha_termino) {
        sql.ModificarCredito(abonoacumulado, fecha_termino, Integer.parseInt(txtNumerodeVenta.getText()));
    }

    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblistadoclientescredito.getModel();
        int filas = tblistadoclientescredito.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
    }

    void Limpiar() {
        txtNuevoAbono.setText("");
        txtDeuda.setText("");
        DateChooser.setEnabled(false);
        txtNuevoAbono.setEnabled(false);
        BtnModificar.setEnabled(false);
        BtnLimpiar.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    public static com.toedter.calendar.JDateChooser DateChooser;
    public static javax.swing.JPanel JPanelNuevoCredito;
    private javax.swing.JButton btnlimpiarrut;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblCredito;
    public static javax.swing.JTable tblistadoclientescredito;
    private javax.swing.JTextField txtAbonado;
    private javax.swing.JTextField txtAbonadoCredito;
    private javax.swing.JTextField txtCreditoDisponible;
    private javax.swing.JTextField txtDeuda;
    public static javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNuevoAbono;
    private javax.swing.JTextField txtNumerodeVenta;
    private javax.swing.JTextField txtRutCredito;
    private javax.swing.JTextField txtTotal;
    public static javax.swing.JTextField txtTotalCredito;
    // End of variables declaration//GEN-END:variables
}
