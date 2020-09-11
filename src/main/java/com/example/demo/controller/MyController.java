package com.example.demo.controller;

import com.example.demo.services.DateCalc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    @GetMapping("/")
    @ResponseBody
    public String  echo(@RequestParam String date) {
        DateCalc dateCalc = new DateCalc();
        return dateCalc.daysBetween(date);
    }

}
