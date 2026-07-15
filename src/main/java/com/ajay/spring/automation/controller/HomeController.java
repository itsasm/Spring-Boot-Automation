package com.ajay.spring.automation.controller;

import com.ajay.spring.automation.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/automation")
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/{number}")
    public ResponseEntity<?> isEvenNumber(@PathVariable long number) {
        Map<String, Object> map = new HashMap<>();
        map.put("Number", number);
        boolean isEven = homeService.isEvenNumber(number);
        map.put("Is Even", isEven);
        return ResponseEntity.ok(map);
    }
}
