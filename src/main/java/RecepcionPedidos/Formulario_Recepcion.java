package RecepcionPedidos;

import ClientesClass.AgregarEmpresa;
import ClientesClass.AgregarCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Formulario_Recepcion extends javax.swing.JFrame {
    
    
    public Formulario_Recepcion() {
        initComponents();
    }
    
    public static ArrayList<Pedido> Lista1 = new ArrayList<>();    
    AgregarCliente AgregarClienteF_Recep = new AgregarCliente();
    AgregarEmpresa AgregarEmpresaF_Recep = new AgregarEmpresa();
    AgregarPedido AgregarPedidoTabla = new AgregarPedido();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TITULO = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ValordeBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPedir = new javax.swing.JTable();
        GuardarPedido = new javax.swing.JButton();
        BuscarCliente = new javax.swing.JButton();
        NuevoCliente = new javax.swing.JButton();
        NuevaEmpresa = new javax.swing.JButton();
        NumeroContacto = new javax.swing.JLabel();
        btnAgregarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TITULO.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 102, 102));
        TITULO.setText("FORMULARIO RECEPCION");

        Nombres.setText("Nombre(s) :");

        Apellidos.setText("Apellidos :");

        jLabel2.setText("DATOS DEL CLIENTE");

        jLabel3.setText("Ingresar DNI/RUC");

        jLabel4.setText("DETALLES DE PEDIDO/SERVICIO");

        jLabel7.setText("Cantidad de Llantas");

        jLabel8.setText("Fecha de Recepción");

        jLabel9.setText("Nro. de Guia");

        jLabel10.setText("0000");

        jLabel11.setText("00/00/0000");

        jLabel13.setText("000");

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

        GuardarPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GuardarPedido.setText("Guardar Pedido");
        GuardarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPedidoActionPerformed(evt);
            }
        });

        BuscarCliente.setText("Buscar");

        NuevoCliente.setText("Nuevo Cliente");
        NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoClienteActionPerformed(evt);
            }
        });

        NuevaEmpresa.setText("Nueva Empresa");
        NuevaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaEmpresaActionPerformed(evt);
            }
        });

        NumeroContacto.setText("N° Telefono / Celular :");

        btnAgregarPedido.setText("Agregar Pedido");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GuardarPedido)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(ValordeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BuscarCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(NumeroContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregarPedido))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(NuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NuevaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(TITULO)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITULO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BuscarCliente)
                    .addComponent(NuevoCliente)
                    .addComponent(ValordeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaEmpresa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombres)
                    .addComponent(NumeroContacto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Apellidos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnAgregarPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(GuardarPedido)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPedidoActionPerformed
        
    }//GEN-LAST:event_GuardarPedidoActionPerformed

    private void NuevaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaEmpresaActionPerformed
                
        if(!AgregarEmpresaF_Recep.isShowing())
	{   
            AgregarEmpresaF_Recep.setVisible(true);
	}
	else
	{
            JOptionPane.showMessageDialog(null, "Ventana Abierta");
	}        
    }//GEN-LAST:event_NuevaEmpresaActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
        
        if(!AgregarPedidoTabla.isShowing())
	{   
            AgregarPedidoTabla.setVisible(true);
	}
	else
	{
            JOptionPane.showMessageDialog(null, "Ventana Abierta");
	}
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClienteActionPerformed
               
        if(!AgregarEmpresaF_Recep.isShowing())
	{   
            AgregarEmpresaF_Recep.setVisible(true);
	}
	else
	{
            JOptionPane.showMessageDialog(null, "Ventana Abierta");
	}
    }//GEN-LAST:event_NuevoClienteActionPerformed
    
    
   
    public static void LlenarMatriz(ArrayList<Pedido> Lista)
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
    }
   
        
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
            java.util.logging.Logger.getLogger(Formulario_Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Recepcion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JButton BuscarCliente;
    private javax.swing.JButton GuardarPedido;
    private javax.swing.JLabel Nombres;
    private javax.swing.JButton NuevaEmpresa;
    private javax.swing.JButton NuevoCliente;
    private javax.swing.JLabel NumeroContacto;
    private javax.swing.JLabel TITULO;
    public static javax.swing.JTable TablaPedir;
    private javax.swing.JTextField ValordeBusqueda;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
