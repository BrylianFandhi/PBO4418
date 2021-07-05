/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_Interface;

import Model.Mahasiswa;
import java.util.List;

/**
 *
 * @author bryli
 */
public interface IMahasiswa {
    public boolean insert (Mahasiswa b);
    public void update (Mahasiswa b);
    public void delete(String nim);
    public List<Mahasiswa> getAll();
    public List<Mahasiswa> getCariNama(String nama);
}
