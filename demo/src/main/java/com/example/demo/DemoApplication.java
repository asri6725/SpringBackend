
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import java.util.*; 

@SpringBootApplication
@RestController
@CrossOrigin("*")
public class DemoApplication {
  
    
    public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    }
    
    @GetMapping("/")
    public List hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        List<Integer> list = new ArrayList<Integer>() {{ 
            add(1); 
            add(3); 
            } }; 
    return list;
    }
  
}
            