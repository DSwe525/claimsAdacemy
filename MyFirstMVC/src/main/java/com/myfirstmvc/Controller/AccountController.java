package com.myfirstmvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.myfirstmvc.entity.Account;
import com.myfirstmvc.service.AccountService;

// All Controlers must be annotated with Controller!
// This lets your component scan know that this is a controller file and it will be seen.

@Controller
public class AccountController {


    //Autowiring is importing a Spring bean into your class, so you dont have to construct it
    // It is very common practice to autowire your service into your controller
    
    @Autowired
    AccountService accountService;

        // GetMapping - It is describing going to a page, but does not save information
    // When I go to http://localhost:8080/ in my browser,
    // my GetMapping will return the home.jsp

    @GetMapping("/")
    public String index() {
        return "home";
    }
    // Making additional getMappings will create addtional pages within the same webpage

    // The model will allow you to put java data onto your ISP pages in the form of a variable
    // The model is how you put java data on the page, or capture the data from a page
    
    @GetMapping("/signUp")
    public String signUp(Model model) {
        // When you have a form on a page, we need to set that form up with a blank object
        // to capture the form data

        model.addAttribute("personSigningUp", new Account());

        return "signUp";
    }
    // Post mappiings are for when you are taking amodel attrible from a form
    // and sending it to the Database to be stored
    @PostMapping("/signUp")
    public String signUp(@ModelAttribute Account personSigningUp) {

        accountService.signUp(personSigningUp);

        return "signIn";
    }

    @GetMapping("/signIn")
    public String signIn(Model model) {

        model.addAttribute("userSignIn", new Account());

        return "signIn";
    }

    @PostMapping("/signIn")
    public String signIn(@ModelAttribute Account personSigningIn, Model model) {

        Account signedInPerson = accountService.signIn(personSigningIn);

        if(signedInPerson != null) {
            model.addAttribute("account", signedInPerson);
            return "profile";
        } else {
            return "signIn";
        
        }

    }
}



