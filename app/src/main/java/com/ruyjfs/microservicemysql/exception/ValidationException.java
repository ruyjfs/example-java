package com.ruyjfs.microservicemysql.exception;

import com.ruyjfs.core.model.Dto.ErrorDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class ValidationException extends RuntimeException {
    private HttpStatus status;
    private String message;
    private Object data;
    private List<ErrorDTO> errors;

    public ValidationException(List<ErrorDTO> errors, Object data) {
        this.status = HttpStatus.BAD_REQUEST;
        this.errors = errors;
        this.data = data;
    }
}
