package com.gulci.spring.spring_yeah.implementations;

import com.gulci.spring.spring_yeah.api.Logger;
import java.util.Date;

public class LoggerImpl implements Logger {
    public void log(String message) {
        System.out.println(new Date() + ": " + message);
    }
}
