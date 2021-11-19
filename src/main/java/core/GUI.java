package core;

import gui.login;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;

public class GUI extends Thread{

    final Logger logger = LogManager.getLogger(main.class.getName());
    JFrame jFrame = new JFrame("Multath - Login");

    @Override
    public void run() {
        logger.info("Starting GUI (Login GUI)");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(720, 480);
        jFrame.setContentPane(new gui.main().display());
        jFrame.pack();
        Logging.getLogger().info("Login GUI has been Loaded");
    }

    public void setScreen(Container panel){
        jFrame.setContentPane(panel);
    }

    public void setTitle(String title){
        jFrame.setTitle(title);
    }
}
