public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] nilai = {70,90,90,70,60};
        sayCongrats("Byakuya", nilai);

        sayCongrats("Rukia", 80,70,90,60,80);
    }

    static void sayCongrats(String name, int... values){
        int total = 0;
        for(int value : values){
            total += value;
        }

        int finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat "+name+", Anda Lulus");
        }else {
            System.out.println("Maaf "+name+", Anda Tidak Lulus");
        }
    }
}
