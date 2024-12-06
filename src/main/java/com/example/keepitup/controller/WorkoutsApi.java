package com.example.keepitup.controller;

import com.example.keepitup.model.dtos.WorkoutsDTO;
import com.example.keepitup.util.UriConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(UriConstants.WORKOUTS)
public interface WorkoutsApi {

    @PostMapping
    ResponseEntity<WorkoutsDTO> logWorkout(@RequestBody WorkoutsDTO workoutDTO);

    @GetMapping(UriConstants.BY_ID)
    ResponseEntity<List<WorkoutsDTO>> getWorkoutsByUserId(@PathVariable Integer userId);
}
