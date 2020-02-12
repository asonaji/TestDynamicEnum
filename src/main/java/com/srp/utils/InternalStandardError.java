package com.srp.utils;

import java.util.Arrays;
import java.util.function.BiFunction;

import org.springframework.http.HttpStatus;

public enum InternalStandardError {

    PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND, "E0006", ConfigUtils::getInternalStandardErrorMessage);

    private final HttpStatus status;
    private final String eCode;
    private BiFunction<ConfigUtils, String, String> function;

    InternalStandardError(HttpStatus status, String eCode, BiFunction<ConfigUtils, String, String> biFunction) {
        this.status = status;
        this.eCode = eCode;
        this.function = biFunction;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public BiFunction<ConfigUtils, String, String> getFunction() {
        return function;
    }

    public String geteCode() {
        return eCode;
    }

    public static InternalStandardError getError(String eCode) {
        return Arrays.stream(InternalStandardError.values()).filter(e -> e.geteCode().equalsIgnoreCase(eCode))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
