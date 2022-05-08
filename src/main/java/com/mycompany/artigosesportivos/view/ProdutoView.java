/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.artigosesportivos.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mycompany.artigosesportivos.model.Produto;
import com.mycompany.artigosesportivos.controller.ProdutoController;

/**
 *
 * @author User
 */
public class ProdutoView extends javax.swing.JFrame {

    /**
     * Creates new form Produto
     */
     public String modoTela = "Criação";
     Produto objProduto;
    
    
    
    
    public ProdutoView() {
        initComponents();
        objProduto = new Produto();
        setLocationRelativeTo(null);
        listarProdutos();
    
    
    
    
    }
    
    public ProdutoView(Produto p) {
        initComponents();
        this.objProduto = p;
        this.txtProduto.setText(p.getDescricaoProduto());
        this.txtMarca.setText(p.getMarca());
        this.cboCategoria.setSelectedItem(p);
        this.txtQtdeEstoque.setText(String.valueOf(p.getQtdeEstoque()));
        this.txtValorUnitario.setText(String.valueOf(p.getValorUnitario()));
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        grupoConsultaProduto = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCodProduto = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        lblDescricaoProduto = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        lblQtdeEstoque = new javax.swing.JLabel();
        txtQtdeEstoque = new javax.swing.JTextField();
        btnAdiciionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        lblValorUnitario = new javax.swing.JLabel();
        txtValorUnitario = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        cboCategoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produto");

        lblCodProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodProduto.setText("Cód. Produto");
        lblCodProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCodProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdutoActionPerformed(evt);
            }
        });
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyTyped(evt);
            }
        });

        lblDescricaoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescricaoProduto.setText("Produto");
        lblDescricaoProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });
        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProdutoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdutoKeyTyped(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca.setText("Marca");
        lblMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        lblCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCategoria.setText("Categoria");
        lblCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblQtdeEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQtdeEstoque.setText("Qtde em Estoque");
        lblQtdeEstoque.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtQtdeEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQtdeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdeEstoqueActionPerformed(evt);
            }
        });
        txtQtdeEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtdeEstoqueKeyTyped(evt);
            }
        });

        btnAdiciionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdiciionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-icon.png"))); // NOI18N
        btnAdiciionar.setText("Adicionar");
        btnAdiciionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdiciionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdiciionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdiciionarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash-icon.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pencil-icon.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.setInheritsPopupMenu(true);
        btnAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view-icon.png"))); // NOI18N
        btnConsulta.setText("Consulta");
        btnConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        lblValorUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValorUnitario.setText("Valor Unitário");
        lblValorUnitario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtValorUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitarioActionPerformed(evt);
            }
        });
        txtValorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnitarioKeyTyped(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod. Produto", "Descrição do Produto", "Marca", "Categoria", "Qtde em Estoque", "Valor Unitario"
            }
        ));
        jScrollPane3.setViewportView(tblProduto);

        cboCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Academia e Fitness", "Boxe e Artes Marciais", "Camping, Trilha e Neve", "Ciclismo", "Corrida e Caminhada", "Futebol, Volei e Basquete", "Esportes Aquaticos" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Look-icon.png"))); // NOI18N
        jButton1.setText("Consulta por Codigo");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Look-icon.png"))); // NOI18N
        jButton2.setText("Consulta por Produto");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAdiciionar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescricaoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCodProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQtdeEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtValorUnitario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtdeEstoque)
                            .addComponent(cboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jButton2)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoria)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(lblQtdeEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodProduto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricaoProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txtQtdeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnAdiciionar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<String> mensagensErro = new ArrayList<>();


    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        
        if (tblProduto.getRowCount() > 0) {

            //Resgato o número da linha pelo JTable
            int numeroLinha = tblProduto.getSelectedRow();

            if (numeroLinha < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um Produto da tabela!");

            } else {

                //int idProduto = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
                int CodProduto = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());                
                String Produto = tblProduto.getModel().getValueAt(numeroLinha, 1).toString();
                String Marca = tblProduto.getModel().getValueAt(numeroLinha, 2).toString();
                String Categoria = tblProduto.getModel().getValueAt(numeroLinha, 3).toString();
                String qtdeEstoque = (tblProduto.getModel().getValueAt(numeroLinha, 4).toString());
                String ValorUnitario = (tblProduto.getModel().getValueAt(numeroLinha, 5).toString());

                objProduto.setcodProduto(CodProduto);
                txtProduto.setText(Produto);
                txtMarca.setText(Marca);
                cboCategoria.setSelectedItem(Categoria);
                txtQtdeEstoque.setText(qtdeEstoque);
                txtValorUnitario.setText(ValorUnitario);
        
            }
        
            }   
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblProduto.getRowCount() > 0) {
            int numeroLinha = tblProduto.getSelectedRow();
            if (numeroLinha < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um produto para excluir!");
            } else {

                int cod = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
                objProduto.setcodProduto(cod);
                int id = objProduto.getcodProduto();
                boolean retorno = ProdutoController.Excluir(id);

                if (retorno == true) {
                    JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao excluir Produto!");
                }

                listarProdutos();

            }
        
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtCodProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Somente números.");
        }
    }//GEN-LAST:event_txtCodProdutoKeyTyped

    private void txtQtdeEstoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdeEstoqueKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Somente números.");
        }
    }//GEN-LAST:event_txtQtdeEstoqueKeyTyped

    private void txtValorUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnitarioKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Somente números.");
        }
    }//GEN-LAST:event_txtValorUnitarioKeyTyped

    private void txtProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyReleased
        String textoAnterior = txtProduto.getText();
        txtProduto.setText(textoAnterior.toUpperCase());
    }//GEN-LAST:event_txtProdutoKeyReleased

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        String textoAnterior = txtMarca.getText();
        txtMarca.setText(textoAnterior.toUpperCase());
    }//GEN-LAST:event_txtMarcaKeyReleased

    private void txtProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyTyped
        if (txtProduto.getText().length() > 20) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de 20 caracteres antingidos para o campo Produto!");
        }
    }//GEN-LAST:event_txtProdutoKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        if (txtMarca.getText().length() > 20) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de 20 caracteres antingidos para o campo Marca!");
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void btnAdiciionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdiciionarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();

        Integer CodProduto = Integer.parseInt(txtCodProduto.getText());
        String Produto = txtProduto.getText();
        String Marca = txtMarca.getText();
        String Categoria = cboCategoria.getSelectedItem().toString();
        Integer quantProd = Integer.parseInt(txtQtdeEstoque.getText());
        Double ValorUnitario = Double.parseDouble(txtValorUnitario.getText());

        modelo.addRow(new String[]{Produto, Marca, Categoria});
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(10);// cod produto
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(50);//produto
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(50); // marca
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(50); // categoria
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(20); //qtde estoque
        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(50); // valor unitario

        
        
        
        
        String consultaProduto = "";

        if (grupoConsultaProduto.getSelection() != null) {
            consultaProduto = grupoConsultaProduto.getSelection()
                    .getActionCommand();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Consulta Produto!");
            return;
        }

        if (cboCategoria.getSelectedIndex() == 0) {
            this.mensagensErro.add("Selecione uma opção no campo " + cboCategoria.getName());
            cboCategoria.setBackground(Color.RED);
        } else {
            cboCategoria.setBackground(Color.WHITE);
        }

        if (Categoria.equals("Academia e Fitness(")) {
            cboCategoria.setSelectedIndex(1);
        } else if (Categoria.equals("Boxe e Arte Marciais")) {
            cboCategoria.setSelectedIndex(2);
        } else if (Categoria.equals("Camping, Trilha e Neve")) {
            cboCategoria.setSelectedIndex(3);
        } else if (Categoria.equals("Ciclismo")) {
            cboCategoria.setSelectedIndex(4);
        } else if (Categoria.equals("Corrida e Caminhada")) {
            cboCategoria.setSelectedIndex(5);
        } else if (Categoria.equals("Futebol, Volei e Basquete")) {
            cboCategoria.setSelectedIndex(6);
        } else if (Categoria.equals("Esportes Aquáticos")) {
            cboCategoria.setSelectedIndex(7);
        }


    }//GEN-LAST:event_btnAdiciionarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void txtCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdutoActionPerformed
        if (txtCodProduto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo Cód. Produto é obrigatório!");
        }

        try {
            int retorno = Integer.parseInt(txtCodProduto.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        } finally {
            this.txtCodProduto.setText("");
        }

    }//GEN-LAST:event_txtCodProdutoActionPerformed

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        if (txtProduto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo produto é obrigatório!");
        }
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        if (txtMarca.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo marca é obrigatório!");
        }
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtQtdeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdeEstoqueActionPerformed
        if (txtQtdeEstoque.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo Qtde Estoque é obrigatório!");
        }

        try {
            int retorno = Integer.parseInt(txtQtdeEstoque.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        } finally {
            this.txtQtdeEstoque.setText("");
        }
    }//GEN-LAST:event_txtQtdeEstoqueActionPerformed

    private void txtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitarioActionPerformed
        if (txtValorUnitario.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo Valor Unitário é obrigatório!");
        }

        try {
            Double retorno = Double.parseDouble(txtValorUnitario.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        } finally {
            this.txtValorUnitario.setText("");
        }
    }//GEN-LAST:event_txtValorUnitarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        
        txtCodProduto.setText("");
        txtProduto.setText("");
        txtMarca.setText("");
        cboCategoria.setSelectedItem("");
        txtValorUnitario.setText("");
        txtCodProduto.grabFocus();

        DefaultTableModel tbm = (DefaultTableModel) tblProduto.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
        listarProdutos();
                         
        
        
        
        
    }//GEN-LAST:event_btnExcluirMouseClicked

     public void listarProdutos() {
        //lista toda a base de dados daquela tabela
        ArrayList<String[]> listaProdutos = ProdutoController.listarProdutos();

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("CodProduto");
        tmProduto.addColumn("Produto");
        tmProduto.addColumn("Marca");
        tmProduto.addColumn("Categoria");
        tmProduto.addColumn("QtdEstoque");
        tmProduto.addColumn("ValorUnitario");

        tblProduto.setModel(tmProduto);
        tmProduto.setRowCount(0);

        for (String[] item : listaProdutos) {
            tmProduto.addRow(item);

        }

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(50);
    }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdiciionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.ButtonGroup grupoConsultaProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblQtdeEstoque;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtdeEstoque;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
