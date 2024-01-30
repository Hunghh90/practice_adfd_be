package com.example.practice_adfd_fe.controller;

import com.example.practice_adfd_fe.entities.PlaceEntity;
import com.example.practice_adfd_fe.service.PlaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceController {
    @Autowired
    private PlaceServiceImpl service;

    @GetMapping("/get-all")
    public List<PlaceEntity> getAll(){
        return service.getAllPlace();
    }
}
