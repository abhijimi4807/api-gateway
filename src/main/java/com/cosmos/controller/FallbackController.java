package com.cosmos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @RequestMapping("/questionFallback")
    public String questionFallback(){
        return "Question Service taking too long to respond. Please try again later..";
    }
}
