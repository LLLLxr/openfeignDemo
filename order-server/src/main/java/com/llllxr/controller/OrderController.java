package com.llllxr.controller;

import com.llllxr.pojo.Order;
import com.llllxr.pojo.User;
import com.llllxr.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public Order findUserById(@PathVariable("id") int id){
        Order order = orderService.findOrderById(id);
        return order;
    }

    @PostMapping("/updateUserByBody")
    public User updateUserByBody(@RequestBody User user){
        User updUser = orderService.updateUserByBody(user);
        return updUser;
    }

    @PostMapping("/updateUserByPojo")
    public User updateUserByPojo(User user){
        User updUser = orderService.updateUserByPojo(user);
        return updUser;
    }
    
    @GetMapping("/testOverTime")
    public String testOverTime() {
        return orderService.testOverTime("1","Blake");
    }
}