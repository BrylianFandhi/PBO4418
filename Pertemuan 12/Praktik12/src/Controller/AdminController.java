/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOPeserta;
import DAOInterface.IPeserta;
import Model.Peserta;
import Model.TabelModelPeserta;
import View.Admin;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bryli
 */
public class AdminController {
    Admin Aframe;
    IPeserta implPeserta;
    List<Peserta> lb;
    
    public AdminController(Admin Aframe){
        this.Aframe = Aframe;
       
        implPeserta = new DAOPeserta();
        lb = implPeserta.getAll();
    }
    
    public void reset(){
        if(Aframe.getTxtNo_id().isEnabled())
            Aframe.getTxtNo_id().setEditable(true);
        Aframe.getTxtNo_id().setText("");
        Aframe.getTxtNama().setText("");
        Aframe.getTxtJk().setSelectedItem("");
        Aframe.getTxtTtl().setText("");
        Aframe.getTxtUsia().setText("");
        Aframe.getTxtAlasan().setText("");
    }
    
    public void isiTable(){
        lb = implPeserta.getAll();
        TabelModelPeserta tmb = new TabelModelPeserta(lb);
        Aframe.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row){
        Aframe.getTxtNo_id().setEditable(false);
        String s=String.valueOf(lb.get(row).getNo_id());
        Aframe.getTxtNo_id().setText(s);
        Aframe.getTxtNama().setText(lb.get(row).getNama());
        Aframe.getTxtJk().setSelectedItem(lb.get(row).getJk());
        Aframe.getTxtTtl().setText(lb.get(row).getTtl());     
        String i=String.valueOf(lb.get(row).getNo_id());
        Aframe.getTxtUsia().setText(i);
        Aframe.getTxtAlasan().setText(lb.get(row).getAlasan());
    }
    
    public void update(){
            Peserta b = new Peserta();                       
            b.setNama(Aframe.getTxtNama().getText());
            b.setJk(Aframe.getTxtJk().getSelectedItem().toString());
            b.setTtl(Aframe.getTxtTtl().getText());
            b.setUsia(Integer.parseInt(Aframe.getTxtUsia().getText()));
            b.setAlasan(Aframe.getTxtAlasan().getText());
            b.setNo_id(Integer.parseInt(Aframe.getTxtNo_id().getText()));       
            implPeserta.update(b);
            JOptionPane.showMessageDialog(null, "Update data sukses");                    
    }
    
    public void delete(){
        if(!Aframe.getTxtNo_id().getText().trim().isEmpty()){
            int id = Integer.parseInt(Aframe.getTxtNo_id().getText());
            implPeserta.delete(id);
            JOptionPane.showMessageDialog(null, "Delete data sukses");
        }else{
            JOptionPane.showMessageDialog(Aframe,"Pilih data yang akan di hapus");
        }
    }
    
    public void isiTableCariNama(){
        lb = implPeserta.getCariNama(Aframe.getTxtCariNama().getText());
        TabelModelPeserta tmb = new TabelModelPeserta(lb);
        Aframe.getTabelData().setModel(tmb);
    }
}
