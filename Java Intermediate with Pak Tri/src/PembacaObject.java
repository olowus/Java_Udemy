import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PembacaObject {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("avanza.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Mobil bmw = (Mobil)ois.readObject();
            bmw.maju();
            bmw.hidupkanMesin();
        }catch(Exception e){
            System.out.println("ERROR :"+e.getMessage());
        }
    }
}
