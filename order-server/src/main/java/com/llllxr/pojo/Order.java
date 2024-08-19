package com.llllxr.pojo;

import lombok.AllArgsConstructor;

@lombok.Data
@AllArgsConstructor
public class Order {
    private int id;
    private String name;
    private Double price;
    private int userId;
    private User user;
}
