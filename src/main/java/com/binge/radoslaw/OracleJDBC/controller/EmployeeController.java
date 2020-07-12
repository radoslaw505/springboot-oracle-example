package com.binge.radoslaw.OracleJDBC.controller;

import com.binge.radoslaw.OracleJDBC.model.Employee;
import com.binge.radoslaw.OracleJDBC.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller // This means that this class is a Controller
@RequestMapping(path = "/operators") // This means URL's start with /demo (after Application path)
public class EmployeeController {

    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("")
    public String showAllOperators(Model model) {
        model.addAttribute("employees", employeeRepository.findAllByCurrentOn("On Site"));
        return "home";
    }

    @GetMapping("/all")
    public String showAllEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAllByOrderByLastNameAscFirstNameAsc());
        return "employee";
    }


    @PostMapping(path = "/setOnSite")
    public String setOnSite(@RequestParam String login) {

        Employee employeeDetachOnSite = employeeRepository.findByCurrentOn("On Site");
        Employee employeeAttachOnSite = employeeRepository.findByLogin(login);

        if (employeeDetachOnSite != null) {
            employeeDetachOnSite.setCurrentOn(null);
            employeeRepository.save(employeeDetachOnSite);
        }

        employeeAttachOnSite.setCurrentOn("On Site");
        employeeRepository.save(employeeAttachOnSite);

        if (employeeDetachOnSite != null) {
            logger.info("Operator On Site changed from " + employeeDetachOnSite.getLogin() + " to " + employeeAttachOnSite.getLogin() + ".");
        } else {
            logger.info("Operator On Site has been set to " + employeeAttachOnSite.getLogin() + ".");
        }

        return "redirect:/operators";
    }

}