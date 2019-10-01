package com.aerogramme.HelloWorld;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UseLogger {

    public static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        setUp();

    }

    public static void setUp(){

        LOGGER.setLevel(Level.SEVERE);
        LOGGER.severe("Info Log");
        LOGGER.warning("Info Log");
        LOGGER.info("Info Log");
        LOGGER.finest("Really not important");

        // set the LogLevel to Info, severe, warning and info will be written
        // finest is still not written
        LOGGER.setLevel(Level.INFO);
        LOGGER.severe("Info Log");
        LOGGER.warning("Info Log");
        LOGGER.info("Info Log");
        LOGGER.finest("Really not important");

        LOGGER.setLevel(Level.WARNING);
        LOGGER.severe("Info Log");
        LOGGER.warning("Info Log");
        LOGGER.info("Info Log");
        LOGGER.finest("Really not important");
    }
}
