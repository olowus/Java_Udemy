import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Notepad extends JFrame {
    JMenuBar bar;
    JMenu fileMenu;
    JMenuItem fileMenuOpen, fileMenuExit;
    JTextArea teks;
    Container canvas;
    JScrollPane scroller;
    JFileChooser chooser;

    Notepad(){
        super("Notepad JDT 9 Edition");
        bar = new JMenuBar();
        fileMenu = new JMenu("File");
        fileMenuOpen = new JMenuItem("Open");
        fileMenuOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tangkap = chooser.showOpenDialog(canvas);
                if(tangkap==JFileChooser.APPROVE_OPTION){
                    File f = chooser.getSelectedFile();
                    try{
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        String data = null;
                        StringBuffer tampil = new StringBuffer();
                        while((data=br.readLine())!=null){
                            tampil.append(data).append("\n");
                        }
                        teks.setText(tampil.toString());
                        br.close();
                        fr.close();
                    }catch(Exception ex){
                        System.out.println("ERROR :"+ex.getMessage());
                    }

                }
            }
        });
        fileMenuExit = new JMenuItem("Exit");
        fileMenuExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(fileMenuOpen);
        fileMenu.add(fileMenuExit);
        bar.add(fileMenu);
        setJMenuBar(bar);
        canvas = getContentPane();
        teks = new JTextArea(10,50);
        chooser = new JFileChooser();
        scroller = new JScrollPane(teks);
        canvas.add(scroller);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Notepad();
    }
}
