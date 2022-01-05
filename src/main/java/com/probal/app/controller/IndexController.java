package com.probal.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String redirectToHomePage() {
        return "redirect:/home/";
    }

}
