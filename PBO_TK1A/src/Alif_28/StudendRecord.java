/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alif_28;

/**
 *
 * @author LENOVO
 */
public class StudendRecord {
    private String name;
    private String address;
    private int age;
    private String number;
    private String email;
    private Double mathGrade;
    private Double englishGrade;
    private Double scienceGrade;
    private Double average;
    private char nilaiAngka;
    
    private static int studentCount;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getNumber(){
        return number;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    public static int getStudentCount (){
        return studentCount;
    }
    
    public char getNilaiAngka(){
        if(average > 80){
            nilaiAngka ='A';
        }
        else if(average > 65){
            nilaiAngka ='B';
        }
        else if(average > 55){
            nilaiAngka ='C';
        }
        else if(average > 40){
            nilaiAngka ='D';
        }
        else if(average > 0){
            nilaiAngka ='E';
        }
        return nilaiAngka;
    }
    
    public void print( String temp ){
    System.out.println("Name:" + name);
    System.out.println("Address:" + address);
    System.out.println("Age:" + age);
    }
    public void print(double eGrade, double mGrade, double sGrade){
    System.out.println("Name:" + name);
    System.out.println("Math Grade:" + mGrade);
    System.out.println("English Grade:" + eGrade);
    System.out.println("Science Grade:" + sGrade);
    }
          
    public StudendRecord(){
        studentCount++;
    }
    public StudendRecord(String temp){
    this.name = temp;
    studentCount++;
    }
    public StudendRecord(String name, String address){
    this.name = name;
    this.address = address;
    studentCount++;
    }
    public StudendRecord(double mGrade, double eGrade, double sGrade){
    mathGrade = mGrade;
    englishGrade = eGrade;
    scienceGrade = sGrade;
    studentCount++;
    } 
    
    
}
