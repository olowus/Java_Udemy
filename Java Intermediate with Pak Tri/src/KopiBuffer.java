import java.io.*;
import java.util.Scanner;

public class KopiBuffer {
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
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(namaFileSumber));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(namaFileTujuan),1024);
                int data =-1;
                while((data=bis.read())!=-1){
                    bos.write(data);
                }
                bos.flush();
                bos.close();
                bis.close();
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
