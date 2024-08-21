package com.llllxr.service;

import com.llllxr.client.UserClient;
import com.llllxr.pojo.Order;
import com.llllxr.pojo.User;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

    private final UserClient userClient;
    
    public Order findOrderById(Integer id) {
        try {
            Order order = new Order(1, "Blake", 1.0, 1, null);
            User user = userClient.findUserById(id);
            order.setUser(user);
            return order;
        }  catch (FeignException e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    public User updateUserByBody(User user) {
        return userClient.updateUserByBody(user);
    }

    public User updateUserByPojo(User user) {
        return userClient.updateUserByPojo(user);
    }

    public String testOverTime(String id, String name) {
        return userClient.testOverTime(id, name);
    }
}
