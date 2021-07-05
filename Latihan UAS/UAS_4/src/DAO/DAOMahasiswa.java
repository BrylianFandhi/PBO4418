/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO_Interface.IMahasiswa;
import Koneksi.Koneksi;
import Model.Mahasiswa;
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
public class DAOMahasiswa implements IMahasiswa {
    Connection connection;
    final String insert = "INSERT INTO tbl_nilai (nim, nama, uts, uas, akhir) VALUES (?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_nilai set nama=?, uts=?, uas=?, akhir=? where nim=?;";
    final String delete = "DELETE FROM tbl_nilai where nim=?;";
    final String select = "SELECT * FROM tbl_nilai order by nim asc;";
    final String carinama = "SELECT * FROM tbl_nilai where nama like ?";
    
    public DAOMahasiswa(){
        connection = Koneksi.connection();
    }
    
    @Override
    public boolean insert(Mahasiswa b) {
        boolean result = true;
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getNim());
            statement.setString(2, b.getNama());
            statement.setFloat(3, b.getUts());
            statement.setFloat(4, b.getUas());
            statement.setFloat(5, b.getAkhir());
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
    public void update(Mahasiswa b) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);            
            statement.setString(1, b.getNama());
            statement.setFloat(2, b.getUts());
            statement.setFloat(3, b.getUas());
            statement.setFloat(4, b.getAkhir());
            statement.setString(5, b.getNim());
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
    public void delete(String nim) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setString(1, nim);
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
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> lb = null;
        try{
            lb = new ArrayList<Mahasiswa>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                Mahasiswa b = new Mahasiswa();
                b.setNim(rs.getString("nim"));               
                b.setNama(rs.getString("nama"));
                b.setUts(rs.getFloat("uts"));
                b.setUas(rs.getFloat("uas"));
                b.setAkhir(rs.getFloat("akhir"));              
                lb.add(b);
                
            }
        } catch (SQLException ex){
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }
    
    @Override
    public List<Mahasiswa> getCariNama(String nama) {
        List<Mahasiswa> lb = null;
        try{
            lb = new ArrayList<Mahasiswa>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama +"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Mahasiswa b = new Mahasiswa();
                b.setNim(rs.getString("nim"));               
                b.setNama(rs.getString("nama"));
                b.setUts(rs.getFloat("uts"));
                b.setUas(rs.getFloat("uas"));
                b.setAkhir(rs.getFloat("akhir"));
                lb.add(b);
                
            }
        } catch (SQLException ex){
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }
}
