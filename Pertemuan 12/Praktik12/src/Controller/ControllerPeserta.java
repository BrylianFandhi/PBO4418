/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOPeserta;
import DAOInterface.IPeserta;
import Model.Peserta;
import View.User;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bryli
 */
public class ControllerPeserta {
    User Iframe;
    IPeserta implPeserta;
    List<Peserta> lb;
    
    public ControllerPeserta(User Iframe){
        this.Iframe = Iframe;
       
        implPeserta = new DAOPeserta();
        lb = implPeserta.getAll();
    }

    
    public void insert(){     
        Peserta b = new Peserta();
        b.setNo_id(Integer.parseInt(Iframe.getTxtNo_id().getText()));
        b.setNama(Iframe.getTxtNama().getText());
        b.setJk(Iframe.getTxtJk().getSelectedItem().toString());
        b.setTtl(Iframe.getTxtTtl().getText());
        b.setUsia(Integer.parseInt(Iframe.getTxtUsia().getText()));
        b.setAlasan(Iframe.getTxtAlasan().getText());
        boolean res = implPeserta.insert(b);
        if (res)
            JOptionPane.showMessageDialog(null, "Simpan data sukses");   
        else
            JOptionPane.showMessageDialog(null, "GAGAL INSERT DATA\nKarena ID yang diinputkan sudah dipakai");                    
    }
    public void reset(){
        if(Iframe.getTxtNo_id().isEnabled())
            Iframe.getTxtNo_id().setEditable(true);
        Iframe.getTxtNo_id().setText("");
        Iframe.getTxtNama().setText("");
        Iframe.getTxtJk().setSelectedItem("");
        Iframe.getTxtTtl().setText("");
        Iframe.getTxtUsia().setText("");
        Iframe.getTxtAlasan().setText("");
    }
        
    
    public void isiTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
