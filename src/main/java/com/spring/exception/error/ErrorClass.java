package com.spring.exception.error;

public class ErrorClass {
    String message;
    int status;

    public ErrorClass() {
    }

    public ErrorClass(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ErrorClass{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
