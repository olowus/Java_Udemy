import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class BacaFileString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nama File: ");
        String namaFile = s.nextLine();
        File f = new File(namaFile);
        if(f.exists()){
            if(!f.isDirectory()){
                try{
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String hasil=null; // menandakan End of File
                    while((hasil=br.readLine())!=null){
                        System.out.println(hasil);
                    }
                    br.close();
                }catch(Exception e){
                    System.out.println("ERROR: "+e.getMessage());
                }
            }else{
                System.out.println("File "+namaFile+" adalah directory");
            }
        }else{
            System.out.println("File "+namaFile+" tidak ditemukan");
        }
    }
}
