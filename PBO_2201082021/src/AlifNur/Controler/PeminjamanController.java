/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlifNur.Controler;
import AlifNur.model.*;
import java.util.*;
import javax.swing.JOptionPane;
import AlifNur.view.*;
import javax.swing.table.DefaultTableModel;
import AlifNur.dao.*;
/**
 *
 * @author LENOVO
 */
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman peminjaman;
    PeminjamanDao dao;
    
     public PeminjamanController(FormPeminjaman view) {
        this.view = view;
        dao = new PeminjamanDaoImpl() {};
    }
    
    public void clearForm() {
        view.getTxtKodeAnggota().setText("");
        view.getTxtKodeBuku().setText("");
        view.gettxttglPeminjaman().setText("");
        view.gettxttglPengembalian().setText("");
       
    }
    
     public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) view.gettblPinjam().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = dao.getAll();
        for (Peminjaman a : list) {
            Object[] row = {
                a.getKodeAnggota(),
                a.getKodeBuku(),
                a.gettglPeminjaman(),
                a.gettglPengembalian(),
            };
            tabelModel.addRow(row);
        }
    }
     public void insert() {
        peminjaman = new Peminjaman();
        peminjaman.setKodeAnggota(view.getTxtKodeAnggota().getText());
        peminjaman.setKodeBuku(view.getTxtKodeBuku().getText());
        peminjaman.settglPeminjaman(view.gettxttglPeminjaman().getText());
        peminjaman.settglPengembalian(view.gettxttglPengembalian().getText());
        dao.insert(peminjaman);
        JOptionPane.showMessageDialog(view,"Entri Data OK");
    }
      public void update() {
        int index = view.gettblPinjam().getSelectedRow();
        peminjaman = new Peminjaman();
        peminjaman.setKodeAnggota(view.getTxtKodeAnggota().getText());
        peminjaman.setKodeBuku(view.getTxtKodeBuku().getText());
        peminjaman.settglPeminjaman(view.gettxttglPeminjaman().getText());
        peminjaman.settglPengembalian(view.gettxttglPengembalian().getText());
        dao.update(index, peminjaman);
        JOptionPane.showMessageDialog(view,"Update Data OK");
        
    }
      public void delete(){
        int index = view.gettblPinjam().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view,"Delete Data OK");
    }
    
    public void getPeminjaman() {
        int index = view.gettblPinjam().getSelectedRow();
        peminjaman = dao.getPeminjaman(index);
        view.getTxtKodeAnggota().setText(peminjaman.getKodeAnggota());
        view.getTxtKodeBuku().setText(peminjaman.getKodeBuku());
        view.gettxttglPeminjaman().setText(peminjaman.gettglPeminjaman());
       
    }
}

