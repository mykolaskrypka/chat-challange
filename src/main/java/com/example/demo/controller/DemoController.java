package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    @ApiOperation(value = "Test to get: 'Hello world'")
    public String getHelloWorld() {
        return "Hello world";
    }

}
