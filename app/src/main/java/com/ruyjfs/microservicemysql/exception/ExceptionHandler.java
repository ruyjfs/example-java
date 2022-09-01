package com.ruyjfs.microservicemysql.exception;

import com.ruyjfs.core.model.Dto.RequestResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;

@ControllerAdvice
class ExceptionHandlerCustom {

//    @ExceptionHandler(ConstraintViolationException.class)
//    public final ResponseEntity<Object> handleConstraintViolationExceptions(
//            ConstraintViolationException ex) {
//        String exceptionResponse = String.format("Invalid input parameters: %s\n", ex.getMessage());
//        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
//    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public final ResponseEntity<Object> handleMethodArgumentNotValidException(
//            MethodArgumentNotValidException ex) {
//        String exceptionResponse = String.format("Invalid input parameters: %s\n", ex.getMessage());
//        RequestResponseDto response =
//                new RequestResponseDto<Object>(Optional.of(ex.getBindingResult().getTarget()));
//        response.setStatus(false);
//        response.setErrors(ex.getBindingResult().getAllErrors());
//        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
//    }

    @ExceptionHandler(ValidationException.class)
    public final ResponseEntity<Object> handleValidationException(ValidationException ex) {
        RequestResponseDTO response = new RequestResponseDTO(Optional.of(ex.getData()));
        response.setStatus(false);
        response.setErrors(ex.getErrors());
        return new ResponseEntity(response, ex.getStatus());
    }
}
