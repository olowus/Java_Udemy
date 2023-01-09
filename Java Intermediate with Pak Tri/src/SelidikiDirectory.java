import java.io.File;
import java.util.Scanner;

public class SelidikiDirectory {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nama directory : ");
        String namaDirectory = s.nextLine();
        File f = new File(namaDirectory);

        if(f.exists()){
            if(f.isDirectory()){
                System.out.println("=============ISI DIRECTORY "+namaDirectory+"=============");
                String[] daftarFile = f.list();
                for (String value : daftarFile) {
                    File ff = new File(value);
                    System.out.println("Nama File : "+value);
                    System.out.println("Path Lengkap : "+ff.getAbsolutePath());
                    System.out.println("Directory ? : "+ff.isDirectory());
                    System.out.println("File ? : "+ff.isFile());
                    System.out.println("Hidden ? : "+ff.isHidden());
                    System.out.println("Readable ? : "+ff.canRead());
                    System.out.println("Writeable ? : "+ff.canWrite());
                    System.out.println("------------------------------");

                }
            }else{
                System.out.println("Data yang diinput bukan directory");
            }
        } else {
            System.out.println("Maaf directory "+namaDirectory+" tidak ditemukan!");
        }
    }
}
