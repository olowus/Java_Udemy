import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class KopiFileBytes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("File Sumber: ");
        String namaFileSumber = s.nextLine();
        System.out.print("File Tujuan: ");
        String namaFileTujuan = s.nextLine();
        s.close();
        long waktuStart = System.currentTimeMillis();

        try{
            File fileSumber = new File(namaFileSumber);
            if(fileSumber.exists()){
                FileInputStream fis = new FileInputStream(namaFileSumber);
                FileOutputStream fos = new FileOutputStream(namaFileTujuan);
                int data =-1;
                while((data=fis.read())!=-1){
                    fos.write(data);
                }
                fos.flush();
                fos.close();
                fis.close();
                long durasi = System.currentTimeMillis()-waktuStart;
                System.out.println("Copy Berhasil, durasi "+durasi+"ms");
            }else{
                System.out.println("File tidak ditemukan!");
            }
        }catch(Exception e){
            System.out.println("ERROR ! "+e.getMessage());
        }
    }
}
