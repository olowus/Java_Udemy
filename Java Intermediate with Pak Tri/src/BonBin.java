import java.util.ArrayList;

public class BonBin {
    public static void main(String[] args) {
        ArrayList kandang = new ArrayList<>();
        for(int i=0;i<10;i++){
            if((i%2)==0){
                kandang.add(new Ayam());
            } else if((i%3)==0){
                kandang.add(new Kucing());
            } else {
                kandang.add(new Kambing());
            }
        }
        System.out.println("Total binatang di dalam kandang : "+kandang.size());

        for(int z=0;z<kandang.size();z++){
            Object binatang = kandang.get(z);
            if(binatang instanceof Ayam){
                System.out.println("Binatang ke "+z+" adalah seekor Ayam");
                ((Ayam) binatang).berkokok();
            }else if(binatang instanceof Kucing){
                System.out.println("Binatang ke "+z+" adalah seekor Kucing");
                ((Kucing) binatang).mengeong();
            }else if(binatang instanceof Kambing){
                System.out.println("Binatang ke "+z+" adalah seekor Kambing");
                ((Kambing) binatang).mengembek();
            }
        }
    }
}

class Ayam{
    void berkokok(){
        System.out.println("kukuruyuuukk...");
    }
}

class Kucing{
    void mengeong(){
        System.out.println("Miaaawww...");
    }
}

class Kambing{
    void mengembek(){
        System.out.println("mbeeekkkk...");
    }
}
