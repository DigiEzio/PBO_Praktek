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
public class BubbleSort {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int[] data;
        int i,j,n,temp;
        
        System.out.print("Banyak data : ");
        n =in.nextInt();
        data = new int[n];
        //Mengisi array
        System.out.println("=============Array Data==============");
        for(i = 0; i<n;i++){
            data[i] = rand.nextInt(100)+1;
            System.out.print(data[i]+"\t");  
        }
        //bubble sort
        for(i = 0; i< n; i++){
            for(j = n-1; j >=i+1 ; j--){
                if(data[j]<data[j-1]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        System.out.println(); 
        for(i = 0; i<n;i++){
            System.out.println(data[i]+"\t");  
        }
    }
}
