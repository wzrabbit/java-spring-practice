package com.wzrabbit.crud;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/try")
    public String home(Model model) {

        model.addAttribute("greeting", "hello world");

        return "home";
    }

}
