import java.io.*;
import java.util.Scanner;

public class KopiString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("File Sumber: ");
        String namaFileSumber = s.nextLine();
        System.out.print("File Tujuan: ");
        String namaFileTujuan = s.nextLine();
        s.close();
        try{
            File fileSumber = new File(namaFileSumber);
            if(fileSumber.exists()){
                BufferedReader br = new BufferedReader(new FileReader(fileSumber));
                PrintWriter pw = new PrintWriter(new FileWriter(namaFileTujuan));
                String data = null;
                while((data=br.readLine())!=null){
                    pw.println(data);
                }
                pw.flush();
                pw.close();
            }
        } catch(Exception e){
            System.out.println("ERROR : "+e.getMessage());
        }
    }
}
