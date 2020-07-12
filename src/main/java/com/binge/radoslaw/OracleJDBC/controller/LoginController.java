package com.binge.radoslaw.OracleJDBC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(path = "/login")
    private String login() {
        return "login";
    }
}
