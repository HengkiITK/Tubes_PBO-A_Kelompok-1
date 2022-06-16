
package rentalMobil.logic;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
        
public class KoneksiDatabase {
    private Connection connect;
    private String url, password, driverName, querry, userName;
    private ResultSet result;
    private PreparedStatement pst;
    private Statement stm;
    
    public KoneksiDatabase() {
        driverName = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/rentalmobil";
        userName = "root";
        password = "";

    }
    
    
    public Connection koneksi_database() {
        if(connect == null) {
            try {
                connect = DriverManager.getConnection(url, userName, password);
                Class.forName(driverName);
                 System.out.println("Berhasil terhubung pada database");
            }           
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connect;       
    }
    
    public void load_table(
            javax.swing.JTable table, 
            String tableDatabase, 
            String [] rowTitleAll,
            String rowTitle,
            String value) {
        
        try {
            stm = koneksi_database().createStatement();
            ResultSet dataTableAll = querry_selectAll(tableDatabase);
            ResultSet dataTable = querry_select(tableDatabase, rowTitle, value);
            
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        
            tableModel.setRowCount(0);
            if ("ready".equals(value)) {
                int index = 0;
                while(dataTable.next()) {
                    for (String a : rowTitleAll) {
                        String row = dataTable.getString(rowTitleAll[index]);
                        index++;
                        if(row.length() == 5) {
                            tableModel.addRow(new Object[] {row.length() == 1, row.length() == 7});
                        }
                    }
                }  
            }
            
            else {
                while(dataTableAll.next()) {
                    try {
                        int id_mobil = dataTableAll.getInt(rowTitleAll[0]);
                        String merk_mobil = dataTableAll.getString(rowTitleAll[1]);
                        String tahun_mobil = dataTableAll.getString(rowTitleAll[2]);
                        String no_plat = dataTableAll.getString(rowTitleAll[3]);
                        String harga_rental = dataTableAll.getString(rowTitleAll[4]);
                        String status_mobil = dataTableAll.getString(rowTitleAll[5]);

                        tableModel.addRow(new Object[] {id_mobil, 
                            merk_mobil, no_plat, tahun_mobil, harga_rental, status_mobil});
                    }
                
                catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet querry_selectAll(String table){
        try {
            Statement stm = koneksi_database().createStatement();
            result = stm.executeQuery("SELECT * FROM " + table);
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public ResultSet querry_select(String table, String where, String value){
        try {
            stm = koneksi_database().createStatement();
            result = stm.executeQuery("SELECT * FROM " + table + " WHERE " + where + " = '" + value + "'");
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public void querry_insert(String tabel, String[] cloumn, String[] data) {
        try {
            String forquerry = "(";
            String values = " VALUES (";
            int index = 0;
            
            for(String param : cloumn) {
                forquerry = forquerry + param + ",";
                values = values + "'" + data[index]+ "',";
                index++;
            }
            
            forquerry = forquerry.substring(0, forquerry.length() - 1) + ")";
            values = values.substring(0, values.length() - 1) + ")";
            
            querry = ("INSERT INTO " + tabel + forquerry + values);
            
            pst = koneksi_database().prepareStatement(querry);
            pst.execute();
            
          
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void querry_update(String tabel, String[] column, String[] data, String where, String value) {
        try {
            String forquerry = " SET ";
            int index = 0;
            
            for(String param : column) {
                forquerry = forquerry + param + " = '" + data[index] + "', ";
                index++;
            }
            forquerry = forquerry.substring(0, forquerry.length() - 2);
            
            querry = ("UPDATE " + tabel + forquerry + " WHERE " + where + " = '" + value + "'");
            System.out.println(querry);
            pst = koneksi_database().prepareStatement(querry);
            pst.execute();
  
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet get_lastData (String table, String param){
        try {
            stm = koneksi_database().createStatement();
            
            result = stm.executeQuery("SELECT * FROM " + table + " ORDER BY "+ param + " DESC LIMIT 1");
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public void querry_delete(String table, String column, String value){
//        DELETE FROM table_name WHERE condition;
        try{
            querry = ("DELETE FROM " + table + " WHERE " + column + " = '" + value + "'");
            System.out.println(querry);
            pst = koneksi_database().prepareStatement(querry);
            pst.execute();
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
