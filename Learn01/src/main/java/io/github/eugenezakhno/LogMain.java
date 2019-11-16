package io.github.eugenezakhno;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMain {

    static Logger logger =  LogManager.getLogger();

    public static void main(String[] args) {
       // Logger.info("info");
        logger.error("first log ");

    }
}
