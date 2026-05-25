package telas;

public class TelaListagem extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaListagem.class.getName());

    public TelaListagem() {
        initComponents();
        this.setSize(600, 500); // Define o tamanho solicitado
        this.setLocationRelativeTo(null); // Abre a janela centralizada na tela
        carregarDados(); // Chama o método de busca
    }
    public void carregarDados() {
        try {
        // 1. Iniciar conexão JPA
            jakarta.persistence.EntityManagerFactory emf = jakarta.persistence.Persistence.createEntityManagerFactory("PeritoPU");
            jakarta.persistence.EntityManager em = emf.createEntityManager();

        // 2. Buscar a lista de peritos
            java.util.List<model.Perito> lista = em.createQuery("SELECT p FROM Perito p", model.Perito.class).getResultList();

        // 3. Preparar o modelo da tabela
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblListagem.getModel();
            modelo.setNumRows(0); // Limpa a tabela

        // 4. Preencher com os dados do banco
        for (model.Perito p : lista) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getCpf(),
                p.getEmail()
            });
        }
        em.close();
        emf.close();
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar listagem: " + e.getMessage());
    }
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 500));

        tblListagem.setBackground(new java.awt.Color(230, 230, 230));
        tblListagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Email"
            }
        ));
        tblListagem.setPreferredSize(new java.awt.Dimension(600, 500));
        jScrollPane1.setViewportView(tblListagem);

        jPanel1.setBackground(new java.awt.Color(70, 90, 140));

        jLabel1.setBackground(new java.awt.Color(70, 90, 140));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listagem de Peritos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnVoltar.setBackground(new java.awt.Color(70, 90, 140));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setPreferredSize(new java.awt.Dimension(80, 40));
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // 1. Instancia a tela principal (Relatório de Alvarás)
        TelaRelatorioAlvaras telaPrincipal = new TelaRelatorioAlvaras();
    
    // 2. Aplica as configurações de tamanho e centralização
        telaPrincipal.setSize(1000, 600); 
        telaPrincipal.setLocationRelativeTo(null);
    
    // 3. Torna a principal visível e fecha a listagem atual
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaListagem().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListagem;
    // End of variables declaration//GEN-END:variables
}
