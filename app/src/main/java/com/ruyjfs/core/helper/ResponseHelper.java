package com.ruyjfs.core.helper;

import com.ruyjfs.core.model.Dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHelper {

  public static ResponseEntity<Object> ok(Object data) {
    return ResponseEntity.ok(new ResponseDto(HttpStatus.OK.value(), HttpStatus.OK, data));
  }

  public static ResponseEntity<Object> created(Object data) {
    return new ResponseEntity<>(new ResponseDto(HttpStatus.CREATED.value(), HttpStatus.CREATED, data),
        HttpStatus.CREATED);
  }

  public static ResponseEntity<Object> notFound() {
    return new ResponseEntity<>(new ResponseDto(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND, null),
            HttpStatus.NOT_FOUND);
  }
}
