import javax.swing.*;
import java.awt.*;

public class DemoSwing {
    JFrame frame;
    Container canvas;
    JButton tombol;
    JTextField teks;
    DemoSwing(){
        frame = new JFrame("Contoh Swing");
        canvas = frame.getContentPane();
        canvas.setLayout(new FlowLayout());
        tombol = new JButton("Click Me");
        teks = new JTextField(25);
        canvas.add(tombol);
        canvas.add(teks);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DemoSwing();
    }
}
