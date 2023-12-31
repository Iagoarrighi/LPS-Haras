/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.ifmg.projeto_haras.view.gerenciaveis;

import com.ifmg.projeto_haras.controller.FaturaController;
import com.ifmg.projeto_haras.controller.ProprietarioController;
import com.ifmg.projeto_haras.model.Fatura;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class IFrPagarFatura extends javax.swing.JInternalFrame {

    ProprietarioController proprietarioController;
    FaturaController faturaController;
    String propSelecionado;
    /**
     * Creates new form iFrPagarFatura
     */
    public IFrPagarFatura() {
        proprietarioController = new ProprietarioController();
        faturaController = new FaturaController();
        propSelecionado = "";
        initComponents();
        cbxProprietarios.addItem("");
        
        propCombobox();
        //faturaController.atualizarTabelaFaturas(grdFaturas);
    }
    
    public void propCombobox() {
        String[] propString = proprietarioController.buscarProprietariosString().split("\n");

        for (String propIdNome : propString) {
            cbxProprietarios.addItem(propIdNome);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxProprietarios = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdFaturas = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        cbxProprietarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProprietariosItemStateChanged(evt);
            }
        });

        jLabel1.setText("Proprietários:");

        grdFaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdFaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdFaturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdFaturas);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Pagar Fatura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbxProprietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxProprietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxProprietariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProprietariosItemStateChanged
        
        propSelecionado = String.valueOf(evt.getItem());
        
        if(!propSelecionado.equals("")){
            proprietarioController.atualizarTabelaFaturas(grdFaturas, propSelecionado);
        }
        
        //equinoController.atualizarTabelaRelacionamentos(grdEquinosAlimentos);
    }//GEN-LAST:event_cbxProprietariosItemStateChanged

    private void trocarParaPago(){
        JOptionPane.showMessageDialog(this, "Status da fatura alterado");
        
        Fatura fatura = (Fatura) getObjectSelectOnGrid();
        
        // fazer um metodo no controller para pagar
        // passou do prazo colocar como nao pago no controller de iniciação
        // aberta somente no prazo
        faturaController.atualizarFatura(fatura);
        
        proprietarioController.atualizarTabelaFaturas(grdFaturas, propSelecionado);
    }
    
    private void grdFaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdFaturasMouseClicked
        if (evt.getClickCount() == 2) {
            trocarParaPago();
        }
    }//GEN-LAST:event_grdFaturasMouseClicked

    private Object getObjectSelectOnGrid() {
        int rowCliked = grdFaturas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdFaturas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxProprietarios;
    private javax.swing.JTable grdFaturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
