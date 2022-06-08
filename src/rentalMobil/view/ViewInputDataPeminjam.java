/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rentalMobil.view;

/**
 *
 * @author ASUS-TUF
 */
public class ViewInputDataPeminjam extends javax.swing.JFrame {

    /**
   
     */
    public ViewInputDataPeminjam() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        interfacePeminjam = new javax.swing.JPanel();
        labelTelepon = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textFieldNama = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textFieldAlamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDataPeminjam = new javax.swing.JTable();
        textFieldSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttonDeleted = new javax.swing.JButton();
        buttonInput = new javax.swing.JButton();
        buttonSearch1 = new javax.swing.JButton();
        formattedTextFieldId = new javax.swing.JFormattedTextField();
        buttonDeleted1 = new javax.swing.JButton();
        FormattedTextFieldTelepon = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        interfacePeminjam.setBackground(new java.awt.Color(255, 246, 218));
        interfacePeminjam.setMaximumSize(new java.awt.Dimension(2000, 2000));

        labelTelepon.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelTelepon.setForeground(new java.awt.Color(185, 22, 78));
        labelTelepon.setText("Telepon");

        labelId.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelId.setForeground(new java.awt.Color(185, 22, 78));
        labelId.setText("ID");

        labelNama.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelNama.setForeground(new java.awt.Color(215, 22, 51));
        labelNama.setText("Nama");

        TextFieldEmail.setBackground(new java.awt.Color(233, 239, 192));
        TextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEmailActionPerformed(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(185, 22, 78));
        labelEmail.setText("Email");

        textFieldNama.setBackground(new java.awt.Color(233, 239, 192));
        textFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNamaActionPerformed(evt);
            }
        });

        labelAlamat.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(185, 22, 78));
        labelAlamat.setText("Alamat");

        textFieldAlamat.setBackground(new java.awt.Color(233, 239, 192));
        textFieldAlamat.setColumns(2);
        textFieldAlamat.setRows(1);
        textFieldAlamat.setAutoscrolls(false);
        textFieldAlamat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldAlamat.setMaximumSize(new java.awt.Dimension(5, 5));
        textFieldAlamat.setPreferredSize(new java.awt.Dimension(5, 5));
        jScrollPane1.setViewportView(textFieldAlamat);

        tableDataPeminjam.setBackground(new java.awt.Color(194, 222, 209));
        tableDataPeminjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Telepon", "Email", "Alamat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDataPeminjam.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jScrollPane2.setViewportView(tableDataPeminjam);

        textFieldSearch.setBackground(new java.awt.Color(233, 239, 192));
        textFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSearchActionPerformed(evt);
            }
        });

        buttonSearch.setBackground(new java.awt.Color(246, 182, 133));
        buttonSearch.setFont(new java.awt.Font("FZYaoTi", 1, 14)); // NOI18N
        buttonSearch.setText("BACK");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonDeleted.setBackground(new java.awt.Color(255, 119, 119));
        buttonDeleted.setFont(new java.awt.Font("FZYaoTi", 1, 14)); // NOI18N
        buttonDeleted.setText("DELETE");
        buttonDeleted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonInput.setBackground(new java.awt.Color(210, 246, 197));
        buttonInput.setFont(new java.awt.Font("FZYaoTi", 1, 14)); // NOI18N
        buttonInput.setText("INPUT");
        buttonInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInputActionPerformed(evt);
            }
        });

        buttonSearch1.setBackground(new java.awt.Color(244, 191, 191));
        buttonSearch1.setFont(new java.awt.Font("FZYaoTi", 1, 14)); // NOI18N
        buttonSearch1.setText("SEARCH");
        buttonSearch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearch1ActionPerformed(evt);
            }
        });

        formattedTextFieldId.setBackground(new java.awt.Color(233, 239, 192));
        formattedTextFieldId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        formattedTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldIdActionPerformed(evt);
            }
        });

        buttonDeleted1.setBackground(new java.awt.Color(255, 119, 119));
        buttonDeleted1.setFont(new java.awt.Font("FZYaoTi", 1, 14)); // NOI18N
        buttonDeleted1.setText("CLEAR");
        buttonDeleted1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        FormattedTextFieldTelepon.setBackground(new java.awt.Color(233, 239, 192));
        FormattedTextFieldTelepon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("+62"))));
        FormattedTextFieldTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormattedTextFieldTeleponActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout interfacePeminjamLayout = new javax.swing.GroupLayout(interfacePeminjam);
        interfacePeminjam.setLayout(interfacePeminjamLayout);
        interfacePeminjamLayout.setHorizontalGroup(
            interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(interfacePeminjamLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(interfacePeminjamLayout.createSequentialGroup()
                                        .addComponent(labelId)
                                        .addGap(67, 67, 67))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, interfacePeminjamLayout.createSequentialGroup()
                                        .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(formattedTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldNama)))
                            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                                .addComponent(labelAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                                .addComponent(labelTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FormattedTextFieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, interfacePeminjamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonInput, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDeleted1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, interfacePeminjamLayout.createSequentialGroup()
                        .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSearch1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDeleted))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        interfacePeminjamLayout.setVerticalGroup(
            interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDeleted, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(interfacePeminjamLayout.createSequentialGroup()
                        .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formattedTextFieldId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FormattedTextFieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAlamat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonDeleted1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(interfacePeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interfacePeminjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNamaActionPerformed

    private void textFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSearchActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonInputActionPerformed

    private void buttonSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSearch1ActionPerformed

    private void formattedTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldIdActionPerformed

    private void FormattedTextFieldTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormattedTextFieldTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormattedTextFieldTeleponActionPerformed

    private void TextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEmailActionPerformed

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
            java.util.logging.Logger.getLogger(ViewInputDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInputDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInputDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInputDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInputDataPeminjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FormattedTextFieldTelepon;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JButton buttonDeleted;
    private javax.swing.JButton buttonDeleted1;
    private javax.swing.JButton buttonInput;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonSearch1;
    private javax.swing.JFormattedTextField formattedTextFieldId;
    private javax.swing.JPanel interfacePeminjam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTelepon;
    private javax.swing.JTable tableDataPeminjam;
    private javax.swing.JTextArea textFieldAlamat;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldSearch;
    // End of variables declaration//GEN-END:variables
}
