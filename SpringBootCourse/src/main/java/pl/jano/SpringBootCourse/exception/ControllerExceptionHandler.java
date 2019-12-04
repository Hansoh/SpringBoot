package pl.jano.SpringBootCourse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.xml.crypto.Data;
import java.util.Date;

@ControllerAdvice
@RestController
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler (WrongIdException.class)
    public ResponseEntity<ExceptionResponce> handleWrongIdException (Exception ex, WebRequest request){
        ExceptionResponce exceptionResponce = new ExceptionResponce((Data) new Date(), ex.getMessage(),
                ex.getStackTrace()[0].toString(),request.getDescription(true));
        return new ResponseEntity<>(exceptionResponce, HttpStatus.BAD_REQUEST);
    }
}
