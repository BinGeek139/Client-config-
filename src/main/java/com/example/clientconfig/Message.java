package com.example.clientconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Message{
    @Value("${name}")
    private String message;

    @RequestMapping("/message")
    public ResponseEntity<String> getMessage() {

        return ResponseEntity.ok(this.message);
    }
}
