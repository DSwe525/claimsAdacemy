package com.pmr.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pmr.entity.Car;
import com.pmr.entity.Pimp;
import com.pmr.service.CarService;
import com.pmr.service.PimpService;

@Controller
public class CarController {

    @Autowired
    CarService carService;
    @Autowired
    PimpService pimpService;

    @GetMapping("/buypmr")
    public String showCars(Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");

            if (email != null) {
                Pimp signInPimp = pimpService.getByEmail(email);
        
                List<Car> allCars = carService.getCarOnLot();
                List<String> allMakes = carService.getListOfMakes(allCars);
                
                model.addAttribute("pimp", signInPimp);
                model.addAttribute("allMakes", allMakes);
                model.addAttribute("allCars", allCars);
        
                return "buypmr";
                } else {
                return "redirect:";
                }
        }
     @GetMapping("/buypmr/{newOrUsed}")
    public String showNewOrUsed(@PathVariable String newOrUsed, Model model, HttpSession session) {
    
        String email = (String) session.getAttribute("emailCookie");
    
                Pimp signInPimp = pimpService.getByEmail(email);
            
                List<Car> allNewUsedCars = carService.getNewOrUsed(newOrUsed);
                    
                model.addAttribute("pimp", signInPimp);
        
                model.addAttribute("allCars", allNewUsedCars);
            
                return "buypmr";
 
        } 
        /*@GetMapping("/buypmr/{make}")
        public String showByMake(@PathVariable String make, Model model, HttpSession session) {
    
        String email = (String) session.getAttribute("emailCookie");
    
                Pimp signInPimp = pimpService.getByEmail(email);
            
                List<Car> allCarsByMake = carService.getCarsOnLotByMake(make);
                List<String> allMakes = carService.getListOfMakes(allCarsByMake);

                    
                model.addAttribute("pimp", signInPimp);
                model.addAttribute("allMakes", allMakes);
                model.addAttribute("allCarsByMake", allCarsByMake);
            
                return "buypmr";
 
        }  */

    @GetMapping("/pmrdetails/{vin}")
    public String showCarDetail(@PathVariable String vin, Model model, HttpSession session) {

    String loggedInPimpEmail = (String) session.getAttribute("emailCookie");

    Pimp loggedInPimp = pimpService.getByEmail(loggedInPimpEmail);

    Car car = carService.getByVin(vin);

    model.addAttribute("loggedInPimp", loggedInPimp);
    model.addAttribute("car", car);

        return "pmrdetails";

        }
    @PostMapping("/pmrdetails/{vin}")
    public String buyCar(@PathVariable String vin, Model model, HttpSession session) {

        String loggedInPimpId = (String) session.getAttribute("emailCookie");
        
        Pimp loggedInPimp = pimpService.buyCar(loggedInPimpId, vin);

        model.addAttribute("loggedInPimp", loggedInPimp);

        return "redirect:/buypmr";

        }
}
