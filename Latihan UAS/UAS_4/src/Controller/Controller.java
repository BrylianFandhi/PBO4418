/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOMahasiswa;
import DAO_Interface.IMahasiswa;
import Model.Mahasiswa;
import View.FormInpt;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bryli
 */
public class Controller {
    FormInpt IF;
    IMahasiswa imMHS;
    List<Mahasiswa> lb;
    
    public Controller(FormInpt IF){
        this.IF = IF;
       
        imMHS = new DAOMahasiswa();
        lb = imMHS.getAll();
    }
    
    public void insert(){     
        Mahasiswa b = new Mahasiswa();
        b.setNim(IF.getTxtNim().getText());
        b.setNama(IF.getTxtNama().getText());
        b.setUts(Float.parseFloat(IF.getTxtUts().getText()));
        b.setUas(Float.parseFloat(IF.getTxtUas().getText()));
        float x, y, z;
        x = Float.parseFloat(IF.getTxtUts().getText());
        y = Float.parseFloat(IF.getTxtUas().getText());
        z = (x+y)/2;
        b.setAkhir(z);
        boolean res = imMHS.insert(b);
        if (res)
            JOptionPane.showMessageDialog(null, "Simpan data sukses");   
        else
            JOptionPane.showMessageDialog(null, "GAGAL INSERT DATA\nKarena NIM yang diinputkan sudah dipakai");                    
    }
    
    public void reset(){
        if(IF.getTxtNim().isEnabled())
            IF.getTxtNim().setEditable(true);
        IF.getTxtNim().setText("");
        IF.getTxtNama().setText("");
        IF.getTxtUts().setText("");
        IF.getTxtUas().setText("");
    }
}
