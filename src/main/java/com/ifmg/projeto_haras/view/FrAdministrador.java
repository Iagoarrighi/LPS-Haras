/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ifmg.projeto_haras.view;

import com.ifmg.projeto_haras.view.gerenciaveis.IFrAlimento;
import com.ifmg.projeto_haras.view.gerenciaveis.IFrBaia;
import com.ifmg.projeto_haras.view.gerenciaveis.IFrCuidador;
import com.ifmg.projeto_haras.view.gerenciaveis.IFrEquino;
import com.ifmg.projeto_haras.view.gerenciaveis.IFrProprietario;
import com.ifmg.projeto_haras.view.gerenciaveis.IFrServicoAdicional;
import com.ifmg.projeto_haras.view.gerenciaveis.IFrVeterinario;
import com.ifmg.projeto_haras.view.gerenciaveis.IFrPagarFatura;
import javax.swing.JFrame;

/**
 *
 * @author gusta
 */
public class FrAdministrador extends javax.swing.JFrame {

    private JFrame telaAnterior;
    /**
     * Creates new form FrAdministrador
     * @param telaQueChamou
     */
    public FrAdministrador(JFrame telaQueChamou) {
        this.telaAnterior = telaQueChamou;
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

        deskPaneAdm = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAdministrador = new javax.swing.JMenu();
        mnItemGerenciarEquino = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mitemGerenciarProprietario = new javax.swing.JMenuItem();
        mitemPagarFatura = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mitemGerenciarCuidador = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mitemGerenciarVeterinario = new javax.swing.JMenuItem();
        menuBaias = new javax.swing.JMenu();
        mitemGerenciarBaia = new javax.swing.JMenuItem();
        menuAlimentos = new javax.swing.JMenu();
        mitemGerenciarAlimento = new javax.swing.JMenuItem();
        mitemGerenciarSerAdicionais = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout deskPaneAdmLayout = new javax.swing.GroupLayout(deskPaneAdm);
        deskPaneAdm.setLayout(deskPaneAdmLayout);
        deskPaneAdmLayout.setHorizontalGroup(
            deskPaneAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        deskPaneAdmLayout.setVerticalGroup(
            deskPaneAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        menuAdministrador.setText("Equinos");

        mnItemGerenciarEquino.setText("Gerenciar");
        mnItemGerenciarEquino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemGerenciarEquinoActionPerformed(evt);
            }
        });
        menuAdministrador.add(mnItemGerenciarEquino);

        jMenuBar1.add(menuAdministrador);

        jMenu2.setText("Proprietário");

        mitemGerenciarProprietario.setText("Gerenciar");
        mitemGerenciarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemGerenciarProprietarioActionPerformed(evt);
            }
        });
        jMenu2.add(mitemGerenciarProprietario);

        mitemPagarFatura.setText("Pagar fatura");
        mitemPagarFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemPagarFaturaActionPerformed(evt);
            }
        });
        jMenu2.add(mitemPagarFatura);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cuidador");

        mitemGerenciarCuidador.setText("Gerenciar");
        mitemGerenciarCuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemGerenciarCuidadorActionPerformed(evt);
            }
        });
        jMenu3.add(mitemGerenciarCuidador);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Veterinário");

        mitemGerenciarVeterinario.setText("Gerenciar");
        mitemGerenciarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemGerenciarVeterinarioActionPerformed(evt);
            }
        });
        jMenu4.add(mitemGerenciarVeterinario);

        jMenuBar1.add(jMenu4);

        menuBaias.setText("Baias");

        mitemGerenciarBaia.setText("Gerenciar");
        mitemGerenciarBaia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemGerenciarBaiaActionPerformed(evt);
            }
        });
        menuBaias.add(mitemGerenciarBaia);

        jMenuBar1.add(menuBaias);

        menuAlimentos.setText("Alimentos");

        mitemGerenciarAlimento.setText("Gerenciar");
        mitemGerenciarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemGerenciarAlimentoActionPerformed(evt);
            }
        });
        menuAlimentos.add(mitemGerenciarAlimento);

        jMenuBar1.add(menuAlimentos);

        mitemGerenciarSerAdicionais.setText("Serviços adicionais");

        jMenuItem1.setText("Gerenciar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mitemGerenciarSerAdicionais.add(jMenuItem1);

        jMenuBar1.add(mitemGerenciarSerAdicionais);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deskPaneAdm)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deskPaneAdm)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemGerenciarEquinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemGerenciarEquinoActionPerformed
        IFrEquino ifrEquino = new IFrEquino();
        deskPaneAdm.add(ifrEquino);
        ifrEquino.setVisible(true);
    }//GEN-LAST:event_mnItemGerenciarEquinoActionPerformed

    private void mitemGerenciarBaiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemGerenciarBaiaActionPerformed
        IFrBaia ifrBaia = new IFrBaia();
        deskPaneAdm.add(ifrBaia);
        ifrBaia.setVisible(true);
    }//GEN-LAST:event_mitemGerenciarBaiaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void mitemGerenciarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemGerenciarAlimentoActionPerformed
        IFrAlimento ifrAlimento = new IFrAlimento();
        deskPaneAdm.add(ifrAlimento);
        ifrAlimento.setVisible(true);
    }//GEN-LAST:event_mitemGerenciarAlimentoActionPerformed

    private void mitemGerenciarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemGerenciarVeterinarioActionPerformed
        IFrVeterinario ifrVeterinario = new IFrVeterinario();
        deskPaneAdm.add(ifrVeterinario);
        ifrVeterinario.setVisible(true);
    }//GEN-LAST:event_mitemGerenciarVeterinarioActionPerformed

    private void mitemGerenciarCuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemGerenciarCuidadorActionPerformed
        IFrCuidador ifrCuidador = new IFrCuidador();
        deskPaneAdm.add(ifrCuidador);
        ifrCuidador.setVisible(true);
    }//GEN-LAST:event_mitemGerenciarCuidadorActionPerformed

    private void mitemGerenciarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemGerenciarProprietarioActionPerformed
        IFrProprietario ifrProprietario = new IFrProprietario();
        deskPaneAdm.add(ifrProprietario);
        ifrProprietario.setVisible(true);
    }//GEN-LAST:event_mitemGerenciarProprietarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IFrServicoAdicional ifrServicoAdicional = new IFrServicoAdicional();
        deskPaneAdm.add(ifrServicoAdicional);
        ifrServicoAdicional.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mitemPagarFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemPagarFaturaActionPerformed
        IFrPagarFatura ifrPagarFatura = new IFrPagarFatura();
        deskPaneAdm.add(ifrPagarFatura);
        ifrPagarFatura.setVisible(true);
    }//GEN-LAST:event_mitemPagarFaturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskPaneAdm;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAdministrador;
    private javax.swing.JMenu menuAlimentos;
    private javax.swing.JMenu menuBaias;
    private javax.swing.JMenuItem mitemGerenciarAlimento;
    private javax.swing.JMenuItem mitemGerenciarBaia;
    private javax.swing.JMenuItem mitemGerenciarCuidador;
    private javax.swing.JMenuItem mitemGerenciarProprietario;
    private javax.swing.JMenu mitemGerenciarSerAdicionais;
    private javax.swing.JMenuItem mitemGerenciarVeterinario;
    private javax.swing.JMenuItem mitemPagarFatura;
    private javax.swing.JMenuItem mnItemGerenciarEquino;
    // End of variables declaration//GEN-END:variables
}
