package com.probal.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/problem")
public class ProblemController {


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAllProblems() {
        return null;
    }
}
