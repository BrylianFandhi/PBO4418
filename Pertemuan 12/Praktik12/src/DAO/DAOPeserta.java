/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAOInterface.IPeserta;
import Koneksi.Koneksi;
import Model.Peserta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bryli
 */
public class DAOPeserta implements IPeserta{
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (no_id, nama, jk, ttl, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_pendaftaran set nama=?, jk=?, ttl=?, usia=?, alasan=? where no_id=?;";
    final String delete = "DELETE FROM tbl_pendaftaran where no_id=?;";
    final String select = "SELECT * FROM tbl_pendaftaran order by no_id asc;";
    final String carinama = "SELECT * FROM tbl_pendaftaran where nama like ?";
    
    public DAOPeserta(){
        connection = Koneksi.connection();
    }
    
    @Override
    public boolean insert(Peserta b) {
        boolean result = true;
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert);
            statement.setInt(1, b.getNo_id());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getTtl());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.executeUpdate();
//            ResultSet rs = statement.getGeneratedKeys();
//            while (rs.next()){
//                b.setId(rs.getInt(1));
//            }
        } catch (SQLException ex){
            System.out.println("Berhasil Input");
            result = false;
        } finally{
            try {
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Input");
                result = false;
            }
        }
        return result;
    }

    @Override
    public void update(Peserta b) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);            
            statement.setString(1, b.getNama());
            statement.setString(2, b.getJk());
            statement.setString(3, b.getTtl());
            statement.setInt(4, b.getUsia());
            statement.setString(5, b.getAlasan());
            statement.setInt(6, b.getNo_id());
            statement.executeUpdate();
        } catch (SQLException ex){
            System.out.println("Berhasil Update");
        } finally{
            try {
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Update");
            }
        }
    }

    @Override
    public void delete(int no_id) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, no_id);
            statement.executeUpdate();
 
        } catch (SQLException ex){
            System.out.println("Berhasil Delete");
        } finally{
            try {
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Delete");
            }
        }
    }

    @Override
    public List<Peserta> getAll() {
        List<Peserta> lb = null;
        try{
            lb = new ArrayList<Peserta>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                Peserta b = new Peserta();
                b.setNo_id(rs.getInt("no_id"));               
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setTtl(rs.getString("ttl"));
                b.setUsia(rs.getInt("usia"));               
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
                
            }
        } catch (SQLException ex){
            Logger.getLogger(DAOPeserta.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }

    @Override
    public List<Peserta> getCariNama(String nama) {
        List<Peserta> lb = null;
        try{
            lb = new ArrayList<Peserta>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama +"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Peserta b = new Peserta();
                b.setNo_id(rs.getInt("no_id"));               
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setTtl(rs.getString("ttl"));
                b.setUsia(rs.getInt("usia"));               
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
                
            }
        } catch (SQLException ex){
            Logger.getLogger(DAOPeserta.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }
    
}
