package net.javaguides.ems_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    /**
     * Exception if employee does not exist in db
     * @param message Message if exception is triggered
     */
    public ResourceNotFoundException(String message) {
        // Passes to super class constructor
        super(message);
    }
}
