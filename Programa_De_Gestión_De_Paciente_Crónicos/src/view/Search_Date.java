package view;

import dao.AppointmentDAO;
import javax.swing.JOptionPane;
import org.bson.Document;
import utilities.*;

public class Search_Date extends javax.swing.JFrame {
    private AppointmentDAO app = new AppointmentDAO();
    
    public Search_Date() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        jPanel1.setLocation(MAXIMIZED_HORIZ/2, MAXIMIZED_VERT/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new PanelImage();
        jPanel1 = new PanelRound();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        typeDocumentField = new javax.swing.JComboBox<>();
        documentField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dayField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        monthField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yearField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backButton.setText("←");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Buscar Cita");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Tipo de Documento:");

        jButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton1.setText(" Buscar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Nro. Documento:");

        typeDocumentField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un documento", "Tarjeta de Identidad", "Cédula de Ciudadanía", "Cédula de Extranjería" }));
        typeDocumentField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        typeDocumentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeDocumentFieldActionPerformed(evt);
            }
        });

        documentField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        documentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentFieldActionPerformed(evt);
            }
        });
        documentField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                documentFieldKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setText("Fecha: (DD/MM/AAAA)");

        dayField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dayField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dayFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dayFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dayFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dayFieldMousePressed(evt);
            }
        });
        dayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayFieldActionPerformed(evt);
            }
        });
        dayField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dayFieldKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("|");

        monthField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        monthField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                monthFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                monthFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                monthFieldMousePressed(evt);
            }
        });
        monthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthFieldActionPerformed(evt);
            }
        });
        monthField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                monthFieldKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("|");

        yearField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        yearField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yearFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yearFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                yearFieldMousePressed(evt);
            }
        });
        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });
        yearField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeDocumentField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(documentField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backButton)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jButton1)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(typeDocumentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(documentField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Appointment_Functions app = new Appointment_Functions();
        app.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(typeDocumentField.getSelectedIndex() == 0 || documentField.getText().isEmpty() || dayField.getText().isEmpty() || 
                monthField.getText().isEmpty() || yearField.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Faltan campos por diligenciar", "Advertencia", 2);
            
        }else{
            String Fecha = dayField.getText()+"/"+monthField.getText()+"/"+yearField.getText();
        
            Document doc = app.FindDate(typeDocumentField.getSelectedItem().toString(), documentField.getText(), Fecha);

            if(doc != null){
                this.setVisible(false);
                Impressions Imp = new Impressions(doc);
                Imp.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "No se encontró la cita", "Error", 0);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void typeDocumentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeDocumentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeDocumentFieldActionPerformed

    private void documentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentFieldActionPerformed

    }//GEN-LAST:event_documentFieldActionPerformed

    private void dayFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayFieldMouseClicked

    }//GEN-LAST:event_dayFieldMouseClicked

    private void dayFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayFieldMouseEntered

    }//GEN-LAST:event_dayFieldMouseEntered

    private void dayFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayFieldMouseExited

    }//GEN-LAST:event_dayFieldMouseExited

    private void dayFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayFieldMousePressed

    }//GEN-LAST:event_dayFieldMousePressed

    private void dayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayFieldActionPerformed

    private void monthFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMouseClicked

    }//GEN-LAST:event_monthFieldMouseClicked

    private void monthFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMouseEntered

    }//GEN-LAST:event_monthFieldMouseEntered

    private void monthFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMouseExited

    }//GEN-LAST:event_monthFieldMouseExited

    private void monthFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMousePressed

    }//GEN-LAST:event_monthFieldMousePressed

    private void monthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthFieldActionPerformed

    private void yearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMouseClicked

    }//GEN-LAST:event_yearFieldMouseClicked

    private void yearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMouseEntered

    }//GEN-LAST:event_yearFieldMouseEntered

    private void yearFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMouseExited

    }//GEN-LAST:event_yearFieldMouseExited

    private void yearFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMousePressed

    }//GEN-LAST:event_yearFieldMousePressed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void documentFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            documentField.setEditable(false);
        }else{
            documentField.setEditable(true);
            if(documentField.getText().length() == 10){
                documentField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            documentField.setEditable(true);
        }
    }//GEN-LAST:event_documentFieldKeyPressed

    private void dayFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            dayField.setEditable(false);
        }else{
            dayField.setEditable(true);
            if(dayField.getText().length() == 2){
                dayField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            dayField.setEditable(true);
        }
    }//GEN-LAST:event_dayFieldKeyPressed

    private void monthFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            monthField.setEditable(false);
        }else{
            monthField.setEditable(true);
            if(monthField.getText().length() == 2){
                monthField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            monthField.setEditable(true);
        }
    }//GEN-LAST:event_monthFieldKeyPressed

    private void yearFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            yearField.setEditable(false);
        }else{
            yearField.setEditable(true);
            if(yearField.getText().length() == 4){
                yearField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            yearField.setEditable(true);
        }
    }//GEN-LAST:event_yearFieldKeyPressed

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
            java.util.logging.Logger.getLogger(Search_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Date().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField dayField;
    private javax.swing.JTextField documentField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField monthField;
    private javax.swing.JComboBox<String> typeDocumentField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
