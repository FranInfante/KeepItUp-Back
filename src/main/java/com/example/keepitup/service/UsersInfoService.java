package com.example.keepitup.service;


import com.example.keepitup.model.dtos.UserInfoDTO;

public interface UsersInfoService {
    UserInfoDTO saveUserInfo(UserInfoDTO userInfoDTO);
    UserInfoDTO getUserInfoByUserId(Integer userId);
}