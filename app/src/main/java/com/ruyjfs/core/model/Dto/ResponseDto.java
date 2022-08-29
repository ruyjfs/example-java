package com.ruyjfs.core.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ResponseDto {
  protected Integer code;
  protected HttpStatus status;
  protected Object data;
}
