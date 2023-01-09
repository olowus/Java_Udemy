import com.indivaragroup.jdt9.database.Database;
import com.indivaragroup.jdt9.database.Karyawan;
import com.indivaragroup.jdt9.database.KaryawanDAO;

import java.util.ArrayList;
import java.util.Scanner;

public class DBApp {
    public static void main(String[] args) throws Exception {
        while(true){
            Database db = new Database();
            KaryawanDAO kd = new KaryawanDAO(db);
            Scanner scan = new Scanner(System.in);
            System.out.println("SELAMAT DATANG DI PORTAL HRD");
            System.out.println("============================");
            System.out.println("MENU:");
            System.out.println("1. TAMPILKAN DATA SEMUA KARYAWAN");
            System.out.println("2. PENCARIAN KARYAWAN");
            System.out.println("3. ENTRY DATA KARYAWAN");
            System.out.println("4. HAPUS DATA KARYAWAN");
            System.out.println("5. UPDATE DATA KARYAWAN");
            System.out.println("============================");
            System.out.print("PILIHAN ANDA : ");
            String pilihan = scan.nextLine();
            if(pilihan.equals("1")){
                try{
                    for(Karyawan kar : kd.getKaryawan()){
                        System.out.println("NIP    : "+kar.getNip());
                        System.out.println("NAMA   : "+kar.getNama());
                        System.out.println("EMAIL  : "+kar.getEmail());
                        System.out.println("POSISI : "+kar.getPosisi());
                        System.out.println("GAJI   : "+kar.getGaji());
                        System.out.println("===============================");
                    }
                }catch(Exception ez){
                    System.out.println("ERROR : "+ez.getMessage());
                }
            } else if(pilihan.equals("2")){
                try{
                    System.out.print("MASUKKAN NIP : ");
                    String cariNip = scan.nextLine();
                    Karyawan k1 = kd.findKaryawan(cariNip);
                    System.out.println("===============================");
                    System.out.println("NIP    : "+k1.getNip());
                    System.out.println("NAMA   : "+k1.getNama());
                    System.out.println("EMAIL  : "+k1.getEmail());
                    System.out.println("POSISI : "+k1.getPosisi());
                    System.out.println("GAJI   : "+k1.getGaji());
                    System.out.println("===============================");
                }catch (Exception ez){
                    System.out.println("ERROR : "+ez.getMessage());
                }
            } else if(pilihan.equals("3")){
                try{
                    System.out.println("=====ENTRY DATA KARYAWAN=====");
                    System.out.print("MASUKKAN NIP : ");
                    String insertNip = scan.nextLine();
                    System.out.print("MASUKKAN NAMA : ");
                    String insertNama = scan.nextLine();
                    System.out.print("MASUKKAN EMAIL : ");
                    String insertEmail = scan.nextLine();
                    System.out.print("MASUKKAN POSISI : ");
                    String insertPosisi = scan.nextLine();
                    System.out.print("MASUKKAN GAJI : ");
                    String insertGaji = scan.nextLine();
                    Karyawan k2 = new Karyawan();
                    k2.setNip(insertNip);
                    k2.setNama(insertNama);
                    k2.setEmail(insertEmail);
                    k2.setPosisi(insertPosisi);
                    k2.setGaji(Double.parseDouble(insertGaji));
                    if(kd.insertKaryawan(k2)){
                        System.out.println("Insert Data Sukses");
                    }
                }catch (Exception ez){
                    System.out.println("ERROR : "+ez.getMessage());
                }
            } else if(pilihan.equals("4")){
                try{
                    System.out.println("=====DELETE DATA KARYAWAN=====");
                    System.out.print("MASUKKAN NIP : ");
                    String deleteNip = scan.nextLine();
                    if(kd.deleteKaryawan(deleteNip)){
                        System.out.println("Karyawan dengan nip "+deleteNip+" berhasil dihapus.");
                    }
                }catch (Exception ez){
                    System.out.println("ERROR : "+ez.getMessage());
                }
            }else if(pilihan.equals("5")){
                try{
                    System.out.println("=====UPDATE DATA KARYAWAN=====");
                    System.out.print("MASUKKAN NIP : ");
                    String updateNip = scan.nextLine();
                    Karyawan k3 = kd.findKaryawan(updateNip);
                    System.out.println("========DATA KARYAWAN========");
                    System.out.println("NIP    : "+k3.getNip());
                    System.out.println("NAMA   : "+k3.getNama());
                    System.out.println("EMAIL  : "+k3.getEmail());
                    System.out.println("POSISI : "+k3.getPosisi());
                    System.out.println("GAJI   : "+k3.getGaji());
                    System.out.println("============================");
                    System.out.print("NAMA BARU   : ");
                    String newNama = scan.next();
                    System.out.print("EMAIL BARU  : ");
                    String newEmail = scan.next();
                    System.out.print("POSISI BARU : ");
                    String newPosisi = scan.next();
                    System.out.print("GAJI BARU   : ");
                    String newGaji = scan.next();
                    k3.setNama(newNama);
                    k3.setEmail(newEmail);
                    k3.setPosisi(newPosisi);
                    k3.setGaji(Double.parseDouble(newGaji));
                    if(kd.updateKaryawan(k3)){
                        System.out.println("Update Data Sukses");
                    }
                }catch (Exception ez){
                    System.out.println("ERROR : "+ez.getMessage());
                }
            }
            System.out.println("============================");
            System.out.print("APAKAH ANDA INGIN MENGGUNAKAN APPS LAGI? (Y/N) : ");
            String pertanyaan = scan.nextLine();
            if(pertanyaan.toLowerCase().equals("n")){
                System.exit(0);
            }
        }
    }
}
