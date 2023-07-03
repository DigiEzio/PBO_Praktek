/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AlifNur.dao;
import AlifNur.model.Anggota;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public interface AnggotaDao {
    void insert(Anggota anggota);
    void update(int index,Anggota anggota);
    void delete(int index);
    Anggota getAngggota(int index);
    List<Anggota>getAll();
}
