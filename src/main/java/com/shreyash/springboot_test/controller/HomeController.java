package com.shreyash.springboot_test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class HomeController {

    static int counter = 1;

    @GetMapping("/welcome")
    public ResponseEntity<Map<String,String>> welcome(){
        Map<String,String> map = new HashMap<>();
        map.put("message","Hello World");
        System.out.println("welcome printed: "+counter);
        counter++;
        return new  ResponseEntity<>(map, HttpStatus.OK);
    }
}
