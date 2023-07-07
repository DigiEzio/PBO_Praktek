/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlifNur.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        this("");
    }
    
     public Peminjaman(String string) {
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
        public long getSelisih() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = format.parse(tglPeminjaman);
        Date d2 = format.parse(tglPengembalian);
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000); 
        return diffDays ;
    }
    
}

