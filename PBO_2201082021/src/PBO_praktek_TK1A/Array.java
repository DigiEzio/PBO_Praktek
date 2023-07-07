/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_praktek_TK1A;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Array {
    public static void main(String[] args){
        //deklarasi
        int[] Nilai;
        int n,i,sum;
        float rata;
        int max, imax, min, imin;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Banyak data : ");
        n =in.nextInt();
        Nilai = new int[n];
        sum = 0;
        //Mengisi array
        for(i = 0; i<n;i++){
            //System.out.print("Masukkan nilai array ke-"+(i+1)+" : ");
            Nilai[i] = rand.nextInt(100);
            sum += Nilai[i];
        }
        //proses nilai
        max = Nilai[0]; imax = 0;
        min = Nilai[0]; imin = 0;
        for(i = 1 ; i <n ; i++){
            if(Nilai[i] > max){
                max = Nilai[i];
                imax = i;
            }
            if(Nilai[i]<min){
                min = Nilai[i];
                imin = i;
            }
        }
        rata = (float)sum/n;
        //Output 
        System.out.println();
        for(i = 0; i<n;i++){
            System.out.println("Nilai array ke "+(i+1)+" : "+Nilai[i]);
        }
        System.out.println("Total nilai adalah : "+sum);
        System.out.println("Rata-rata nilai adalah : "+rata);
        System.out.println("Nilai tertinggi terletak pada array ke-"+(imax+1)+" dengan nilai "+max);
        System.out.println("Nilai terendah terletak pada array ke-"+(imin+1)+" dengan nilai "+min);  
    }
}
