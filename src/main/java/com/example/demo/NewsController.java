package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {
    @RequestMapping("/")
    public String mainNews() {
        return "mainnews";
    }

    @RequestMapping("/world")
    public String world() {
        return "world";
    }

    @RequestMapping("/local")
    public String local() {
        return "local";
    }

    @RequestMapping("/sports")
    public String sports() {
        return "sports";
    }
}
