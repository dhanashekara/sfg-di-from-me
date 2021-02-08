package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String testSpringContext(){

        System.out.println("Hello World");
        return "Hi Folks";
    }
}
