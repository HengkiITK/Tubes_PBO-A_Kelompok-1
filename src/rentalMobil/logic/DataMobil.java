/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalMobil.logic;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class DataMobil extends KoneksiDatabase{
    public void load_table(javax.swing.JTable tableDataPem) {
                try {
            DefaultTableModel tableModel = (DefaultTableModel) tableDataPem.getModel();
            
            ResultSet dataTable = querry_selectAll("datamobil");
            
            tableModel.setRowCount(0);
            
            while(dataTable.next()) {
                int id = dataTable.getInt("id_mobil");
                String nama = dataTable.getString("merk");
                String telepon = dataTable.getString("tahun");
                String email = dataTable.getString("no_pol");
                String alamat = dataTable.getString("harga");
                String status = dataTable.getString("status");
                
                tableModel.addRow(new Object[] {id, nama, telepon, email, alamat, status});
            }
            
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}