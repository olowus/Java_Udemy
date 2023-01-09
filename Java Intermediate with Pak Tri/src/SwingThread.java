import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingThread extends JFrame implements Runnable {
    Container canvas;
    JButton tombol1, tombol2;
    JTextField teks;
    boolean flag = false;
    int angka = 0;

    public void run(){
        while(true){
            if(flag){
                teks.setText("Detik ke "+angka);
                angka++;
            }
            try{
                Thread.sleep(1000);
            }catch(Exception ez){
                System.out.println("ERROR : "+ez.getMessage());
            }
        }
    }

    SwingThread(){
        super("Stop Watch");
        canvas = getContentPane();
        canvas.setLayout(new FlowLayout());
        tombol1 = new JButton("Start / Stop");
        tombol2 = new JButton("Reset");
        tombol1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=!flag;
            }
        });
        tombol2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                angka = 0;
                teks.setText("Detik ke "+angka);
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
        Thread t = new Thread(new SwingThread());
        t.start();
    }
}
