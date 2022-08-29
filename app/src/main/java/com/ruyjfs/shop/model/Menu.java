package com.ruyjfs.shop.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
@Document
public class Menu {

  @Id
  private String id;

  @NonNull
  private String name;

  private ArrayList<MenuCategory> categories;

  @CreatedDate
  private Instant createdAt;

  @LastModifiedDate
  private Instant updatedAt;


}
