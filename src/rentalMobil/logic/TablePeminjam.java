package rentalMobil.logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import rentalMobil.view.ViewInputDataPeminjam;

public class TablePeminjam extends KoneksiDatabase{
  
    private int id_peminjam;
    private String nama;
    private String alamat;
    private int telepon;
    private String email;
    
//    private javax.swing.JFormattedTextField FormattedTextFieldTelepon;
//    private javax.swing.JTextField TextFieldEmail;
//    private javax.swing.JButton buttonDeleted;
//    private javax.swing.JButton buttonDeleted1;
//    private javax.swing.JButton buttonInput;
//    private javax.swing.JButton buttonSearch;
//    private javax.swing.JButton buttonSearch1;
//    private javax.swing.JFormattedTextField formattedTextFieldId;
//    private javax.swing.JPanel interfacePeminjam;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JScrollPane jScrollPane2;
//    private javax.swing.JLabel labelAlamat;
//    private javax.swing.JLabel labelEmail;
//    private javax.swing.JLabel labelId;
//    private javax.swing.JLabel labelNama;
//    private javax.swing.JLabel labelTelepon;
//    private javax.swing.JTable tableDataPeminjam;
//    private javax.swing.JTextArea textFieldAlamat;
//    private javax.swing.JTextField textFieldNama;
//    private javax.swing.JTextField textFieldSearch;
    
    void TablePeminjam (Connection conn, ResultSet result, Statement stm, 
            int id_peminjam, String nama, String alamat, int telepon, String email) {
        
        this.id_peminjam = id_peminjam;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }
    
//    private void buttonInputActionPerformed(java.awt.event.ActionEvent evt) {                                            
//        try {
//           
//            query = "INSERT INTO datapengguna VALUE('%s', '%d', '%s', '%s', '%s')";
//            
//            query = String.format(query, 
//                    textFieldNama.getText(), 
//                    formattedTextFieldId.getText(), 
//                    FormattedTextFieldTelepon.getText(),
//                    TextFieldEmail.getText(),
//                    textFieldAlamat.getText()
//                    
//                    
//                    );
////            
//         
//            
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }
//    }                                           

   
    public void load_table(javax.swing.JTable tableDataPeminjam) {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tableDataPeminjam.getModel();
            
            ResultSet dataTable = querry_selectAll("datapeminjam");
            
            tableModel.setRowCount(2);
            while(dataTable.next()) {
                System.out.print(dataTable.getString("nama"));

                int id = dataTable.getInt("id_penyewa");
                String nama = dataTable.getString("nama");
                String telepon = dataTable.getString("telepon");
                String email = dataTable.getString("email");
                String alamat = dataTable.getString("alamat");
                
                tableModel.addRow(new Object[] {id, nama, telepon, email, alamat});
            }
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
