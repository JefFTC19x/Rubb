
package MenuInicial;

public class DetalleGuiaPanel extends javax.swing.JInternalFrame {

    public DetalleGuiaPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TITULO = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPedir = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NumeroContacto = new javax.swing.JLabel();
        btnModificarGuia = new javax.swing.JButton();
        btnCerrarDetalleGuia = new javax.swing.JButton();

        jLabel4.setText("DETALLES DE PEDIDO/SERVICIO");

        jLabel7.setText("Cantidad de Llantas");

        jLabel8.setText("Fecha de Recepción");

        jLabel9.setText("Nro. de Guia");

        jLabel10.setText("0000");

        TITULO.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 102, 102));
        TITULO.setText("DETALLE DE GUIA");

        jLabel11.setText("00/00/0000");

        Nombres.setText("Nombre(s) :");

        jLabel13.setText("000");

        Apellidos.setText("Apellidos :");

        TablaPedir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "DOT", "Codigo", "Medida", "Banda", "Cantidad"
            }
        ));
        TablaPedir.setRowHeight(25);
        jScrollPane2.setViewportView(TablaPedir);

        jLabel2.setText("DATOS DEL CLIENTE");

        jLabel3.setText("DNI/RUC:");

        NumeroContacto.setText("N° Telefono / Celular :");

        btnModificarGuia.setText("Modificar Guia");
        btnModificarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGuiaActionPerformed(evt);
            }
        });

        btnCerrarDetalleGuia.setText("Cerrar");
        btnCerrarDetalleGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarDetalleGuiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(352, 352, 352)
                                .addComponent(TITULO))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 356, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModificarGuia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCerrarDetalleGuia)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane2)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel13)
                                    .addGap(143, 143, 143)
                                    .addComponent(jLabel9)
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel10)
                                    .addGap(149, 149, 149)
                                    .addComponent(jLabel8)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel11))
                                .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(429, 429, 429)
                                    .addComponent(NumeroContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(20, 91, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITULO)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nombres)
                .addGap(35, 35, 35)
                .addComponent(btnModificarGuia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(btnCerrarDetalleGuia))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel2)
                    .addGap(40, 40, 40)
                    .addComponent(NumeroContacto)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Apellidos)
                    .addGap(21, 21, 21)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel13)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel8)
                        .addComponent(jLabel11))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGuiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarGuiaActionPerformed

    private void btnCerrarDetalleGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarDetalleGuiaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarDetalleGuiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Nombres;
    private javax.swing.JLabel NumeroContacto;
    private javax.swing.JLabel TITULO;
    public static javax.swing.JTable TablaPedir;
    private javax.swing.JButton btnCerrarDetalleGuia;
    private javax.swing.JButton btnModificarGuia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
