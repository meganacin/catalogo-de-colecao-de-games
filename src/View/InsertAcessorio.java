package View;

import Controllers.Controllers;
import javax.swing.JOptionPane;

public class InsertAcessorio extends javax.swing.JInternalFrame {

    Controllers cc = new Controllers();

    public void setColectionName(String colecao) {
        atualColection.setText(colecao);
    }

    public InsertAcessorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEstadoConcerv = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtLancamento = new javax.swing.JTextField();
        atualColection = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 10));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 224, 20));

        jLabel2.setText("Lancamento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 10));

        jLabel3.setText("Estado de Conservação:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 10));

        txtEstadoConcerv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Controle", "Periferico" }));
        getContentPane().add(txtEstadoConcerv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 224, 20));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar Acessório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));
        getContentPane().add(txtLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 224, 20));
        getContentPane().add(atualColection, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 6, 224, 18));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Acessorios.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 610, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtNome.getText().isEmpty() || txtLancamento.getText().isEmpty() || txtEstadoConcerv.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Os campos não podem ser vazios");
        } else {
            cc.insertAcessorio(txtNome.getText(), Integer.parseInt(txtLancamento.getText()), txtEstadoConcerv.getSelectedItem().toString(),atualColection.getText());
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");
        }

        txtNome.setText("");
        txtLancamento.setText("");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atualColection;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> txtEstadoConcerv;
    private javax.swing.JTextField txtLancamento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
