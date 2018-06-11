package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ColorController1 {
    @RequestMapping(value = "/index")
    public String method1(){
        return "index";
    }
}
