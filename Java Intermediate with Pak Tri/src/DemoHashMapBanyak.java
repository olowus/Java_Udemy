import java.util.HashMap;
import java.util.Map;

public class DemoHashMapBanyak {
    public static void main(String[] args) {
        String[] daftarKey = new String[10];
        for(int a=0;a<daftarKey.length;a++){
            daftarKey[a]= "Kambing ke-"+a;
        }

        Kambing3[] daftarValue = new Kambing3[10];
        for(int b=0;b<daftarValue.length;b++){
            daftarValue[b] = new Kambing3();
        }

        HashMap<String,Kambing3> dagangan = new HashMap<>();
        for(int c=0;c<10;c++){
            dagangan.put(daftarKey[c], daftarValue[c]);
        }
        for(Map.Entry<String, Kambing3> ambil : dagangan.entrySet()){
            System.out.println(ambil.getKey());
            ambil.getValue().mengembek();
        }
    }
}

class Kambing3{
    void mengembek(){
        System.out.println("mbeeekkkk...");
    }
}