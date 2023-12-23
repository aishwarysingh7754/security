package com.ezbank.bank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @RequestMapping("/about")
    public String getAbout() {
        return "This is about section";
    }
}
