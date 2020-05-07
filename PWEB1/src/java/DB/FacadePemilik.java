/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import EntityClass.*;
import java.sql.SQLException;

/**
 *
 * @author M. Yofi Indrawan
 */
public class FacadePemilik {
    AksesJdbcOdbc akses = new AksesJdbcOdbc();
    
    public double getPemasukan(String bulan){
        int pemasukan = 0;
        String sql = "SELECT SUM(total_biaya) AS ms FROM transaksi WHERE tanggal_jual LIKE '%-"+bulan+"-%'";
        
        try {
            akses.connect();
            akses.executeQuery(sql);
            
            if (akses.getResultSet().next()) {
                pemasukan = akses.getResultSet().getInt("ms");
            }
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                akses.disconnect();
                return pemasukan;
            } catch (SQLException x) {
                x.printStackTrace();
                return pemasukan;
            }
        }
    }
    
    public double getPengeluaran(String bulan){
        int pengeluaran = 0;
        String sql = "SELECT SUM(total_harga) AS kl FROM beli WHERE tanggal_beli LIKE '%-"+bulan+"-%'";
        
        try {
            akses.connect();
            akses.executeQuery(sql);
            
            if (akses.getResultSet().next()) {
                pengeluaran = akses.getResultSet().getInt("kl");
            }
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                akses.disconnect();
                return pengeluaran;
            } catch (SQLException x) {
                x.printStackTrace();
                return pengeluaran;
            }
        }
    }
}
