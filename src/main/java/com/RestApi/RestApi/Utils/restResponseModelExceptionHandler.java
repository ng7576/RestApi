package com.RestApi.RestApi.Utils;

import com.RestApi.RestApi.Errors.ErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@ResponseStatus
public class restResponseModelExceptionHandler
        extends ResponseEntityExceptionHandler {

    @ExceptionHandler(modelNotFoundExceptionHandler.class)
    public ResponseEntity<ErrorMessages> modelNotFoundException(modelNotFoundExceptionHandler exception,
                                                                WebRequest request)
    {
        ErrorMessages messages = new ErrorMessages(HttpStatus.NOT_FOUND, exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(messages);


    }



}
