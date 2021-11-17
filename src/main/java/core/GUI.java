package core;

import gui.login;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

public class GUI extends Thread{

    final Logger logger = LogManager.getLogger(main.class.getName());

    @Override
    public void run() {
        logger.info("Starting GUI (Login GUI)");

        new login();

        while (true){
            System.out.println("null");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
