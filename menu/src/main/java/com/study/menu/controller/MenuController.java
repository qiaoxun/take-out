package com.study.menu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Value("${test.aaa}")
    private String aaa;

    @Value("${test.bbb}")
    private String bbb;

    @GetMapping("/getAaa")
    public String getAaa() {
        return aaa;
    }

}
