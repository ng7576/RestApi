package com.RestApi.RestApi.Utils;

public class modelNotFoundExceptionHandler extends Exception {

    public modelNotFoundExceptionHandler() {
        super();
    }

    public modelNotFoundExceptionHandler(String message) {
        super(message);
    }

    public modelNotFoundExceptionHandler(String message, Throwable cause) {
        super(message, cause);
    }

    public modelNotFoundExceptionHandler(Throwable cause) {
        super(cause);
    }

    protected modelNotFoundExceptionHandler(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
