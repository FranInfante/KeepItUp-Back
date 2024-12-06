package com.example.keepitup.controller.impl;

import com.example.keepitup.controller.UsersInfoApi;
import com.example.keepitup.model.dtos.UserInfoDTO;
import com.example.keepitup.service.UsersInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class UsersInfoController implements UsersInfoApi {

    private final UsersInfoService usersInfoService;

    @Override
    public ResponseEntity<UserInfoDTO> saveUserInfo(UserInfoDTO userInfoDTO) {
        UserInfoDTO savedUserInfo = usersInfoService.saveUserInfo(userInfoDTO);
        return ResponseEntity.status(201).body(savedUserInfo);
    }

    @Override
    public ResponseEntity<UserInfoDTO> getUserInfoByUserId(Integer userId) {
        UserInfoDTO userInfo = usersInfoService.getUserInfoByUserId(userId);
        return ResponseEntity.ok(userInfo);
    }
}
