package me.aoa4eva.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model)

    {
        String message = "Welcome to the Invoice Application";
        model.addAttribute("index", "Welcome to the Invoice Application");
        return "index";
    }

    @PostMapping("/index")
    public @ResponseBody
    String index() {
        return "This is the index";
    }


    @RequestMapping("/login")
    public String login(Model model) {
        String message = "This is the login page";
        model.addAttribute("login", "Welcome to the Invoice Application");
        return "login";
    }


    @RequestMapping("/addproduct")
    public String addProduct(Model model) {
        String message = "Add a product here";
        model.addAttribute("addProduct", "Welcome to the Invoice Application");
        return "Add a product here";
    }


    @RequestMapping("/listProducts")
    public String listProducts(Model model) {
        String message = "Here is a list of your products";
        model.addAttribute("listProducts", "Welcome to the Invoice Application");
        return "Here is a list of your products";
    }
}



