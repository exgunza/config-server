package com.example.demo.refresco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DefaultController {
    @Autowired
    private DemoRefresh configuration;

    @RequestMapping("/")
    public String home(HttpServletRequest request) {
        return String.format("Hello world (%s, %s)", request.getRequestURL(), configuration.getColor());
    }
}
