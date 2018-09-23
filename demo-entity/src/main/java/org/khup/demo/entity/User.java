package org.khup.demo.entity;

import lombok.Data;

@Data
public class User {

    private long id;

    private String username;

    private String  password;

    private double salary;
}
