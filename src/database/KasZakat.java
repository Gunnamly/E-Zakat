/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Wirya
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KasZakat {
    private static Connection KasZakat;
    public static Connection getKasZakat(){
        if(KasZakat==null){
            try{
                String url = new String();
                String user = new String();
                String password = new String();
                url = "jdbc:mysql://localhost:3306/kaszakat";
                user = "root";
                password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                KasZakat = (Connection) DriverManager.getConnection(url, user, password);
                
            }catch (SQLException t){
                System.out.println("Koneksi Gagal");
            }
                
        }
        return KasZakat;
    }
    
}
