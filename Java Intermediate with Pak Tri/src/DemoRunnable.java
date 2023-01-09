class ClassParent{
    void jalan(){
        while(true){
            System.out.println("Jalan...");
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class ClassChild extends ClassParent implements Runnable{
    @Override
    public void run() {
        jalan();
    }
}

class ClassSatu extends Thread{
    public void run(){
        int counter = 0;
        while(true){
            counter++;
            if(counter > 5){
                stop();
            }
            System.out.println("Satu...."+counter);
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class DemoRunnable {
    public static void main(String[] args) {
        ClassChild cc = new ClassChild();
        Thread t = new Thread(cc);
        t.start();

        ClassSatu cs = new ClassSatu();
        cs.start();
    }
}
