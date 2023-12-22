package com.mikolajmus.githubactions.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Everything is ok.";
    }
}
