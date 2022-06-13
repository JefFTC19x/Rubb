/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.companyRubbers.srl;

import DocsTxt.OnlyLocal;
import MenuInicial.PanelMenu;
/* @author Jefferson Torres */
public class Conexion_bd_rbrs extends javax.swing.JFrame {
   
    public Conexion_bd_rbrs() 
    {
        initComponents();
        this.setTitle("Gestión Rubbers");
        this.setLocationRelativeTo(Conexion_bd_rbrs.this);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelLogin = new javax.swing.JPanel();
        TituloPanel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UsPass = new javax.swing.JPasswordField();
        UsNa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TituloPanel.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        TituloPanel.setForeground(new java.awt.Color(0, 102, 51));
        TituloPanel.setText(" RUBBERS");

        jLabel1.setText("USUARIO            :");

        jLabel2.setText("CONTRASEÑA   :");

        BtnIngresar.setText("Ingresar");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addComponent(BtnIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSalir)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UsPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsNa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))))
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(TituloPanel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(TituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UsNa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnIngresar)
                    .addComponent(BtnSalir))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        OnlyLocal enlace = new OnlyLocal();
        //String b ="Rubbers";
        String b = enlace.ReadOn();
        conexion_bd_sql log_In = new conexion_bd_sql();
        if(b!=null)
        {
            log_In.getConect(b,UsNa.getText(), UsPass.getPassword());
        
            if(log_In.link_up !=null) 
            {
                PanelMenu panelmenu =new PanelMenu();
                panelmenu.setVisible(true);
                dispose();
            }
        }        
    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_BtnSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conexion_bd_rbrs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JLabel TituloPanel;
    private javax.swing.JTextField UsNa;
    private javax.swing.JPasswordField UsPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
