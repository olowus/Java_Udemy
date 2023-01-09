public class IfStatement {
    public static void main(String[] args) {

        int nilai = 60;
        int absensi = 99;

        if(nilai >= 80 && absensi >= 80){
            System.out.println("Nilai Anda A");
        }else if(nilai >= 70 && absensi >= 70){
            System.out.println("Nilai Anda B");
        }else if(nilai >= 60 && absensi >= 60){
            System.out.println("Nilai Anda C");
        }else if(nilai >= 50 && absensi >= 50){
            System.out.println("Nilai Anda D");
        }else{
            System.out.println("Nilai Anda E");
        }
    }
}
