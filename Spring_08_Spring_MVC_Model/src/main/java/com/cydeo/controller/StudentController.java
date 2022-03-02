package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("welcome")
    public String homePage(Model model){

        model.addAttribute("name","cydeo");
        model.addAttribute("course","mvc");

        return "student/welcome";
    }

}