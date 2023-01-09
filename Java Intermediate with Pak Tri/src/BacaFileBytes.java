import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class BacaFileBytes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nama File: ");
        String namaFile = s.nextLine();
        File f = new File(namaFile);
        if(f.exists()){
            if(!f.isDirectory()){
                try{
                    FileInputStream fis = new FileInputStream(f);
                    int hasil=-1; // menandakan End of File
                    while((hasil=fis.read())!=-1){
                        System.out.print((char)hasil);
                    }
                    fis.close();
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
