/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalMobil.logic;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import rentalMobil.view.ViewRiwayatTransaksi;

/**
 *
 * @author ASUS-TUF
 */
public class riwayat extends KoneksiDatabase{
    public void run() {
        new ViewRiwayatTransaksi().setVisible(true);
    }
    
     public void load_table(javax.swing.JTable tableDataPeminjam) {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tableDataPeminjam.getModel();
            
            ResultSet dataTable = querry_selectAll("datatransaksi JOIN datamobil ON datatransaksi.id_mobil = datamobil.id_mobil JOIN datapeminjam ON datatransaksi.id_penyewa = datapeminjam.id_penyewa");
            
            tableModel.setRowCount(0);
            
            while(dataTable.next()) {
                String tgl_kembali = dataTable.getString("tgl_kembali");
                if(tgl_kembali != null){
                    int id = dataTable.getInt("id_transaksi");
                    String merk = dataTable.getString("merk");
                    String no_pol = dataTable.getString("no_pol");
                    String peminjam = dataTable.getString("nama");
                    String harga = dataTable.getString("harga");
                    String tgl_pinjam = dataTable.getString("tgl_pinjam");
                    int lama = dataTable.getInt("lama");
                    int denda = dataTable.getInt("denda");
                    
                    tableModel.addRow(new Object[] {id, merk, no_pol, peminjam, harga, tgl_pinjam, lama, tgl_kembali, denda});
                }
            }
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
            
    }  
}
