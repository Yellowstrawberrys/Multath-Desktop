package core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

public class GUI extends Thread{
    @Override
    public void run() {
        JFrame frame = new JFrame("Multath");
        JPanel panel = new JPanel();

        //Setting the frame/panel
        frame.setSize(1024, 768);
        frame.setIconImage(new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/logo.png"))).getImage());
        panel.setSize(1024, 768);

        //Remove Title Bar for custom Title Bar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);

        //Components
        Button offline = new Button("Offline Mode");

        //Set Components
        offline.setBounds(870, 500, 300, 250);
        offline.addActionListener(e -> {

        });
        offline.setBackground(Color.WHITE);
        offline.setSize(300, 250);

        //Add to Panel
        panel.add(offline);

        //Add to Frame
        frame.add(panel);

        //Start the Program
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //Setting the frame Second
        frame.setSize(1024, 768);
        frame.setResizable(false);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
