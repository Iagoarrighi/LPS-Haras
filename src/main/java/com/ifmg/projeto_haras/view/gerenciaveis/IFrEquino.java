/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.ifmg.projeto_haras.view.gerenciaveis;

import com.ifmg.projeto_haras.controller.BaiaController;
import com.ifmg.projeto_haras.controller.CuidadorController;
import com.ifmg.projeto_haras.controller.EquinoController;
import com.ifmg.projeto_haras.controller.ProprietarioController;
import com.ifmg.projeto_haras.controller.VeterinarioController;
import com.ifmg.projeto_haras.model.Equino;
import com.ifmg.projeto_haras.model.Proprietario;
import com.ifmg.projeto_haras.model.exceptions.EquinoException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author iago_
 */
public class IFrEquino extends javax.swing.JInternalFrame {

    EquinoController equinoController;
    BaiaController baiaController;
    ProprietarioController propController;
    VeterinarioController veterinarioController;
    CuidadorController cuidadorController;
    int idEquinoEditando;

    /**
     * Creates new form IFrEquino
     */
    public IFrEquino() {

        equinoController = new EquinoController();
        baiaController = new BaiaController();
        propController = new ProprietarioController();
        veterinarioController = new VeterinarioController();
        cuidadorController = new CuidadorController();
        idEquinoEditando = -1;
        

        initComponents();
        
        
        habilitarCampos(false);
        limparCampos();
        baiaCombobox();
        proprietarioCombobox();
        veterinarioCombobox();
        cuidadorCombobox();

        equinoController.atualizarTabela(grdEquinos);

    }

    public void baiaCombobox() {
        cbxBaia.addItem("");
        String[] baiasString = baiaController.buscarBaiasString().split("\n");

        for (String baiaId : baiasString) {
            cbxBaia.addItem(baiaId);
        }
    }

    public void proprietarioCombobox() {
        cbxProprietario.addItem("");
        String[] proprietarioIdNomeString = propController.buscarProprietariosString().split("\n");

        for (String idNome : proprietarioIdNomeString) {
            cbxProprietario.addItem(idNome);
        }
    }

    public void veterinarioCombobox() {
        cbxVeterinario.addItem("");
        String[] veterinarioIdNomeString = veterinarioController.buscarVeterinariosString().split("\n");

        for (String idNome : veterinarioIdNomeString) {
            cbxVeterinario.addItem(idNome);
        }
    }

    public void cuidadorCombobox() {
        cbxCuidador.addItem("");
        String[] veterinarioIdNomeString = cuidadorController.buscarCuidadoresString().split("\n");

        for (String idNome : veterinarioIdNomeString) {
            cbxCuidador.addItem(idNome);
        }
    }

    public Integer getIdDoidNome(String idNome) {
        String[] novoIdNome = idNome.split(" - ");
        return Integer.parseInt(novoIdNome[0]);
    }

    public void habilitarCampos(boolean flag) {
        edtNome.setEnabled(flag);
        edtSexo.setEnabled(flag);
        edtRaca.setEnabled(flag);
        edtDataNasc.setEnabled(flag);
        cbxBaia.setEnabled(flag);
        cbxCuidador.setEnabled(flag);
        cbxVeterinario.setEnabled(flag);
        cbxProprietario.setEnabled(flag);
    }

    public void limparCampos() {
        edtNome.setText("");
        edtSexo.setText("");
        edtRaca.setText("");
        edtDataNasc.setText("");
    }

    public void preencherFormulario(Equino e) {
        edtNome.setText(e.getNome());
        edtSexo.setText(String.valueOf(e.getSexo()));
        edtRaca.setText(e.getRaca());
        edtDataNasc.setText(String.valueOf(e.getNascimento()));
        
         if(e.getBaia()!= null){
            cbxBaia.getModel().setSelectedItem(String.valueOf(e.getBaia().getId()));
        }
        
        
        if(e.getProprietario() != null){
            cbxProprietario.getModel().setSelectedItem(e.getProprietario().getId() + " - " + e.getProprietario().getNome());
        }
        if(e.getCuidador() != null){
            cbxCuidador.getModel().setSelectedItem(e.getCuidador().getId() + " - " + e.getCuidador().getNome());
        }
        
        if(e.getVeterinario()!= null){
            cbxVeterinario.getModel().setSelectedItem(e.getVeterinario().getId() + " - " + e.getVeterinario().getNome());
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

        edtSexo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdEquinos = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        lblRaca = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtRaca = new javax.swing.JTextField();
        cbxProprietario = new javax.swing.JComboBox<>();
        lblProprietario = new javax.swing.JLabel();
        cbxCuidador = new javax.swing.JComboBox<>();
        lblCuidador = new javax.swing.JLabel();
        cbxVeterinario = new javax.swing.JComboBox<>();
        lblVeterinario = new javax.swing.JLabel();
        cbxBaia = new javax.swing.JComboBox<>();
        lblBaia = new javax.swing.JLabel();
        edtDataNasc = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        grdEquinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdEquinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdEquinosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdEquinos);

        lblNome.setText("Nome:");

        lblRaca.setText("Raça:");

        lblSexo.setText("Sexo:");

        lblDataNasc.setText("Data de nascimento:");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Gerenciamento dos Equinos");

        cbxProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProprietarioActionPerformed(evt);
            }
        });

        lblProprietario.setText("Proprietário:");

        lblCuidador.setText("Cuidador:");

        cbxVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVeterinarioActionPerformed(evt);
            }
        });

        lblVeterinario.setText("Veterinário:");

        cbxBaia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBaiaActionPerformed(evt);
            }
        });

        lblBaia.setText("Baia:");

        try {
            edtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaca)
                    .addComponent(lblNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbxVeterinario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edtRaca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblProprietario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxProprietario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblVeterinario))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCuidador)
                            .addComponent(edtSexo)
                            .addComponent(lblSexo)
                            .addComponent(lblDataNasc)
                            .addComponent(cbxCuidador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBaia)
                            .addComponent(cbxBaia, 0, 208, Short.MAX_VALUE)
                            .addComponent(edtDataNasc))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaca)
                    .addComponent(lblDataNasc))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtRaca)
                    .addComponent(edtDataNasc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProprietario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCuidador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblVeterinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblBaia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxBaia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProprietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProprietarioActionPerformed

    private void cbxVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxVeterinarioActionPerformed

    private void cbxBaiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBaiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBaiaActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        idEquinoEditando = -1;
        this.habilitarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Equino equinoEditando = (Equino) this.getObjectSelectOnGrid();

        if (equinoEditando == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            try {
                equinoController.excluirEquino(equinoEditando);

                equinoController.atualizarTabela(grdEquinos);
                JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
            } catch (EquinoException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Equino equinoEditando = (Equino) this.getObjectSelectOnGrid();
        if (equinoEditando == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.preencherFormulario(equinoEditando);
            this.idEquinoEditando = equinoEditando.getId();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if(cbxCuidador.getSelectedItem().equals("")){
            System.out.println("RETORNA NADA");
        }
        String prop = String.valueOf(cbxProprietario.getSelectedItem());
        String cuidador = String.valueOf(cbxCuidador.getSelectedItem());
        String baia = String.valueOf(cbxBaia.getSelectedItem());
        String veterinario = String.valueOf(cbxVeterinario.getSelectedItem());

        try {
            if (idEquinoEditando > 0) {
                equinoController.atualizarEquino(
                        idEquinoEditando, edtNome.getText(), edtSexo.getText(), edtRaca.getText(),
                        edtDataNasc.getText(), prop, veterinario, baia, cuidador
                );
                idEquinoEditando = -1;
            } else {
                equinoController.cadastrarEquino(
                        edtNome.getText(), edtSexo.getText(), edtRaca.getText(),
                        edtDataNasc.getText(), prop, veterinario, baia, cuidador
                );
            }

            equinoController.atualizarTabela(grdEquinos);
            this.habilitarCampos(false);
            this.limparCampos();
        } catch (EquinoException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void grdEquinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdEquinosMouseClicked
        if (evt.getClickCount() == 2) {
            btnEditarActionPerformed(null);
        }
    }//GEN-LAST:event_grdEquinosMouseClicked

    private Object getObjectSelectOnGrid() {
        int rowCliked = grdEquinos.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdEquinos.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxBaia;
    private javax.swing.JComboBox<String> cbxCuidador;
    private javax.swing.JComboBox<String> cbxProprietario;
    private javax.swing.JComboBox<String> cbxVeterinario;
    private javax.swing.JFormattedTextField edtDataNasc;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtRaca;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JTable grdEquinos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBaia;
    private javax.swing.JLabel lblCuidador;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProprietario;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVeterinario;
    // End of variables declaration//GEN-END:variables
}
