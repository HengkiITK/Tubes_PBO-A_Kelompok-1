package rentalMobil.logic;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

abstract class form_transaksi extends KoneksiDatabase{
  
    private int id_peminjam;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    private String a,b,c,d;
    
    public abstract void run();
    
    void TablePeminjam (ResultSet result, Statement stm, 
         int id_peminjam, String nama, String alamat, String telepon, String email) {
     
        this.id_peminjam = id_peminjam;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }
                                       
    public void load_table(javax.swing.JTable tableDataPeminjam) {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tableDataPeminjam.getModel();
            
            ResultSet dataTable = querry_selectAll("datamobil");
            
            tableModel.setRowCount(0);
            
            while(dataTable.next()) {
                String merk = dataTable.getString("merk");
                int id = dataTable.getInt("id_mobil");
                String  tahun = dataTable.getString("tahun");
                String noPolisi = dataTable.getString("no_pol");
                String harga = dataTable.getString("harga");
                
                tableModel.addRow(new Object[] { id, merk, tahun, noPolisi, harga});
            }
        }  
        
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void add_peminjam(
            String nama,
            String telepon,
            String email,
            String alamat) {
        
        querry_insert("datapeminjam", nama, alamat, telepon, email);
    }
    
    
}
   
