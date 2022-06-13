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
            
            ResultSet dataTable = querry_select("datamobil", "status", "ready");
            
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
    
    public void add_peminjam(String nama, String telepon, String email, String alamat, String no_pol, String duration, String date) {
        try {
            String[] column = {"nama", "telepon", "email", "alamat"};
            String[] data = {nama, telepon, email, alamat};

            querry_insert("datapeminjam", column, data);

            ResultSet dataPeminjam = get_lastData("datapeminjam", "id_penyewa");
            ResultSet dataMobil = querry_select("datamobil", "no_pol", no_pol);

            int harga = Integer.parseInt(duration) * 200000;
            
            while(dataMobil.next()) {
                int id_mobil = dataMobil.getInt("id_mobil");
                int id_penyewa = dataMobil.getInt("id_mobil");
                
                String[] column2 = {"id_mobil", "id_penyewa", "no_pol", "harga", "tgl_pinjam", "lama"};
                String[] value = {Integer.toString(id_mobil), Integer.toString(id_penyewa) , no_pol, Integer.toString(harga), date, duration};

                querry_insert("datatransaksi",column2, value);
            }
            
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
   
