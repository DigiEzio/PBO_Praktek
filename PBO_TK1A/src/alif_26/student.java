/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alif_26;

/**
 *
 * @author LENOVO
 */
public class student extends Person {
    public student() {
        super("anna","Padang");
        System.out.println("Inside Student:Constructor");
        //beberapa kode di sini
    }
   
 
    public static void main(String[] args){
        student anna = new student();
        System.out.println("Nama      "+anna.name);
        System.out.println("Alamat    "+anna.address);
    }

}
