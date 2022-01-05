package com.probal.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
@Controller
public class HomeController {


    @RequestMapping("/")
    public String home() {
        return "home";
    }

}
