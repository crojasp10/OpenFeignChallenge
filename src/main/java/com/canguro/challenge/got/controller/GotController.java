package com.canguro.challenge.got.controller;

import com.canguro.challenge.got.model.House;
import com.canguro.challenge.got.service.GotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class GotController {

    @Autowired
    @Qualifier("GotServiceFeign")
    GotService gotService;

    @GetMapping("/houses")
    public List <House> findAll(){
        return gotService.findAll();
    }




}
