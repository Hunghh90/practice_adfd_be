package com.example.practice_adfd_fe.repository;

import com.example.practice_adfd_fe.entities.PlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<PlaceEntity,Long> {
}
