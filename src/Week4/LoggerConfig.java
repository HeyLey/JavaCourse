package Week4;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

/**
 * Created by leyla on 19/10/15.
 */
public class LoggerConfig {
    private static void configureLogging() {
        Logger logA = Logger.getLogger("org.stepic.java.logging.ClassA");
        logA.setLevel(Level.ALL);
        Logger logB = Logger.getLogger("org.stepic.java.logging.ClassB");
        logB.setLevel(Level.WARNING);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new XMLFormatter());

        logA.addHandler(handler);
        logB.addHandler(handler);
    }
}
