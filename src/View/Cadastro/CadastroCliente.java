/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Cadastro;

import Controller.ControleCliente;
import View.Pesquisa.PesquisaCliente;
import View.Pesquisa.PesquisaProduto;
import View.Pesquisa.PesquisaUsuario;
import View.Pesquisa.PesquisaVenda;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan
 */
public class CadastroCliente extends javax.swing.JFrame {
    
    ControleCliente controle =  new ControleCliente();
    private int id;
    boolean config = false;
    
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        config = false;
        confBotoes(comboPFPJ,config);
    }
    public CadastroCliente(boolean confg, int id){
        initComponents();
        this.id = id;
        config = confg;
        confBotoes(comboPFPJ, confg);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormularioCadCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        comboPFPJ = new javax.swing.JComboBox<>();
        txtRG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();
        menuBarra = new javax.swing.JMenuBar();
        jMenuCliente = new javax.swing.JMenu();
        menuClieCad = new javax.swing.JMenuItem();
        menuCliePesq = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenu();
        menuUserCad = new javax.swing.JMenuItem();
        menuUserPesq = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenu();
        menuProdCad = new javax.swing.JMenuItem();
        menuProdPesq = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        menuVendCad = new javax.swing.JMenuItem();
        menuVendPesq = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        relatorioMenuCliente = new javax.swing.JMenu();
        exportClientePDF = new javax.swing.JMenuItem();
        exportVisuRelatorioClientes = new javax.swing.JMenuItem();
        exportMaioresClientes = new javax.swing.JMenuItem();
        relatorioMenuProduto = new javax.swing.JMenu();
        exportProdutoPDF = new javax.swing.JMenuItem();
        exportVisuRelatorioProdutos = new javax.swing.JMenuItem();
        relatorioMenuVenda = new javax.swing.JMenu();
        exportVendasPDF = new javax.swing.JMenuItem();
        exportVisuRelatorioVenda = new javax.swing.JMenuItem();
        exportVisuVendasAgrupadas = new javax.swing.JMenuItem();
        exportVendasAgrupadasPDF = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        FormularioCadCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar Novo Cliente");
        FormularioCadCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 5, -1, -1));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 250, 25));

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 130, 25));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        FormularioCadCliente.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 436, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Contato");
        FormularioCadCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 159, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Dados Pessoais");
        FormularioCadCliente.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 27, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Telefone");
        FormularioCadCliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtTel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 110, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Nº:");
        FormularioCadCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 25, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 240, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("RG");
        FormularioCadCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 30, 20));

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNumero.setText("0");
        FormularioCadCliente.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 40, 25));

        comboPFPJ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboPFPJ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Pessoa", "Pessoa Física", "Pessoa Jurídica" }));
        comboPFPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPFPJActionPerformed(evt);
            }
        });
        FormularioCadCliente.add(comboPFPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 140, 30));

        txtRG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });
        FormularioCadCliente.add(txtRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 100, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Rua:");
        FormularioCadCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        FormularioCadCliente.add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 50, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("E-mail:");
        FormularioCadCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        FormularioCadCliente.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Estado:");
        FormularioCadCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 62, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("CPF:");
        FormularioCadCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 90, -1, -1));

        txtRua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 220, 25));

        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 90, 130, 25));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        FormularioCadCliente.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 436, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nome Fantasia:");
        FormularioCadCliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 90, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        FormularioCadCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 64, -1, -1));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        FormularioCadCliente.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 436, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Cidade:");
        FormularioCadCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 62, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Endereço");
        FormularioCadCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 250, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("CNPJ");
        FormularioCadCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 40, 20));

        txtCNPJ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 90, 25));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Complemento");
        FormularioCadCliente.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, 20));

        txtComplemento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 200, 25));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Bairro");
        FormularioCadCliente.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 50, 20));

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FormularioCadCliente.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 150, 25));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        FormularioCadCliente.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        getContentPane().add(FormularioCadCliente);
        FormularioCadCliente.setBounds(60, 40, 1090, 690);

        lblFundo.setBackground(new java.awt.Color(0, 255, 255));
        lblFundo.setMaximumSize(new java.awt.Dimension(1400, 800));
        lblFundo.setName(""); // NOI18N
        lblFundo.setOpaque(true);
        lblFundo.setPreferredSize(new java.awt.Dimension(980, 580));
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 1200, 780);

        jMenuCliente.setText("Cliente");

        menuClieCad.setText("Cadastrar");
        menuClieCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClieCadActionPerformed(evt);
            }
        });
        jMenuCliente.add(menuClieCad);

        menuCliePesq.setText("Pesquisar");
        menuCliePesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliePesqActionPerformed(evt);
            }
        });
        jMenuCliente.add(menuCliePesq);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemSair);

        menuBarra.add(jMenuCliente);

        menuUser.setText("Usuario");

        menuUserCad.setText("Cadastrar");
        menuUserCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserCadActionPerformed(evt);
            }
        });
        menuUser.add(menuUserCad);

        menuUserPesq.setText("Pesquisar");
        menuUserPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserPesqActionPerformed(evt);
            }
        });
        menuUser.add(menuUserPesq);

        menuBarra.add(menuUser);

        menuProduto.setText("Produto");

        menuProdCad.setText("Cadastrar");
        menuProdCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdCadActionPerformed(evt);
            }
        });
        menuProduto.add(menuProdCad);

        menuProdPesq.setText("Pesquisar");
        menuProdPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdPesqActionPerformed(evt);
            }
        });
        menuProduto.add(menuProdPesq);

        menuBarra.add(menuProduto);

        menuVenda.setText("Venda");

        menuVendCad.setText("Cadastrar");
        menuVendCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendCadActionPerformed(evt);
            }
        });
        menuVenda.add(menuVendCad);

        menuVendPesq.setText("Pesquisar");
        menuVendPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendPesqActionPerformed(evt);
            }
        });
        menuVenda.add(menuVendPesq);

        menuBarra.add(menuVenda);

        menuRelatorios.setText("Relatórios");

        relatorioMenuCliente.setText("Cliente");

        exportClientePDF.setText("Exportar para PDF");
        exportClientePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportClientePDFActionPerformed(evt);
            }
        });
        relatorioMenuCliente.add(exportClientePDF);

        exportVisuRelatorioClientes.setText("Visualizar Relatórios Clientes");
        exportVisuRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportVisuRelatorioClientesActionPerformed(evt);
            }
        });
        relatorioMenuCliente.add(exportVisuRelatorioClientes);

        exportMaioresClientes.setText("Maiores Clientes");
        exportMaioresClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportMaioresClientesActionPerformed(evt);
            }
        });
        relatorioMenuCliente.add(exportMaioresClientes);

        menuRelatorios.add(relatorioMenuCliente);

        relatorioMenuProduto.setText("Produto");

        exportProdutoPDF.setText("Exportar para PDF");
        exportProdutoPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportProdutoPDFActionPerformed(evt);
            }
        });
        relatorioMenuProduto.add(exportProdutoPDF);

        exportVisuRelatorioProdutos.setText("Visualizar Relatório Produtos");
        exportVisuRelatorioProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportVisuRelatorioProdutosActionPerformed(evt);
            }
        });
        relatorioMenuProduto.add(exportVisuRelatorioProdutos);

        menuRelatorios.add(relatorioMenuProduto);

        relatorioMenuVenda.setText("Venda");

        exportVendasPDF.setText("Exportar para PDF");
        exportVendasPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportVendasPDFActionPerformed(evt);
            }
        });
        relatorioMenuVenda.add(exportVendasPDF);

        exportVisuRelatorioVenda.setText("Visualizar Relatório de Venda");
        exportVisuRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportVisuRelatorioVendaActionPerformed(evt);
            }
        });
        relatorioMenuVenda.add(exportVisuRelatorioVenda);

        exportVisuVendasAgrupadas.setText("Vendas Agrupadas Visualização");
        exportVisuVendasAgrupadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportVisuVendasAgrupadasActionPerformed(evt);
            }
        });
        relatorioMenuVenda.add(exportVisuVendasAgrupadas);

        exportVendasAgrupadasPDF.setText("Vendas Agrupadas Exportar PDF");
        exportVendasAgrupadasPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportVendasAgrupadasPDFActionPerformed(evt);
            }
        });
        relatorioMenuVenda.add(exportVendasAgrupadasPDF);

        menuRelatorios.add(relatorioMenuVenda);

        menuBarra.add(menuRelatorios);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        menuBarra.add(jMenuSair);

        setJMenuBar(menuBarra);

        setSize(new java.awt.Dimension(1216, 839));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClieCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClieCadActionPerformed
        CadastroCliente obj_acesso = new CadastroCliente();
        obj_acesso.setVisible(true);
    }//GEN-LAST:event_menuClieCadActionPerformed

    private void menuCliePesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliePesqActionPerformed
        PesquisaCliente obj_acesso = new PesquisaCliente();
        obj_acesso.setVisible(true);
    }//GEN-LAST:event_menuCliePesqActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void menuUserCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserCadActionPerformed
        CadastroUsuario obj = new CadastroUsuario();
        obj.setVisible(true);
    }//GEN-LAST:event_menuUserCadActionPerformed

    private void menuUserPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserPesqActionPerformed
        PesquisaUsuario obj = new PesquisaUsuario();
        obj.setVisible(true);
    }//GEN-LAST:event_menuUserPesqActionPerformed

    private void menuProdCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdCadActionPerformed
        CadastroProduto obj_acesso = new CadastroProduto();
        obj_acesso.setVisible(true);
    }//GEN-LAST:event_menuProdCadActionPerformed

    private void menuProdPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdPesqActionPerformed
        PesquisaProduto obj_acesso = new PesquisaProduto();
        obj_acesso.setVisible(true);
    }//GEN-LAST:event_menuProdPesqActionPerformed

    private void menuVendCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendCadActionPerformed
        CadastroVenda obj_acesso = new CadastroVenda();
        obj_acesso.setVisible(true);
    }//GEN-LAST:event_menuVendCadActionPerformed

    private void menuVendPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendPesqActionPerformed
        PesquisaVenda obj_acesso = new PesquisaVenda();
        obj_acesso.setVisible(true);
    }//GEN-LAST:event_menuVendPesqActionPerformed

    private void exportClientePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportClientePDFActionPerformed

    }//GEN-LAST:event_exportClientePDFActionPerformed

    private void exportVisuRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportVisuRelatorioClientesActionPerformed

    }//GEN-LAST:event_exportVisuRelatorioClientesActionPerformed

    private void exportMaioresClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportMaioresClientesActionPerformed

    }//GEN-LAST:event_exportMaioresClientesActionPerformed

    private void exportProdutoPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportProdutoPDFActionPerformed

    }//GEN-LAST:event_exportProdutoPDFActionPerformed

    private void exportVisuRelatorioProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportVisuRelatorioProdutosActionPerformed

    }//GEN-LAST:event_exportVisuRelatorioProdutosActionPerformed

    private void exportVendasPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportVendasPDFActionPerformed

    }//GEN-LAST:event_exportVendasPDFActionPerformed

    private void exportVisuRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportVisuRelatorioVendaActionPerformed

    }//GEN-LAST:event_exportVisuRelatorioVendaActionPerformed

    private void exportVisuVendasAgrupadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportVisuVendasAgrupadasActionPerformed

    }//GEN-LAST:event_exportVisuVendasAgrupadasActionPerformed

    private void exportVendasAgrupadasPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportVendasAgrupadasPDFActionPerformed

    }//GEN-LAST:event_exportVendasAgrupadasPDFActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //controle = new ControleCliente();
        String no1, no2, no3, no4, no5, no6, no7, no8, no9, no10, no11;
        int tipo = 0;
        if(comboPFPJ.getSelectedItem().toString()== "Pessoa Física"){
            tipo=0;
            no1 = txtNome.getText();
            no2 = txtEmail.getText();
            no3 = txtTel.getText();
            no4 = txtRG.getText();
            no5 = txtCPF.getText();
            no6 = comboEstado.getSelectedItem().toString();
            no7 = txtCidade.getText();
            no8 = txtBairro.getText();
            no9 = txtRua.getText();
            no10 = txtNumero.getText();
            no11 = txtComplemento.getText();
            System.out.println("fisica "+tipo);
            
        }else
        if(comboPFPJ.getSelectedItem().toString()== "Pessoa Jurídica"){
            tipo = 1;
            no1 = txtNome.getText();
            no2 = txtEmail.getText();
            no3 = txtTel.getText();
            no4 = txtNomeFantasia.getText();
            no5 = txtCNPJ.getText();
            no6 = comboEstado.getSelectedItem().toString();
            no7 = txtCidade.getText();
            no8 = txtBairro.getText();
            no9 = txtRua.getText();
            no10 = txtNumero.getText();
            no11 = txtComplemento.getText();
            System.out.println("juridica "+tipo);
        } else {
            no1 = no2 = no3 = no4 = no5 = no6 = no7 = no8 = no9 = no10 = no11 = null;
        }
        
        try{
            controle.pegarDados(config, id, tipo, no1, no2, no3, no4, no5, no6, no7, no8, no9, no10, no11);
            
            if(controle.salvarCliente()){
                JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");
                dispose();
            }
        } catch (IOException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
            
            

        

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtCPF.setText("");
        txtRG.setText("");
        comboEstado.setSelectedIndex(0);
        txtEmail.setText("");

        txtTel.setText("");
        txtBairro.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtCidade.setText("");
        txtComplemento.setText("");
        txtNomeFantasia.setText("");
        txtCNPJ.setText("");
        comboPFPJ.setSelectedIndex(0);

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        dispose();
        CadastroCliente obj_acess = new CadastroCliente();
        obj_acess.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void comboPFPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPFPJActionPerformed
        confBotoes( comboPFPJ, config );
    }//GEN-LAST:event_comboPFPJActionPerformed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String no1, no2, no3, no4, no5, no6, no7, no8, no9, no10, no11;
        
        int tipo = 0;
        if(null == comboPFPJ.getSelectedItem().toString()){
            no1 = no2 = no3 = no4 = no5 = no6 = no7 = no8 = no9 = no10 = no11 = null;
        }else
        switch (comboPFPJ.getSelectedItem().toString()) {
            case "Pessoa Física" -> {
                tipo=0;
                no1 = txtNome.getText();
                no2 = txtEmail.getText();
                no3 = txtTel.getText();
                no4 = txtRG.getText();
                no5 = txtCPF.getText();
                no6 = comboEstado.getSelectedItem().toString();
                no7 = txtCidade.getText();
                no8 = txtBairro.getText();
                no9 = txtRua.getText();
                no10 = txtNumero.getText();
                no11 = txtComplemento.getText();
                System.out.println("fisica "+tipo);
            }
            case "Pessoa Jurídica" -> {
                tipo = 1;
                no1 = txtNome.getText();
                no2 = txtEmail.getText();
                no3 = txtTel.getText();
                no4 = txtNomeFantasia.getText();
                no5 = txtCNPJ.getText();
                no6 = comboEstado.getSelectedItem().toString();
                no7 = txtCidade.getText();
                no8 = txtBairro.getText();
                no9 = txtRua.getText();
                no10 = txtNumero.getText();
                no11 = txtComplemento.getText();
                System.out.println("juridica "+tipo);
            }
            default -> no1 = no2 = no3 = no4 = no5 = no6 = no7 = no8 = no9 = no10 = no11 = null;
        }
        try {
          //  controle.newListClient();
          //  controle.removeCliente(id);
            controle.listarTodosClientes();
            controle.deleteClientefromLista(id);
            //controle.deleteFile();
            
            controle.pegarDados( true,id, tipo ,no1, no2, no3, no4, no5, no6, no7, no8, no9, no10, no11);
            controle.chamarGravarOrdenado(id, controle.getCliente());
            controle.deleteFile();
            if(controle.gravarTodosClientes())
            {
                JOptionPane.showMessageDialog(null, "Cliente Alterado com sucesso");
                dispose();
            }
        } catch (IOException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FormularioCadCliente;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboPFPJ;
    private javax.swing.JMenuItem exportClientePDF;
    private javax.swing.JMenuItem exportMaioresClientes;
    private javax.swing.JMenuItem exportProdutoPDF;
    private javax.swing.JMenuItem exportVendasAgrupadasPDF;
    private javax.swing.JMenuItem exportVendasPDF;
    private javax.swing.JMenuItem exportVisuRelatorioClientes;
    private javax.swing.JMenuItem exportVisuRelatorioProdutos;
    private javax.swing.JMenuItem exportVisuRelatorioVenda;
    private javax.swing.JMenuItem exportVisuVendasAgrupadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuClieCad;
    private javax.swing.JMenuItem menuCliePesq;
    private javax.swing.JMenuItem menuProdCad;
    private javax.swing.JMenuItem menuProdPesq;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenuItem menuUserCad;
    private javax.swing.JMenuItem menuUserPesq;
    private javax.swing.JMenuItem menuVendCad;
    private javax.swing.JMenuItem menuVendPesq;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JMenu relatorioMenuCliente;
    private javax.swing.JMenu relatorioMenuProduto;
    private javax.swing.JMenu relatorioMenuVenda;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    public void confBotoes(JComboBox comboPFPJ, boolean config ){
       // JTextField txtCPF, JTextField txtRG, JTextField txtNomeFantasia, JTextField txtNome
        if(comboPFPJ.getSelectedItem().toString()== "Tipo de Pessoa"){
           txtCPF.setEditable(false);
           txtRG.setEditable(false);
           txtCNPJ.setEditable(false);
           txtNomeFantasia.setEditable(false);
           txtNome.setEditable(false);
        }
        if(comboPFPJ.getSelectedItem().toString()== "Pessoa Física"){
            txtCPF.setEditable(true);
            txtRG.setEditable(true);
            txtNome.setEditable(true);
            txtNomeFantasia.setText("");
            txtCNPJ.setText("");
            txtNomeFantasia.setEditable(false);
            txtCNPJ.setEditable(false);
        }
        if(comboPFPJ.getSelectedItem().toString() == "Pessoa Jurídica" ){
            txtNome.setEditable(true);
            txtCPF.setEditable(false);
            txtRG.setEditable(false);
            txtCPF.setText("");
            txtRG.setText("");
            txtNomeFantasia.setEditable(true);
            txtCNPJ.setEditable(true);
        }
        if(config == false){
            btnCadastrar.setEnabled(true);
            btnLimpar.setEnabled(true);
            btnNovo.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnVoltar.setEnabled(true);
        }
        if(config == true){
            btnCadastrar.setEnabled(false);
            btnLimpar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnVoltar.setEnabled(false);
        }
        
       
    }



}