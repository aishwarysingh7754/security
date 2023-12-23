package com.ezbank.bank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @RequestMapping("/myCards")
    public String getCards() {
        return "this is cards";
    }
}
