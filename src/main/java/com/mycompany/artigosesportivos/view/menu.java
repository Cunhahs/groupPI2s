/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.artigosesportivos.view;

/**
 *
 * @author User
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        lblLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jmiAbrirPDV = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jmiAbrirClientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiAbrirProdutos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiAbrirRelatorios = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmiAbrirSobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/output-onlinepngtools.png"))); // NOI18N

        jMenu8.setText("Ponto de Venda");

        jmiAbrirPDV.setText("Abrir");
        jmiAbrirPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbrirPDVActionPerformed(evt);
            }
        });
        jMenu8.add(jmiAbrirPDV);

        jMenuBar1.add(jMenu8);

        jMenu7.setText("Clientes");

        jmiAbrirClientes.setText("Abrir");
        jmiAbrirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbrirClientesActionPerformed(evt);
            }
        });
        jMenu7.add(jmiAbrirClientes);

        jMenuBar1.add(jMenu7);

        jMenu2.setText("Produtos");

        jmiAbrirProdutos.setText("Abrir");
        jMenu2.add(jmiAbrirProdutos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        jmiAbrirRelatorios.setText("Abrir");
        jMenu3.add(jmiAbrirRelatorios);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Sobre");

        jmiAbrirSobre.setText("Abrir");
        jMenu6.add(jmiAbrirSobre);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblLogo)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblLogo)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAbrirPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbrirPDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiAbrirPDVActionPerformed

    private void jmiAbrirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbrirClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiAbrirClientesActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmiAbrirClientes;
    private javax.swing.JMenuItem jmiAbrirPDV;
    private javax.swing.JMenuItem jmiAbrirProdutos;
    private javax.swing.JMenuItem jmiAbrirRelatorios;
    private javax.swing.JMenuItem jmiAbrirSobre;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
