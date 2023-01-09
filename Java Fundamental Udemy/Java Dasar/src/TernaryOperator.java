public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 81;

        // menggunakan if else biasa
        String ucapan;

        if(nilai >=75){
            ucapan = "Selamat Anda Lulus";
        }else {
            ucapan = "Anda Tidak Lulus";
        }

        System.out.println(ucapan);
        System.out.println("=======TERNARY OPERATOR=======");
        String ucapan2 = nilai >= 75 ? "Selamat Anda Lulus" : "Anda Tidak Lulus";
        System.out.println(ucapan2);
    }
}
