class Satu extends Thread{
    public void run(){
        while(true){
            System.out.println("Satu....");
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Dua extends Thread{
    public void run(){
        while(true){
            System.out.println("Dua....");
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}

class Empat extends Thread{
    public void run(){
        lari();
    }
    // tidak akan terpanggil karena Thread hanya memanggil method run()
    public void lari(){
        while(true){
            System.out.println("Lari di Empat....");
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class Tiga {
    public static void main(String[] args) {
        Satu s = new Satu();
        Dua d = new Dua();
        Empat e = new Empat();
        s.start();
        d.start();
        e.start();
    }
}
