public class Continue {
    public static void main(String[] args) {
        for(int counter = 0; counter <= 100; counter ++){
            if(counter % 2 == 0){
                continue;
            }
            System.out.println("Perulangan ganjil - "+counter);
        }
    }
}
