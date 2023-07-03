/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlifNur.Controler;
import AlifNur.model.*;
import java.util.*;
import AlifNur.view.*;
import AlifNur.dao.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
/**
 *
 * @author LENOVO
 */
public class AnggotaController {
    FromAnggota view;
    Anggota anggota;
    AnggotaDao dao;
    
    public AnggotaController(FromAnggota view){
        this.view = view;
        dao = new AnggotaDaoImpl();
    }
    public void clearFrom(){
        view.getTxtKodeAnggota().setText("");
        view.getTxtNamaAnggota().setText("");
        view.getTxtAlamat().setText("");
        view.getCbo().removeAllItems();
        view.getCbo().addItem("L");
        view.getCbo().addItem("P");
    }
    public void tampil(){
    DefaultTableModel tabelModel = (DefaultTableModel) view.getTabelAnggota().getModel();
    tabelModel.setRowCount(0);
    List<Anggota> List = dao.getAll();
    for(Anggota a : List){
        Object[] row = {
            a.getKodeAnggota(),
            a.getNamaAnggota(),
            a.getAlamat(),
            a.getJeniskelamin()
        };
        tabelModel.addRow(row);
    }
    }
    public void insert(){
    anggota = new Anggota();
    anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
    anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
    anggota.setAlamat(view.getTxtAlamat().getText());
    anggota.setJeniskelamin(view.getCbo().getSelectedItem().toString());
    dao.insert(anggota);
    JOptionPane.showMessageDialog(view,"Ectri Data OK");
    
}
    public void update(){
    int index = view.getTabelAnggota().getSelectedRow();
    anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
    anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
    anggota.setAlamat(view.getTxtAlamat().getText());
    anggota.setJeniskelamin(view.getCbo().getSelectedItem().toString());
    dao.update(index, anggota);
    JOptionPane.showMessageDialog(view,"Ectri Data OK");
    }
    
    public void delete(){
        int index = view.getTabelAnggota().getSelectedRow();
        dao.delete(index);
            JOptionPane.showMessageDialog(view,"Delete Data OK");
    }
    
    public void getAnggota(){
        int index = view.getTabelAnggota().getSelectedRow();
        anggota = dao.getAngggota(index);
        view.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
        view.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
        view.getTxtAlamat().setText(anggota.getAlamat());
        view.getCbo().setSelectedItem(anggota.getJeniskelamin());
        
        
    }
}
