/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClass;

/**
 *
 * @author M. Yofi Indrawan
 */
public class Jual {
    private int id_jual;
    private int id_barang;
    private int jumlah;
    private int id_akun;
    private int id_transaksi;

    public Jual(int id_barang, int jumlah, int id_akun, int id_transaksi) {
        this.id_barang = id_barang;
        this.jumlah = jumlah;
        this.id_akun = id_akun;
        this.id_transaksi = id_transaksi;
    }

    public int getId_jual() {
        return id_jual;
    }

    public void setId_jual(int id_jual) {
        this.id_jual = id_jual;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getId_akun() {
        return id_akun;
    }

    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }
    
    
}
