package pl.jano.SpringBootCourse.exception;

import lombok.AllArgsConstructor;

import javax.xml.crypto.Data;

@lombok.Data
@AllArgsConstructor
public class ExceptionResponce {
    private Data timestamp;
    private String message;
    private String stacktrace;
    private String details;
}
