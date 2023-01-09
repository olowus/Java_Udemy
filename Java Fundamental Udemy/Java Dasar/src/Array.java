public class Array {
    public static void main(String[] args) {

        String[] arrayString = new String[2];

        arrayString[0] = "Eren";
        arrayString[1] = "Jaeger";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);

        // bisa dipersingkat cara pembuatan array seperti di bawah

        String[] namaNama = {
                "Eren","Jaeger"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5
        };

        long[] arrayLong = {
                10L,20L,30L,40L,50L
        };

        // operasi yang ada di array
        // array[index] => mengambil data array
        // array[index] = value => mengubah data array sesuai index
        // array.length => mengambil panjang array

        System.out.println(arrayLong.length);
        System.out.println(arrayInt.length);
        System.out.println(arrayInt[0]);
        arrayInt[0] = 0;
        System.out.println(arrayInt[0]);

        // Array dalam Array

        String[][] nameName = {
                {"Eren","Jaeger"},
                {"Armin","Arlert"},
                {"Mikasa","Ackerman"}
        };
        // contoh ingin mengambil kata "Arlert"
        System.out.println(nameName[1][1]);
    }
}
