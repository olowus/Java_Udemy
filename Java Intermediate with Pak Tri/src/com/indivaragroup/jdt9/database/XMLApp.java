package com.indivaragroup.jdt9.database;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class XMLApp {
    public static void main(String[] args) throws Exception {
        Database db = new Database();
        KaryawanDAO kd = new KaryawanDAO(db);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbf.newDocumentBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PORTAL HRD");
        System.out.println("============================");
        System.out.println("MENU:");
        System.out.println("1. ENTRY DATA KARYAWAN");
        System.out.println("2. UPDATE DATA KARYAWAN");
        System.out.println("3. INSERT BANYAK KARYAWAN");
        System.out.println("============================");
        System.out.print("PILIHAN ANDA : ");
        String pilihan = scan.nextLine();
        if(pilihan.equals("1")){
            try{
                System.out.print("NAMA FILE XML : ");
                String entryFile = scan.nextLine();
                Document docEntry = docBuilder.parse(entryFile);
                NodeList nodeList = docEntry.getElementsByTagName("Karyawan");
                Node node = nodeList.item(0);
                Element element = (Element) node;
                Karyawan k1 = new Karyawan();
                k1.setNip(element.getElementsByTagName("nip").item(0).getTextContent());
                k1.setNama(element.getElementsByTagName("nama").item(0).getTextContent());
                k1.setEmail(element.getElementsByTagName("email").item(0).getTextContent());
                k1.setPosisi(element.getElementsByTagName("posisi").item(0).getTextContent());
                k1.setGaji(Double.parseDouble(element.getElementsByTagName("gaji").item(0).getTextContent()));
                if(kd.insertKaryawan(k1)){
                    System.out.println("Insert Data Sukses");
                }
            }catch(Exception ez){
                System.out.println("ERROR : "+ez.getMessage());
            }
        }else if(pilihan.equals("2")){
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
                System.out.print("LOKASI FILE XML : ");
                String updateXML = scan.nextLine();
                Document docEntry = docBuilder.parse(updateXML);
                NodeList nodeList = docEntry.getElementsByTagName("Karyawan");
                Node node = nodeList.item(0);
                Element element = (Element) node;
                Karyawan karyawan = new Karyawan();
                karyawan.setNip(element.getElementsByTagName("nip").item(0).getTextContent());
                karyawan.setNama(element.getElementsByTagName("nama").item(0).getTextContent());
                karyawan.setEmail(element.getElementsByTagName("email").item(0).getTextContent());
                karyawan.setPosisi(element.getElementsByTagName("posisi").item(0).getTextContent());
                karyawan.setGaji(Double.parseDouble(element.getElementsByTagName("gaji").item(0).getTextContent()));
                if(kd.updateKaryawan(karyawan)){
                    System.out.println("Update Data Sukses");
                }
            }catch(Exception ez){
                System.out.println("ERROR : "+ez.getMessage());
            }
        }else if(pilihan.equals("3")){
            try{
                System.out.print("NAMA FILE XML : ");
                String entryFile = scan.nextLine();
                Document docEntry = docBuilder.parse(entryFile);
                NodeList nodeList = docEntry.getElementsByTagName("Karyawan");
                for(int p=0;p< nodeList.getLength();p++){
                    Node node = nodeList.item(p);
                    Element element = (Element) node;
                    Karyawan k3 = new Karyawan();
                    k3.setNip(element.getElementsByTagName("nip").item(0).getTextContent());
                    k3.setNama(element.getElementsByTagName("nama").item(0).getTextContent());
                    k3.setEmail(element.getElementsByTagName("email").item(0).getTextContent());
                    k3.setPosisi(element.getElementsByTagName("posisi").item(0).getTextContent());
                    k3.setGaji(Double.parseDouble(element.getElementsByTagName("gaji").item(0).getTextContent()));
                    if(kd.insertKaryawan(k3)){
                        System.out.println("Insert Banyak Data Sukses");
                    }
                }
            }catch(Exception ez){
                System.out.println("ERROR : "+ez.getMessage());
            }
        }
    }
}