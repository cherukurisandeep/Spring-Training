package com.sb.springwebapp.controller;

import com.sb.springwebapp.model.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class MainController {

   /* @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String index(){
        return "register";
    }*/

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(Locale locale, Model model){
       // System.out.println("Home Page Requested, Local = "+locale);
        return new ModelAndView("register","UserDetails","user");
    }

    @RequestMapping(value = "/users",method =RequestMethod.POST)
    public String userDetails(@Validated UserDetails user, Model model){
        System.out.println("User Page Requested");
        model.addAttribute("firstName",user.getFirstName());
        model.addAttribute("lastName",user.getLastName());
        model.addAttribute("age",user.getAge());
        return "users";
    }
}
