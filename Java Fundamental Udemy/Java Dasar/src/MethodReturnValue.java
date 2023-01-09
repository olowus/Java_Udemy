public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(sum(100,200));
        System.out.println(hitung(10,"+",10));
        System.out.println(hitung(60,"-",10));
        System.out.println(hitung(10,"as",10));
    }

    static int sum(int a, int b){
        int total = a+b;
        return total;
    }

    static int hitung(int c, String operasi, int d){
        switch (operasi){
            case "+":
                return c+d;
            case "-":
                return c-d;
            default:
                return 0;
        }
    }
}
