package com.lljjssjjll.wd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wd")
public class BaseController {
    @GetMapping("/test")
    public String doTest() {
        return "Hello";
    }
}
