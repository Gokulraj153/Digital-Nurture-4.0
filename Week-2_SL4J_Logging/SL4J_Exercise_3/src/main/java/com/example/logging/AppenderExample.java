package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.debug("Debugging the application");
        logger.info("Info message logged");
        logger.warn("Warning occurred");
        logger.error("Error encountered");
    }
}
