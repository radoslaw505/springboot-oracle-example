package com.binge.radoslaw.OracleJDBC.controller;

import com.binge.radoslaw.OracleJDBC.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String showAllUEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAllByCurrentOn("On Site"));
        return "home";
    }
}
