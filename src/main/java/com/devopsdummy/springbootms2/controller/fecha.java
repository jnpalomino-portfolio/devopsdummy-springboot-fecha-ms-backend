package com.devopsdummy.springbootms2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/fecha")
public class fecha {
    @GetMapping
    public String getDateTime() {
        return "Fecha y Hora actual: " + LocalDateTime.now();
    }
}
