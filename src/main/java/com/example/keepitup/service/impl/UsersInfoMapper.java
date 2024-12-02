package com.example.keepitup.service.impl;

import com.example.keepitup.model.dtos.UserInfoDTO;
import com.example.keepitup.model.entities.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersInfoMapper {

    public UserInfo usersInfoDTOToEntity(UserInfoDTO userInfoDTO) {
        return UserInfo.builder()
                .id(userInfoDTO.getId())
                .initialWeight(userInfoDTO.getInitialWeight())
                .goalWeight(userInfoDTO.getGoalWeight())
                .workoutDaysPerWeek(userInfoDTO.getWorkoutDaysPerWeek())
                .build();
    }

    public UserInfoDTO usersInfoEntityToDTO(UserInfo userInfo) {
        return UserInfoDTO.builder()
                .id(userInfo.getId())
                .initialWeight(userInfo.getInitialWeight())
                .goalWeight(userInfo.getGoalWeight())
                .workoutDaysPerWeek(userInfo.getWorkoutDaysPerWeek())
                .build();
    }
}