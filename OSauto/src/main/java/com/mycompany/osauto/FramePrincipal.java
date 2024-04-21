/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.osauto;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulodossantos
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    private DefaultTableModel modelo = new DefaultTableModel();
    private int linhaSelecionada = -1;
    
    public FramePrincipal() {
        initComponents();
        setLocationRelativeTo(this);
        carregaTabela();
    }
    
    public void carregaTabela(){
        modelo.addColumn("Servico/Peca");
        modelo.addColumn("Descricao");
        modelo.addColumn("UND");
        modelo.addColumn("Valor Und");
        modelo.addColumn("Valor Total");
        tbOs.setModel(modelo);
        tbOs.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbOs.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbOs.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbOs.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbOs.getColumnModel().getColumn(4).setPreferredWidth(50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrint = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfValorUnd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfContato = new javax.swing.JTextField();
        btGerar = new javax.swing.JButton();
        btAdicionaTabela = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        lbValorTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbOs = new javax.swing.JTable();
        tfServicoPeca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfUnidade = new javax.swing.JTextField();
        tfAno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        jlTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setText("Observacao");

        jLabel15.setText("Descricao");

        taObs.setColumns(20);
        taObs.setRows(5);
        jScrollPane1.setViewportView(taObs);

        jLabel16.setText("Valor UND");

        jLabel1.setText("Cadastro Cliente");

        jLabel2.setText("Nome Completo");

        jLabel3.setText("Contato");

        jLabel11.setText("Ordem de Servico");

        tfContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContatoActionPerformed(evt);
            }
        });

        btGerar.setText("Gerar Ordem de Servico");
        btGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarActionPerformed(evt);
            }
        });

        btAdicionaTabela.setText("Adicionar na OS");
        btAdicionaTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionaTabelaActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereco");

        tfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnderecoActionPerformed(evt);
            }
        });

        jLabel5.setText("Cadastro Veiculo");

        jLabel6.setText("Marca");

        jLabel12.setText("Valor Total:");

        tfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMarcaActionPerformed(evt);
            }
        });

        jLabel7.setText("Modelo");

        tfModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfModeloActionPerformed(evt);
            }
        });

        jLabel13.setText("Servico/Peca");

        tbOs.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbOs);

        jLabel8.setText("Ano");

        tfUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnidadeActionPerformed(evt);
            }
        });

        tfAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoActionPerformed(evt);
            }
        });

        jLabel14.setText("UND");

        jLabel9.setText("Placa");

        tfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoActionPerformed(evt);
            }
        });

        jlTotal.setText("0");

        javax.swing.GroupLayout panelPrintLayout = new javax.swing.GroupLayout(panelPrint);
        panelPrint.setLayout(panelPrintLayout);
        panelPrintLayout.setHorizontalGroup(
            panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrintLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrintLayout.createSequentialGroup()
                        .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfServicoPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao)
                            .addGroup(panelPrintLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelPrintLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addGap(67, 67, 67))
                            .addComponent(tfValorUnd)))
                    .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelPrintLayout.createSequentialGroup()
                                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addGroup(panelPrintLayout.createSequentialGroup()
                                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10)))
                    .addComponent(jLabel11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrintLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAdicionaTabela, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btGerar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelPrintLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        panelPrintLayout.setVerticalGroup(
            panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrintLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelPrintLayout.createSequentialGroup()
                            .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel15))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfServicoPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelPrintLayout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfValorUnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrintLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAdicionaTabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btGerar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContatoActionPerformed

    private void tfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnderecoActionPerformed

    private void tfAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoActionPerformed

    private void tfUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUnidadeActionPerformed

    private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoActionPerformed

    private void btAdicionaTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionaTabelaActionPerformed
        if (validaCampo(tfServicoPeca, "Servico ou peca nao pode ser vazio")){
            return;
        }
        if (validaCampo(tfDescricao, "Descricao nao pode ser vazio")){
            return;
        }
        if (validaNumero(tfValorUnd, "Servico ou peca nao colocado")){
            return;
        }
        if (validaNumero(tfUnidade, "Servico ou peca nao colocado")){
            return;
        }
        
        String servicoPeca = tfServicoPeca.getText();
        String descricao = tfDescricao.getText();
        Double valorUnd = Double.parseDouble(tfValorUnd.getText());
        Integer und = Integer.valueOf(tfUnidade.getText());
        Double valorTotal = valorUnd * und;
        Double totalLabel = Double.parseDouble(jlTotal.getText());
        
        
        if(linhaSelecionada >= 0){
            modelo.removeRow(linhaSelecionada);
            modelo.insertRow(linhaSelecionada, new Object[]{servicoPeca, descricao, und, valorUnd, valorTotal});
        }else{
            modelo.addRow(new Object[]{servicoPeca, descricao, und, valorUnd, valorTotal});
        }

        JOptionPane.showMessageDialog(this,"Ordem de servico cadastrado com sucesso!!");
        
        Double total = valorTotal + totalLabel;
        jlTotal.setText(Double.toString(total));
        tfServicoPeca.setText("");
        tfDescricao.setText("");
        tfValorUnd.setText("");
        tfUnidade.setText("");
        tfServicoPeca.requestFocus();
        linhaSelecionada = -1;
    }//GEN-LAST:event_btAdicionaTabelaActionPerformed

    private void btGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarActionPerformed
        if (validaCampo(tfNome, "Nome nao pode estar vazio")){
            return;
        }
        if (validaNumero(tfContato, "Contato nao pode estar vazio")){
            return;
        }
        if (validaCampo(tfEndereco, "Endereco nao pode estar vazio")){
            return;
        }
        if (validaCampo(tfMarca, "Marca nao pode estar vazio")){
            return;
        }
        if (validaCampo(tfModelo, "Modelo nao pode estar vazio")){
            return;
        }
        if (validaNumero(tfAno, "Ano nao pode estar vazio")){
            return;
        } 
        if (validaCampo(tfPlaca, "Placa nao pode estar vazio")){
            return;
        }
        if (validaArea(taObs, "Ano nao pode estar vazio")){
            return;
        }         
    }//GEN-LAST:event_btGerarActionPerformed

    private void tfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMarcaActionPerformed

    private void tfModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfModeloActionPerformed

    public boolean validaCampo(JTextField campo, String name){
        try {
            String value = campo.getText().trim();
            
            if(value.isEmpty()){
                throw new IllegalArgumentException(name + " Nao pode ser vazio");
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            campo.requestFocus();
            return false;
        }
    }
    
    public boolean validaArea(JTextArea campo, String name){
        try {
            String value = campo.getText().trim();
            
            if(value.isEmpty()){
                throw new IllegalArgumentException(name + " Nao pode ser vazio");
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            campo.requestFocus();
            return false;
        }
    }
    public boolean validaNumero(JTextField campo, String name){
        String valueCampo = campo.getText().trim();
        try {
            double value = Double.parseDouble(valueCampo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this, e.getMessage(), "O campo" + name + "Deve ser apenas numero", JOptionPane.ERROR_MESSAGE);
            campo.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionaTabela;
    private javax.swing.JButton btGerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JPanel panelPrint;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTable tbOs;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfContato;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfServicoPeca;
    private javax.swing.JTextField tfUnidade;
    private javax.swing.JTextField tfValorUnd;
    // End of variables declaration//GEN-END:variables
}
