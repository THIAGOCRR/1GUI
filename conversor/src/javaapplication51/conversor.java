
package javaapplication51;

import javax.swing.JOptionPane;

public class conversor extends javax.swing.JFrame {

    public conversor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtGrados = new javax.swing.JTextField();
        rbuttFherenheit = new javax.swing.JRadioButton();
        rbuttCelsius = new javax.swing.JRadioButton();
        rbuttKelvin = new javax.swing.JRadioButton();
        rbuttRadianes = new javax.swing.JRadioButton();
        jConvertir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio2-De Celcius a Farenheit");

        jLabel2.setText("Ingrese temperatura en Grados");

        txtGrados.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtGrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbuttFherenheit);
        rbuttFherenheit.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbuttFherenheit.setText("A Fherenheit");
        rbuttFherenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbuttFherenheitActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbuttCelsius);
        rbuttCelsius.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbuttCelsius.setText("A Celsius");
        rbuttCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbuttCelsiusActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbuttKelvin);
        rbuttKelvin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbuttKelvin.setText("A Kelvin");
        rbuttKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbuttKelvinActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbuttRadianes);
        rbuttRadianes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbuttRadianes.setText("A Radianes");
        rbuttRadianes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbuttRadianesActionPerformed(evt);
            }
        });

        jConvertir.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jConvertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication51/img/icons8-aprobar-y-actualizar-48.png"))); // NOI18N
        jConvertir.setText("Convertir");
        jConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConvertirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Conversor de Temperatura");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbuttFherenheit)
                    .addComponent(rbuttKelvin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbuttCelsius)
                    .addComponent(rbuttRadianes))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jConvertir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtGrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbuttFherenheit)
                    .addComponent(rbuttCelsius))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbuttKelvin)
                    .addComponent(rbuttRadianes))
                .addGap(18, 18, 18)
                .addComponent(jConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbuttFherenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbuttFherenheitActionPerformed

          
        
        
        
        
        
        
    }//GEN-LAST:event_rbuttFherenheitActionPerformed

    private void txtGradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGradosActionPerformed

    private void jConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConvertirActionPerformed
      
        String texto = new String(txtGrados.getText());
        
         double grados = Double.parseDouble(texto);
         
       // double C = (grados-32)*5/9;
        double C = grados + 273.15;
        if(rbuttFherenheit.isSelected()){
           ;
            
            double F = (grados - 273.15)*9/5 +32;
        JOptionPane.showMessageDialog(rootPane,"La temperatura en grados Farenheit es:"+F);
        }
        
         if(rbuttCelsius.isSelected()){
        //C a K
             System.out.println(C);
        
        JOptionPane.showMessageDialog(this, "la temperatura de grados a Celcius es: "+ C);
        }
        
        
        if(rbuttRadianes.isSelected()){
        
        double R = grados * 3.1416 / 180;
        
        JOptionPane.showMessageDialog(this, "la temperatura de grados a Radianes es: "+ R);
        
        }
        
        
        if(rbuttKelvin.isSelected()){
        //F a K
        double K =  (grados-32)*5/9+273.15;
        
        JOptionPane.showMessageDialog(this, "la temperatura de grados a Kelvin es: "+K);
        
        }
        
        
        
        
    }//GEN-LAST:event_jConvertirActionPerformed

    private void rbuttCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbuttCelsiusActionPerformed
       
         String texto = new String(txtGrados.getText());
       double grados = Double.parseDouble(texto);
        int nro=Integer.parseInt(texto);
         double F= nro*9/5+32;
       
        
        
    }//GEN-LAST:event_rbuttCelsiusActionPerformed

    private void rbuttRadianesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbuttRadianesActionPerformed
        // TODO add your handling code here:
      
        
        
        
    }//GEN-LAST:event_rbuttRadianesActionPerformed

    private void rbuttKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbuttKelvinActionPerformed
        // TODO add your handling code here:
       
        
        
         
         
         
         
         
         
        
        
        
    }//GEN-LAST:event_rbuttKelvinActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jConvertir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton rbuttCelsius;
    private javax.swing.JRadioButton rbuttFherenheit;
    private javax.swing.JRadioButton rbuttKelvin;
    private javax.swing.JRadioButton rbuttRadianes;
    private javax.swing.JTextField txtGrados;
    // End of variables declaration//GEN-END:variables
}
