/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import EntityClass.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author M. Yofi Indrawan
 */
public class FacadeKasir {
    AksesJdbcOdbc akses = new AksesJdbcOdbc();
    
    public Barang[] getDaftarBarangById(int[] id){
        Barang[] daftar = null;
        Barang data = null;
        ArrayList<Barang>list = new ArrayList<>();
        String sql = "SELECT * FROM barang where id_barang = ";
        
        try {
            for (int i = 0; i < id.length; i++) {
                sql += id[i];
                akses.connect();
                akses.executeQuery(sql);

                String nama_obat = "", tipe = "";
                int harga = 0, stok = 0, kode_obat = 0;

                while (akses.getResultSet().next()) {
                    kode_obat = akses.getResultSet().getInt("id_barang");
                    nama_obat = akses.getResultSet().getString("nama_barang");
                    tipe = akses.getResultSet().getString("tipe");
                    harga = akses.getResultSet().getInt("harga");
                    stok = akses.getResultSet().getInt("stok");
                    data = new Barang(kode_obat, nama_obat, tipe, harga, stok);
                    list.add(data);
                }
                daftar = new Barang[list.size()];
                list.toArray(daftar);
            }
            return daftar;
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        }
        return daftar;
    }
    
    public boolean kurangStokBarang(int[] jumlah, int[] id){
        boolean sukses = false;
        
        try {
            for (int i = 0; i < jumlah.length; i++) {
                String update = "UPDATE barang SET stok = stok - " + jumlah[i] + " where id_barang = " + id[i] + "";
                akses.connect();

                int baris = akses.executeUpdate(update);
                if (baris > 0) {
                    sukses = true;
                }
            }
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
    
    public boolean insertJual(Jual[] jual){
        try {
            for (int i = 0; i < jual.length; i++) {
                String insert = "INSERT INTO jual (id_barang, jumlah, id_akun, id_transaksi) VALUES "
                        + "(" + jual[i].getId_barang() + "," + jual[i].getJumlah() + "," + jual[i].getId_akun() + ","
                        + "" + jual[i].getId_transaksi() + ")";
                akses.connect();
                akses.executeUpdate(insert);
                akses.disconnect();
            }
            return true;
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
            return false;
        } 
    }
    
    public int getLastIdTransaksi(){
        String sql = "SELECT max(id) as id FROM transaksi";
        int id = 0;
        
        try {
            akses.connect();
            akses.executeQuery(sql);
            
            if (akses.getResultSet().next()) {
                id = akses.getResultSet().getInt("id");
            }
            
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                akses.disconnect();
                return id;
            } catch (SQLException x) {
                x.printStackTrace();
                return id;
            }
        }
    }
    
    public boolean insertTransaksi(Transaksi tr){
        try {
            String insert = "INSERT INTO transaksi (total_biaya, id_akun) VALUES ("
                    + ""+tr.getTotal_biaya()+","+tr.getId_akun()+")";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();
            return true;
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
            return false;
        } 
    }
    
    public Barang getDataBarang(String nama){
        Barang brg = null;
        String sql = "SELECT * FROM barang WHERE nama_barang = '"+nama+"'";
        
        try {
            akses.connect();
            akses.executeQuery(sql);
            
            String nama_barang="", tipe="";
            int harga=0, stok=0, id_barang=0;
            
            if (akses.getResultSet().next()) {
                id_barang=akses.getResultSet().getInt("id_barang");
                tipe=akses.getResultSet().getString("tipe");
                nama_barang=akses.getResultSet().getString("nama_barang");
                harga=akses.getResultSet().getInt("harga");
                stok=akses.getResultSet().getInt("stok");
            }
            
            brg = new Barang(id_barang, nama_barang, tipe, harga, stok);
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                akses.disconnect();
                return brg;
            } catch (SQLException x) {
                x.printStackTrace();
                return brg;
            }
        }
    }
    
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
                tipe=akses.getResultSet().getString("tipe");
                harga=akses.getResultSet().getInt("harga");
                stok=akses.getResultSet().getInt("stok");
                data = new Barang(kode_obat, nama_obat, tipe, harga, stok);
                list.add(data);
            }
            daftar= new Barang[list.size()];
            list.toArray(daftar);
            return daftar;
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        }
        return daftar;
    }
    
    public Barang getBarang(int id){
        Barang brg = null;
        String sql = "SELECT * FROM barang WHERE id_barang = "+id+"";
        
        try {
            akses.connect();
            akses.executeQuery(sql);
            
            String nama_barang="", tipe="";
            int harga=0, stok=0, id_barang=0;
            
            if (akses.getResultSet().next()) {
                id_barang=akses.getResultSet().getInt("id_barang");
                tipe=akses.getResultSet().getString("tipe");
                nama_barang=akses.getResultSet().getString("nama_barang");
                harga=akses.getResultSet().getInt("harga");
                stok=akses.getResultSet().getInt("stok");
            }
            
            brg = new Barang(id_barang, nama_barang, tipe, harga, stok);
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                akses.disconnect();
                return brg;
            } catch (SQLException x) {
                x.printStackTrace();
                return brg;
            }
        }
    }
    
    public Keranjang[] getKeranjang(int id_acc){
        Keranjang[] daftar = null;
        Keranjang data = null;
        ArrayList<Keranjang>list = new ArrayList<>();
        String sql = "SELECT * FROM keranjang where id_akun = "+id_acc+"";
        
        try {
            akses.connect();
            akses.executeQuery(sql);
            
            int id = 0, id_barang = 0, jumlah = 0, id_akun = 0;
            
            while (akses.getResultSet().next()) {
                id=akses.getResultSet().getInt("id");
                id_barang=akses.getResultSet().getInt("id_barang");
                jumlah=akses.getResultSet().getInt("jumlah");
                id_akun=akses.getResultSet().getInt("id_akun");
                data = new Keranjang(id, id_barang, jumlah, id_akun);
                list.add(data);
            }
            daftar= new Keranjang[list.size()];
            list.toArray(daftar);
            return daftar;
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        }
        return daftar;
    }
    
    public boolean insertKeranjang(Keranjang keranjang){
        try {
            String insert = "INSERT INTO keranjang (id_barang, jumlah, id_akun) VALUES ("+keranjang.getId_barang()+","
                    + ""+keranjang.getJumlah()+","+keranjang.getId_akun()+")";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();
            return true;
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
            return false;
        } 
    }
    
    public boolean deleteBarangKeranjang(int id){
        boolean sukses = false;
        
        try {
            String delete = "DELETE FROM keranjang where id = "+id+"";
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
    
    public boolean deleteKeranjang(int id){
        boolean sukses = false;
        
        try {
            String delete = "DELETE FROM keranjang where id_akun = "+id+"";
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
}
