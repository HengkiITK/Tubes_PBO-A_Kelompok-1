
package rentalMobil;
import java.sql.Connection;
import java.sql.DriverManager;
        
public class ConnectDataBase {
    private Connection connect;
    private String DriverName; 
    private String url;
    private String UserName;
    private String password; 
    
    
    public ConnectDataBase() {
        
        DriverName = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/rentalmobil";
        UserName = "root";
        password = "";
      
    }
    public void setConnect(Connection connect){
        this.connect = connect;
    }
    
    public Connection getConnect() {
        if(connect == null) {
            try {
                connect = DriverManager.getConnection(url, UserName, password);
                Class.forName(DriverName);
                 System.out.println("Berhasil terhubung pada database");
            }           
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connect;       
    }
    
    public static void main(String[] args) {
        ConnectDataBase sambung = new ConnectDataBase();
        
        System.out.println(sambung.getConnect());
        
    }
 
}
