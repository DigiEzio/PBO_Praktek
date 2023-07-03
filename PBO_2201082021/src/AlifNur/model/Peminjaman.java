/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlifNur.model;

/**
 *
 * @author LENOVO
 */
public class Peminjaman{
    private String kodeAnggota;
    private String kodeBuku;
    private String tglPeminjaman;
    private String tglPengembalian;
    
    public Peminjaman(){
    }
    
    public Peminjaman(String kodeAnggota, String kodeBuku, String tglPeminjaman,String tglPengembalian) {
        this.kodeAnggota = kodeAnggota;
        this.kodeBuku = kodeBuku;
        this.tglPeminjaman = tglPeminjaman;
        this.tglPengembalian = tglPengembalian;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }
    
        public void setKodeAnggota(String kodeAnggota) {
            this.kodeAnggota = kodeAnggota;
        }

    public String getKodeBuku() {
        return kodeBuku;
    }
    
        public void setKodeBuku(String KodeBuku) {
            this.kodeBuku = KodeBuku;
        }

    public String gettglPeminjaman() {
        return tglPeminjaman;
    }
    
        public void settglPeminjaman(String tglPeminjaman) {
            this.tglPeminjaman = tglPeminjaman;
        }

    public String gettglPengembalian() {
        return tglPengembalian;
    }

        public void settglPengembalian(String tglPengembalian) {
            this.tglPengembalian = tglPengembalian;
        }
}

