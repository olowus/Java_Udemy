package com.indivaragroup.jdt9.database;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class JSONTest {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            System.out.print("LOKASI FILE JSON : ");
            String namaFile = s.nextLine();
            BufferedReader br = new BufferedReader(new FileReader(namaFile));
            String data = null;
            StringBuffer sb = new StringBuffer();
            while((data=br.readLine())!=null){
                sb.append(data.trim());
            }
            Gson jsonConverter = new Gson();
            Karyawan[] allKaryawan = jsonConverter.fromJson(sb.toString(), Karyawan[].class);
            for(int x=0;x< allKaryawan.length;x++){
                System.out.println(allKaryawan[x].getNama());
            }
        }catch (Exception ez){
            ez.printStackTrace();
        }
    }
}
