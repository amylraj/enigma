package com.endor.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args ) {
        int randomNumber = new Random().nextInt(100);
        logger.info("This is the random number : {}", randomNumber);
        System.out.println(randomNumber);
    }
}
