package dev.patika.patika0601.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeExistException extends RuntimeException{

    public EmployeeExistException(String message) {
        super(message);
    }
}
