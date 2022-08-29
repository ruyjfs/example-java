package com.ruyjfs.shop.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class Product {

  @NonNull
  private String name;
  private ProductQuantity quantity;

}
