package com.ezbank.bank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

    @RequestMapping("/notices")
    public String getNoticesDetails() {
        return "Notices from database DB";
    }
}
