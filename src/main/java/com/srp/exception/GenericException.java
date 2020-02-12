package com.srp.exception;

import com.srp.utils.InternalStandardError;

public class GenericException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final InternalStandardError error;

    public GenericException(InternalStandardError error) {
        super();
        this.error = error;
    }

    public InternalStandardError getError() {
        return error;
    }

}
