/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import EntityClass.Barang;
import EntityClass.Beli;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author M. Yofi Indrawan
 */
public class FacadeGudang {
    AksesJdbcOdbc akses = new AksesJdbcOdbc();
    
    public Barang[] getDaftarBarang(){
        Barang[] daftar = null;
        Barang data = null;
        ArrayList<Barang>list = new ArrayList<>();
        String sql = "SELECT * FROM barang";
        
        try {
            akses.connect();
            akses.executeQuery(sql);
            
            String nama_obat="", tipe="";
            int harga=0, stok=0, kode_obat=0;
            
            while (akses.getResultSet().next()) {
                kode_obat=akses.getResultSet().getInt("id_barang");
                nama_obat=akses.getResultSet().getString("nama_barang");
                harga=akses.getResultSet().getInt("harga");
                stok=akses.getResultSet().getInt("stok");
                tipe=akses.getResultSet().getString("tipe");
                data = new Barang(kode_obat, nama_obat, tipe, harga, stok);
                list.add(data);
            }
            daftar= new Barang[list.size()];
            list.toArray(daftar);
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                akses.disconnect();
                return daftar;
            } catch (SQLException x) {
                x.printStackTrace();
                return daftar;
            }
        }
    }
    
    public boolean tambahStokBarang(Barang barang){
        boolean sukses = false;
        
        try {
            String update = "UPDATE barang SET stok = stok + "+barang.getStok()+" where id_barang = "+barang.getId_barang()+"";
            akses.connect();
            
            int baris = akses.executeUpdate(update);
            if(baris>0) sukses = true;
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        } finally{
            try {
                akses.disconnect();
            } catch (SQLException x) {
                x.printStackTrace();
            }
        }
        return sukses;
    }
    
    public boolean updateBarang(Barang dataBarang){
        boolean sukses = false;
        
        try {
            String update = "UPDATE barang SET "
                    + "nama_barang = '"+dataBarang.getNama_barang()+"', "
                    + "harga = "+dataBarang.getHarga()+", tipe = '"+dataBarang.getTipe()+"'"
                    + "where id_barang = "+dataBarang.getId_barang()+"";
            akses.connect();
            
            int baris = akses.executeUpdate(update);
            if(baris>0) sukses = true;
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (SQLException x){
            x.printStackTrace();
        } finally{
            try {
                akses.disconnect();
            } catch (SQLException x) {
                x.printStackTrace();
            }
        }
        return sukses;
    }
    
    public Barang getDataBarang(String id){
        Barang dataBarang = null;
        String sql = "SELECT * FROM barang WHERE id_barang = "+id+"";
        
        try {
            akses.connect();
            akses.executeQuery(sql);
            
            if (akses.getResultSet().next()) {                
                dataBarang = new Barang();
                dataBarang.setId_barang(akses.getResultSet().getInt("id_barang"));
                dataBarang.setNama_barang(akses.getResultSet().getString("nama_barang"));
                dataBarang.setHarga(akses.getResultSet().getInt("harga"));
                dataBarang.setStok(akses.getResultSet().getInt("stok"));
                dataBarang.setTipe(akses.getResultSet().getString("tipe"));
            }
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                akses.disconnect();
                return dataBarang;
            } catch (SQLException x) {
                x.printStackTrace();
                return dataBarang;
            }
        }
    }
    
    public boolean deleteBarang(String id){
        boolean sukses = false;
        
        try {
            String delete = "DELETE FROM barang where id_barang = "+id+"";
            akses.connect();
            
            int baris = akses.executeUpdate(delete);
            if (baris>0) sukses = true;
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (SQLException x){
            x.printStackTrace();
        } finally{
            try {
                akses.disconnect();
            } catch (SQLException x) {
                x.printStackTrace();
            }
        }
        return sukses;
    }
    
    public boolean insertBarang(Barang barang){
        try {
            String insert = "INSERT INTO barang (nama_barang, harga, tipe, stok) VALUES ('"+barang.getNama_barang()+"',"
                    + ""+barang.getHarga()+",'"+barang.getTipe()+"',0)";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();
            return true;
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
            return false;
        } catch (SQLException x) {
            x.printStackTrace();
            return false;
        }
    }
    
    public boolean insertBeli(Beli beli){
        try {
            String insert = "INSERT INTO beli (id_barang, jumlah, total_harga, id_akun) VALUES ("+beli.getId_barang()+","
                    + ""+beli.getJumlah()+","+beli.getTotal_harga()+","+beli.getId_akun()+")";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();
            return true;
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
            return false;
        } catch (SQLException x) {
            x.printStackTrace();
            return false;
        }
    }
}
