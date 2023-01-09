import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoSwing2 extends JFrame {
    Container canvas;
    JButton tombol1;
    JButton tombol2;
    JTextField teks;
    public class AksiTombolTulis implements ActionListener {
        public void actionPerformed(ActionEvent e){
            teks.setText("Tombol Telah Di Klik");
        }
    }

    public class AksiTombolHapus implements ActionListener {
        public void actionPerformed(ActionEvent e){
            teks.setText("");
        }
    }

    DemoSwing2(){
        super("Contoh Swing 2");
        canvas = getContentPane();
        canvas.setLayout(new FlowLayout());
        tombol1 = new JButton("Tulis");
        tombol1.addActionListener(new AksiTombolTulis());
        tombol2 = new JButton("Hapus");
        tombol2.addActionListener(new AksiTombolHapus());
        teks = new JTextField(25);
        canvas.add(tombol2);
        canvas.add(teks);
        canvas.add(tombol1);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DemoSwing2();
    }
}
