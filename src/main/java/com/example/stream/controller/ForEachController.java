package com.example.stream.controller;

import com.example.stream.service.ForEachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/foreach")
public class ForEachController {

    @Autowired
    private ForEachService forEachService;

    @GetMapping("")
    public ArrayList<Integer> main() {
        return forEachService.main();
    }

}
