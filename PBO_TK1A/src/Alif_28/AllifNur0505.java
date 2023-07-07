/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alif_28;

/**
 *
 * @author LENOVO
 */
public class AllifNur0505 {
    public static void main(String[] args) {
        StudendRecord alifRecord = new  StudendRecord();
        alifRecord.setName("Alif Nur Samudra");
        alifRecord.setAddress("Padang");
        
        alifRecord.setEmail("Alif Nur Samudra");

        //Tampilkan
        System.out.println("Nama              :"+alifRecord.getName());
        System.out.println("Alamat            :"+alifRecord.getAddress());
        System.out.println("Nomor Telepon     :"+alifRecord.getNumber());
        System.out.println("Email             :"+alifRecord.getEmail());
        
       
        
        System.out.println("Jumlah Siswa      :");
            StudendRecord.getStudentCount();
    }
}


