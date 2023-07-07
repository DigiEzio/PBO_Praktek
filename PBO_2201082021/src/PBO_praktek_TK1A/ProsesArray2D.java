/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_praktek_TK1A;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LAB-MM
 */
public class ProsesArray2D {
    public static void main(String[] args){
        int[][] data;
        int brs,klm,i,j;
        int jum = 0;
        int max,imax = 0,jmax = 0;
        float rata;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Baris : ");
        brs = in.nextInt();
        System.out.print("Kolom : ");
        klm = in.nextInt();
        data = new int[brs][klm];
        System.out.println("\n------------Isi Array 2D---------------\n ");
        for(i = 0; i < brs;i++){
            for(j = 0; j< klm ; j++){
                data[i][j]= rand.nextInt(10)+1;
                
            }
        }
        for(i = 0; i < brs;i++){
            for(j = 0; j< klm ; j++){
                System.out.print(data[i][j]+"\t");
                jum = jum + data[i][j];
            }
            System.out.println();
        }
        max = data[imax][jmax];
        for(i = 0; i < brs;i++){
            for(j = 0; j< klm ; j++){
                if(data[i][j]>data[imax][jmax]){
                    max = data[i][j];
                }
            }
        }
        rata =(float)jum/(klm*brs);
        System.out.println("Rata-rata adalah "+rata);
        System.out.println("Nilai tertinggi adalah "+max);
    }
}
