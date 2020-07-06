package com.binge.radoslaw.OracleJDBC.controller;

import com.binge.radoslaw.OracleJDBC.model.Employee;
import com.binge.radoslaw.OracleJDBC.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller // This means that this class is a Controller
@RequestMapping(path="/operators") // This means URL's start with /demo (after Application path)
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("")
    public String showAllUEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAllByOrderByLastNameAscFirstNameAsc());
        return "employee";
    }


    @PostMapping(path="/setOnSite")
    public String setOnSite(@RequestParam String login) {

        Employee employeeDetachOnSite = employeeRepository.findByCurrentOn("On Site");
        Employee employeeAttachOnSite = employeeRepository.findByLogin(login);

        if (employeeDetachOnSite != null) {
            employeeDetachOnSite.setCurrentOn(null);
            employeeRepository.save(employeeDetachOnSite);
        }

        employeeAttachOnSite.setCurrentOn("On Site");
        employeeRepository.save(employeeAttachOnSite);

        return "redirect:/operators";
    }

}