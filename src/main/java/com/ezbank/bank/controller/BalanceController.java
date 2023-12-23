package com.ezbank.bank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @RequestMapping("/balance")
    public String getBalanceDetails() {
        return "Balance details from DB";
    }
}
