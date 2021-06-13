/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import Model.Peserta;
import java.util.List;

/**
 *
 * @author bryli
 */
public interface IPeserta {
    public boolean insert (Peserta b);
    public void update (Peserta b);
    public void delete(int no_id);
    public List<Peserta> getAll();
    public List<Peserta> getCariNama(String nama);
    }