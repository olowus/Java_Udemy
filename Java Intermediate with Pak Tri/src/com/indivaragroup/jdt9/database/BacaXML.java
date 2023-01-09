package com.indivaragroup.jdt9.database;
import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.util.*;

public class BacaXML {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("NAMA FILE XML : ");
        String namaFile = scan.nextLine();
        try{
            File file = new File(namaFile);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
//            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            System.out.println("Root : "+doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Karyawan");
            for(int i=0; i< nodeList.getLength();i++){
                Node node = nodeList.item(i);
                System.out.println("====="+node.getNodeName()+"=====");
                Element element = (Element) node;
                System.out.println("NIP     :"+element.getElementsByTagName("nip").item(0).getTextContent());
                System.out.println("NAMA    :"+element.getElementsByTagName("nama").item(0).getTextContent());
                System.out.println("EMAIL   :"+element.getElementsByTagName("email").item(0).getTextContent());
                System.out.println("POSISI  :"+element.getElementsByTagName("posisi").item(0).getTextContent());
                System.out.println("GAJI    :"+element.getElementsByTagName("gaji").item(0).getTextContent());
            }
        }catch (Exception ez){
            ez.printStackTrace();
        }
    }
}
