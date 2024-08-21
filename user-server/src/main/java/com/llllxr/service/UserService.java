package com.llllxr.service;

//import com.llllxr.client.UserClient;
import com.llllxr.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    
    public User findUserById(int id) {
        return new User(
                1, 
                "Blake", 
                "123456", 
                "beijing"
        );
    }
}
