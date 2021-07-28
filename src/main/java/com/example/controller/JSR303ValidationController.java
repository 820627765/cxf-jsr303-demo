package com.example.controller;

import com.example.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class JSR303ValidationController {
    @GetMapping("/add")
    public String add(@Validated Person p){
        return "success";
    }
}
