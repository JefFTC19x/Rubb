
package MenuInicial;

public class ListaGuiasActivasPanel extends javax.swing.JInternalFrame {

    public ListaGuiasActivasPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaGuiasActivas = new javax.swing.JTable();
        btnModificarGuia = new javax.swing.JButton();
        btnCerrarDetalleGuia = new javax.swing.JButton();

        TITULO.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 102, 102));
        TITULO.setText("BUSCAR EN GUIAS ACTIVAS");

        TablaGuiasActivas.setModel(new javax.swing.table.DefaultTableModel(
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaGuiasActivas.setRowHeight(25);
        jScrollPane2.setViewportView(TablaGuiasActivas);
        if (TablaGuiasActivas.getColumnModel().getColumnCount() > 0) {
            TablaGuiasActivas.getColumnModel().getColumn(0).setResizable(false);
            TablaGuiasActivas.getColumnModel().getColumn(1).setResizable(false);
            TablaGuiasActivas.getColumnModel().getColumn(2).setResizable(false);
            TablaGuiasActivas.getColumnModel().getColumn(3).setResizable(false);
            TablaGuiasActivas.getColumnModel().getColumn(4).setResizable(false);
            TablaGuiasActivas.getColumnModel().getColumn(5).setResizable(false);
        }

        btnModificarGuia.setText("BUSCAR");
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
                .addGap(310, 310, 310)
                .addComponent(TITULO)
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrarDetalleGuia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarGuia, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TITULO)
                .addGap(23, 23, 23)
                .addComponent(btnModificarGuia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(btnCerrarDetalleGuia))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
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
    private javax.swing.JLabel TITULO;
    public static javax.swing.JTable TablaGuiasActivas;
    private javax.swing.JButton btnCerrarDetalleGuia;
    private javax.swing.JButton btnModificarGuia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
