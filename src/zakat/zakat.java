/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;


import database.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.lang.String;
import java.sql.Timestamp;
/**
 *
 * @author Wirya
 */
public class zakat {
    login user = new login();
    private Connection conn = new koneksi().getkoneksi();
    int jmlanggota;
    int nominal;
    int user_id;
    int id;
    
    private javax.swing.JOptionPane j;
    public zakat(){
        this.id = id;
        this.user_id = login.id;
        this.jmlanggota = jmlanggota;
        this.nominal = nominal;
        
    }
    public static void tambah(String jmlanggota,String nominal, Connection conn){
        long now = System.currentTimeMillis();
        Timestamp sqlTimestamp = new Timestamp(now);
        String sql = "INSERT INTO zakat VALUES (0,'"+login.id+"','"+Integer.parseInt(jmlanggota)+"','"+Integer.parseInt(nominal)+"','"+sqlTimestamp+"')";
        try{
            conn.prepareStatement(sql);
            PreparedStatement stat = conn.prepareStatement(sql);
                 stat.executeUpdate();
          }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void ubah(int user_id, String jmlanggota, String nominal, Connection conn){
        long now = System.currentTimeMillis();
        Timestamp sqlTimestamp = new Timestamp(now);
        String sql = "UPDATE zakat SET jmlanggota='"+jmlanggota+"', nominal='"+nominal+"' WHERE user_id ='"+user_id+"'";
        try{
            conn.prepareStatement(sql);
            PreparedStatement stat = conn.prepareStatement(sql);
                 stat.executeUpdate();
          }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void hapus(int id, Connection conn){
       
        try{
            Statement stat = conn.createStatement();
            int result= stat.executeUpdate("DELETE FROM zakat WHERE id ='"+id+"'");
            if(result == 0){
                JOptionPane.showMessageDialog(null,"data gagal dihapus silahkan cek id dengan benar");
            }else{
            JOptionPane.showMessageDialog(null, "data berhasil dihapus, harap refresh menu utama");
            }
          }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Data gagal dihapus");
        }
    }
}
