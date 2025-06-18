package com.pluralsight.api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    // this method will respond to http://localhost:8080/
//    @RequestMapping(path="/")
//    public String index(@RequestParam(defaultValue="World") String country) {
//        return "Hello " + country + "!";
//    }
    @GetMapping(path="/pathvar/{country}")
    public String helloPathVar(@PathVariable String country) {
        return "Hello " + country + "!";
    }
}
