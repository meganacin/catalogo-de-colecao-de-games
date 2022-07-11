package View;

import Controllers.Controllers;
import javax.swing.JOptionPane;

public class InsertJogo extends javax.swing.JInternalFrame {

    Controllers cc = new Controllers();

    public InsertJogo() {
        initComponents();
    }
    public void setColectionName(String colecao){
     atualColection.setText(colecao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtLancamento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEstadoConcerv = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        atualColection = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 224, -1));
        getContentPane().add(txtLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 224, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar Jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 130, 20));

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel2.setText("Ano de lancamento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setText("Estado de Concervação:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtEstadoConcerv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo", "Lacrado", "Bem Concervado", "Concervado", "Usado", "Usado em bom Estado", "Bom estado", "marcas de ferrugem", "Arranhado", "Avariado", "defeito", "quebrado", "Produto Pirata" }));
        getContentPane().add(txtEstadoConcerv, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 224, -1));

        jLabel4.setText("Adicionar jogo de ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 0, -1, -1));
        getContentPane().add(atualColection, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 0, 203, 18));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogos3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -210, 630, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if(txtNome.getText().isEmpty()){
            throw new Exception("Nome não pode ser vazio");
        }else if(txtLancamento.getText().isEmpty()){
            throw new Exception("Lançamento não pode ser vazio");

        }
            cc.insertJogo(txtNome.getText(), Integer.parseInt(txtLancamento.getText()), txtEstadoConcerv.getSelectedItem().toString(),atualColection.getText());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Dados Incorretos");

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> txtEstadoConcerv;
    private javax.swing.JTextField txtLancamento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
