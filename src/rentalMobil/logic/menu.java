/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalMobil.logic;

import rentalMobil.view.ViewMenu;

/**
 *
 * @author ASUS
 */
public class menu implements form{
    @Override
    public void run(){
        new ViewMenu().setVisible(true);
    }
    
    public void transaksi(){
        new form_peminjaman().run();
    }
    
    public void pengembalian(){
        new form_pengembalian().run();
    }
    
    public void mobil(){
        new DataMobil().run();
    }
    
    public void user(){
        new form_user().run();
    }
}
