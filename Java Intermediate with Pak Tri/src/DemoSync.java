class One{
    int penghitung = 0;
    public synchronized void jalan(String s){
       penghitung ++;
        System.out.println("Pemanggilan ke -"+penghitung+" dari "+s);
    }
}

class Two extends Thread{
    One o;
    Two (One o){
        this.o=o;
    }
    void aksesObject(){
        while(true){
            o.jalan("Two");
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void run(){
        aksesObject();
    }
}

class Three extends Thread{
    One o;
    Three (One o){
        this.o=o;
    }
    void aksesObject(){
        while(true){
            o.jalan("Three");
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void run(){
        aksesObject();
    }
}


public class DemoSync {
    public static void main(String[] args) {
        One o = new One();
        Two t = new Two(o);
        Three z = new Three(o);

        t.start();
        z.start();
    }
}
