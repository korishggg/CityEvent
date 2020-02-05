package com.example.cityeventservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class CityEventServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityEventServiceApplication.class, args);
    }

}

@RestController
class MessageRestRepository {

    @RequestMapping(method = RequestMethod.GET, path = "/message")
    public String message(){
        return "";
    }
}
