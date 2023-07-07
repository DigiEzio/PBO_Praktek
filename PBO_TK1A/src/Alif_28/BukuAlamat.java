/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alif_28;

/**
 *
 * @author LENOVO
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String notlp;
    private String email;
    private String notelp;
    
public BukuAlamat(){
    
}

public BukuAlamat(String nama, String alamat, String notlp, String email ){
    this.nama = nama;
    this.alamat = alamat;
    this.notlp = notlp;
    this.email = email;
    
}

 public String getnama(){
        return nama;
    }
    
public void setnama(String nama){
        this.nama = nama;
    }
public String getAlamat() {
    return nama;
}
 public void setAlamat(String alamat){
 this.alamat = alamat;
}
 public String getNotelp() {
    return notelp;
}
 public void setNotelp(String notelp){
 this.notelp = notelp;
}
 public String getEmail() {
    return email;
}
 public void setEmail(String email){
 this.email = email;
} 

    void setNama(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
