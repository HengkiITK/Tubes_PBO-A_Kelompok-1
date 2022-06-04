package rentalMobil.logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import rentalMobil.view.ViewInputDataPeminjam;

public class TablePeminjam  extends ViewInputDataPeminjam {
    private final KoneksiDatabase nyambung = new KoneksiDatabase();
    
    private Connection conn;
    private ResultSet result;
    private Statement stm;
    private String query;
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
        this.conn = conn;
        this.result = result;
        this.stm = stm;
        this.id_peminjam = id_peminjam;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }
    
    public TablePeminjam() {
        initComponents();
        get_data();
    }
    
    public int get_idpeminjam() {
        return id_peminjam;
    }
    
    public void set_idpeminjam(int id_peminjam) {
        this.id_peminjam = id_peminjam;
    }
    
    public String get_nama() {
        return nama;
    }
    
    public void set_nama(String nama) {
        this.nama = nama;
    }
    
    public String get_alamat() {
        return alamat;
    }
    
    public void set_alamat(String alamat) {
        this.alamat = alamat;
    }
    
    public int get_telepon () {
        return telepon;
    }
    
    public void set_telepon(int telepon) {
        this.telepon = telepon;
    }
    
    public String get_email() {
        return email;
    }
    
    public void set_email(String email) {
        this.email = email;
    }
    
    public Connection get_conn() {
        return conn;
    }
    
    public void set_conn(Connection conn) {
        this.conn = nyambung.get_connect();
    }
    
    public ResultSet get_result() {
        return result;
    }
    
    public void set_result(ResultSet result) {
        this.result = result;
    }
    
    public Statement get_stm() {
        return stm;
    }
    
    public void set_stm(Statement stm) {
        try {
            this.stm = conn.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
   
    public String get_query() {
        return query;
    }
    
    public void set_query(String query) {
        this.query = query;
        
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

   
    public ResultSet get_data() {
        try {
//            conn = nyambung.get_connect();
//            stm = conn.createStatement();
          
            result = stm.executeQuery("SELECT * FROM datapeminjam");
            
            DefaultTableModel tableModel = (DefaultTableModel) tableDataPeminjam.getModel();
            
            tableModel.setRowCount(0);
            
            while(result.next()) {
                String id = result.getString("id_peminjam");
                String nama = result.getString("Nama");
                String telepon = result.getString("Telepon");
                String email = result.getString("Email");
                String alamat = result.getString("Alamat");
                
            tableModel.addRow(new Object[] {id, nama, telepon, email, alamat});
            }
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }

}
