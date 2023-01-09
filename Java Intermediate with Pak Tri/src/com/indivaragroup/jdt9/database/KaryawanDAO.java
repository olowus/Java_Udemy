package com.indivaragroup.jdt9.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class KaryawanDAO {
    private Database db;
    private Connection conn;
    private String namaTable="karyawan";

    public KaryawanDAO(Database db) throws Exception{
        this.db=db;
        this.conn=db.connect();
    }

    public ArrayList<Karyawan> getKaryawan() throws Exception{
        String perintahSQL = "SELECT * FROM "+namaTable;
        Statement stm = conn.createStatement();
        ResultSet hasil = stm.executeQuery(perintahSQL);
        ArrayList<Karyawan> semuaKaryawan = new ArrayList<>();
        while(hasil.next()){
            Karyawan k = new Karyawan();
            k.setNip(hasil.getString("nip"));
            k.setNama(hasil.getString("nama"));
            k.setEmail(hasil.getString("email"));
            k.setPosisi(hasil.getString("posisi"));
            k.setGaji(hasil.getDouble("gaji"));
            semuaKaryawan.add(k);
        }
        stm.close();
        return semuaKaryawan;
    }

    public Karyawan findKaryawan(String nip)throws Exception {
        String perintahSQL = "SELECT * FROM "+namaTable+" WHERE nip=?";
        PreparedStatement stm = conn.prepareStatement(perintahSQL);
        stm.setString(1,nip);
        ResultSet hasil = stm.executeQuery();
        Karyawan k = new Karyawan();
        if(hasil.next()){
            k.setNip(hasil.getString("nip"));
            k.setNama(hasil.getString("nama"));
            k.setEmail(hasil.getString("email"));
            k.setPosisi(hasil.getString("posisi"));
            k.setGaji(hasil.getDouble("gaji"));
        }else {
            throw new Exception("Karyawan dengan nip "+nip+" tidak ditemukan");
        }
        stm.close();
        return k;
    }

    public boolean insertKaryawan(Karyawan k) throws Exception{
        String perintahSQL = "INSERT INTO "+namaTable+" (nip,nama,email,posisi,gaji) VALUES (?,?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(perintahSQL);
        stm.setString(1, k.getNip());
        stm.setString(2, k.getNama());
        stm.setString(3, k.getEmail());
        stm.setString(4, k.getPosisi());
        stm.setDouble(5, k.getGaji());
        int hasil = stm.executeUpdate();
        stm.close();
        if(hasil > 0){
            return true;
        }else{
            throw new Exception("Insert Data Gagal");
        }
    }

    public boolean updateKaryawan(Karyawan k) throws Exception{
        String perintahSQL = "UPDATE "+namaTable+" SET nama=?,email=?,posisi=?,gaji=? WHERE nip=?";
        PreparedStatement stm = conn.prepareStatement(perintahSQL);
        stm.setString(1, k.getNama());
        stm.setString(2, k.getEmail());
        stm.setString(3, k.getPosisi());
        stm.setDouble(4, k.getGaji());
        stm.setString(5, k.getNip());
        int hasil = stm.executeUpdate();
        stm.close();
        if(hasil > 0){
            return true;
        }else{
            throw new Exception("Update Data Gagal");
        }
    }

    public boolean deleteKaryawan(String nip) throws Exception{
        String perintahSQL = "DELETE from "+namaTable+" WHERE nip=?";
        PreparedStatement stm = conn.prepareStatement(perintahSQL);
        stm.setString(1, nip);
        int hasil = stm.executeUpdate();
        stm.close();
        if(hasil > 0){
            return true;
        }else{
            throw new Exception("Delete Data Gagal");
        }
    }


}
