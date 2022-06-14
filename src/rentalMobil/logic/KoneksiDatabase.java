
package rentalMobil.logic;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

        
public class KoneksiDatabase {
    private Connection connect;
    private String url, password, driverName, querry, userName;
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
            System.out.println("SELECT * FROM " + table + " WHERE " + where + " = '" + value + "'");
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
            Statement stm = koneksi_database().createStatement();
            
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
