import java.util.ArrayList;

public class KandangSapi {
    public static void main(String[] args) {
        ArrayList<Sapi> kandang = new ArrayList<Sapi>();
        for(int z=0;z<10;z++){
            kandang.add(new Sapi());
        }
        for(int x=0;x<kandang.size();x++){
            Sapi s = kandang.get(x);
            s.mengemo();
        }
    }
}

class Sapi{
    void mengemo(){
        System.out.println("Moooo...");
    }
}

class Kerbau{
    void melengoh(){
        System.out.println("Ngoooo...");
    }
}
