package com.binge.radoslaw.OracleJDBC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")
public class LoginController {

    @GetMapping(path = "login")
    private String login() {
        return "Login";
    }

}
