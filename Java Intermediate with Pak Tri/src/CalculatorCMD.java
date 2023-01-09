import java.util.Scanner;

public class CalculatorCMD {
    public static void main(String[] args) {
        try{
            while(true){
                Scanner penangkap = new Scanner(System.in);
                System.out.print("Angka 1 : ");
                String angka1 = penangkap.nextLine();
                System.out.print("Angka 2 : ");
                String angka2 = penangkap.nextLine();
                System.out.print("Operasi (+,-,x,/) : ");
                String operator = penangkap.nextLine();
                double bil1 = Double.parseDouble(angka1);
                double bil2 = Double.parseDouble(angka2);
                double hasil = 0;

                switch(operator){
                    case "+":
                        hasil = bil1+bil2;
                        System.out.println(angka1+"+"+angka2+"="+hasil);
                        break;
                    case "-":
                        hasil = bil1-bil2;
                        System.out.println(angka1+"-"+angka2+"="+hasil);
                        break;
                    case "x":
                        hasil = bil1*bil2;
                        System.out.println(angka1+"x"+angka2+"="+hasil);
                        break;
                    case "/":
                        hasil = bil1/bil2;
                        System.out.println(angka1+"/"+angka2+"="+hasil);
                        break;
                    default:
                        System.out.println("Operasi tidak ditemukan");
                }

                System.out.print("APAKAH INGIN MEMASUKKAN DATA LAGI? Y/N : ");
                String kondisi = penangkap.nextLine();

                if(kondisi.equals("N") || kondisi.equals("n")){
                    break;
                }

            }
        } catch (NumberFormatException numberFormatException){
            System.out.println("Format angka yang anda masukkan salah!");
        }
    }
}
