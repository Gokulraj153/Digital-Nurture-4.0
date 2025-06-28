package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "Gokul";
        int userId = 101;
        String role = "Admin";

        logger.info("User {} with ID {} has logged in with role {}", username, userId, role);

        int fileCount = 5;
        String folder = "/home/docs";

        logger.debug("Processed {} files in the folder '{}'", fileCount, folder);
    }
}
