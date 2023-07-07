/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alif_26;

/**
 *
 * @author LENOVO
 */
public class Person {
       protected String name;
   protected String address;

    /**
     * @param args the command line arguments
     */
   public Person() {
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    
}

    public static void main(String[] args) {
        // TODO code application logic here
    }
    public Person (String name, String addres){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        System.out.println("Student : getName");
        return name;
    }
    
    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
}