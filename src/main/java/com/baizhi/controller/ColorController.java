package com.baizhi.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
//    @Autowired
//    private ColorService colorService;

    @RequestMapping(value = "/color/show")
    public String show(){
        return "welcome our world";
    }
}
