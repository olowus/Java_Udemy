import java.util.HashMap;
import java.util.Map;

public class DemoHashMapSpesifik {
    public static void main(String[] args) {
        HashMap<String, Ayam2> kandang = new HashMap<>();
        kandang.put("Ayam Kampung", new Ayam2());
        kandang.put("Ayam Broiler", new Ayam2());
        kandang.put("Ayam Hutan", new Ayam2());

        Ayam2 kampung= kandang.get("Ayam Kampung");
        Ayam2 broiler= kandang.get("Ayam Kampung");
        Ayam2 hutan= kandang.get("Ayam Kampung");
        kampung.berkokok();
        broiler.berkokok();
        hutan.berkokok();

        for(Map.Entry<String,Ayam2> tangkapan: kandang.entrySet()){
            System.out.println("KEY : "+tangkapan.getKey());
            Ayam2 a = tangkapan.getValue();
            a.berkokok();
        }
    }
}

class Ayam2{
    void berkokok(){
        System.out.println("kukuruyuuukk...");
    }
}