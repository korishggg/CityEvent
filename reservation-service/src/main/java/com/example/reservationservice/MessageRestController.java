package com.example.reservationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageRestController {

    private String value;

    public MessageRestController(@Value("${message}") String value) {
        this.value = value;
    }

    @GetMapping("/message")
    String read(){
        return this.value;
    }

}
