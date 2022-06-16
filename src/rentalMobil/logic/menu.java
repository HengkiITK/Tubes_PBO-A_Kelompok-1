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
        ViewMenu viewmenu = new ViewMenu();
        viewmenu.setVisible(true);
    }
    
    public void transaksi(){
        form_peminjaman formPeminjaman = new form_peminjaman();
        formPeminjaman.run();
    }
    
    public void pengembalian(){
        form_pengembalian form_pengembalian = new form_pengembalian();
        form_pengembalian.run();
    }
    
    public void mobil(){
        DataMobil DataMobil = new DataMobil();
        DataMobil.run();
    }
    
    public void user(){
        form_user form_user = new form_user();
        form_user.run();
    }
    
    public void riwayat() {
        riwayat riwayat = new riwayat();
        riwayat.run();     
    }
}
