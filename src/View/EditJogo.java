package View;

import Controllers.Controllers;
import javax.swing.JOptionPane;

public class EditJogo extends javax.swing.JInternalFrame {

    Controllers cc = new Controllers();

    public EditJogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtLancamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEstadoConcerv = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(618, 214));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 15, 234, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar Jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 110, -1));

        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 18, -1, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 49, 234, -1));
        getContentPane().add(txtLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 83, 234, -1));

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 52, -1, -1));

        jLabel3.setText("Lançamento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 86, -1, -1));

        jLabel4.setText("Estado de Concervação:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 126, -1, -1));

        txtEstadoConcerv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo", "Lacrado", "Bem Concervado", "Concervado", "Usado", "Usado em bom Estado", "Bom estado", "marcas de ferrugem", "Arranhado", "Avariado", "defeito", "quebrado" }));
        getContentPane().add(txtEstadoConcerv, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 120, 234, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogos3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -210, 630, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtId.getText().isEmpty() || txtNome.getText().isEmpty() ||txtLancamento.getText().isEmpty() ||txtEstadoConcerv.getSelectedItem() == null) {
                       JOptionPane.showMessageDialog(null,"Os campos não podem ser vazios");

        }else{
            cc.editarJogo(Integer.parseInt(txtId.getText()), txtNome.getText(), Integer.parseInt(txtLancamento.getText()), txtEstadoConcerv.getSelectedItem().toString());
            txtId.setText("");
            txtNome.setText("");
            txtLancamento.setText("");
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> txtEstadoConcerv;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLancamento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
