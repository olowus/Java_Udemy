public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        // augmented assignments
        System.out.println("=====augmented assignments=====");

        int c = 20;
        c += 10;

        System.out.println(c);

        // unary operator
        System.out.println("=====unary operator=====");
        int d = 40;
        d++;
        System.out.println(d);
        d--;
        System.out.println(d);

    }
}
