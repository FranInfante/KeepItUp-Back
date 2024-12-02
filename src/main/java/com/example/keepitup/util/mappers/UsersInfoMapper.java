package com.example.keepitup.util.mappers;


import com.example.keepitup.model.dtos.UserInfoDTO;
import com.example.keepitup.model.entities.UserInfo;
import com.example.keepitup.model.entities.Users;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsersInfoMapper {

    public UserInfo usersInfoDTOToEntity(UserInfoDTO userInfoDTO) {
        if (userInfoDTO == null) {
            return null;
        }

        UserInfo.UserInfoBuilder userInfoBuilder = UserInfo.builder()
                .id(userInfoDTO.getId())
                .initialWeight(userInfoDTO.getInitialWeight())
                .goalWeight(userInfoDTO.getGoalWeight())
                .workoutDaysPerWeek(userInfoDTO.getWorkoutDaysPerWeek());

        // Set the user reference if the userId is present
        if (userInfoDTO.getUserId() != null) {
            Users user = Users.builder().id(userInfoDTO.getUserId()).build();
            userInfoBuilder.user(user);
        }

        return userInfoBuilder.build();
    }

    public UserInfoDTO usersInfoEntityToDTO(UserInfo userInfo) {
        if (userInfo == null) {
            return null;
        }

        return UserInfoDTO.builder()
                .id(userInfo.getId())
                .initialWeight(userInfo.getInitialWeight())
                .goalWeight(userInfo.getGoalWeight())
                .workoutDaysPerWeek(userInfo.getWorkoutDaysPerWeek())
                .userId(userInfo.getUser() != null ? userInfo.getUser().getId() : null)
                .build();
    }
}