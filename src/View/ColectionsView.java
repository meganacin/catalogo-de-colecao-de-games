package View;

import Controllers.Controllers;
import Models.Colecao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ColectionsView extends javax.swing.JFrame {

    viewMain sendColectionName;
    Controllers cc = new Controllers();
    String texto;

    public ColectionsView() {
        initComponents();
        comboboxElements();
        painelCreate.setVisible(false);
    }

    public void comboboxElements() {

        try {
            ColectionComboBox.removeAllItems();

            ResultSet rs = cc.listColection();
            while (rs.next()) {
                ColectionComboBox.addItem(rs.getString(1));
            }
        } catch (Exception erro) {
            System.out.println(erro);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ColectionComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAcess = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        painelCreate = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        deletColection = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(ColectionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 242, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Selecione a Coleção que deseja acessar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 24));

        btnAcess.setBackground(new java.awt.Color(102, 102, 255));
        btnAcess.setForeground(new java.awt.Color(255, 255, 255));
        btnAcess.setText("Acessar");
        btnAcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 150, 40));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Criar nova coleção");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 150, 40));

        painelCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Nome da coleção:");

        btnCreate.setText("Criar");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnCancel.setText("cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCreateLayout = new javax.swing.GroupLayout(painelCreate);
        painelCreate.setLayout(painelCreateLayout);
        painelCreateLayout.setHorizontalGroup(
            painelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCreateLayout.createSequentialGroup()
                .addGroup(painelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCreateLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCreateLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCancel)
                        .addGap(42, 42, 42)
                        .addComponent(btnCreate)))
                .addGap(15, 15, 15))
        );
        painelCreateLayout.setVerticalGroup(
            painelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCreateLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(painelCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        deletColection.setBackground(new java.awt.Color(102, 102, 255));
        deletColection.setForeground(new java.awt.Color(255, 255, 255));
        deletColection.setText("Deletar coleção");
        deletColection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletColectionActionPerformed(evt);
            }
        });
        jPanel1.add(deletColection, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 150, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela_inicial3.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        painelCreate.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        try {
            cc.createColection(txtNome.getText());
            comboboxElements();
            JOptionPane.showMessageDialog(null, "Coleção Criada com sucesso");
            painelCreate.setVisible(false);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Dados Incorretos");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void deletColectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletColectionActionPerformed
        try {
            cc.deleteColecao(ColectionComboBox.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "item Deletado");
            comboboxElements();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro, selecione Uma coleção");
        }    }//GEN-LAST:event_deletColectionActionPerformed

    private void btnAcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessActionPerformed

        texto = ColectionComboBox.getSelectedItem().toString();
        sendColectionName = new viewMain(texto);
        sendColectionName.setVisible(true);

    }//GEN-LAST:event_btnAcessActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        painelCreate.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColectionsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ColectionComboBox;
    private javax.swing.JButton btnAcess;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton deletColection;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelCreate;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
