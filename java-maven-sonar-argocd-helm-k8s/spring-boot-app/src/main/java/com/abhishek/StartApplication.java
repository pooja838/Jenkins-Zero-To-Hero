package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication  // This annotation is used to indicate that this is a Spring Boot application
@Controller  // This annotation tells Spring that this class is a controller that will handle web requests
public class StartApplication {

    // The method to handle HTTP GET requests to the root URL ("/")
    @GetMapping("/")
    public String index(final Model model) {
        // Adding attributes to the model which will be used in the view (HTML page)
        model.addAttribute("title", "I have successfully built a Spring Boot application using Maven");
        model.addAttribute("msg", "This application is deployed onto Kubernetes using Argo CD");
        
        // Returning the name of the view to be displayed (index.html in this case)
        return "index";
    }

    // The main method that runs the Spring Boot application
    public static void main(String[] args) {
        // Launching the Spring Boot application
        SpringApplication.run(StartApplication.class, args);
    }

}
