/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlifNur.dao;
import java.util.List;
import java.util.ArrayList;
import AlifNur.model.Peminjaman;
/**
 *
 * @author LENOVO
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
    private List<Peminjaman> data = new ArrayList<>();
    
    public PeminjamanDaoImpl() {
        data.add(new Peminjaman("A001","NARUTO Vol. 123","23 Mei 2023","30 Juni 2023 "));
        data.add(new Peminjaman("A002","ENSIKLOPEDIA HEWAN","4 Desember 2034","4 Januari 2035"));
    }
    
    public void insert(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman> getAll(){
        return data;
    }
}

