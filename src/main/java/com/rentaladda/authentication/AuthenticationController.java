package com.rentaladda.authentication;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@Controller
public class AuthenticationController {


    @RequestMapping(value = "/welcome")
    public String getWelcomePage(){
System.out.println("in welcome");
        return "welcome";
    }
}
