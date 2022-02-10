package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GPAController {

    @GetMapping("/gpacalculator")
    public String greeting() {
        return "GPACalculator";
    }

    @PostMapping("GPAController/Gpa")
    @ResponseBody
    public String Gpa(

    ) {
        //return GPAOutput.gpa
    }


}

class GPAOutput {
    public static int gpa () {
        return 5; //random value and what I Want my gpa to be
    }


}
