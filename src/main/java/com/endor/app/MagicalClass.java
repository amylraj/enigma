package com.endor.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class MagicalClass {
    private static final Logger logger = LogManager.getLogger(MagicalClass.class);

    public void performMagic() {
        int randomNumber = new Random().nextInt(100);
        logger.info("This is the random number : {}", randomNumber);
        System.out.println(randomNumber);
    }
}
