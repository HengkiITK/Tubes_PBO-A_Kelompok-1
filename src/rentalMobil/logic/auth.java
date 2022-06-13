/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalMobil.logic;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import rentalMobil.view.menu;

public class auth extends KoneksiDatabase{
    public boolean login(String username, String password){
        try{
            String sql = username + "' AND password = '" + password;

            ResultSet dataLogin = querry_select("datauser", "username", sql);

            while (dataLogin.next()){
//                System.exit(0);
                new menu().setVisible(true);
                
                return true;
            }
            
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return false;
        
    }
}


