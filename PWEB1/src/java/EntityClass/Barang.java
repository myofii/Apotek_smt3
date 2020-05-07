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
public class Barang {
    private int id_barang;
    private String nama_barang;
    private String tipe;
    private int harga;
    private int stok;

    public Barang(){
        this.id_barang=0;
        this.nama_barang="";
        this.tipe="";
        this.harga=0;
        this.stok=0;
    }
    
    public Barang(int id_barang, String nama_barang, String tipe, int harga, int stok) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.tipe = tipe;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
