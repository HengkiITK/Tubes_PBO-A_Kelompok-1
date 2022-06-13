/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalMobil.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import rentalMobil.view.ViewFormPengembalian;

/**
 *
 * @author ASUS
 */
public class form_pengembalian extends KoneksiDatabase {
    String peminjam = ""; 
    String merk = "";
    
    public void run(){
        new ViewFormPengembalian().setVisible(true);
    }
    
    public void load_table(javax.swing.JTable tableDataPem) {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tableDataPem.getModel();
            
            ResultSet dataTable = querry_selectAll("datatransaksi JOIN datamobil ON datatransaksi.id_mobil = datamobil.id_mobil JOIN datapeminjam ON datatransaksi.id_penyewa = datapeminjam.id_penyewa");
            
            tableModel.setRowCount(0);
            

            while(dataTable.next()) {
//                System.out.print(dataTable.getString("merk"));
                int id = dataTable.getInt("id_transaksi");
                String merk = dataTable.getString("merk");
                String no_pol = dataTable.getString("nama");
                String peminjam = dataTable.getString("nama");
                String harga = dataTable.getString("harga");
                String tgl_pinjam = dataTable.getString("tgl_pinjam");
                int lama = dataTable.getInt("lama");
                String tgl_kembali = dataTable.getString("tgl_kembali");
                int denda = dataTable.getInt("denda");
//                System.out.print(id);
                tableModel.addRow(new Object[] {id, merk, no_pol, peminjam, harga, tgl_pinjam, lama, tgl_kembali, denda});
            }
            
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cariData(String id, javax.swing.JTextField no_pol, javax.swing.JTextField nama, javax.swing.JTextField harga, javax.swing.JTextField tgl_pinjam, javax.swing.JTextField duration) {
        try {
            ResultSet dataTransaksi = querry_select("datatransaksi JOIN datamobil ON datatransaksi.id_mobil = datamobil.id_mobil JOIN datapeminjam ON datatransaksi.id_penyewa = datapeminjam.id_penyewa", "id_transaksi", id);
            while(dataTransaksi.next()){
                no_pol.setText(dataTransaksi.getString("no_pol"));
                nama.setText(dataTransaksi.getString("nama"));
                harga.setText(dataTransaksi.getString("harga"));
                tgl_pinjam.setText(dataTransaksi.getString("tgl_pinjam"));
                duration.setText(dataTransaksi.getString("lama"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void penghitung_denda(String tgl_pinjam, String tgl_kembali, String duration, javax.swing.JTextField denda){
        try {
            Date firstDate = new SimpleDateFormat("dd-MM-yyyy").parse(tgl_pinjam);
            Date secondDate =  new SimpleDateFormat("dd-MM-yyyy").parse(tgl_kembali);
            
            long diff = secondDate.getTime() - firstDate.getTime();

            TimeUnit time = TimeUnit.DAYS; 
            long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
            
            if(Integer. parseInt(duration) < diffrence){
                long banyak_denda = 50000 * (diffrence - Integer. parseInt(duration));
                denda.setText(String.valueOf(banyak_denda));
            } else {
                denda.setText("0");
            }
        } catch (ParseException ex) {
            Logger.getLogger(form_pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pengembalian(String id, String tgl_kembali, String denda){
        String[] column = {"tgl_kembali", "denda"};
        String[] data = {tgl_kembali, denda};
        querry_update("datatransaksi", column, data, "id_transaksi", id);

    }
}
