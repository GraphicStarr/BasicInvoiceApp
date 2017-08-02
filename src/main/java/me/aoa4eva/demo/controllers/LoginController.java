package me.aoa4eva.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String greetingForm(Model model) {
        model.addAttribute("login", new login());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute MainController login) {
        return "result";
    }
}
