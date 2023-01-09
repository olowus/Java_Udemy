public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
    }

    // Menggunakan loop biasa
    static int factorialLoop(int value){
        int result = 1;
        for(int i=1; i<=value ; i++){
            result *= i;
        }
        return result;
    }

    // Menggunakan Recursive Method
    static int factorialRecursive(int value){
        if(value==1){
            return 1;
        }else{
            return value * factorialRecursive(value - 1);
        }
    }
}
