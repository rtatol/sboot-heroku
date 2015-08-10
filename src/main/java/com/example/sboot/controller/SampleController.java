package com.example.sboot.controller;

import com.example.sboot.core.Elo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/")
    public Elo hello(@RequestParam(value = "value", defaultValue = "Hello") final String value) {
        return new Elo(value);
    }
}
