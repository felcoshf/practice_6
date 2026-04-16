package com.example.flc2.reg_form.controller;

import com.example.flc2.reg_form.model.User;
import com.example.flc2.reg_form.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegForm(User user) {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        userRepository.save(user);
        return "redirect:/register";
    }
}