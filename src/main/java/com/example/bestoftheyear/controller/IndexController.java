package com.example.bestoftheyear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("home")
    public String getName(Model model) {
        String name = "Nicola";
        model.addAttribute("myName", name);
        return "home-page";
    }
}
