/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alif_26;

/**
 *
 * @author LENOVO
 */
public class polimorsis_example {
    public static void main(String[] args) {
        Person ref;
        student studentObject = new student();
        Employee employeeObject = new Employee();
        
        studentObject.setName("Anna");
        employeeObject.setname("Budi");
       
        ref = studentObject;
        System.out.println("Nama    :"+ref.getName());
        
        ref = employeeObject;
        System.out.println("Nama :"+ref.getName());
        printInformation(studentObject);
        printInformation(employeeObject);
    }
    
    public static void printInformation(Person ref){
        if(ref instanceof student) {
            System.out.println("Nama Student    :"+ref.getName());
            System.out.println("Alamat Student :"+ref.getAddress());
        }
        else if(ref instanceof Employee) {
            System.out.println("Nama Employee   :"+ref.getName());
            System.out.println("Alamat Employee :"+ref.getAddress());
        }
    
    }
}