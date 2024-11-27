package com.portfolio.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ServiceResponse {
    private String message;
    private HttpStatus httpStatusCode;
}
