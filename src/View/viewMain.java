package View;

import Controllers.Controllers;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class viewMain extends javax.swing.JFrame {

    public void refresh() {
        tb = cc.indexJogos(atualColection.getText());
        tblJogos.setModel(tb);
        tb = null;
        tb = cc.indexAcessorios(atualColection.getText());
        tblAcessorios.setModel(tb);
    }

    public viewMain() {
        initComponents();
    }

    public viewMain(String texto) {
        initComponents();
        tb = cc.indexJogos(texto);
        tblJogos.setModel(tb);
        tb = null;
        tb = cc.indexAcessorios(texto);
        tblAcessorios.setModel(tb);
        atualColection.setText(texto);

    }
    DeletJogo dJ = new DeletJogo();
    InsertJogo iJ = new InsertJogo();
    EditJogo eJ = new EditJogo();
    DeletAcessorio dA = new DeletAcessorio();
    InsertAcessorio iA = new InsertAcessorio();
    EditAcessorio eA = new EditAcessorio();

    TableModel tb = null;
    Controllers cc = new Controllers();
    String colectionName;

    public void closeIJFrames() {
        if (dJ.isVisible()) {
            dJ.dispose();
        } else if (iJ.isVisible()) {
            iJ.dispose();
        } else if (eJ.isVisible()) {
            eJ.dispose();
        } else if (iA.isVisible()) {
            iA.dispose();
        } else if (eA.isVisible()) {
            eA.dispose();
        }else{
            dA.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descktopjogos2 = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJogos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnDeletGame = new javax.swing.JButton();
        btnEditGame = new javax.swing.JButton();
        btnInsertGame = new javax.swing.JButton();
        descktopjogos = new javax.swing.JDesktopPane();
        refresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcessorios = new javax.swing.JTable();
        refresh1 = new javax.swing.JButton();
        descktopAcessorios = new javax.swing.JDesktopPane();
        btnRefresh = new javax.swing.JButton();
        btnAddAcessorio = new javax.swing.JButton();
        btnEditAcessorio = new javax.swing.JButton();
        btnExcluirAcessorio = new javax.swing.JButton();
        atualColection = new javax.swing.JLabel();
        returnMenu = new javax.swing.JButton();

        javax.swing.GroupLayout descktopjogos2Layout = new javax.swing.GroupLayout(descktopjogos2);
        descktopjogos2.setLayout(descktopjogos2Layout);
        descktopjogos2Layout.setHorizontalGroup(
            descktopjogos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        descktopjogos2Layout.setVerticalGroup(
            descktopjogos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        tblJogos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblJogos);

        btnDeletGame.setBackground(new java.awt.Color(102, 102, 255));
        btnDeletGame.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletGame.setText("Excluir Jogo");
        btnDeletGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletGameActionPerformed(evt);
            }
        });

        btnEditGame.setBackground(new java.awt.Color(102, 102, 255));
        btnEditGame.setForeground(new java.awt.Color(255, 255, 255));
        btnEditGame.setText("Editar Jogo");
        btnEditGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditGameActionPerformed(evt);
            }
        });

        btnInsertGame.setBackground(new java.awt.Color(102, 102, 255));
        btnInsertGame.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertGame.setText("Adicionar Jogo");
        btnInsertGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout descktopjogosLayout = new javax.swing.GroupLayout(descktopjogos);
        descktopjogos.setLayout(descktopjogosLayout);
        descktopjogosLayout.setHorizontalGroup(
            descktopjogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        descktopjogosLayout.setVerticalGroup(
            descktopjogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        refresh.setBackground(new java.awt.Color(102, 102, 255));
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Atualizar Tabela");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(refresh)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descktopjogos)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descktopjogos)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletGame, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditGame, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jogos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        tblAcessorios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAcessorios);

        refresh1.setText("Atualizar Tabela");
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });

        descktopAcessorios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout descktopAcessoriosLayout = new javax.swing.GroupLayout(descktopAcessorios);
        descktopAcessorios.setLayout(descktopAcessoriosLayout);
        descktopAcessoriosLayout.setHorizontalGroup(
            descktopAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        descktopAcessoriosLayout.setVerticalGroup(
            descktopAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnRefresh.setText("Atualizar Tabela");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAddAcessorio.setText("Adcionar Acessorio");
        btnAddAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAcessorioActionPerformed(evt);
            }
        });

        btnEditAcessorio.setText("Editar Acessorio");
        btnEditAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAcessorioActionPerformed(evt);
            }
        });

        btnExcluirAcessorio.setText("Excluir Acessorio");
        btnExcluirAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAcessorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditAcessorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluirAcessorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddAcessorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(descktopAcessorios)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(refresh1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddAcessorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditAcessorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirAcessorio)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descktopAcessorios)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(refresh1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Acessorios", jPanel2);

        jDesktopPane1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, -1, -1));
        jDesktopPane1.add(atualColection, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 9, 208, 19));

        returnMenu.setBackground(new java.awt.Color(102, 102, 255));
        returnMenu.setForeground(new java.awt.Color(255, 255, 255));
        returnMenu.setText("Voltar menu");
        returnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMenuActionPerformed(evt);
            }
        });
        jDesktopPane1.add(returnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 144, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        refresh();
        closeIJFrames();
    }//GEN-LAST:event_refreshActionPerformed

    private void btnInsertGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertGameActionPerformed
        closeIJFrames();
        iJ.setColectionName(atualColection.getText());
        iJ.setVisible(true);
        descktopjogos.add(iJ);
    }//GEN-LAST:event_btnInsertGameActionPerformed

    private void btnEditGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditGameActionPerformed
        closeIJFrames();
        eJ.setVisible(true);
        descktopjogos.add(eJ);
    }//GEN-LAST:event_btnEditGameActionPerformed

    private void btnDeletGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletGameActionPerformed
        closeIJFrames();
        dJ.setVisible(true);
        descktopjogos.add(dJ);
    }//GEN-LAST:event_btnDeletGameActionPerformed

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        refresh();
        closeIJFrames();
    }//GEN-LAST:event_refresh1ActionPerformed

    private void btnExcluirAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAcessorioActionPerformed
        closeIJFrames();
        dA.setVisible(true);
        descktopAcessorios.add(dA);
    }//GEN-LAST:event_btnExcluirAcessorioActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refresh();
        closeIJFrames();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAcessorioActionPerformed
        closeIJFrames();
        iA.setColectionName(atualColection.getText());
        iA.setVisible(true);
        descktopAcessorios.add(iA);
    }//GEN-LAST:event_btnAddAcessorioActionPerformed

    private void btnEditAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAcessorioActionPerformed
        closeIJFrames();
        eA.setVisible(true);
        descktopAcessorios.add(eA);
    }//GEN-LAST:event_btnEditAcessorioActionPerformed

    private void returnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMenuActionPerformed
this.dispose();
    }//GEN-LAST:event_returnMenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atualColection;
    private javax.swing.JButton btnAddAcessorio;
    private javax.swing.JButton btnDeletGame;
    private javax.swing.JButton btnEditAcessorio;
    private javax.swing.JButton btnEditGame;
    private javax.swing.JButton btnExcluirAcessorio;
    private javax.swing.JButton btnInsertGame;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JDesktopPane descktopAcessorios;
    private javax.swing.JDesktopPane descktopjogos;
    private javax.swing.JDesktopPane descktopjogos2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refresh1;
    private javax.swing.JButton returnMenu;
    private javax.swing.JTable tblAcessorios;
    private javax.swing.JTable tblJogos;
    // End of variables declaration//GEN-END:variables
}
