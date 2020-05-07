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
public class Transaksi {
    private int total_biaya;
    private int id_akun;

    public Transaksi(int total_biaya, int id_akun) {
        this.total_biaya = total_biaya;
        this.id_akun = id_akun;
    }

    public int getTotal_biaya() {
        return total_biaya;
    }

    public void setTotal_biaya(int total_biaya) {
        this.total_biaya = total_biaya;
    }

    public int getId_akun() {
        return id_akun;
    }

    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }
    
    
}
