package com.baizhi.controller;
import com.baizhi.entity.Color;
import com.baizhi.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController2 {
    @Autowired
    private ColorService colorService;

    @RequestMapping(value = "/show")
    public Color show(){
        return colorService.showOne();
    }
}
