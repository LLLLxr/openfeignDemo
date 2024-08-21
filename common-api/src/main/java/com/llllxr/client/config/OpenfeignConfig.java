package com.llllxr.client.config;

import feign.Logger;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenfeignConfig extends FeignClientsConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

//    @Bean
//    public FeignLoggerFactory feignLoggerFactory() {
//        return new CustomizationFeignLoggerFactory();
//    }

//    @Bean
//    ErrorDecoder feignErrorDecoder() {
//        return new RetreiveMessageErrorDecoder();
//    }
    
}
