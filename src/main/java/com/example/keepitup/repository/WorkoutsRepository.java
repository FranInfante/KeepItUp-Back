package com.example.keepitup.repository;

import com.example.keepitup.model.entities.Workouts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WorkoutsRepository extends JpaRepository<Workouts, Integer> {

    List<Workouts> findByUserId(Integer userId);
}