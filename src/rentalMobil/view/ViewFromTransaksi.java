/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rentalMobil.view;

import rentalMobil.logic.*;

/**
 *
 * @author ASUS-TUF
 */
public class ViewFromTransaksi extends javax.swing.JFrame{
    public  form_peminjaman TablePeminjam;
    
    public ViewFromTransaksi() {
        TablePeminjam = new form_peminjaman();        
        initComponents();
        TablePeminjam.load_table(tableDataPeminjam);
        
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
        labelNama = new javax.swing.JLabel();
        no_pol = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textFieldNama = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textFieldAlamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDataPeminjam = new javax.swing.JTable();
        back = new javax.swing.JButton();
        btnpinjam = new javax.swing.JButton();
        textFieldTelepon = new javax.swing.JTextField();
        labelAlamat1 = new javax.swing.JLabel();
        TextFieldEmail1 = new javax.swing.JTextField();
        labelAlamat2 = new javax.swing.JLabel();
        labelAlamat3 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        labelAlamat4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        interfacePeminjam.setBackground(new java.awt.Color(250, 242, 233));

        labelTelepon.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelTelepon.setForeground(new java.awt.Color(185, 22, 78));
        labelTelepon.setText("Telepon");

        labelNama.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelNama.setForeground(new java.awt.Color(215, 22, 51));
        labelNama.setText("Nama");

        no_pol.setBackground(new java.awt.Color(233, 239, 192));
        no_pol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_polActionPerformed(evt);
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
        tableDataPeminjam.setForeground(new java.awt.Color(0, 0, 0));
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
                "Id_mobil", "Merk ", "Tahun", "No. polisi", "Harga rental"
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

        back.setBackground(new java.awt.Color(246, 182, 133));
        back.setFont(new java.awt.Font("FZYaoTi", 1, 14)); // NOI18N
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        btnpinjam.setBackground(new java.awt.Color(210, 246, 197));
        btnpinjam.setFont(new java.awt.Font("FZYaoTi", 1, 14)); // NOI18N
        btnpinjam.setText("INPUT");
        btnpinjam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpinjamActionPerformed(evt);
            }
        });

        textFieldTelepon.setBackground(new java.awt.Color(233, 239, 192));
        textFieldTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTeleponActionPerformed(evt);
            }
        });

        labelAlamat1.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelAlamat1.setForeground(new java.awt.Color(185, 22, 78));
        labelAlamat1.setText("Plat Mobil");

        TextFieldEmail1.setBackground(new java.awt.Color(233, 239, 192));
        TextFieldEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEmail1ActionPerformed(evt);
            }
        });

        labelAlamat2.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelAlamat2.setForeground(new java.awt.Color(185, 22, 78));
        labelAlamat2.setText("Lama");

        labelAlamat3.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelAlamat3.setForeground(new java.awt.Color(185, 22, 78));
        labelAlamat3.setText("Tanggal");

        duration.setBackground(new java.awt.Color(233, 239, 192));
        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });

        date.setBackground(new java.awt.Color(233, 239, 192));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        labelAlamat4.setFont(new java.awt.Font("FZYaoTi", 0, 18)); // NOI18N
        labelAlamat4.setForeground(new java.awt.Color(185, 22, 78));
        labelAlamat4.setText("Hari");

        javax.swing.GroupLayout interfacePeminjamLayout = new javax.swing.GroupLayout(interfacePeminjam);
        interfacePeminjam.setLayout(interfacePeminjamLayout);
        interfacePeminjamLayout.setHorizontalGroup(
            interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(interfacePeminjamLayout.createSequentialGroup()
                        .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                                .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(textFieldTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                    .addComponent(TextFieldEmail1)))
                            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAlamat1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAlamat3)
                                    .addComponent(labelAlamat2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(no_pol, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                    .addComponent(date)
                                    .addGroup(interfacePeminjamLayout.createSequentialGroup()
                                        .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelAlamat4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(71, 71, 71)
                        .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(interfacePeminjamLayout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322))))
        );
        interfacePeminjamLayout.setVerticalGroup(
            interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlamat))
                .addGap(18, 18, 18)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamat1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_pol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelAlamat2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelAlamat4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(interfacePeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamat3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(interfacePeminjamLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interfacePeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(interfacePeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNamaActionPerformed
       
    }//GEN-LAST:event_textFieldNamaActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void btnpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpinjamActionPerformed
       try {
            TablePeminjam.add_peminjam(
                textFieldNama.getText(), 
                textFieldTelepon.getText(),
                no_pol.getText(),
                textFieldAlamat.getText(),
                no_pol.getText() ,
                date.getText(), 
                duration.getText()); 
            TablePeminjam.load_table(tableDataPeminjam);
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
       TablePeminjam.load_table(tableDataPeminjam);
       
       textFieldNama.setText("");
       textFieldTelepon.setText("");
       textFieldAlamat.setText("");
       date.setText("");
       duration.setText("");
       no_pol.setText("");
       TextFieldEmail1.setText("");
       
    }//GEN-LAST:event_btnpinjamActionPerformed

    private void no_polActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_polActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_polActionPerformed

    private void textFieldTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTeleponActionPerformed

    private void TextFieldEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEmail1ActionPerformed

    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new menu().run();
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldEmail1;
    private javax.swing.JButton back;
    private javax.swing.JButton btnpinjam;
    private javax.swing.JTextField date;
    private javax.swing.JTextField duration;
    private javax.swing.JPanel interfacePeminjam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelAlamat1;
    private javax.swing.JLabel labelAlamat2;
    private javax.swing.JLabel labelAlamat3;
    private javax.swing.JLabel labelAlamat4;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNama1;
    private javax.swing.JLabel labelTelepon;
    private javax.swing.JTextField no_pol;
    private javax.swing.JTable tableDataPeminjam;
    private javax.swing.JTextArea textFieldAlamat;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldTelepon;
    // End of variables declaration//GEN-END:variables
}