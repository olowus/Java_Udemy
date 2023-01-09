import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args) {
        while(true) {
            Scanner penangkap = new Scanner(System.in);
            System.out.print("Nama : ");
            String nama = penangkap.nextLine();
            System.out.print("Alamat : ");
            String alamat = penangkap.nextLine();
            System.out.print("Umur : ");
            String umur = penangkap.nextLine();

            System.out.println("========= DATA ANDA =========");
            System.out.println("Nama Anda : " + nama);
            System.out.println("Alamat Anda : " + alamat);
            System.out.println("Umur Anda : " + umur);
            System.out.println("=============================");

            System.out.print("APAKAH INGIN MEMASUKKAN DATA LAGI? Y/N : ");
            String kondisi = penangkap.nextLine();

            if(kondisi.equals("N") || kondisi.equals("n")){
                break;
            }
        }
    }
}
