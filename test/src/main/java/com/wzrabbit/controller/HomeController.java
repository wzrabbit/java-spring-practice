package com.wzrabbit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home/*")
public class HomeController {

    @GetMapping("helloworld")
    public @ResponseBody
    String homeTest() {
        return "Hello, Spring Project! :)";
    }
}