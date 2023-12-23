package com.ezbank.bank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @RequestMapping("/loan")
    public String getLoanDetails() {
        return "this is loan page from DB";
    }
}
