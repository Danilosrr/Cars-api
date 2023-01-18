package com.carsapi.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarDTO;

@RestController
@RequestMapping("/")
public class carsController {
    @PostMapping
    public void createCar(@RequestBody CarDTO req) {
        System.out.println(req);
    }
}
