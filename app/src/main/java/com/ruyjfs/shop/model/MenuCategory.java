package com.ruyjfs.shop.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class MenuCategory {

  @NonNull
  private String name;

  private ArrayList<Catalog> catalogs;

}
