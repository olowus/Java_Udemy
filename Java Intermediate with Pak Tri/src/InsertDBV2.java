import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDBV2 {
    public static void main(String[] args) {
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("NIP      :");
            String nip = scan.nextLine();
            System.out.print("Nama     :");
            String nama = scan.nextLine();
            System.out.print("Email    :");
            String email = scan.nextLine();
            System.out.print("Posisi   :");
            String posisi = scan.nextLine();
            System.out.print("Gaji     :");
            String gaji = scan.nextLine();
            try{
                String url = "jdbc:mysql://localhost:3306/hr";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection conn =DriverManager.getConnection(url, username, password);
                String sql="INSERT INTO karyawan VALUES(?,?,?,?,?)";
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.setString(1,nip);
                stm.setString(2,nama);
                stm.setString(3,email);
                stm.setString(4,posisi);
                stm.setString(5,gaji);
                int hasil = stm.executeUpdate();
                System.out.println(hasil+" - record telah terinsert");
                conn.close();
            }catch(Exception ez){
                System.out.println("ERROR : "+ez.getMessage());
            }
            System.out.println("Apakah anda ingin memasukkan data lagi? Y/N");
            String logika = scan.nextLine();
            if(logika.toLowerCase().equals("n")){
                System.exit(0);
            }
        }
    }
}
