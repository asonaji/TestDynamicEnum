package com.srp.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigUtils {

    @Autowired
    private Environment env;

    public String getInternalStandardErrorMessage(String eCode) {
        return env.getProperty("internal.error.code." + eCode);
    }

}
