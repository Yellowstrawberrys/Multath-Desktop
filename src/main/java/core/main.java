package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {

    private static final Logger logger = LogManager.getLogger(main.class);

    public static void main(String[] args) {
        logger.info("Starting MULTATH(Developed by Yellowstrawberry Dev.)");
        logger.info("Powered by ISS");
        new GUI().start();
    }
}
