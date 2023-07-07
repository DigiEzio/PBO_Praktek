/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_praktek_TK1A;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LAB-MM
 */
public class SequentialSearch {
    public static void main(String[] args){
        int[] Nilai;
        int i,n,banyak = 0;
        int cari;
        Random rand = new Random();
        Scanner key = new Scanner(System.in);
        
        //Program
           System.out.print("Masukkan panjang aray : ");
           n = key.nextInt();
           Nilai = new int[n];
           //mengisoi array
           for (i = 0; i< n; i++){
               Nilai[i] = rand.nextInt(10);
           }
           for (i = 0; i< n; i++){
               System.out.println("Nilay array ke-"+(i+1)+" adalah "+Nilai[i]);
           }
           System.out.print("Nilai yang dicari : ");
           cari = key.nextInt();
           System.out.println();
           for(i = 0; i<n ;i++){
               if(cari == Nilai[i]){
                   System.out.println("Nilai "+cari+" Ditemukan di array ke "+(i+1));
                   banyak++;
                   //break;
               }
           }
           System.out.println("Banyak angka "+cari+" adalah "+banyak);
           
    }
}
