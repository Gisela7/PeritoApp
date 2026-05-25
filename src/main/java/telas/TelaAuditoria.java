package telas;

public class TelaAuditoria extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaAuditoria.class.getName());

    
    public TelaAuditoria() {
        initComponents();
        
        this.setSize(1000, 600); 
        this.setLocationRelativeTo(null);
        txtPesquisa.setEnabled(false);
        
        btnBuscarActionPerformed(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        lblCadastroPeritos = new javax.swing.JLabel();
        lblCadastroAlvaras = new javax.swing.JLabel();
        lblAuditoria = new javax.swing.JLabel();
        lblBackup = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JScrollPane = new javax.swing.JScrollPane();
        tblAuditoria = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(830, 520));

        jPanel1.setBackground(new java.awt.Color(70, 90, 140));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SISTEMA PERITOS");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Versão 1.0 - Desktop");

        lblDashboard.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Align-Vertical-Bottom--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDashboard.setIconTextGap(15);
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });

        lblCadastroPeritos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCadastroPeritos.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroPeritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Person--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblCadastroPeritos.setText("Cadastro Peritos");
        lblCadastroPeritos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastroPeritos.setIconTextGap(15);
        lblCadastroPeritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastroPeritosMouseClicked(evt);
            }
        });

        lblCadastroAlvaras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCadastroAlvaras.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroAlvaras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblCadastroAlvaras.setText("Cadastro de Alvarás");
        lblCadastroAlvaras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastroAlvaras.setIconTextGap(15);
        lblCadastroAlvaras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastroAlvarasMouseClicked(evt);
            }
        });

        lblAuditoria.setBackground(new java.awt.Color(90, 110, 160));
        lblAuditoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAuditoria.setForeground(new java.awt.Color(255, 255, 255));
        lblAuditoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/History--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblAuditoria.setText("Auditoria/Histórico");
        lblAuditoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAuditoria.setIconTextGap(15);
        lblAuditoria.setOpaque(true);
        lblAuditoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAuditoriaMouseClicked(evt);
            }
        });

        lblBackup.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBackup.setForeground(new java.awt.Color(255, 255, 255));
        lblBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Database--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblBackup.setText("Backup e Importação");
        lblBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackup.setIconTextGap(15);
        lblBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackupMouseClicked(evt);
            }
        });

        cbFiltro.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Usuário", "Ação", "Descrição" }));
        cbFiltro.addActionListener(this::cbFiltroActionPerformed);

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCadastroPeritos)
                            .addComponent(lblCadastroAlvaras)
                            .addComponent(lblAuditoria)
                            .addComponent(lblBackup)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPesquisa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(lblDashboard)
                .addGap(27, 27, 27)
                .addComponent(lblCadastroPeritos)
                .addGap(31, 31, 31)
                .addComponent(lblCadastroAlvaras)
                .addGap(32, 32, 32)
                .addComponent(lblAuditoria)
                .addGap(33, 33, 33)
                .addComponent(lblBackup)
                .addGap(28, 28, 28)
                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(70, 90, 140));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Auditoria e Histórico do Sistema");

        tblAuditoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Data/Hora", "Usuário", "Ação", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JScrollPane.setViewportView(tblAuditoria);

        btnVoltar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(141, 141, 141)
                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JScrollPane))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblCadastroPeritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroPeritosMouseClicked
        TelaDadosPeritos tela = new TelaDadosPeritos();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCadastroPeritosMouseClicked

    private void lblCadastroAlvarasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroAlvarasMouseClicked
        TelaRelatorioAlvaras tela = new TelaRelatorioAlvaras();
        tela.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_lblCadastroAlvarasMouseClicked

    private void lblAuditoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAuditoriaMouseClicked
        btnBuscarActionPerformed(null);
    }//GEN-LAST:event_lblAuditoriaMouseClicked

    private void lblBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseClicked
        new TelaBackup().setVisible(true);
    }//GEN-LAST:event_lblBackupMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaRelatorioAlvaras telaRelatorio = new TelaRelatorioAlvaras();
        telaRelatorio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                                              
        String tipoFiltro = cbFiltro.getSelectedItem().toString();
        String termo = txtPesquisa.getText().trim();
    
    try {
        jakarta.persistence.EntityManager em = util.JPAUtil.getEntityManager();
        String jpql = "SELECT a FROM Auditoria a";
        
        if (!termo.isEmpty() && !tipoFiltro.equals("Todos")) {
            if (tipoFiltro.equals("Usuário")) {
                jpql += " WHERE LOWER(a.usuario) LIKE :termo";
            } else if (tipoFiltro.equals("Ação")) {
                jpql += " WHERE LOWER(a.acao) LIKE :termo";
            } else if (tipoFiltro.equals("Descrição")) {
                jpql += " WHERE LOWER(a.descricao) LIKE :termo";
            }
        }
        
        jpql += " ORDER BY a.dataHora DESC";
        
        jakarta.persistence.TypedQuery<model.Auditoria> query = em.createQuery(jpql, model.Auditoria.class);
        
        if (!termo.isEmpty() && !tipoFiltro.equals("Todos")) {
            query.setParameter("termo", "%" + termo.toLowerCase() + "%");
        }
        
        java.util.List<model.Auditoria> lista = query.getResultList();
        
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblAuditoria.getModel();
        modelo.setNumRows(0);
        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        for (model.Auditoria a : lista) {
            modelo.addRow(new Object[]{
                a.getId(),
                sdf.format(a.getDataHora()),
                a.getUsuario(),
                a.getAcao(),
                a.getDescricao()
            });
        }
        
        em.close();
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao filtrar histórico: " + e.getMessage());
    }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        if (cbFiltro.getSelectedItem().toString().equals("Todos")) {
            txtPesquisa.setText("");
            txtPesquisa.setEnabled(false);
        } else {
            txtPesquisa.setEnabled(true);
            txtPesquisa.requestFocus();
        }
    }//GEN-LAST:event_cbFiltroActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaAuditoria().setVisible(true));
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAuditoria;
    private javax.swing.JLabel lblBackup;
    private javax.swing.JLabel lblCadastroAlvaras;
    private javax.swing.JLabel lblCadastroPeritos;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTable tblAuditoria;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
