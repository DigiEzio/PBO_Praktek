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
public class BukuController {
    FromBuku view;
    Buku buku;
    BukuDao dao;

    public BukuController(FromBuku view) {
        this.view = view;
        dao = new BukuDaoImpl();
    }
    
    public void clearForm(){
        view.getTxtKodeBuku().setText("");
        view.getTxtJudul().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =(DefaultTableModel) view.getTabelBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = dao.getAll();
        for(Buku a : list){
            Object[] row = {
                a.getKodebuku(),
                a.getJudul(),
                a.getPengarang(),
                a.getPenerbit()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void insert(){
        buku = new Buku();
        buku.setKodebuku(view.getTxtKodeBuku().getText());
        buku.setJudul(view.getTxtJudul().getText());
        buku.setPengarang(view.getTxtPengarang().getText());
        buku.setPenerbit(view.getTxtPenerbit().getText());
        dao.insert(buku);
        JOptionPane.showMessageDialog(view,"Entry Data Ok"); 
    }
    
    public void update(){
        int index = view.getTabelBuku().getSelectedRow();
        buku.setKodebuku(view.getTxtKodeBuku().getText());
        buku.setJudul(view.getTxtJudul().getText());
        buku.setPengarang(view.getTxtPengarang().getText());
        buku.setPenerbit(view.getTxtPenerbit().getText());
        dao.update(index, buku);
        JOptionPane.showMessageDialog(view,"Update Data Ok");
    }
    
    public void delete(){
        int index = view.getTabelBuku().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view,"Delete Data Ok");
    }
    
    public void getBuku(){
        int index = view.getTabelBuku().getSelectedRow();
        buku = dao.getBuku(index);
        view.getTxtKodeBuku().setText(buku.getKodebuku());
        view.getTxtJudul().setText(buku.getJudul());
        view.getTxtPengarang().setText(buku.getPengarang());
        view.getTxtPenerbit().setText(buku.getPenerbit());
        
    }

    public void clearFrom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

