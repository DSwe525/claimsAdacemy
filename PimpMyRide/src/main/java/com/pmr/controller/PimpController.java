package com.pmr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pmr.entity.Pimp;
import com.pmr.service.PimpService;

@Controller
public class PimpController {
    
    @Autowired
    PimpService pimpService;

    @GetMapping("/")
    public String index(Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");

        if(email != null) {
        Pimp signInPimp = pimpService.getByEmail(email);


        model.addAttribute("pimp", signInPimp);

        return "home";
         } else {
        return "home";
         }
    }
    @GetMapping("/signup")
    public String signUp(Model model) {

        model.addAttribute("pimp", new Pimp());

        return "signup";
    }
    @PostMapping("/signup")
    public String signUp(@ModelAttribute Pimp pimp, Model model, HttpSession session) {

        Pimp signedInPimp = pimpService.save(pimp);

        session.setAttribute("emailCookie", signedInPimp.getEmail());

        model.addAttribute("pimp", signedInPimp);

        return "redirect:";
    }
    @GetMapping("/signin")
    public String signIn(Model model) {

        model.addAttribute("pimp",new Pimp());

        return "signin";
    }
    @PostMapping("/signin")
    public String signIn(@ModelAttribute Pimp pimp, HttpSession session,Model model) {

        Pimp signInPimp = pimpService.signIn(pimp);

        if (signInPimp == null) {
            model.addAttribute("pimp", new Pimp());
            return "signin";
        
    }

    session.setAttribute("emailCookie", signInPimp.getEmail());

    model.addAttribute("pimp", signInPimp);

    return "redirect:";
    }
    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {

        String email = (String) session.getAttribute("emailCookie");


        if (email == null) {
            return "redirect:";
        }

        Pimp pimp = pimpService.getByEmail(email);

        if(pimp == null) {
            return "redirect:";
        }

        model.addAttribute("pimp", pimp);

        return "profile";
    }
    @PostMapping("/profile")
    public String profile (@ModelAttribute Pimp pimp, Model model) {

        pimp = pimpService.update(pimp);

        model.addAttribute("pimp", pimp);

        return "profile";
    }
    @GetMapping("/logoff")
    public String signOut(HttpSession session) {

        session.removeAttribute("emailCookie");

        return "redirect:";
    }

}
