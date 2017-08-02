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
        String message = "This is the login page";
        model.addAllAttributes("myMessage", message);
        return "index";
    }

    @PostMapping("/index")
    public @ResponseBody String index(){ return "This is the index" ; }


    @RequestMapping("/login")
    public String login(Model model)
    {
    String message = "This is the login page";
    model.addAllAttributes("myMessage1", message);
        return "login";
    }
   @PostMapping("/login")
    public @ResponseBody  String login() { return "Please login below" ; }


    @RequestMapping("/addproduct")
    public String addProduct(Model model)
    {
        String message = "Add a product here";
        model.addAllAttributes("myMessage2", message);
        return "Add a product here";
    }

    @PostMapping("/addproduct")
     public @ResponseBody String addProduct() { return "Add a product here" ; }

    @RequestMapping("/listproducts")
    public String listProducts(Model model)
    {
        String message = "Here is a list of your products";
        model.addAllAttributes("myMessage3", message)
        return "Here is a list of your products";
    }

    @PostMapping("/listproducts")
    public @ResponseBody String listProducts(){ return "Here is a list of your products" ; }

    }


}
