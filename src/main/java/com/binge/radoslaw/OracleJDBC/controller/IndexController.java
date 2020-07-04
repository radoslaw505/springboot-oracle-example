package com.binge.radoslaw.OracleJDBC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(name = "/")
    public String index() {
        return "home";
    }
}
