
package rentalMobil.logic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

        
public class KoneksiDatabase {
    private Connection connect;
    private String driverName; 
    private String url;
    private String userName;
    private String password; 
    private ResultSet result;
    
    
    public KoneksiDatabase() {
        
        driverName = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/rentalmobil";
        userName = "root";
        password = "";
      
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
}
