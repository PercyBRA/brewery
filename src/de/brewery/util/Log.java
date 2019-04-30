package de.brewery.util;

import java.sql.SQLOutput;

public class Log {

    private static int DEBUG_LEVEL = 2;

    public static void debug(String msg) {
        if (DEBUG_LEVEL >= 3)
            log("Debug : " + msg);
    }
    public static void info(String msg) {
        if (DEBUG_LEVEL >= 2)
            log("Info : " + msg);
    }
    public static void warn(String msg) {
        if (DEBUG_LEVEL >= 1)
            log("Warn : " + msg);
    }
    public static void error(String msg) {
        if (DEBUG_LEVEL >= 0)
            log("Error : " + msg);
    }

    private static void log(String msg) {
        System.out.println(msg);
    }
}
