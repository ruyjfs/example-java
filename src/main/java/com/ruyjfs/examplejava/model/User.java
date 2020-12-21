package com.ruyjfs.examplejava.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@Builder
public class User {

    @Id
    Integer id;
    String name;
    String email;
    String password;
    String firstName;
    String lastName;
    LocalDate date;
    Integer gender;

    @CreatedDate
    LocalDate createdAt;

    @LastModifiedDate
    LocalDate updatedAt;

    LocalDate deletedAt;
}
