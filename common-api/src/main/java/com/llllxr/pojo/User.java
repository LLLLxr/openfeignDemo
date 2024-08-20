package com.llllxr.pojo;

import lombok.AllArgsConstructor;

@lombok.Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String phone;
    private String address;
}
