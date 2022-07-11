/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controllers.Controllers;
import javax.swing.JOptionPane;

/**
 *
 * @author brasi
 */
public class DeletAcessorio extends javax.swing.JInternalFrame {

    /**
     * Creates new form DeletAcessorio
     */
    public DeletAcessorio() {
        initComponents();
        alertFild.setVisible(false);

    }

    Controllers cc = new Controllers();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        alertFild = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 30, 30));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 145, 36));

        alertFild.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        alertFild.setForeground(new java.awt.Color(255, 0, 0));
        alertFild.setText("Campo Obrigatorio");
        getContentPane().add(alertFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 190, 30));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Deletar Acessorio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 180, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Acessorios.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 630, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtId.getText().isEmpty()) {
            alertFild.setVisible(true);
        } else {
            cc.deleteAcessorio(Integer.parseInt(txtId.getText()));
            JOptionPane.showMessageDialog(null, "Deletado!");
            this.dispose();
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertFild;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
