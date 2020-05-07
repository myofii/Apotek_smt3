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
public class Keranjang {
    private int id;
    private int id_barang;
    private int jumlah;
    private int id_akun;

    public Keranjang(int id, int id_barang, int jumlah, int id_akun) {
        this.id = id;
        this.id_barang = id_barang;
        this.jumlah = jumlah;
        this.id_akun = id_akun;
    }
    
    public Keranjang(int id_barang, int jumlah, int id_akun) {
        this.id_barang = id_barang;
        this.jumlah = jumlah;
        this.id_akun = id_akun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
}
