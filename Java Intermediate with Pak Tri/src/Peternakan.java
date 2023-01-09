import java.util.ArrayList;

public class Peternakan {
    public static void main(String[] args) {
        ArrayList<HewanTernak> kandang = new ArrayList<>();
         for(int a=0;a<10;a++){
             if((a%2)==0){
                 kandang.add(new Sapi1());
             }else{
                 kandang.add(new Kerbau1());
             }
         }
         for(int b=0;b<kandang.size();b++){
             HewanTernak binatang = kandang.get(b);
             if(binatang instanceof Sapi1){
                 System.out.println("Binatang ke "+b+" adalah seekor Sapi");
                 ((Sapi1) binatang).mengemo();
                 binatang.makanRumput();
             } else if(binatang instanceof Kerbau1){
                 System.out.println("Binatang ke "+b+" adalah seekor Kerbau");
                 ((Kerbau1) binatang).melengoh();
                 binatang.makanRumput();
             }
         }
    }
}

class HewanTernak{
    void makanRumput(){
        System.out.println("Makan rumput..");
    }
}

class Sapi1 extends HewanTernak{
    void mengemo(){
        System.out.println("Moooo...");
    }
}

class Kerbau1 extends HewanTernak{
    void melengoh(){
        System.out.println("Ngoooo...");
    }
}
