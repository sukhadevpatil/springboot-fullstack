package com.app.crud.fullstack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String userName;

    private String email;

}
