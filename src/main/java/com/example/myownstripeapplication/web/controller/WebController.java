package com.example.myownstripeapplication.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 12/5/22
 */
@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }

}
