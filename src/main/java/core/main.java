package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {

    public static final Logger logger = LogManager.getLogger(main.class);
    public static String version = "0.1";
    public static GUI gui;

    public static void main(String[] args) {
        logger.info("Starting MULTATH(Developed by Yellowstrawberry Dev.)");
        logger.info("Powered by ISS");
        gui = new GUI();
        gui.start();
    }
}
