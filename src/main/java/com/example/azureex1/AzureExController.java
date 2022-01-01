package com.example.azureex1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureExController {

    @RequestMapping
    public String home() {
        return "Testing with Azure";
    }

    @RequestMapping("/msg")
     public String message() {
        return "Some message";
    }
}
