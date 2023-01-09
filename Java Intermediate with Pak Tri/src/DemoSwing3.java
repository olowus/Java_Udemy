import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoSwing3 extends JFrame {
    Container canvas;
    JButton tombol1, tombol2;
    JTextField teks;

    DemoSwing3(){
        super("Contoh Swing 3");
        canvas = getContentPane();
        canvas.setLayout(new FlowLayout());
        tombol1 = new JButton("Tulis");
        tombol1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teks.setText("Tombol Telah Di Klik");
            }
        });
        tombol2 = new JButton("Hapus");
        tombol2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teks.setText("");
            }
        });
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
        new DemoSwing3();
    }
}
