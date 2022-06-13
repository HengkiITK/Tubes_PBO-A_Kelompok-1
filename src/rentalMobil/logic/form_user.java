/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalMobil.logic;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import rentalMobil.view.ViewFormUser;

/**
 *
 * @author ASUS
 */
public class form_user extends KoneksiDatabase{
    public void run(){
        new ViewFormUser().setVisible(true);
    }
    
    public void load_table(javax.swing.JTable table){
        try {
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
            
            ResultSet dataTable = querry_selectAll("datauser");
            
            tableModel.setRowCount(0);
            
            while(dataTable.next()) {
                int id = dataTable.getInt("id_user");
                String nama = dataTable.getString("nama");
                String username = dataTable.getString("username");
                
                tableModel.addRow(new Object[] {id, nama, username});
            }
            
        }  
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void add_user(String name, String username, String password) {
        String[] column = {"nama", "username", "password"};
        String[] data = {name, username, password};
        querry_insert("datauser", column, data);
    }
    
    public void delete_user(String username){
        querry_delete("datauser", "username", username);
    }   
}
