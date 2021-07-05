/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bryli
 */
public class TabelModelMhs extends AbstractTableModel{
    List<Mahasiswa> lb;
    
    public TabelModelMhs(List<Mahasiswa> lb){
        this.lb = lb;
    }
    
    
    @Override
    public int getRowCount() {
        return this.lb.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "NIM";
            case 1:
                return "Nama";
            case 2:
                return "UTS";
            case 3:
                return "UAS";
            case 4:
                return "Akhir";        
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column){
            case 0:
                return lb.get(row).getNim();
            case 1:
                return lb.get(row).getNama();
            case 2:
                return lb.get(row).getUts();
            case 3:
                return lb.get(row).getUas();
            case 4:
                return lb.get(row).getAkhir();
            default:
                return null;
        }
    }
}
