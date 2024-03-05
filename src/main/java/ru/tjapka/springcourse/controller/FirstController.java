package ru.tjapka.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/")
    public String helloPage(){
        return "first/hello";
    }
    @GetMapping("/by")
    public String goodbyePage(){
        return "first/goodbye";
    }
}
