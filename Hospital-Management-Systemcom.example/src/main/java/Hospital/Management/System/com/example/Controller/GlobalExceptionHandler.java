package Hospital.Management.System.com.example.Controller;

import Hospital.Management.System.com.example.Error.ApiErrorResponse;
import Hospital.Management.System.com.example.Exception.DuplicateResourceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicateResourceException.class)
    public ResponseEntity<?> handleDuplicateException(DuplicateResourceException ex){
        return  ResponseEntity.
                status(HttpStatus.BAD_REQUEST)
                .body(new ApiErrorResponse(ex.getMessage()));
    }
}
