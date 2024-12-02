package com.example.keepitup.service.impl;

import com.example.keepitup.model.dtos.WorkoutsDTO;
import com.example.keepitup.model.entities.Workouts;
import com.example.keepitup.repository.WorkoutsRepository;
import com.example.keepitup.service.WorkoutsService;
import com.example.keepitup.util.mappers.WorkoutsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkoutsServiceImpl implements WorkoutsService {

    private WorkoutsRepository workoutsRepository;

    @Override
    public WorkoutsDTO logWorkout(WorkoutsDTO workoutDTO) {
        Workouts workout = WorkoutsMapper.workoutsDTOToEntity(workoutDTO);
        Workouts savedWorkout = workoutsRepository.save(workout);
        return WorkoutsMapper.workoutsEntityToDTO(savedWorkout);
    }

    @Override
    public List<WorkoutsDTO> getWorkoutsByUserId(Integer userId) {
        List<Workouts> workouts = workoutsRepository.findByUserId(userId);
        return WorkoutsMapper.listWorkoutsEntityToDTO(workouts);
    }
}