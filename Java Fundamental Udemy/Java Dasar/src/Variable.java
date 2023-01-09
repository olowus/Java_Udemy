public class Variable {
    public static void main(String[] args) {

        String name = "Eren Jaeger";

        System.out.println(name);

        int age = 25;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        // semenjak Java 10 bisa menggunakan kata kunci var
        // dengan syarat langsung di assign isinya

        var nama = "Roronoa Zoro";
        System.out.println(nama);

        // kata kunci final membuat isi variable tidak bisa dirubah lagi

        final String jurus = "BANKAI";
        //jurus = "asdasd";  => akan error
    }
}
