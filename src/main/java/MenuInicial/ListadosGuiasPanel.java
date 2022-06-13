
package MenuInicial;

public class ListadosGuiasPanel extends javax.swing.JInternalFrame {

    public ListadosGuiasPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTotalGuias = new javax.swing.JTable();
        btnModificarGuia = new javax.swing.JButton();
        btnCerrarDetalleGuia = new javax.swing.JButton();

        TITULO.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 102, 102));
        TITULO.setText("BUCAR EN TODAS LAS GUIAS");

        TablaTotalGuias.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaTotalGuias.setRowHeight(25);
        jScrollPane2.setViewportView(TablaTotalGuias);
        if (TablaTotalGuias.getColumnModel().getColumnCount() > 0) {
            TablaTotalGuias.getColumnModel().getColumn(0).setResizable(false);
            TablaTotalGuias.getColumnModel().getColumn(1).setResizable(false);
            TablaTotalGuias.getColumnModel().getColumn(2).setResizable(false);
            TablaTotalGuias.getColumnModel().getColumn(3).setResizable(false);
            TablaTotalGuias.getColumnModel().getColumn(4).setResizable(false);
            TablaTotalGuias.getColumnModel().getColumn(5).setResizable(false);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TITULO)
                .addGap(306, 306, 306))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCerrarDetalleGuia)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificarGuia)
                                .addGap(19, 19, 19))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TITULO)
                .addGap(42, 42, 42)
                .addComponent(btnModificarGuia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrarDetalleGuia))
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
    public static javax.swing.JTable TablaTotalGuias;
    private javax.swing.JButton btnCerrarDetalleGuia;
    private javax.swing.JButton btnModificarGuia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
