package com.murad.awwad.springbootwithangular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ma_ab on 3/21/2018.
 */

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "index";
    }

}
