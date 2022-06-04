
package rentalMobil.logic;
import java.sql.Connection;
import java.sql.DriverManager;
        
public class KoneksiDatabase {
    private Connection connect;
    private String driverName; 
    private String url;
    private String userName;
    private String password; 
    
    
    public KoneksiDatabase() {
        
        driverName = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/rentalmobil";
        userName = "root";
        password = "";
      
    }
    public void set_connect(Connection connect){
        this.connect = connect;
    }
    
    public Connection get_connect() {
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
