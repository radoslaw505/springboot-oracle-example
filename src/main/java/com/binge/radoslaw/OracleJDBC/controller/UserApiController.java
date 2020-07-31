package com.binge.radoslaw.OracleJDBC.controller;

import com.binge.radoslaw.OracleJDBC.model.User;
import com.binge.radoslaw.OracleJDBC.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/user")
public class UserApiController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
