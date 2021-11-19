package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    public static Logger getLogger(){
        return LogManager.getLogger(main.class);
    }
}
