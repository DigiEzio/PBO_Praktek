/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alif_28;

/**
 *
 * @author LENOVO
 */
public class DataBukuAlamat {
    private BukuAlamat[] data = new BukuAlamat[100];
    private int index;
    
    public void insert(int index, BukuAlamat bukuAlamat) {
        data[index] = bukuAlamat;
        index++;
    }
    public void update(int index, BukuAlamat bukuAlamat) {
        data[index] = bukuAlamat;
    }
    public BukuAlamat[] getAll() {
        return data;
    }
    public void delete(int index) {
        data[index].setNama("");
        data[index].setAlamat("");
        data[index].setNotelp("");
        data[index].setEmail("");
    }
}
