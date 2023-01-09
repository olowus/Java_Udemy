import java.io.File;
import java.util.Scanner;

public class SelidikiFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nama file : ");
        String namaFile = s.nextLine();
        File f = new File(namaFile);

        if(f.exists()){
            System.out.println("Directory ? : "+f.isDirectory());
            System.out.println("File ? : "+f.isFile());
            System.out.println("Hidden ? : "+f.isHidden());
            System.out.println("Readable ? : "+f.canRead());
            System.out.println("Writeable ? : "+f.canWrite());
            System.out.println("Path Lengkap ? : "+f.getAbsolutePath());
        } else {
            System.out.println("Maaf file "+namaFile+" tidak ditemukan!");
        }
    }
}
