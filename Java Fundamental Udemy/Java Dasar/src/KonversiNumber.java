public class KonversiNumber {
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;

        int iniInt2 = 1000;
        // hati2 jika memasukkan angka yang melebihi batas tipe data akan terjadi Number Overflow
        byte iniByte2 = (byte) iniInt2;
        // casting to bytw from int
    }
}
