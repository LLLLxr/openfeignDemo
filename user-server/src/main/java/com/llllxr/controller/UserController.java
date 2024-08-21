package com.llllxr.controller;

import com.llllxr.pojo.User;
import com.llllxr.service.UserService;
import feign.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") int id){
//        int i = 3/0;
        User user = userService.findUserById(id);
        return user;
    }

    @PostMapping("/updateUserByBody")
    @Headers({"acceptEncoding: gzip","contentType: application/json"})
    public User updateUserByBody(@RequestBody User user){
        user.setId(2);
        return user;
    }

    @PostMapping("/updateUserByPojo")
    public User updateUserByPojo(User user){
        user.setId(2);
        return user;
    }

    @GetMapping("/testOverTime/{id}/{name}")
    public String testOverTime(@PathVariable("id") String id,@PathVariable("name") String name) throws InterruptedException {
        Thread.sleep(10000);
        return MessageFormat.format("accept on msg id={0}，name={1}",id,name);
    }
}