import java.sql.*;

public class AksesDB {
    public static void main(String[] args) {
        //1. buat koneksi ke db server
        try{
            String url = "jdbc:mysql://localhost:3306/hr";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn =DriverManager.getConnection(url, username, password);

            Statement stm = conn.createStatement();

            String perintahSQL = "SELECT employee_id,first_name,salary from employees";

            ResultSet hasil = stm.executeQuery(perintahSQL);

            while(hasil.next()){
                System.out.println("NIP : "+hasil.getString("EMPLOYEE_ID"));
                System.out.println("NAMA : "+hasil.getString("FIRST_NAME"));
                System.out.println("SALARY : "+hasil.getString("SALARY"));
                System.out.println("================");
            }

            conn.close();

        }catch(Exception ez){
            System.out.println("ERROR : "+ez.getMessage());
        }
    }
}
