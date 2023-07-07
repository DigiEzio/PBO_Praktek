/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alif_28;

/**
 *
 * @author LENOVO
 */
public class studen_record_exam {
    public static void main(String[] args) {
        StudendRecord annaRecord = new  StudendRecord();
        annaRecord.setName("Anna");
        annaRecord.setAddress("Padang");
        annaRecord.setAge(23);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(70);
        annaRecord.setScienceGrade(80);
        
        //Tampilkan
        System.out.println("Nama              :"+annaRecord.getName());
        System.out.println("Alamat            :"+annaRecord.getAddress());
        System.out.println("Umur              :"+annaRecord.getAge());
        System.out.println("Matematika        :"+annaRecord.getMathGrade());
        System.out.println("B.Iggris          :"+annaRecord.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan  :"+annaRecord.getScienceGrade());
        System.out.println("Rata-rata Nilai   :"+annaRecord.getAverage());
        System.out.println("Nilai   :"+annaRecord.getNilaiAngka());
        
        StudendRecord aliRecord = new  StudendRecord();
        aliRecord.setName("ali");
        aliRecord.setAddress("Padang");
        aliRecord.print("");
        aliRecord.print(80,70,80);
        
        StudendRecord budiRecord = new  StudendRecord("Budi","Bukittingi");
        budiRecord.print("");
        
        System.out.println("Jumlah Siswa      :");
            StudendRecord.getStudentCount();
    }
}
