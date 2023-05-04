package com.example.microservices.limitsservice.controller;

import com.example.microservices.limitsservice.configuration.Configuration;
import com.example.microservices.limitsservice.entity.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limit retrieveLimits() {
        return new Limit(configuration.getMinimum(),
                configuration.getMaximum());
    }

}
