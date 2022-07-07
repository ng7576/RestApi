package com.RestApi.RestApi.Errors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

//LOMBOK IS USED TO REDUCE BOILERPLATE CODE 
// INSTEAD OF MANUALLY TYPING OUT GETTERS, SETTERS AND CONSTRUCTORS FOR THE CLASS, THIS CODE LETS LOMBOK HANDLE IT.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessages {

    private HttpStatus status;
    private String message;

}
