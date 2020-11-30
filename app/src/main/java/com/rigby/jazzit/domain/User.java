package com.rigby.jazzit.domain;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class User implements Serializable {

    private String email;
    private String password;
    private LocalDate birthday;
}
