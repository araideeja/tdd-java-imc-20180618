package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    
    @GetMapping("/add/{i1}/{i2}")
    public String add(@PathVariable int i1, 
                      @PathVariable int i2) {
        AddOperation operation = new AddOperation();
        double result = operation.calculate(i1, i2);
        return String.valueOf(result);
    }

}
