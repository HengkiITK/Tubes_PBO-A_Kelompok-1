/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalMobil.logic;

public class login {
    public int id_user;
    public String username;
    public String password;
    
    
    public login(int id_user, String username, String password){
        this.id_user = id_user;
        this.username = username;
        this.password = password;
    }

    public int  get_Text() {
        
        return id_user;
        
    }
     
    
    
}


