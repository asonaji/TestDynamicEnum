package com.srp.exception;

import java.time.LocalDateTime;

public class ErrorResponse {

    private LocalDateTime time;
    private String eCode;
    private String status;
    private String message;

    public ErrorResponse(String eCode, String status, String message) {
        super();
        this.eCode = eCode;
        this.status = status;
        this.message = message;
        this.time = LocalDateTime.now();
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String geteCode() {
        return eCode;
    }

    public void seteCode(String eCode) {
        this.eCode = eCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
