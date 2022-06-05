package rentalMobil.logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;



public class TablePeminjam extends KoneksiDatabase{
  
    private int id_peminjam;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;

    
    void TablePeminjam (Connection conn, ResultSet result, Statement stm, 
            int id_peminjam, String nama, String alamat, String telepon, String email) {
        
        this.id_peminjam = id_peminjam;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }
                                       
    public void load_table(javax.swing.JTable tableDataPem) {
        

        
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tableDataPem.getModel();
            
            ResultSet dataTable = querry_selectAll("datapeminjam");
            
            tableModel.setRowCount(0);
            
            while(dataTable.next()) {
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
