
package MenuInicial;

public class ListaGuiasCerradasPanel extends javax.swing.JInternalFrame {

    public ListaGuiasCerradasPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaGuiasCerradas = new javax.swing.JTable();
        btnModificarGuia = new javax.swing.JButton();
        btnCerrarDetalleGuia = new javax.swing.JButton();

        TITULO.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 102, 102));
        TITULO.setText("BUSCAR EN GUIAS CERRADAS");

        TablaGuiasCerradas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaGuiasCerradas.setRowHeight(25);
        jScrollPane2.setViewportView(TablaGuiasCerradas);
        if (TablaGuiasCerradas.getColumnModel().getColumnCount() > 0) {
            TablaGuiasCerradas.getColumnModel().getColumn(0).setResizable(false);
            TablaGuiasCerradas.getColumnModel().getColumn(1).setResizable(false);
            TablaGuiasCerradas.getColumnModel().getColumn(2).setResizable(false);
            TablaGuiasCerradas.getColumnModel().getColumn(3).setResizable(false);
            TablaGuiasCerradas.getColumnModel().getColumn(4).setResizable(false);
            TablaGuiasCerradas.getColumnModel().getColumn(5).setResizable(false);
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
                .addGap(295, 295, 295)
                .addComponent(TITULO)
                .addContainerGap(314, Short.MAX_VALUE))
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
                .addGap(19, 19, 19)
                .addComponent(btnModificarGuia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addComponent(btnCerrarDetalleGuia))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
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
    public static javax.swing.JTable TablaGuiasCerradas;
    private javax.swing.JButton btnCerrarDetalleGuia;
    private javax.swing.JButton btnModificarGuia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
