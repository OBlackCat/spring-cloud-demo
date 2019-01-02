package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: doubleS
 * @Date: 2019-01-02 15:32
 * @Description: demo
 */
@RestController
public class ProviderController {

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String getName() {
        return name;
    }
}
