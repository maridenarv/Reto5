package Vista;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonPrimerInforme = new javax.swing.JButton();
        botonSegundoInforme = new javax.swing.JButton();
        botonTercerInforme = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel3.setText("Generar primer informe");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reto 5 Alejandra de la Rosa");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setText("Informes proyectos de construcción");

        botonPrimerInforme.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        botonPrimerInforme.setText("Generar primer informe ");
        botonPrimerInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrimerInformeActionPerformed(evt);
            }
        });

        botonSegundoInforme.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        botonSegundoInforme.setText("Generar segundo informe ");
        botonSegundoInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSegundoInformeActionPerformed(evt);
            }
        });

        botonTercerInforme.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        botonTercerInforme.setText("Generar tercer informe ");
        botonTercerInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTercerInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonTercerInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSegundoInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPrimerInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(botonPrimerInforme, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonSegundoInforme, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonTercerInforme, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPrimerInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrimerInformeActionPerformed
        new frmPrimerInforme().setVisible(true);
    }//GEN-LAST:event_botonPrimerInformeActionPerformed

    private void botonSegundoInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSegundoInformeActionPerformed
        new frmSegundoInforme().setVisible(true);
    }//GEN-LAST:event_botonSegundoInformeActionPerformed

    private void botonTercerInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTercerInformeActionPerformed
        new frmTercerInforme().setVisible(true);
    }//GEN-LAST:event_botonTercerInformeActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPrimerInforme;
    private javax.swing.JButton botonSegundoInforme;
    private javax.swing.JButton botonTercerInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
