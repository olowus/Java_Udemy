package com.indivaragroup.jdt9.database;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class JSONApp {
    public static void main(String[] args) throws Exception {
        Database db = new Database();
        KaryawanDAO kd = new KaryawanDAO(db);
        Gson jsonConverter = new Gson();
        Scanner scan = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PORTAL HRD");
        System.out.println("============================");
        System.out.println("MENU:");
        System.out.println("1. TAMPILKAN DATA SEMUA KARYAWAN");
        System.out.println("2. PENCARIAN KARYAWAN");
        System.out.println("3. ENTRY DATA KARYAWAN");
        System.out.println("4. UPDATE DATA KARYAWAN");
        System.out.println("5. INSERT BANYAK DATA KARYAWAN");
        System.out.println("============================");
        System.out.print("PILIHAN ANDA : ");
        String pilihan = scan.nextLine();
        if(pilihan.equals("1")){
            try{
                ArrayList<Karyawan> semuaKaryawan = kd.getKaryawan();
                String karyawanJSON = jsonConverter.toJson(semuaKaryawan);
                System.out.println(karyawanJSON);
            }catch(Exception ez){
                System.out.println("ERROR : "+ez.getMessage());
            }
        }else if(pilihan.equals("2")){
            try{
                System.out.print("MASUKKAN NIP : ");
                String cariNip = scan.nextLine();
                Karyawan k = kd.findKaryawan(cariNip);
                String satuKaryawanJSON = jsonConverter.toJson(k);
                System.out.println(satuKaryawanJSON);
            }catch (Exception ez){
                System.out.println("ERROR : "+ez.getMessage());
            }
        }else if(pilihan.equals("3")){
            try{
                System.out.print("LOKASI FILE JSON : ");
                String file = scan.nextLine();
                BufferedReader br = new BufferedReader(new FileReader(file));
                String data = null;
                StringBuilder sb = new StringBuilder();
                while((data=br.readLine())!=null){
                    sb.append(data.trim());
                }
                Karyawan k1 = jsonConverter.fromJson(sb.toString(), Karyawan.class);
                if(kd.insertKaryawan(k1)){
                    System.out.println("Insert Data Sukses");
                }else{
                    System.out.println("Insert Data Gagal");
                }
            }catch (Exception ez){
                System.out.println("ERROR : "+ez.getMessage());
            }
        }else if(pilihan.equals("4")){
            try{
                System.out.print("MASUKKAN NIP : ");
                String updateNip = scan.nextLine();
                Karyawan k2 = kd.findKaryawan(updateNip);
                System.out.println("===============================");
                System.out.println("NIP    : "+k2.getNip());
                System.out.println("NAMA   : "+k2.getNama());
                System.out.println("EMAIL  : "+k2.getEmail());
                System.out.println("POSISI : "+k2.getPosisi());
                System.out.println("GAJI   : "+k2.getGaji());
                System.out.println("===============================");
                System.out.print("LOKASI FILE JSON : ");
                String file = scan.nextLine();
                BufferedReader br = new BufferedReader(new FileReader(file));
                String data = null;
                StringBuilder sb = new StringBuilder();
                while((data=br.readLine())!=null){
                    sb.append(data.trim());
                }
                k2 = jsonConverter.fromJson(sb.toString(), Karyawan.class);
                if(kd.updateKaryawan(k2)){
                    System.out.println("Update Data Sukses");
                }else{
                    System.out.println("Update Data Gagal");
                }
            }catch(Exception ez){
                System.out.println("ERROR : "+ez.getMessage());
            }
        }else if(pilihan.equals("5")){
            System.out.print("LOKASI FILE JSON : ");
            String file = scan.nextLine();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String data = null;
            StringBuilder sb = new StringBuilder();
            while((data=br.readLine())!=null){
                sb.append(data.trim());
            }
            Karyawan[] allKaryawan = jsonConverter.fromJson(sb.toString(), Karyawan[].class);
            for(int z=0;z<allKaryawan.length;z++){
                if(kd.insertKaryawan(allKaryawan[z])){
                    System.out.println("Insert Data Sukses");
                }else{
                    System.out.println("Insert Data Gagal");
                }
            }
        }
    }
}
