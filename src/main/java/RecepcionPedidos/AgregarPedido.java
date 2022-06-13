
package RecepcionPedidos;

import static RecepcionPedidos.Formulario_Recepcion.TablaPedir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AgregarPedido extends javax.swing.JFrame {
    
    public AgregarPedido() {
        initComponents();
    }
    public static ArrayList<Pedido> Lista2 = new ArrayList<>();
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        txtMedida = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAgregarPedido = new javax.swing.JButton();
        txtCantidad1 = new javax.swing.JLabel();
        valMarca = new javax.swing.JComboBox<>();
        txtDOT = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        valDOT = new javax.swing.JTextField();
        valCodigo = new javax.swing.JTextField();
        valMedida = new javax.swing.JComboBox<>();
        valBanda = new javax.swing.JComboBox<>();
        valCantidad = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        Titulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 204));
        Titulo.setText("AGREGAR PEDIDO");

        txtMarca.setText("Marca");

        txtMedida.setText("Medida");

        txtCantidad.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnAgregarPedido.setText("Agregar");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        txtCantidad1.setText("Banda");

        valMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtDOT.setText("DOT");

        txtCodigo.setText("Codigo");

        valCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valCodigoActionPerformed(evt);
            }
        });

        valMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        valBanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad)
                    .addComponent(txtMedida)
                    .addComponent(txtCantidad1)
                    .addComponent(valMarca, 0, 170, Short.MAX_VALUE)
                    .addComponent(txtDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valBanda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valCodigo)
                    .addComponent(valDOT)
                    .addComponent(valCantidad))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(Titulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valBanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valDOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarPedido)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valCodigoActionPerformed
     
    }//GEN-LAST:event_valCodigoActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
        
         if (valMarca.getItemAt(valMarca.getSelectedIndex())!= null || valDOT.getText().length()!= 0 ||
            valCodigo.getText().length()!= 0 || valMedida.getItemAt(valMedida.getSelectedIndex())!= null ||
            valBanda.getItemAt(valBanda.getSelectedIndex())!= null || (Integer)valCantidad.getValue()!= 0  ) 
        {
            
            Pedido valores = new Pedido(
                    valMarca.getItemAt(valMarca.getSelectedIndex()),
                    valMedida.getItemAt(valMedida.getSelectedIndex()),
                    valBanda.getItemAt(valBanda.getSelectedIndex()),                    
                    Integer.parseInt(valCantidad.getValue().toString()),
                    valDOT.getText(),
                    valCodigo.getText());
            
            Lista2.add(valores);
            LlenarMatriz2(Lista2);
            
        valMarca.setSelectedIndex(0);valDOT.setText("");valCodigo.setText("");
        valMedida.setSelectedIndex(0);valBanda.setSelectedIndex(0);valCantidad.setValue(0);            
        }
         else{ 
         JOptionPane.showMessageDialog(null,"No se aceptan Valores vacios");
        }        
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed
    
    
   
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
            java.util.logging.Logger.getLogger(AgregarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AgregarPedido().setVisible(true);
        });
    }
   
    public static void LlenarMatriz2(ArrayList<Pedido> Lista)
    {
        String[][] MatrizA = new String [Lista.size()][6];
        
        for(int i = 0;i<Lista.size();i++)
        {
            MatrizA[i][0] = Lista.get(i).getMarca();
            MatrizA[i][1] = Lista.get(i).getDOT();
            MatrizA[i][2] = Lista.get(i).getCodigo();
            MatrizA[i][3] = Lista.get(i).getMedida();
            MatrizA[i][4] = Lista.get(i).getBanda();            
            MatrizA[i][5] = Integer.toString(Lista.get(i).getCantidad());                         
        }      
        ActualizarTabla2(MatrizA);
    }
    public static void ActualizarTabla2(String[][] Matrix2 ){
//        for(int i =0; i<Lista2.size();i++)
//        {
//        System.out.println(
//         Matrix2[i][0]+" "+Matrix2[i][1]+" "
//        +Matrix2[i][2]+" "+Matrix2[i][3]+" "
//        +Matrix2[i][4]+" "+Matrix2[i][5] );        
//        }
        Formulario_Recepcion.TablaPedir.setModel(new javax.swing.table.DefaultTableModel(
            Matrix2,
            new String [] {
                "Marca", "DOT", "Codigo", "Medida", "Banda", "Cantidad"
            }                
        ));  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtDOT;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtMedida;
    private javax.swing.JComboBox<String> valBanda;
    private javax.swing.JSpinner valCantidad;
    public static javax.swing.JTextField valCodigo;
    public static javax.swing.JTextField valDOT;
    private javax.swing.JComboBox<String> valMarca;
    private javax.swing.JComboBox<String> valMedida;
    // End of variables declaration//GEN-END:variables
}
