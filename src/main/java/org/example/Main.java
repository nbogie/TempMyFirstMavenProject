package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {
        Main myMain = new Main();
        myMain.doStuff();
    }

    private void doStuff() {
        if (logger.isLoggable((Level.INFO))) {
            logger.info(String.format("Hello and welcome caller %d %n", 100000));
        }

        for (int i = 1; i <= 5; i++) {
            if (logger.isLoggable((Level.INFO))) {
                logger.info(String.format("i = %d", i));
            }
        }
    }
}