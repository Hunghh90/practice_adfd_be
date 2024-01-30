package com.example.practice_adfd_fe.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "places")
public class PlaceEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    private double star;
    public PlaceEntity(String name,double star,String image){
        this.name = name;
        this.image = image;
        this.star = star;
    }
}