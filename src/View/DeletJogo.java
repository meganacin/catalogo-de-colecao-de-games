package View;

import Controllers.Controllers;
import javax.swing.JOptionPane;

public class DeletJogo extends javax.swing.JInternalFrame {

    Controllers cc = new Controllers();

    public DeletJogo() {
        initComponents();
        alertFild.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        alertFild = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(618, 214));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 150, 30));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Deletar Jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        alertFild.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        alertFild.setForeground(new java.awt.Color(255, 0, 0));
        alertFild.setText("Campo Obrigatorio");
        getContentPane().add(alertFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogos3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -210, 630, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtId.getText().isEmpty()){
            alertFild.setVisible(true);
        } else{
            cc.deleteJogo(Integer.parseInt(txtId.getText()));
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
