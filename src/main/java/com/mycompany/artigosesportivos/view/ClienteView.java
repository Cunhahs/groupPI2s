/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.artigosesportivos.view;

import com.mycompany.artigosesportivos.model.Cliente;
import com.mycompany.artigosesportivos.controller.ClienteController;



import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe responsável pela interface de cadastro, manutenção e consulta de
 * clientes
 * @author Viviane Cipollari
 * @version 1.0
 */
public class ClienteView extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public ClienteView() throws ClassNotFoundException {
        initComponents();
        Cliente objCliente = new Cliente();
        setLocationRelativeTo(null);
        listarClientes(); //carrega todos os clientes cadastrados na base de dados
    }

    
    public ClienteView(Cliente c) {
       
        initComponents();        
        this.txtCPF.setText(c.getCpf());
        this.txtNome.setText(c.getNome());
        this.cboGenero.setSelectedItem(c);
        this.cboEstadoCivil.setSelectedItem(c);
        this.txtTelefone.setText(c.getTelefone());        
        this.txtEmail.setText(c.getEmail());
        this.txtEndereço.setText(c.getEndereço());
        this.txtBairro.setText(c.getBairro());
        this.txtCidade.setText(c.getCidade());
        this.cboEstado.setSelectedItem(c);
       

        setLocationRelativeTo(null);

    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoConsultaCliente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblEndereço = new javax.swing.JLabel();
        txtEndereço = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JFormattedTextField();
        lblSexo = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        btnAdicionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnConsultarNome = new javax.swing.JButton();
        btnConsultarCPF = new javax.swing.JButton();
        cboGenero = new javax.swing.JComboBox<>();
        cboEstadoCivil = new javax.swing.JComboBox<>();
        cboEstado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome*:");
        lblNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCPF.setText("CPF*:");
        lblCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPFKeyTyped(evt);
            }
        });

        lblEndereço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEndereço.setText("Endereço:");
        lblEndereço.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEndereço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEndereço.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEndereçoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEndereçoKeyTyped(evt);
            }
        });

        lblNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumero.setText("Número");
        lblNumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone* :");
        lblTelefone.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("E-mail*:");
        lblEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEmail.setAutoscrolls(false);
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        lblSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSexo.setText("Sexo* : ");
        lblSexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEstadoCivil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstadoCivil.setText("Estado Civil");
        lblEstadoCivil.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataNascimento.setText("Data de Nascimento");
        lblDataNascimento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-icon.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdicionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash-icon.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pencil-icon.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view-icon.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Cadastro de Cliente");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBairro.setText(" Bairro:");
        lblBairro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBairroKeyReleased(evt);
            }
        });

        lblCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCidade.setText("Cidade");
        lblCidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCidadeKeyReleased(evt);
            }
        });

        lblEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstado.setText("Estado:");
        lblEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Endereço", "Número", "Bairro", "Cidade", "Estado", "Sexo", "Estado Civil", "Data Nascimento", "E-Mail", "Telefone"
            }
        ));
        jScrollPane4.setViewportView(tblCliente);

        btnConsultarNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Look-icon.png"))); // NOI18N
        btnConsultarNome.setText("Consultar por Nome");
        btnConsultarNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConsultarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNomeActionPerformed(evt);
            }
        });

        btnConsultarCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultarCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Look-icon.png"))); // NOI18N
        btnConsultarCPF.setText("Consultar por CPF");
        btnConsultarCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConsultarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCPFActionPerformed(evt);
            }
        });

        cboGenero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));

        cboEstadoCivil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "União Estavel", "Divorciado", "Separado", "Viuvo", "Outro" }));
        cboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoCivilActionPerformed(evt);
            }
        });

        cboEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ", "MG", "ES", "PR", "RS", "SC" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEndereço, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(lblCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(lblEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addGap(9, 9, 9)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnConsultarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(btnConsultarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereço)
                    .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimento)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<String> mensagensErro = new ArrayList<>();

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        try {
            int retorno = Integer.parseInt(txtNumero.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        if (txtNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo nome é obrigatório!");
        }

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        if (txtEmail.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo e-mail é obrigatório!");
        }
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        if (txtTelefone.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo telefone é obrigatório!");
        }

        try {
            int retorno = Integer.parseInt(txtTelefone.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed

    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed

    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        if (txtCPF.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo CPF é obrigatório!");
        }

        try {
            int retorno = Integer.parseInt(txtCPF.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        } finally {
            this.txtCPF.setText("");
        }

        try {

            if (txtCPF.getText().replace(".", "").replace("-", "").trim().equals("")) {
                throw new IllegalArgumentException();
            } else {
                txtCPF.setBackground(Color.WHITE);
            }

        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo " + txtCPF.getName());
            txtCPF.setBackground(Color.red);
        } catch (Exception e) {
            this.mensagensErro.add("Ocorreu um erro inesperado no campo: " + txtCPF.getName());
            txtCPF.setText("");
        }

    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyTyped
        if (txtCPF.getText().length() > 11) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de 11 caracteres antingidos para o CPF!");
        }

        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Somente números.");
        }


    }//GEN-LAST:event_txtCPFKeyTyped

    private void txtBairroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyReleased
        String textoAnterior = txtBairro.getText();
        txtBairro.setText(textoAnterior.toUpperCase());
    }//GEN-LAST:event_txtBairroKeyReleased

    private void txtCidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyReleased
        String textoAnterior = txtCidade.getText();
        txtCidade.setText(textoAnterior.toUpperCase());
    }//GEN-LAST:event_txtCidadeKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tblCliente.getSelectedRow();

        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();

        if (linhaSelecionada >= 0) {
            modelo.removeRow(linhaSelecionada);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione uma linha!");
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        
        String nome = txtNome.getText();
        String CPF = txtCPF.getText();
        String Endereco = txtEndereço.getText();
        String Numero = txtNumero.getText();
        String bairro = txtBairro.getText();
        String cidade = txtCidade.getText();
        String estado = cboEstado.getSelectedItem().toString();
        String sexo = cboGenero.getSelectedItem().toString();
        String estadoCivil = cboEstadoCivil.getSelectedItem().toString();
        String dataNascimento = txtDataNascimento.getText();
        String email = txtEmail.getText();
        String telefone = txtTelefone.getText();

        modelo.addRow(new String[]{nome,
            CPF,
            Endereco,
            Numero,
            bairro,
            cidade,
            estado,
            sexo,
            estadoCivil,
            dataNascimento,
            email,
            telefone});

        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(50); //nome
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(50); //CPF
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(50); //endereço
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(50); //numero
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(50); //bairro
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(50); //cidade
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(10); //estado
        tblCliente.getColumnModel().getColumn(8).setPreferredWidth(30); //Sexo
        tblCliente.getColumnModel().getColumn(9).setPreferredWidth(50); //E. Civil
        tblCliente.getColumnModel().getColumn(11).setPreferredWidth(50); //data nascimento
        tblCliente.getColumnModel().getColumn(12).setPreferredWidth(50); //e-mail        
        tblCliente.getColumnModel().getColumn(10).setPreferredWidth(50); //Telefone
        String consultaCliente = "";

        if (grupoConsultaCliente.getSelection() != null) {
            consultaCliente
                    = grupoConsultaCliente.getSelection()
                            .getActionCommand();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Consulta Cliente!");
            return;
        }

        if (cboGenero.getSelectedIndex() == 0) {
            this.mensagensErro.add("Selecione uma opção no campo " + cboGenero.getName());
            cboGenero.setBackground(Color.RED);
        } else {
            cboGenero.setBackground(Color.WHITE);
        }

        if (sexo.equals("Feminino")) {
            cboGenero.setSelectedIndex(1);
        } else if (sexo.equals("Masculino")) {
            cboGenero.setSelectedIndex(2);
        } else if (sexo.equals("Outro")) {
            cboGenero.setSelectedIndex(3);
        }

        if (cboEstadoCivil.getSelectedIndex() == 0) {
            this.mensagensErro.add("Selecione uma opção no campo " + cboEstadoCivil.getName());
            cboEstadoCivil.setBackground(Color.RED);
        } else {
            cboEstadoCivil.setBackground(Color.WHITE);
        }

        if (estadoCivil.equals("Solteiro(")) {
            cboEstadoCivil.setSelectedIndex(1);
        } else if (estadoCivil.equals("Casado")) {
            cboEstadoCivil.setSelectedIndex(2);
        } else if (estadoCivil.equals("União Estável")) {
            cboEstadoCivil.setSelectedIndex(3);
        } else if (estadoCivil.equals("Divorciado")) {
            cboEstadoCivil.setSelectedIndex(4);
        } else if (estadoCivil.equals("Separado")) {
            cboEstadoCivil.setSelectedIndex(5);
        } else if (estadoCivil.equals("Viúvo")) {
            cboEstadoCivil.setSelectedIndex(6);
        } else if (estadoCivil.equals("Outro")) {
            cboEstadoCivil.setSelectedIndex(7);
        }

        if (cboEstado.getSelectedIndex() == 0) {
            this.mensagensErro.add("Selecione uma opção no campo " + cboEstado.getName());
            cboEstado.setBackground(Color.RED);
        } else {
            cboEstado.setBackground(Color.WHITE);
        }

        if (estado.equals("SP")) {
            cboEstado.setSelectedIndex(1);
        } else if (estado.equals("RJ")) {
            cboEstado.setSelectedIndex(2);
        } else if (estado.equals("MG")) {
            cboEstado.setSelectedIndex(3);
        } else if (estado.equals("ES")) {
            cboEstado.setSelectedIndex(4);
        } else if (estado.equals("PR")) {
            cboEstado.setSelectedIndex(5);
        } else if (estado.equals("RS")) {
            cboEstado.setSelectedIndex(6);
        } else if (estado.equals("SC")) {
            cboEstado.setSelectedIndex(7);

        }
        
         boolean retorno = ClienteController.adicionar( CPF, nome, Endereco, Numero,   sexo, estadoCivil, telefone, dataNascimento,
                        email, bairro, cidade, estado );

                if (retorno == true) {
                    JOptionPane.showMessageDialog(null, "Cliente ALTERADO com sucesso!",
                            "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Falha na ALTERAÇÃO de cliente!",
                            "Falha", JOptionPane.ERROR_MESSAGE);
                }

            
        
        try {
            listarClientes();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        


    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void cboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoCivilActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if (txtEmail.getText().length() > 40) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de 40 caracteres antingidos para o campo e-mail!");
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtEndereçoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndereçoKeyReleased
        String textoAnterior = txtEndereço.getText();
        txtEndereço.setText(textoAnterior.toUpperCase());
    }//GEN-LAST:event_txtEndereçoKeyReleased

    private void txtEndereçoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndereçoKeyTyped
        if (txtEndereço.getText().length() > 40) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de 40 caracteres antingidos para o campo endereço!");
        }
    }//GEN-LAST:event_txtEndereçoKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped

        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Somente números.");
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnConsultarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCPFActionPerformed
       
        

            ArrayList<String[]> filtro = null;
        try {
            filtro = ClienteController.filtroCPF(txtCPF.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }

            DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
            modelo.setRowCount(0);
            
            for (String[] item : filtro) {
                modelo.addRow(item);
            }
        
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(50); //nome
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(11); //CPF
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(50); //endereço
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(50); //numero
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(50); //bairro
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(50); //cidade
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(10); //estado
        tblCliente.getColumnModel().getColumn(8).setPreferredWidth(30); //Sexo
        tblCliente.getColumnModel().getColumn(9).setPreferredWidth(50); //E. Civil
        tblCliente.getColumnModel().getColumn(11).setPreferredWidth(50); //data nascimento
        tblCliente.getColumnModel().getColumn(12).setPreferredWidth(50); //e-mail        
        tblCliente.getColumnModel().getColumn(10).setPreferredWidth(50); //Telefone
    }//GEN-LAST:event_btnConsultarCPFActionPerformed

    private void btnConsultarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNomeActionPerformed
       
        ArrayList<String[]> filtro = null;
        try {
            filtro = ClienteController.filtroNome(txtNome.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        modelo.setRowCount(0);

        for (String[] item : filtro) {
            modelo.addRow(item);
        }

        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(50); //nome
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(11); //CPF
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(50); //endereço
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(50); //numero
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(50); //bairro
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(50); //cidade
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(10); //estado
        tblCliente.getColumnModel().getColumn(8).setPreferredWidth(30); //Sexo
        tblCliente.getColumnModel().getColumn(9).setPreferredWidth(50); //E. Civil
        tblCliente.getColumnModel().getColumn(11).setPreferredWidth(50); //data nascimento
        tblCliente.getColumnModel().getColumn(12).setPreferredWidth(50); //e-mail        
        tblCliente.getColumnModel().getColumn(10).setPreferredWidth(50); //Telefone 
        
        
    }//GEN-LAST:event_btnConsultarNomeActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        ArrayList<String[]> filtro = null;
        try {
            filtro = ClienteController.filtroNome(txtNome.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        modelo.setRowCount(0);

        for (String[] item : filtro) {
            modelo.addRow(item);
        }

        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(10); //id
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(50); //nome
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(50); //CPF
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(50); //endereço
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(50); //numero
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(50); //bairro
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(50); //cidade
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(10); //estado
        tblCliente.getColumnModel().getColumn(8).setPreferredWidth(30); //Sexo
        tblCliente.getColumnModel().getColumn(9).setPreferredWidth(50); //E. Civil
        tblCliente.getColumnModel().getColumn(10).setPreferredWidth(50); //Telefone
        tblCliente.getColumnModel().getColumn(11).setPreferredWidth(50); //data nascimento
        tblCliente.getColumnModel().getColumn(12).setPreferredWidth(50); //e-mail

    }//GEN-LAST:event_btnConsultarActionPerformed
public void listarClientes() throws ClassNotFoundException {
        //lista toda a base de dados daquela tabela
        ArrayList<String[]> listaCliente = ClienteController.listarC();

        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("Nome");
        tmCliente.addColumn("CPF");
        tmCliente.addColumn("Endereço");
        tmCliente.addColumn("Numero");
        tmCliente.addColumn("Bairro");
        tmCliente.addColumn("Cidade");
        tmCliente.addColumn("Estado");
        tmCliente.addColumn("Sexo");
        tmCliente.addColumn("Estado Civil");
        tmCliente.addColumn("DataNascimento");
        tmCliente.addColumn("E-mail");
        tmCliente.addColumn("Telefone");
        

        tblCliente.setModel(tmCliente);
        tmCliente.setRowCount(0);

        for (String[] item : listaCliente) {
            tmCliente.addRow(item);

        }
        
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ClienteView().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
        });
        
                }  
                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarCPF;
    private javax.swing.JButton btnConsultarNome;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboEstadoCivil;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.ButtonGroup grupoConsultaCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereço;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private class jDateChooser1 {

        public jDateChooser1() {
        }
    }
}
                
        
                
