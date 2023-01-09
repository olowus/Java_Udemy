import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PenulisObject {
    public static void main(String[] args) {
        try{
            Mobil avanza = new Mobil();
            avanza.maju();
            avanza.hidupkanMesin();

            FileOutputStream fos = new FileOutputStream("avanza.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(avanza);
            oos.flush();
            oos.close();
            System.out.println("Avanza Telah Di Bekukan");
        }catch(Exception e){
            System.out.println("ERROR : "+e.getMessage());
        }
    }
}
