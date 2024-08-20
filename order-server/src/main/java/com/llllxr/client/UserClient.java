package com.llllxr.client;

import com.llllxr.client.config.OpenfeignConfig;
import com.llllxr.pojo.User;
import feign.Headers;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient(value = "user-server", configuration = OpenfeignConfig.class)
//@FeignClient(value = "user-server", url = "http://localhost:8081")
@FeignClient(value = "user-server")
public interface UserClient {

    @Cacheable(cacheNames = "user",key = "#id")
    @GetMapping("/user/{id}")
    User findUserById(@PathVariable("id") int id);
    
    @PostMapping("/user/updateUserByBody")
    User updateUserByBody(@RequestBody User user);

    @PostMapping("/user/updateUserByPojo")
    User updateUserByPojo(@SpringQueryMap User user);
    
    @GetMapping("/user/testOverTime/{id}/{name}")
    String testOverTime(@PathVariable("id") String id,@PathVariable("name") String name);
}
