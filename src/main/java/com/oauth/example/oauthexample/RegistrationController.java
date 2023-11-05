package com.oauth.example.oauthexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/register")
    public String registerUser(@RequestBody RegistrationRequest registrationRequest) {

        // Implement your registration logic here
        // You can access registrationRequest.getFirstname(), registrationRequest.getLastname(), etc.
        System.out.printf("registration parameter recieved %s", registrationRequest.toString());
        registrationService.createBook(new UserDetails(registrationRequest.getFirstname(),
                registrationRequest.getLastname(),
                registrationRequest.getEmail(), registrationRequest.getPassword()));
        // For this example, let's just return a success message
        return "Registration successful!";
    }
}
