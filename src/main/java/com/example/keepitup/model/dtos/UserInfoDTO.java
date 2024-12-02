package com.example.keepitup.model.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoDTO {
    private Integer id;
    private Integer userId;
    private double initialWeight;
    private double goalWeight;
    private Integer workoutDaysPerWeek;
    private Integer usersId;
}