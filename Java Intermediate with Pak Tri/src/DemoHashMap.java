import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Object> kandang = new HashMap<>();
        kandang.put("Ayam Kampung", new Ayam1());
        kandang.put("Kucing Kampung", new Kucing1());
        kandang.put("Kambing Kampung", new Kambing1());

        Ayam1 a = (Ayam1) kandang.get("Ayam Kampung");
        Kucing1 k = (Kucing1) kandang.get("Kucing Kampung");
        Kambing1 kk = (Kambing1) kandang.get("Kambing Kampung");
        a.berkokok();
        k.mengeong();
        kk.mengembek();
    }
}

class Ayam1{
    void berkokok(){
        System.out.println("kukuruyuuukk...");
    }
}

class Kucing1{
    void mengeong(){
        System.out.println("Miaaawww...");
    }
}

class Kambing1{
    void mengembek(){
        System.out.println("mbeeekkkk...");
    }
}