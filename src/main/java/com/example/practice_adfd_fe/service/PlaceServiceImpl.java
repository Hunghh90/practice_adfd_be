package com.example.practice_adfd_fe.service;

import com.example.practice_adfd_fe.entities.PlaceEntity;
import com.example.practice_adfd_fe.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService{
    @Autowired
    private PlaceRepository repository;
    @Override
    public List<PlaceEntity> getAllPlace() {
        return repository.findAll();
    }
}
