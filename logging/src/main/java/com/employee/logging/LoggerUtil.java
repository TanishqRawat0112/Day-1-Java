package com.employee.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {
    private static final Logger logger = LoggerFactory.getLogger(LoggerUtil.class);

    public static Logger getLogger(){
        return logger;
    }
    public static void main(String[] args) {
        System.out.println("Inside LoggerUtil");
    }
}