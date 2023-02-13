package com.pmr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pmr.service.CarService;
import com.pmr.service.PimpService;
import com.pmr.entity.Car;



@Controller
public class AdminController {
    
    @Autowired
    PimpService pimpService;

    @Autowired
    CarService carService;


    @GetMapping("/admin")
    public void admin(HttpSession session) {

    session.getAttribute("emailCookie");

    }

    @GetMapping("/addcar")
    public String addCar(HttpSession session,Model model) {

    session.getAttribute("emailCookie");

    model.addAttribute("car", new Car());

    return "addcar";

    }

    @PostMapping("/addcar")
    public String addWhips(@ModelAttribute Car car, Model model) {
    
    carService.save(car);

    model.addAttribute("car", new Car());

    return "addcar";

    }

    @GetMapping("/reports")
    public String reports(HttpSession session,Model model) {

    session.getAttribute("emailCookie");

    return "reports";

    }
}