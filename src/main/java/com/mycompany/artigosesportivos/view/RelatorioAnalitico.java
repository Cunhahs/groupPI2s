package com.mycompany.artigosesportivos.view;

import com.mycompany.artigosesportivos.controller.RelatorioController;
import com.mycompany.artigosesportivos.model.Relatorio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicolly.crsouza
 */
public class RelatorioAnalitico extends javax.swing.JFrame {

    private int idVenda = 0;
    private String nomeCliente;
    private String dataVenda;
    private double valorTotal = 0.0;
    
    /**
     * Creates new form RelatorioAnalitico
     */
    
    public RelatorioAnalitico(int idVenda, String nomeCliente, Date dataVenda, double valorTotal) {
        initComponents();
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strData = dateFormat.format(dataVenda);
        
        lblDataVendaBD.setText(strData);
        lblNomeClienteBD.setText(nomeCliente);
        String valorTotalstr = Double.toString(valorTotal);
        lblValorTotalBD.setText(valorTotalstr);
        String idVendastr = Integer.toString(idVenda);
        lblIDVenda.setText(idVendastr);
        
        ArrayList<Relatorio> listaRelatorio = RelatorioController.consultaIndividual(idVenda);
        
        DefaultTableModel tmRelatorioAnalitico = new DefaultTableModel();
        
        tmRelatorioAnalitico.addColumn("Produtos");
        tmRelatorioAnalitico.addColumn("Quantidade de produtos");
        tblDetalhes.setModel(tmRelatorioAnalitico);
        
        tmRelatorioAnalitico.setRowCount(0);
        
        for (Relatorio r : listaRelatorio) {
            tmRelatorioAnalitico.addRow(new Object[]{r.getProdutos(), r.getQtdProdutos()});
        }
    }

    public RelatorioAnalitico(){
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNomeClienteBD = new javax.swing.JLabel();
        lblValorTotalBD = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhes = new javax.swing.JTable();
        lblRelatorioAnalitico = new javax.swing.JLabel();
        lblDataVenda = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        lblIDVenda = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblDataVendaBD = new javax.swing.JLabel();
        lblVenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeClienteBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeClienteBD.setText("Nome completo");

        lblValorTotalBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValorTotalBD.setText("00,00");

        tblDetalhes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblDetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto(s)", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tblDetalhes);

        lblRelatorioAnalitico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRelatorioAnalitico.setText("Relat??rio Anal??tico");

        lblDataVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataVenda.setText("Data da venda:");

        lblValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValorTotal.setText("Valor total: R$");

        lblIDVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIDVenda.setText("00");

        lblCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliente.setText("Cliente:");

        lblDataVendaBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataVendaBD.setText("dd/MM/yyyy");

        lblVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVenda.setText("ID da Venda:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDataVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDataVendaBD))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNomeClienteBD))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorTotalBD))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIDVenda))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(lblRelatorioAnalitico)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioAnalitico)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(lblNomeClienteBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataVenda)
                    .addComponent(lblDataVendaBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorTotal)
                    .addComponent(lblValorTotalBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVenda)
                    .addComponent(lblIDVenda))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioAnalitico().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblDataVendaBD;
    private javax.swing.JLabel lblIDVenda;
    private javax.swing.JLabel lblNomeClienteBD;
    private javax.swing.JLabel lblRelatorioAnalitico;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblValorTotalBD;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JTable tblDetalhes;
    // End of variables declaration//GEN-END:variables
}
