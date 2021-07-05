/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOMahasiswa;
import DAO_Interface.IMahasiswa;
import Model.Mahasiswa;
import Model.TabelModelMhs;
import View.Tabel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bryli
 */
public class Controller_Tbl {
    Tabel IF;
    IMahasiswa imMHS;
    List<Mahasiswa> lb;

    
    public Controller_Tbl(Tabel IF){
        this.IF = IF;
       
        imMHS = new DAOMahasiswa();
        lb = imMHS.getAll();
    }
        
    public void isiTable() {
        lb = imMHS.getAll();
        TabelModelMhs tmb = new TabelModelMhs(lb);
        IF.getTabelData().setModel(tmb);
    }
    
    public void delete(){
        if(!IF.getTxtNim().getText().trim().isEmpty()){
            String id = IF.getTxtNim().getText();
            imMHS.delete(id);
            JOptionPane.showMessageDialog(null, "Delete "+id+" telah berhasil");
        }else{
            JOptionPane.showMessageDialog(IF,"Pilih data yang akan di hapus");
        }   
    }
    
    public void isiField(int row){    
//        String s=String.valueOf(lb.get(row).getNim());
        IF.getTxtNim().setText(lb.get(row).getNim());
    }
    
}
