
package rentalMobil.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

        
public class KoneksiDatabase {
    private Connection connect;
    private String url, password, driverName, query;
    private String userName;
    private ResultSet result;
    public PreparedStatement pst;
    
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
            Statement stm = koneksi_database().createStatement();
            
            result = stm.executeQuery("SELECT * FROM " + table + " WHERE " + where + " = " + value);
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public void querry_insert(String tabel, String nama, String telepon, String email, String alamat) {
        try {
            query = ("INSERT INTO " 
                    + tabel
                    + "(nama, "
                    + "alamat, "
                    + "telepon, "
                    + "email) "
                    + "values"
                    + " ('"+nama+"',"
                    + " '"+alamat+"',"
                    + " '"+telepon+"',"
                    + " '"+email+"') ");
            
            pst = koneksi_database().prepareStatement(query);
            pst.execute();
            
          
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
   
}
