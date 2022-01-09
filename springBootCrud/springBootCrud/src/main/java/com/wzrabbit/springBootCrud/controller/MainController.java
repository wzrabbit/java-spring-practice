package com.wzrabbit.springBootCrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/mustacheTest")
    public String doGreetings() {
        return "greetings";
    }
}
