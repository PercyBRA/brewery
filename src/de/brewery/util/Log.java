package de.brewery.util;


/**
 *  General purpose logging class.
 *
 */
public class Log {

    // control the log level
    private static int DEBUG_LEVEL = 2;

    /**
     * Prints debug information.
     *
     * @param msg Text to be printed
      */
    public static void debug(Object msg) {
        if (DEBUG_LEVEL >= 3)
            log("Debug : " + msg);
    }

    /**
     * Prints general trace information.
     *
     * @param msg Text to be printed
     */
    public static void info(Object msg) {
        if (DEBUG_LEVEL >= 2)
            log("Info : " + msg);
    }

    /**
     * Prints warnings.
     *
     * @param msg Text to be printed
     */
    public static void warn(Object msg) {
        if (DEBUG_LEVEL >= 1)
            log("Warn : " + msg);
    }

    /**
     * Prints errors and exceptions.
     *
     * @param msg Text to be printed
     */
    public static void error(Object msg) {
        if (DEBUG_LEVEL >= 0)
            log("Error : " + msg);
    }

    /**
     * Prints everything.
     *
     * @param msg Text to be printed
     */
    private static void log(Object msg) {
        System.out.println(msg.toString());
    }
}
