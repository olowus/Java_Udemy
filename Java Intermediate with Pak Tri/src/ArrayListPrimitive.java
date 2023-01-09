import java.util.ArrayList;

public class ArrayListPrimitive {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<>();
        for(int a=0;a<10;a++){
            nilai.add(a);
        }
        for(int b=0;b<nilai.size();b++){
            System.out.println(nilai.get(b)+100);
        }

        ArrayList<Double> pecahan = new ArrayList<>();
        for(int y=0;y<10;y++){
            pecahan.add(y*0.4);
        }
        for(int z=0;z<pecahan.size();z++){
            System.out.println(pecahan.get(z)+55);
        }

        ArrayList<Boolean> logika = new ArrayList<>();
        for(int c=0;c<10;c++) {
            if ((c % 2) == 0) {
                logika.add(Boolean.TRUE);
            } else {
                logika.add(Boolean.FALSE);
            }
        }
        for (int d = 0; d < logika.size(); d++) {
            System.out.println(logika.get(d));
        }
    }
}
